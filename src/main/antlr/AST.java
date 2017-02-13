package main.antlr;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import main.antlr.LoocParser.program_return;
import sun.reflect.generics.tree.Tree;

public class AST {
	private static ANTLRFileStream input;
	private static LoocLexer lexer;
	private static CommonTokenStream tokens;
	private static LoocParser parser;
	private File out;
	private FileWriter fileWriter;
	private PrintWriter printWriter;
	
	private void init(String filepath) throws Exception {
		input = new ANTLRFileStream(filepath);
		lexer = new LoocLexer(input);
		tokens = new CommonTokenStream(lexer);
		parser = new LoocParser(tokens);
	}
	
	private void getAST() throws RecognitionException, IOException {
		CommonTree tree = (CommonTree)parser.program().getTree();
		DOTTreeGenerator gen = new DOTTreeGenerator();
		StringTemplate st=gen.toDOT(tree);
		out=new File("AST.dot");
		fileWriter = new FileWriter(out);
		printWriter=new PrintWriter(fileWriter);
		printWriter.print(st);
		fileWriter.flush();
		fileWriter.close();
		System.out.println("Should be OK");		
	}
	private void getASTBis() throws RecognitionException, IOException {
		program_return result=parser.program();
		CommonTree t =(CommonTree)result.getTree();
		out=new File("AST.dot");
		fileWriter = new FileWriter(out);
		printWriter=new PrintWriter(fileWriter);
		printWriter.print(t.toStringTree());
		fileWriter.flush();
		fileWriter.close();
		System.out.println("Should be OK");
		System.out.println(t.toStringTree());
	}
	
	
	
	public static void main(String[] args) throws Exception {
		AST ast=new AST();
		ast.init("tests/if.looc");
		ast.getAST();

		
	}

}

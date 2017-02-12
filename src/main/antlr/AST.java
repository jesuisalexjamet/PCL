package main.antlr;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

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
	
	private void getAST() {
		CommonTree tree = (CommonTree)parser.program().getTree();
		DOTTreeGenerator gen = new DOTTreeGenerator();
		StringTemplate st=gen.toDOT(tree);
		out=new File("AST.dot");
		fileWriter = new FileWriter(out);
		printWriter.print(st);
		fileWriter.flush();
		fileWriter.close();
		System.out.println("Should be OK");
		
	}
	
	
	public static void main(String[] args) throws Exception {
		AST ast=new AST();
		ast.init("tests/class.looc");
		ast.getAST();
		
	}

}

package main.antlr;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
	private List<String> tab=new ArrayList<String>();
	

	private void setTab() {
		tab.add("class");
		tab.add("read");
		tab.add("prio");
		tab.add("if");
		tab.add("class");
		tab.add("fonction");
		tab.add("for");
		tab.add("full_example");
		tab.add("inheritance");
	}
	
	
	private void init(String filepath) throws Exception {
		input = new ANTLRFileStream(filepath);
		lexer = new LoocLexer(input);
		tokens = new CommonTokenStream(lexer);
		parser = new LoocParser(tokens);
	}
	
	private void getAST() throws Exception {
		if(!new File("AST").exists()) {
			new File("AST").mkdirs();
 
		}
		for(int i=0;i<this.tab.size();i++){
			this.init("tests/"+tab.get(i)+".looc");
			CommonTree tree = (CommonTree)parser.program().getTree();
			DOTTreeGenerator gen = new DOTTreeGenerator();
			StringTemplate st=gen.toDOT(tree);
			out=new File("AST/AST_"+tab.get(i)+".dot");
			fileWriter = new FileWriter(out);
			printWriter=new PrintWriter(fileWriter);
			printWriter.print(st);
			fileWriter.flush();
			fileWriter.close();
			System.out.println("Should be OK for "+"AST_"+tab.get(i));
		}
	}

	
	
	
	public static void main(String[] args) throws Exception {
		AST ast=new AST();
		ast.setTab();
		ast.getAST();

	}

}

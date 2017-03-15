package main.compiler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import main.antlr.AST;
import main.symbols.SymbolTable;
import main.symbols.SymbolTableBuilder;

public class Program {
	private String filepath;
	private String programName;
	private AST abstratTree;
	private SymbolTable symbolTable;
	
	private boolean outputAST;
	private boolean outputTDS;
	
	public Program(String filepath, boolean outputAST, boolean outputTDS) {
		this.filepath = filepath;
		
		int beginPos = this.filepath.lastIndexOf("/") + 1;
		int endPos = this.filepath.lastIndexOf(".");
		
		this.programName = this.filepath.substring(beginPos, endPos);
		
		this.abstratTree = null;
		this.symbolTable = null;
		
		this.outputAST = outputAST;
		this.outputTDS = outputTDS;
	}
	
	public void processAbstractTree() throws Exception {
		this.abstratTree = AST.fromLoocFile(this.filepath);
		
		if (this.outputAST) {
			this.outputAbstractTree();
		}
	}
	
	public void processSymbolTable() {
		SymbolTableBuilder builder = new SymbolTableBuilder(this.abstratTree.getTree());
		
		this.symbolTable = builder.getSymboleTable();
		
		if (this.outputTDS) {
			this.outputSymbolTable();
		}
	}
	
	public void outputAbstractTree() throws IOException {
		DOTTreeGenerator dotTreeGenerator = new DOTTreeGenerator();
		StringTemplate st = dotTreeGenerator.toDOT(this.abstratTree.getTree());
		
		File out = new File(this.programName + ".dot");
		FileWriter fileWriter = new FileWriter(out);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.print(st);
		fileWriter.flush();
		fileWriter.close();
	}
	
	public void outputSymbolTable() {
		this.symbolTable.info();
	}
	
	public String getFilepath() {
		return this.filepath;
	}
	
	public String getProgramName() {
		return this.programName;
	}
	
	public AST getAbstractTree() {
		return this.abstratTree;
	}
	
	public SymbolTable getSymbolTable() {
		return this.symbolTable;
	}
}

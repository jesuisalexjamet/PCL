package main.compiler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import main.antlr.LoocLexer;
import main.antlr.LoocParser;
import main.antlr.errors.AbstractSemanticErrorReporter;
import main.antlr.errors.AbstractSyntaxErrorReporter;
import main.antlr.errors.StdErrSemanticErrorReporter;
import main.antlr.errors.StdErrSyntaxErrorReporter;
import main.symbols.SymbolTable;
import main.symbols.SymbolTableBuilder;

public class Program {
	private String filepath;
	private String programName;
	
	private LoocLexer lexer;
	private CommonTokenStream tokens;
	private LoocParser parser;
	private CommonTree abstractTree;
	private SymbolTable symbolTable;
	private SymbolTableBuilder builder;
	
	private boolean outputAST;
	private boolean outputTDS;
	
	public Program(String filepath, boolean outputAST, boolean outputTDS) {
		this.filepath = filepath;
		
		int beginPos = this.filepath.lastIndexOf("/") + 1;
		int endPos = this.filepath.lastIndexOf(".");
		
		this.programName = this.filepath.substring(beginPos, endPos);
		
		this.symbolTable = null;
		
		this.outputAST = outputAST;
		this.outputTDS = outputTDS;
	}
	
	public void processAbstractTree() throws Exception {
		this.lexer = new LoocLexer(new ANTLRFileStream(this.filepath));
		this.tokens = new CommonTokenStream(this.lexer);
		this.parser = new LoocParser(this.tokens);
		
		this.parser.setErrorReporter(new StdErrSyntaxErrorReporter());
		
		this.abstractTree = (CommonTree) this.parser.program().getTree();
		
		if (this.outputAST) {
			this.outputAbstractTree();
		}
		
		// Affichage des erreurs syntaxiques.
		this.getSyntaxErrorReporter().output();
	}
	
	public void processSymbolTable() {
		builder = new SymbolTableBuilder(this.abstractTree, new StdErrSemanticErrorReporter());
		
		this.symbolTable = builder.getSymboleTable();
		
		if (this.outputTDS) {
			this.outputSymbolTable();
		}
		
		// Affichage des erreurs sémantiques.
		this.getSemanticErrorReporter().output();
	}
	
	public void outputAbstractTree() throws IOException {
		DOTTreeGenerator dotTreeGenerator = new DOTTreeGenerator();
		StringTemplate st = dotTreeGenerator.toDOT(this.abstractTree);
		
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
	
	public CommonTree getAbstractTree() {
		return this.abstractTree;
	}
	
	public SymbolTable getSymbolTable() {
		return this.symbolTable;
	}
	
	public AbstractSyntaxErrorReporter getSyntaxErrorReporter() {
		return this.parser.getErrorReporter();
	}
	
	public AbstractSemanticErrorReporter getSemanticErrorReporter() {
		return this.builder.getErrorReporter();
	}
}

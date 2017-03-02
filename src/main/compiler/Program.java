package main.compiler;

import main.antlr.AST;

public class Program {
	private String filepath;
	private String programName;
	private AST abstratTree;
	
	public Program(String filepath) {
		this.filepath = filepath;
		
		int beginPos = this.filepath.lastIndexOf("/") + 1;
		int endPos = this.filepath.lastIndexOf(".");
		
		this.programName = this.filepath.substring(beginPos, endPos);
		
		this.abstratTree = null;
	}
	
	public void processAbstractTree() throws Exception {
		this.abstratTree = AST.fromLoocFile(this.filepath);
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
}

package main.compiler;

import main.assembly.AssemblyBuilder;
import main.assembly.AssemblyWriter;

public class Compiler {
	public static void main(String args[]) throws Exception {
		String programPath;
		String outputPath = "";
		boolean outputTDS = false, outputAST = false;
		
		if (args.length < 1) {
			System.out.println("[Erreur] La commande attend au moins une option: le chemin vers le fichier Looc a compiler.");
			
			return;
		}
		
		programPath = args[0];
		
		for (int i = 1; i < args.length; i++) {
			switch (args[i]) {
			case "--ast":
				outputAST = true;
				break;
			case "--tds":
				outputTDS = true;
				break;
			case "--out":
				outputPath = args[i + 1];
			}
		}
		
		Program loocProgram = new Program(programPath, outputAST, outputTDS, outputPath);
		
		// Acquisition de l'arbre abstrait.
		loocProgram.processAbstractTree();
		
		// Acquisition de la table des symboles.
		loocProgram.processSymbolTable();
		
		AssemblyBuilder assBuilder = AssemblyBuilder.getInstance();
		AssemblyWriter assWriter = new AssemblyWriter(outputPath);
		String res = assBuilder.translateProgram(loocProgram);
		assWriter.writeInFile(res,outputPath);
		System.out.println(res);
	}
}

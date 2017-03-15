package main.compiler;

public class Compiler {
	public static void main(String args[]) throws Exception {
		String programPath;
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
			}
		}
		
		Program loocProgram = new Program(programPath, outputAST, outputTDS);
		
		// Acquisition de l'arbre abstrait.
		loocProgram.processAbstractTree();
		
		// Acquisition de la table des symboles.
		loocProgram.processSymbolTable();
	}
}

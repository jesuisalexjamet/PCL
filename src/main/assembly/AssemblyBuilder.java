package main.assembly;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;

import main.compiler.Program;
import main.symbols.Symbol;
import main.symbols.SymbolTable;
import main.symbols.Variable;

/**
 * AssemblyBuilder est une classe dédiée à la traduction des structures
 * de données que sont la table des symboles et l'arbre abstrait d'un
 * programme en langage d'assemblage.
 * 
 * Cette classe implémente le design pattern Singleton: il n'existe qu'une
 * unique instance de cette classe pendant toute l'exécution du programme.
 * 
 * @author alexandrejamet
 *
 */
public class AssemblyBuilder {
	private static AssemblyBuilder _instance = null;
	/**
	 * Constructeur par défaut de la classe AssemblyBuilder.
	 */
	private AssemblyBuilder() {
		
	}
	
	/**
	 * Retourne l'unique instance de la classe AssemblyBuilder.
	 * Initialise la dite instance si nécessaire.
	 * 
	 * @return L'unique instance de la classe AssemblyBuilder
	 */
	public static AssemblyBuilder getInstance() {
		// Instanciation de l'unique instance de la classe.
		if (AssemblyBuilder._instance == null) {
			AssemblyBuilder._instance = new AssemblyBuilder();
		}
		
		return AssemblyBuilder._instance;
	}
	
	/**
	 * Méthode de traduction d'un programme en langage d'assemblage.
	 * 
	 * On supposse que le programme est correct tant syntaxiquement
	 * que sémantiquement.
	 * 
	 * Pour plus d'informations sur l'algorithme de traduction en
	 * langage d'assemblage, se réferer à la fiche docs/assembly-builder.md.
	 * 
	 * @param prg Le programme a traduire en langage d'assemblage
	 * @return Le programme traduit en langage d'assemblage sous forme
	 * d'une chaîne de caractères.
	 */
	public String translateProgram(Program prg) {
		String assPrg = this.bootstrap(prg);
		//assPrg += this.translateGlobalVariables(prg) + "\n\n";
		assPrg += this.translateArithmetic(prg.getAbstractTree(), prg.getSymbolTable());
		return assPrg;
	}
	
	/**
	 * Méthode permettant d'obtenir une séquence d'amorçage spécifique au
	 * programme passé en paramètre.
	 * 
	 * @param prg Le programme pour lequel doit être produit une séquence d'amorçage
	 * @return La séquence d'amorçage spécifique au programme passé en paramètre
	 * sous la forme d'un code source écrit en lagnage d'assemblage.
	 */
	private String bootstrap(Program prg) {
		return new String("SP EQU R15\nHP EQU R14\n\n");
	}
	
	/**
	 * Méthode permettant d'obtenir une représentation sous forme de langage d'assemblage
	 * des descripteurs de classes à partir du programme passé en paramètre.
	 * 
	 * @param prg Le programme pour lequel doit être produit des descripteurs de classes
	 * sous la forme de langage d'assemblage.
	 * @return L'ensemble des descripteurs de classes du programme sous la forme de langage
	 * d'assemblage.
	 */
	private String translateClasses(Program prg) {
		return null;
	}
	
	/**
	 * Méthode permettant d'obtenir une représentation sous forme de langage d'assemblage
	 * des différentes méthodes définies dans le programme sous la forme de langage d'assemblage.
	 * 
	 * @param prg
	 * @return
	 */
	private String translateMethods(Program prg) {
		return null;
	}
	
	/**
	 * Méthode permettant d'obtenir une représentation sous forme de langage d'assemblage
	 * de l'ensemble des variables globales définies dans le programme.
	 * 
	 * @param prg
	 * @return
	 */
	private String translateGlobalVariables(Program prg) {
		String res = "";
		
		// On parcours les l'ensemble des variables définies à la racines de la table des symboles.
		for (Symbol curr: prg.getSymbolTable()) {
			if (curr instanceof Variable) {
				res += String.format("%1s EQU 1\n", curr.getName().toUpperCase());
			}
		}
		
		return res;
	}
	
	/**
	 * Méthode permettant d'obtenir une représentation sous forme de langage d'assemblage les affectations de variables
	 * 
	 * @param tree, ST
	 * @return
	 */
	private String translateAffectation(CommonTree tree, SymbolTable ST) {
		String res = "";
		String childOne = tree.getChild(0).getText();
		String childTwo = tree.getChild(1).getText();
	
		return res;
	}
	
	/**
	 * Méthode permettant d'obtenir une représentation sous forme de langage d'assemblage les opérations arithmétiques
	 * 
	 * @param tree, ST
	 * @return
	 */
	private String translateArithmetic(CommonTree tree, SymbolTable ST) {
		String res = "";
		if (tree==null) {
			return "";
		}
		String operation = tree.getText();
		if (!operation.matches("([+,1,*,/])")){
			res += translateArithmetic((CommonTree) tree.getChild(0), ST);
			res += translateArithmetic((CommonTree) tree.getChild(1), ST);
			return res;
		}
		CommonTree childOne = (CommonTree) tree.getChild(0);
		CommonTree childTwo = (CommonTree) tree.getChild(1);
		if (childOne.getText().matches("([+,-,*,/])")) {
			res += translateArithmetic(childOne,ST);
			res += "STW R3 R1\n";
		}
		else if (childOne.getText().matches("[0-9]+")) {
			res = res + "STW R1 "+childOne.getText() + "\n";
		}
		else {
			
			res+="coucou";
		}
		if (childTwo.getText().matches("([+,-,*,/])")) {
			res += translateArithmetic(childTwo,ST);
			res += "STW R3 R2\n";
		}
		else if (childTwo.getText().matches("[0-9]+")) {
			res = res + "STW R2 "+childTwo.getText() + "\n";
		}
		else {
			
		}
		
		switch (operation) {
		case "+": res += "ADD R1 R2 R3 \n"; break;
		case "-": res += "SUB R1 R2 R3 \n"; break;
		case "*": res += "MUL R1 R2 R3 \n"; break;
		case "/": res += "DIV R1 R2 R3 \n"; break;
	}
		return res;
	}
	/**
	 * Méthode permettant d'obtenir une représentation sous forme de langage d'assemblage
	 * des instructions présentent dans le portée globale.
	 * 
	 * @param prg
	 * @return
	 */
	private String translateGlobalInstructions(Program prg) {
		return null;
	}
}

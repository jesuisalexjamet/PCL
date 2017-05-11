package main.assembly;

import main.compiler.Program;

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
	public AssemblyBuilder getInstance() {
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
		
		return null;
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
		return null;
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
		return null;
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

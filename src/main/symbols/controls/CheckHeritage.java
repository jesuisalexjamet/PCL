package main.symbols.controls;

import main.antlr.errors.AbstractSemanticErrorReporter;
import main.symbols.ClassSymbol;
import main.symbols.Method;
import main.symbols.SymbolTable;

/**
 * CheckHeritage est la classe dédiée à la gestion des contrôles
 * sémantiques relatif à la notion d'héritage en programmation
 * orientée objet.
 * 
 * @author alexandrejamet
 *
 */
public abstract class CheckHeritage {
	/**
	 * Cette méthode statique permet de vérifier que le mot-clé super
	 * n'est pas utilisé en dehors d'une méthode.
	 * 
	 * @param symbolTable La table des symboles dans laquelle est utilisée le mot clé super
	 * @param reporter Gestionnaire d'erreurs sémantiques
	 */
	public static void checkSuperCalledInClass(SymbolTable symbolTable,
			AbstractSemanticErrorReporter reporter) {
		SymbolTable curr = symbolTable;
		
		while (!curr.getName().equals("Root")) {
			if (curr.getSymbol(curr.getName()) instanceof Method) {
				return;
			}
			
			// Itération suivante...
			curr = curr.getParent();
		}
		
		reporter.reportError(String.format("super should only be used in a method", curr.getName()));
	}
}

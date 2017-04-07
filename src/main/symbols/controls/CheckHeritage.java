package main.symbols.controls;

import main.antlr.errors.AbstractSemanticErrorReporter;
import main.symbols.ClassSymbol;
import main.symbols.Method;
import main.symbols.Symbol;
import main.symbols.SymbolTable;
import main.symbols.Variable;

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
	 * @param line TODO
	 */
	public static void checkSuperCalledInClass(SymbolTable symbolTable,
			AbstractSemanticErrorReporter reporter,
			int line, int column) {
		SymbolTable curr = symbolTable;
		
		while (!curr.getName().equals("Root")) {
			if (curr.getSymbol(curr.getName()) instanceof Method) {
				return;
			}
			
			// Itération suivante...
			curr = curr.getParent();
		}
		
		if (curr.getName().equals("Root")) {
			return;
		}
		
		reporter.reportError(String.format("super should only be used in a method", curr.getName()), line, column);
	}
	
	/**
	 * 
	 * @param cls
	 * @param reporter
	 * @param line TODO
	 */
	public static void checkAttrDisjoint(ClassSymbol cls,
			AbstractSemanticErrorReporter reporter,
			int line, int column) {
		ClassSymbol parentCls = cls.getParentClass();
		
		while (parentCls != null) {
			checkAttrDisjointHelper(cls, parentCls, reporter, line, column);
			
			parentCls = parentCls.getParentClass();
		}
	}
	
	/**
	 * 
	 * @param cls
	 * @param parentCls
	 * @param reporter
	 * @param line TODO
	 */
	private static void checkAttrDisjointHelper(ClassSymbol cls, 
			ClassSymbol parentCls, 
			AbstractSemanticErrorReporter reporter,
			int line, int column) {
		/*
		 * On parcours l'ensemble des éléments de la table des symboles de la
		 * classe fille.
		 */
		for (Symbol symb: cls.getChildSymbolTable()) {
			for (Symbol parentSymb: parentCls.getChildSymbolTable()) {
				if (symb instanceof Variable && parentSymb instanceof Variable && symb.getName().equals(parentSymb.getName())) {
					reporter.reportError(String.format("Attribute %1s is already defined in parent class %2s", symb.getName(), parentCls.getName()), line, column);
				}
			}
		}
	}
	
	/**
	 * 
	 * @param mtd
	 * @param cls
	 * @param reporter
	 * @param line TODO
	 * @param column TODO
	 */
	public static void checkOverloadedMethod(Method mtd, 
			ClassSymbol cls, AbstractSemanticErrorReporter reporter, 
			int line, int column) {
		ClassSymbol parentCls = cls.getParentClass();
		
		while (parentCls != null) {
			checkOverloadedMethodHelper(mtd, cls, parentCls, reporter, line, column);
			
			parentCls = parentCls.getParentClass();
		}
	}
	
	/**
	 * 
	 * @param mtd
	 * @param cls
	 * @param parentCls
	 * @param reporter
	 * @param line TODO
	 * @param column TODO
	 */
	private static void checkOverloadedMethodHelper(Method mtd,
			ClassSymbol cls,
			ClassSymbol parentCls,
			AbstractSemanticErrorReporter reporter,
			int line, int column) {
		/*
		 * On parcours l'ensmeble des méthodes de la table des symboles de la classe fille.
		 */
		for (Symbol parentSymb: parentCls.getChildSymbolTable()) {
			if (parentSymb instanceof Method && mtd.getName().equals(parentSymb.getName())) {
				Method parentMtd = (Method) parentSymb;
				
				if (mtd.getReturnType() != parentMtd.getReturnType()) {
					reporter.reportError(String.format("Method %1s can't be overloaded in %2s with a different return type", mtd.getName(), cls.getName()), line, column);
				}
				
				if (mtd.getArgCount() != parentMtd.getArgCount()) {
					reporter.reportError(String.format("Method %1s can't be overloaded with a different amount of argument", mtd.getName()), line, column);
					return;
				}
				
				for (int i = 0; i < mtd.getArgCount(); i++) {
					if (mtd.getChildSymbolTable().get(i).getType() != parentMtd.getChildSymbolTable().get(i).getType()) {
						reporter.reportError(String.format("Argument %1s in method %2s should be of type %3s", mtd.getChildSymbolTable().get(i).getName(), mtd.getName(), parentMtd.getChildSymbolTable().get(i).getType().getName()));
					}
				}
			}
		}
	}
	
	public static void checkCallSuperOnParent(String mtdName,
			SymbolTable symbolTable, 
			AbstractSemanticErrorReporter reporter,
			int line, int column) {
		// Recherche de la classe courante.
		SymbolTable currSymbolTable = symbolTable;
		ClassSymbol cls = null;
				
		while (!currSymbolTable.getName().equals("Root")) {
			if (currSymbolTable.getSymbol(currSymbolTable.getName()) instanceof ClassSymbol) {
				cls = (ClassSymbol) currSymbolTable.getSymbol(currSymbolTable.getName());
				break;
			}
			
			currSymbolTable = currSymbolTable.getParent();
		}
		
		if (cls == null) {
			return;
		}
				
		for (Symbol symb: cls.getChildSymbolTable()) {
			if (symb instanceof Method && symb.getName().equals(mtdName)) {
				// On vérifie si la méthode est définie dans les classes parents...
				ClassSymbol parentCls = cls.getParentClass();
				boolean result = false;
				
				while (parentCls != null) {
					result |= checkCallSuperOnParentHelper(mtdName, parentCls);
					
					parentCls = parentCls.getParentClass();
				}
				
				if (!result) {
					reporter.reportError(String.format("Member %1s is not defined in a parent class", mtdName), line, column);
					return;
				}
			}
		}
		
		/*
		 *  La méthode n'est pas définie dans les classes parents, on vérifie si elle est définie dans les classes parents.
		 */
		ClassSymbol parentCls = cls.getParentClass();
		boolean result = false;
		
		while (parentCls != null) {
			result |= checkCallSuperOnParentHelper(mtdName, parentCls);
			
			parentCls = parentCls.getParentClass();
		}
		
		if (!result) {
			reporter.reportError(String.format("Member %1s is not defined in a parent class", mtdName), line, column);
			return;
		}
	}
	
	private static boolean checkCallSuperOnParentHelper(String mtdName,
			ClassSymbol parentCls) {
		for (Symbol symb: parentCls.getChildSymbolTable()) {
			if (symb instanceof Method && symb.getName().equals(mtdName)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void checkSuperInInheritedClass(SymbolTable symbolTable,
			AbstractSemanticErrorReporter reporter,
			int line, int column) {
		// Recherche de la classe courante.
		SymbolTable currSymbolTable = symbolTable;
		ClassSymbol cls = null;
				
		while (!currSymbolTable.getName().equals("Root")) {
			if (currSymbolTable.getSymbol(currSymbolTable.getName()) instanceof ClassSymbol) {
				cls = (ClassSymbol) currSymbolTable.getSymbol(currSymbolTable.getName());
				break;
			}
			
			currSymbolTable = currSymbolTable.getParent();
		}
		
		if (cls == null) {
			reporter.reportError(String.format("super used outside of a class"), line, column);
			return;
		}
		
		if (cls.getParentClass() == null) {
			reporter.reportError(String.format("super shouldn't be used as %1s doesn't have any parent class", cls.getName()), line, column);
		}
	}
}

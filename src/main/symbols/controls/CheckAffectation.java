package main.symbols.controls;

import main.antlr.errors.AbstractSemanticErrorReporter;
import main.symbols.Symbol;
import main.symbols.SymbolTable;

public abstract class CheckAffectation {
	
	public static void checkAffectation(String left, String right, SymbolTable ST, AbstractSemanticErrorReporter reporter) {
		
		Symbol leftSymbol = ST.getSymbol(left);
		CheckDeclaration.checkVariableExistence(left,ST,reporter);
		if (right.matches("-?[0-9]+")) {
			if (!(leftSymbol.getType().getName().equals("int"))) {
				reporter.reportError(left + " is not an int and is affected to an int");
			}
		}
		else if (!(right.matches("-?[+,-,*,/,>,<,<=,>=,%]"))) {
			Symbol rightSymbol = ST.getSymbol(right);
			if (!(leftSymbol.getType().getName().equals(rightSymbol.getType().getName()))) {
				reporter.reportError(left + " and " + right + " are not the same type");
			}
		}
		
	}

}

package main.symbols.controls;

import main.antlr.errors.AbstractSemanticErrorReporter;
import main.symbols.Symbol;
import main.symbols.SymbolTable;

//Made by N.Hell
public abstract class CheckArithmetique {
	
	public static void checkOperation(String left, String right, SymbolTable ST, AbstractSemanticErrorReporter reporter) {
		if (!(left.matches("-?[0-9]+"))) {
			CheckDeclaration.checkVariableExistence(left, ST, reporter);
			Symbol leftSymbol = ST.getSymbol(left);
			if (leftSymbol !=null) {
				if (!(leftSymbol.getType().getName().equals("int"))) {
					reporter.reportError("Left operand is not an int");
				}
			}
		}
		if (!(right.matches("-?[0-9]+"))) {
			CheckDeclaration.checkVariableExistence(right, ST, reporter);
			Symbol rightSymbol = ST.getSymbol(right);
			if (rightSymbol != null) {
				if (!(rightSymbol.getType().getName().equals("int"))) {
					reporter.reportError("Right operand is not an int");
				}
			}
		}	
	}
	
}


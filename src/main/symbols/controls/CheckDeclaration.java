package main.symbols.controls;

import main.antlr.errors.AbstractSemanticErrorReporter;
import main.symbols.Symbol;
import main.symbols.SymbolTable;

public abstract class CheckDeclaration {
	
	public static void checkVariableExistence(String var, SymbolTable ST, AbstractSemanticErrorReporter reporter) {
		Symbol variable = ST.getSymbol(var);
		if (variable == null && ((var.substring(0, 1)+var.substring(var.length()-1,var.length())).equals("\"\"")) && !var.matches("-?[0-9]+")) {
			reporter.reportError(var +" does not exist");
		}
	}

}

// Killian Raoux
package main.symbols.controls;
import main.antlr.errors.AbstractSemanticErrorReporter;
import main.antlr.errors.StdErrSyntaxErrorReporter;
import main.symbols.Symbol;
import main.symbols.SymbolTable;
public abstract class CheckMethod {
	void Example(Symbol parent,SymbolTable ST, AbstractSemanticErrorReporter reporter){
		reporter.reportError("Erreur d'exemple");
	}
}

// Killian Raoux
package main.symbols.controls;
import main.antlr.errors.AbstractSemanticErrorReporter;
import main.antlr.errors.StdErrSyntaxErrorReporter;
import main.symbols.ClassSymbol;
import main.symbols.Method;
import main.symbols.Symbol;
import main.symbols.SymbolTable;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;
public abstract class CheckMethod {
	public static void checkDO(List<CommonTree> tree ,SymbolTable ST, AbstractSemanticErrorReporter reporter){
		Symbol sClass = ST.getSymbol(tree.get(0).getText());
		if (sClass == null){
			reporter.reportError("Class {} doesn't exist".format(tree.get(0).getText()));
			return;
		}
		else if (!(sClass instanceof ClassSymbol)){
			reporter.reportError("{} is not a class".format(tree.get(0).getText()));
			return;
		}
		ClassSymbol sclass = (ClassSymbol) sClass;
		SymbolTable STclass = sclass.getChildSymbolTable();
		Symbol sMethod = STclass.getSymbol(tree.get(1).getText());
		if (sMethod == null){
			reporter.reportError("Method {} doesn't exist or not defined in class {}".format(tree.get(1).getText(),tree.get(0).getText()));
			return;
		}
		else if(!(sMethod instanceof Method)){
			reporter.reportError("{} is not a method".format(tree.get(0).getText()));
			return;
		}
		Method mtd = (Method) sMethod;
		int arg = mtd.getArgCount();
		int size = tree.size();
		if (size-2 != arg){
			reporter.reportError("Method {} needs {} arguments but {} given.".format(tree.get(1).getText(),arg,size));
		}
	}
}

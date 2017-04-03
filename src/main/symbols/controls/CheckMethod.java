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
		Symbol sClass=  ST.getSymbol(ST.getSymbol(tree.get(0).getText()).getType().getName());
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
		int size = 0;
		if (tree.size()>2)
			size = tree.get(2).getChildren().size();
		if (size != arg){
			//reporter.reportError("Method {} needs {} arguments but {} given.".format(tree.get(1).getText(),arg,size));
			reporter.reportError("Method "+ tree.get(1).getText() +" needs "+arg+ " arguments but "+size+ " given.");
		}
	}
	
	
	public static String checkReturn(List<CommonTree> tree ,SymbolTable ST, AbstractSemanticErrorReporter reporter){
		if (tree != null) {
			Symbol classe= ST.getSymbol(ST.getSymbol(tree.get(0).getText()).getType().getName());
			if (classe != null) {
				Symbol method=classe.getChildSymbolTable().getSymbol(tree.get(1).getText());
				if (method != null) {
					Symbol type=method.getArg();
					if (type != null) {
						return(type.getName()) ;
					}
				}
			}
		}
		return null;
			
		
		
		
		
		
		
		
		
	}
}

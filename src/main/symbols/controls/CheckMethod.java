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
		if (sClass == null){ // S'il y a un Symbol avec ce nom dans les TDS a portée.
			reporter.reportError(String.format("Class %1s doesn't exist",tree.get(0).getText()));
			return;
		}
		else if (!(sClass instanceof ClassSymbol)){ // 
			reporter.reportError(String.format("%1s is not a class",tree.get(0).getText()));
			return;
		}
		ClassSymbol sclass = (ClassSymbol) sClass;
		Method sMethod = sclass.getMethod(tree.get(1).getText());
		if (sMethod == null){
			reporter.reportError(String.format("Method %1s doesn't exist or not defined in class %2s",tree.get(1).getText(),tree.get(0).getText()));
			return;
		}
		else if(!(sMethod instanceof Method)){
			reporter.reportError(String.format("%1s is not a method",tree.get(0).getText()));
			return;
		}
		Method mtd = (Method) sMethod;
		int arg = mtd.getArgCount();
		int size = 0;
		if (tree.size()>2)
			size = tree.get(2).getChildren().size();
		if (size != arg){
			reporter.reportError("Method "+ tree.get(1).getText() +" needs "+arg+ " arguments but "+size+ " given.");
		}
		else {
			int i=0;
			List<CommonTree> newTree = tree.get(2).getChildren();
			SymbolTable SymT = mtd.getChildSymbolTable();
			for (Symbol symb: SymT) {
				if (newTree.get(i).getText().matches("-?[0-9]+")) {
					if (!symb.getType().getName().equals("int"))
						reporter.reportError("Method "+ tree.get(1).getText() +" needs the argument number "+ i+" of type string" );
				}
				else if (newTree.get(i).getText().matches("\"[a-zA-Z0-9 _-]*\"")) {
					if (symb.getType().getName().equals("int")) 
						reporter.reportError("Method "+ tree.get(1).getText() +" needs the argument number "+ i+" of type int" );
				}
				else {
					Symbol sym=ST.getSymbol(newTree.get(i).getText());
					if (sym==null) {
						CheckDeclaration.checkVariableExistence(newTree.get(i).getText(), ST, reporter);
					}
					else if (!sym.getType().getName().equals(symb.getType().getName())) {
						reporter.reportError("Method "+ tree.get(1).getText() +" needs the argument number "+ i+" of type "+ symb.getType().getName()+" but type "+ sym.getType().getName()+" given" );
					}
				}
				i++;
			}	
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
	public static void checkThis(SymbolTable ST, AbstractSemanticErrorReporter reporter){
		if (ST.getSymbol(ST.getName())==null){
		}
		else if (!ST.getSymbol(ST.getName()).getType().getName().equals("class")){
			return ;
		}
		if (!ST.getName().equals("Root")){
			checkThis(ST.getParent(), reporter);
		}
	}
}

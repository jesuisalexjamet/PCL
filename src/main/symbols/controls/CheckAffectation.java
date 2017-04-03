package main.symbols.controls;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;

import main.antlr.errors.AbstractSemanticErrorReporter;
import main.symbols.Symbol;
import main.symbols.SymbolTable;

public abstract class CheckAffectation {
	
	public static void checkAffectation(String left, String right, SymbolTable ST, AbstractSemanticErrorReporter reporter,List<CommonTree> leftChild ,List<CommonTree> rightChild) {
		if (right.equals("THIS")) {
			
		}
		else if (right.equals("SUPER")) {
			
		}
		else {
			Symbol leftSymbol = ST.getSymbol(left);
			CheckDeclaration.checkVariableExistence(left,ST,reporter);
			if (right.matches("-?[0-9]+")) {
				if (!(leftSymbol.getType().getName().equals("int"))) {
					reporter.reportError(left + " is not an int and is affected to an int");
				}
				
			}
			
			else if (right.matches("-?[+,-,*,/,>,<,<=,>=,%]")) {
				CheckComparaison.checkComparaison(rightChild.get(0).getText(), rightChild.get(1).getText(), ST, reporter, rightChild.get(0).getChildren(), rightChild.get(1).getChildren());
			}
			else if (right.equals("METHOD_CALL")){
				CheckMethod.checkDO(rightChild, ST, reporter);
			}
			else if (right.matches("\"[a-zA-Z0-9]*\"")) {
				if (!(leftSymbol.getType().getName().equals("string"))) {
					reporter.reportError(left + " is not a string");
				}
			}
			else {
				Symbol rightSymbol = ST.getSymbol(right);
				System.out.println(leftSymbol.getType().getName()+"  "+rightSymbol.getType().getName());
				if (rightSymbol.getType().getName().equals("class") && !leftSymbol.getType().getName().equals(rightSymbol.getName())) {
					reporter.reportError(left + " and " + right + " are not the same type");
				}
				else if (!rightSymbol.getType().getName().equals("class") && !(leftSymbol.getType().getName().equals(rightSymbol.getType().getName()))) {
					reporter.reportError(left + " and " + right + " are not the same type");
				}
				
			}
					
		}
	}

}

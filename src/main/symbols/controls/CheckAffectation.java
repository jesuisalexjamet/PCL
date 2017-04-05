package main.symbols.controls;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import main.antlr.errors.AbstractSemanticErrorReporter;
import main.symbols.Symbol;
import main.symbols.SymbolTable;

public abstract class CheckAffectation {
	
	public static void checkAffectation(String left, String right, SymbolTable ST, AbstractSemanticErrorReporter reporter,List<CommonTree> leftChild ,List<CommonTree> rightChild) {
		if (left == null || right == null || ST == null){
			return;
		}
		if (left.equals("THIS")) {
		}
		else if (left.equals("SUPER")) {
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
				if (leftSymbol.getType().getName().equals("string")) {
					reporter.reportError(left +" is a string and is affected to an int");
					CheckComparaison.checkComparaison(rightChild.get(0).getText(), rightChild.get(1).getText(), ST, reporter, rightChild.get(0).getChildren(), rightChild.get(1).getChildren());
				}
			}
			else if (right.equals("METHOD_CALL")){
				if (CheckMethod.checkReturn(rightChild ,ST, reporter)!=null && !CheckMethod.checkReturn(rightChild ,ST, reporter).equals(leftSymbol.getType().getName())) {
					reporter.reportError( "The method does not return the type of "+leftSymbol.getName());
				}
				CheckMethod.checkDO(rightChild, ST, reporter);
			}
			else if ((right.substring(0, 1)+right.substring(right.length()-1,right.length())).equals("\"\"")) {
				if (!(leftSymbol.getType().getName().equals("string"))) {
					reporter.reportError(left + " is not a string");
				}
			}
			else {
				Symbol rightSymbol = ST.getSymbol(right);
				if (rightSymbol == null){
					reporter.reportError(String.format("%1s is not defined", right));
				}
				else if (rightSymbol.getType().getName().equals("class") && !leftSymbol.getType().getName().equals(rightSymbol.getName())) {
					reporter.reportError(left + " and " + right + " are not the same type");
				}
				else if (!rightSymbol.getType().getName().equals("class") && !(leftSymbol.getType().getName().equals(rightSymbol.getType().getName()))) {
					reporter.reportError(left + " and " + right + " are not the same type");
				}
				
			}
					
		}
	}

}

package main.symbols.controls;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;

import com.sun.imageio.plugins.common.LZWStringTable;

import main.antlr.errors.AbstractSemanticErrorReporter;
import main.antlr.errors.StdErrSyntaxErrorReporter;
import main.symbols.ClassSymbol;
import main.symbols.Method;
import main.symbols.Symbol;
import main.symbols.SymbolTable;
// Made by Antoine Choné
public abstract class CheckComparaison {
	public static void checkComparaison(String left, String right, SymbolTable ST, AbstractSemanticErrorReporter reporter,List<CommonTree> leftChild,List<CommonTree> rightChild,int line,int column) {

		if (left.matches("-?[+,-,*,/,>,<,<=,>=,%]")) {
			CheckComparaison.checkComparaison(leftChild.get(0).getText(), leftChild.get(1).getText(), ST, reporter, leftChild.get(0).getChildren(), leftChild.get(1).getChildren(),leftChild.get(0).getLine(),leftChild.get(0).getCharPositionInLine());
			if (left.equals("/") && leftChild.get(1).getText().equals("0")) {
				reporter.reportError( "Divison by 0",leftChild.get(0).getLine(),leftChild.get(0).getCharPositionInLine());
			}
		}
		else if (left.equals("METHOD_CALL")) {
			if (!CheckMethod.getReturn(leftChild ,ST, reporter).equals("int")) {
				reporter.reportError( "this method does not return an int",leftChild.get(0).getLine(),leftChild.get(0).getCharPositionInLine());
			}
		}
		else if (!(left.matches("-?[0-9]+"))) {
			Symbol leftSymbol = ST.getSymbol(left);
			CheckDeclaration.checkVariableExistence(left, ST, reporter);
			if (leftSymbol != null) {
				if (!leftSymbol.getType().getName().equals("int")) {
					reporter.reportError( left+" is not an int",line,column);
				}
			}
			
		}
		
		if (right.matches("-?[+,-,*,/,>,<,<=,>=,%]")) {
			CheckComparaison.checkComparaison(rightChild.get(0).getText(), rightChild.get(1).getText(), ST, reporter, rightChild.get(0).getChildren(), rightChild.get(1).getChildren(),rightChild.get(0).getLine(),rightChild.get(0).getCharPositionInLine());
			if (right.equals("/") && rightChild.get(1).getText().equals("0")) {
				reporter.reportError( "Divison by 0",rightChild.get(0).getLine(),rightChild.get(0).getCharPositionInLine());
			}
		}		
		else if (right.equals("METHOD_CALL")) {
			ClassSymbol classe= (ClassSymbol) ST.getSymbol(ST.getSymbol(rightChild.get(0).getText()).getType().getName());
			Symbol method=classe.getChildSymbolTable().getSymbol(rightChild.get(1).getText());
			if (method == null) {
				reporter.reportError(rightChild.get(1).getText()+" does not exist",rightChild.get(0).getLine(),rightChild.get(0).getCharPositionInLine()); }
			else {
				Symbol type=method.getArg();
				if (type != null && !type.getName().equals("int")) {
					reporter.reportError(method.getName()+" is a method which does not return an int",line,column);
				}
			}
		}
			
		else if (!(right.matches("-?[0-9]+"))) {
			Symbol rightSymbol = ST.getSymbol(right);
			CheckDeclaration.checkVariableExistence(right, ST, reporter);
			if (rightSymbol != null)
				if (!rightSymbol.getType().getName().equals("int")) {
					reporter.reportError(right+" operand is not an int",line,column);
				}
		}
		

		
		
	}
}

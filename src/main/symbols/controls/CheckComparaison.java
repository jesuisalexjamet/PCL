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

public abstract class CheckComparaison {
	public static void checkComparaison(String left, String right, SymbolTable ST, AbstractSemanticErrorReporter reporter,List<CommonTree> leftChild,List<CommonTree> rightChild) {
		if (left.equals("METHOD_CALL")) {
			ClassSymbol classe= (ClassSymbol) ST.getSymbol(ST.getSymbol(leftChild.get(0).getText()).getType().getName());
			Symbol method=classe.getChildSymbolTable().getSymbol(leftChild.get(1).getText());
			Symbol type=method.getArg();
			
			if (type != null && !type.getName().equals("int")) {
				reporter.reportError("Left operand is a method which does not return an int");
			}
		}
		else if (!(left.matches("-?[0-9]+"))) {
			Symbol leftSymbol = ST.getSymbol(left);
			CheckDeclaration.checkVariableExistence(left, ST, reporter);
			if (leftSymbol != null) {
				if (!leftSymbol.getType().getName().equals("int")) {
					reporter.reportError("Left operand is not an int");
				}
			}
			
		}
		
		
		if (right.equals("METHOD_CALL")) {
			ClassSymbol classe= (ClassSymbol) ST.getSymbol(ST.getSymbol(rightChild.get(0).getText()).getType().getName());
			Symbol method=classe.getChildSymbolTable().getSymbol(rightChild.get(1).getText());
			Symbol type=method.getArg();
			if (type != null && !type.getName().equals("int")) {
				reporter.reportError("Right operand is a method which does not return an int");
			}
		}
		else if (!(right.matches("-?[0-9]+"))) {
			Symbol rightSymbol = ST.getSymbol(right);
			CheckDeclaration.checkVariableExistence(right, ST, reporter);
			if (rightSymbol != null)
				if (!rightSymbol.getType().getName().equals("int")) {
					reporter.reportError("Right operand is not an int");
				}
		}
		

		
		
	}
}

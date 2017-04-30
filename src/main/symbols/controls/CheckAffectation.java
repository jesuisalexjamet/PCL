package main.symbols.controls;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import main.antlr.errors.AbstractSemanticErrorReporter;
import main.symbols.Symbol;
import main.symbols.SymbolTable;

public abstract class CheckAffectation {
	
	public static void checkAffectation(String left, String right, SymbolTable ST, AbstractSemanticErrorReporter reporter,List<CommonTree> leftChild ,List<CommonTree> rightChild,int line,int column) {
		if (left == null || right == null || ST == null){
			return;
		}
		if (left.equals("THIS")) {
			String methodName = ST.getName();
			Symbol methodSymb = ST.getSymbol(methodName);
			if (methodSymb != null) {
				String className = methodSymb.getParentSymbolTable().getName();
				Symbol classSymbol = methodSymb.getParentSymbolTable().getSymbol(className);
				if (classSymbol != null && classSymbol.getType().getName().equals("class")) {
					String attributGauche = leftChild.get(0).getText();
					CheckDeclaration.checkVariableExistence(attributGauche, methodSymb.getParentSymbolTable(), reporter);
					Symbol attributGaucheSymb = methodSymb.getParentSymbolTable().getSymbol(attributGauche);
					if (attributGaucheSymb != null) {
						checkAffectation(attributGauche,right,ST,reporter,leftChild,rightChild,leftChild.get(0).getLine(),leftChild.get(0).getCharPositionInLine());
					}
				}
			
			}
			else {
				reporter.reportError("this cannot be used outside a class",leftChild.get(0).getLine(),leftChild.get(0).getCharPositionInLine());
			}
		
			
		}
		else if (left.equals("SUPER")) {
		}
		else {
			Symbol leftSymbol = ST.getSymbol(left);
			if (leftSymbol == null){
				reporter.reportError(String.format("%1s is not defined in %2s", left,ST.getName()),line,column);
				return;
			}
			CheckDeclaration.checkVariableExistence(left,ST,reporter);
			if (right.matches("-?[0-9]+")) {
				if (!(leftSymbol.getType().getName().equals("int"))) {
					reporter.reportError(left + " is not an int and is affected to an int",line,column);
				}
				
			}
			else if (right.matches("-?[+,-,*,/,>,<,<=,>=,%]")) {
				if (leftSymbol.getType().getName().equals("string")) {
					reporter.reportError(left +" is a string and is affected to an int",line,column);
				}
				CheckComparaison.checkComparaison(rightChild.get(0).getText(), rightChild.get(1).getText(), ST, reporter, rightChild.get(0).getChildren(), rightChild.get(1).getChildren(),rightChild.get(0).getLine(),rightChild.get(0).getCharPositionInLine());
			}
			else if (right.equals("METHOD_CALL")){
				if (CheckMethod.getReturn(rightChild ,ST, reporter)!=null && !CheckMethod.getReturn(rightChild ,ST, reporter).equals(leftSymbol.getType().getName())) {
					reporter.reportError( "The method does not return the type of "+leftSymbol.getName(),rightChild.get(0).getLine(),rightChild.get(0).getCharPositionInLine());
				}
				CheckMethod.checkDO(rightChild, ST, reporter);
			}
			else if ((right.substring(0, 1)+right.substring(right.length()-1,right.length())).equals("\"\"")) {
				if (leftSymbol.getType() == null) {
					reporter.reportError("the type of "+leftSymbol.getName()+" is not defined",line,column);;
				}
				else if (!(leftSymbol.getType().getName().equals("string"))) {
					reporter.reportError(left + " is not a string",line,column);
				}
			}
			else if (right.equals("THIS")) {
				String methodName = ST.getName();
				Symbol methodSymb = ST.getSymbol(methodName);
				if (methodSymb != null) {
					String className = methodSymb.getParentSymbolTable().getName();
					Symbol classSymbol = methodSymb.getParentSymbolTable().getSymbol(className);
					if (classSymbol != null && classSymbol.getType().getName().equals("class")) {
						String attributDroit = rightChild.get(0).getText();
						CheckDeclaration.checkVariableExistence(attributDroit, methodSymb.getParentSymbolTable(), reporter);
						Symbol attributDroitSymb = methodSymb.getParentSymbolTable().getSymbol(attributDroit);
						if (attributDroitSymb != null) {
							checkAffectation(left,attributDroit,ST,reporter,leftChild,rightChild,rightChild.get(0).getLine(),rightChild.get(0).getCharPositionInLine());
						}
					}
				}
				else {
					reporter.reportError("this cannot be used outside a class",rightChild.get(0).getLine(),rightChild.get(0).getCharPositionInLine());
				}
			}
			else if (right.equals("SUPER")) {
				return;
			}
			else {
				Symbol rightSymbol = ST.getSymbol(right);
				if (rightSymbol == null){
					reporter.reportError(String.format("%1s is not defined", right),line,column);
				}
				else if (rightSymbol.getType().getName().equals("class") && !leftSymbol.getType().getName().equals(rightSymbol.getName())) {
					reporter.reportError(left + " and " + right + " are not the same type",line,column);
				}
				else if (!rightSymbol.getType().getName().equals("class") && !(leftSymbol.getType().getName().equals(rightSymbol.getType().getName()))) {
					reporter.reportError(left + " and " + right + " are not the same type",line,column);
				}
				
			}
					
		}
	}

}

package main.symbols.controls;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;

import main.antlr.errors.AbstractSemanticErrorReporter;
import main.symbols.Symbol;
import main.symbols.SymbolTable;

public abstract class CheckBoucle {

	public static boolean checkBounds(List<CommonTree> tree,SymbolTable ST,AbstractSemanticErrorReporter reporter) {
		Boolean problemL = true;
		Boolean problemR = true;
		Boolean problem = true;
		Symbol compteur = ST.getSymbol(tree.get(0).getText());
		CheckDeclaration.checkVariableExistence(tree.get(0).getText(), ST, reporter);
		if (!compteur.getType().getName().equals("int")) {
			reporter.reportError("Loop identifier must be an int");
		}
		else {
			problem =false;
		}
		String min = tree.get(1).getText(); 
		String max =tree.get(2).getText();
		
		if (min.matches("METHOD_CALL")) {
			if (!CheckMethod.checkReturn(tree.get(1).getChildren(), ST, reporter).equals("int")) {
				reporter.reportError("Lower bound must be an int");
			}
		}
		else if (min.matches("THIS")) {
			Symbol c = ST.getSymbol(((CommonTree) (tree.get(1).getChildren()).get(0)).getText());
			CheckDeclaration.checkVariableExistence(c.getName(), ST, reporter);
			if (!c.getType().getName().equals("int")) {
				reporter.reportError("Lower bound must be an int");
			}
		}
		else if ((min.substring(0, 1)+min.substring(min.length()-1,min.length())).equals("\"\"")) {
			reporter.reportError("Lower bound must be an int");
		}
		else if (!min.matches("-?[0-9]+")) {
			Symbol m = ST.getSymbol(min);
			if (!m.getType().getName().equals("int")) {
				reporter.reportError("Lower bound must be an int");
			}
		}
		else {
			problemL = false;
		}
		
		
		if (max.matches("METHOD_CALL")) {
			if (!CheckMethod.checkReturn(tree.get(1).getChildren(), ST, reporter).equals("int")) {
				reporter.reportError("Upper bound must be an int");
			}
		}
		else if (max.matches("THIS")) {
			Symbol cmax = ST.getSymbol(((CommonTree) (tree.get(2).getChildren()).get(0)).getText());
			CheckDeclaration.checkVariableExistence(cmax.getName(), ST, reporter);
			if (!cmax.getType().getName().equals("int")) {
				reporter.reportError("Upper bound must be an int");
			}
		}
		else if ((max.substring(0, 1)+max.substring(max.length()-1,max.length())).equals("\"\"")) {
			reporter.reportError("Upper bound must be an int");
		}
		else if (!max.matches("-?[0-9]+")) {
			Symbol mmax = ST.getSymbol(max);
			if (!mmax.getType().getName().equals("int")) {
				reporter.reportError("Upper bound must be an int");
			}
		}
		else {
			problemR= false;
		}
		return problemR && problemL&& problem;
		
	}
	
	
	public static void checkOrder(List<CommonTree> tree,SymbolTable ST,AbstractSemanticErrorReporter reporter) {
		if (CheckBoucle.checkBounds(tree, ST, reporter) == false) {
			String min = tree.get(1).getText();
			String max = tree.get(2).getText();
			if (min.matches("-?[0-9]+") && max.matches("-?[0-9]+")) {

				int intMin=Integer.parseInt(min) ;
				int intMax=Integer.parseInt(max) ; 
				if (intMin > intMax ) {
					reporter.reportError("Upper bound must be greater or equal than lower bound");
				
				}
			}
			

		}
	}
	
	
	public static void checkModification(List<CommonTree> tree,SymbolTable ST,AbstractSemanticErrorReporter reporter) {
		if  (CheckBoucle.checkBounds(tree, ST, reporter) == false) {
			Symbol boucle = ST.getSymbol(tree.get(0).getText());
			int i = 3;
			int size = tree.size();
			while (i<size) {
				if (tree.get(i).getText().equals("AFFECT")) {
					Symbol left = ST.getSymbol(((CommonTree) tree.get(i).getChildren().get(0)).getText());
					if (left.equals(boucle)) {
						reporter.reportError("You cannot modify the loop identifier");
					}
				}
				i++;
			}
		}
		
	}
}

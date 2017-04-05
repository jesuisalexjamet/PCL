package main.symbols.controls;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;

import main.antlr.errors.AbstractSemanticErrorReporter;
import main.symbols.SymbolTable;

public abstract class CheckCondition {
	public static void checkCond(List<CommonTree> tree ,SymbolTable ST, AbstractSemanticErrorReporter reporter){
		List<CommonTree> children = tree.get(0).getChildren();
		CheckComparaison.checkComparaison((children.get(0)).getText(), children.get(1).getText(), ST, reporter, children.get(0).getChildren(), children.get(1).getChildren());
	}
}

package main.symbols;

import java.util.ArrayList;

public class SymbolTable extends ArrayList<Symbol> {
	private SymbolTable parent;
	private String name;
    private Symbol symbolParent;

	public SymbolTable(SymbolTable parent,String name) {
		this.parent = parent;
		this.name = name;
		if (this.parent != null){
			this.symbolParent = parent.getSymbol(name);
		}
	}

	public SymbolTable getParent() {
		return this.parent;
	}

	public Symbol getSymbol(String symbolName) {
        if (symbolName == null) {
			return null;
		} else if (this.symbolParent instanceof ClassSymbol && ((ClassSymbol) this.symbolParent).getParentClass() != null) {
			Symbol res;

            if((res = ((ClassSymbol) this.symbolParent).getParentClass().getChildSymbolTable().getSymbol(symbolName)) != null) {
                return res;
            }
		}

		for (Symbol symbol: this) {
			if (symbol.getName().equals(symbolName)) {
				return symbol;
			}
		}
		if (this.parent != null) {
			return this.parent.getSymbol(symbolName);
		}
		//System.out.println("Error : "+symbolName+" doesn't exist");
		return null;
	}

	public boolean checkType(String symbolName) {
        ClassSymbol parentClassSymbol;

		if (this.symbolParent instanceof ClassSymbol && (parentClassSymbol = ((ClassSymbol) this.symbolParent).getParentClass()) != null) {
            if(parentClassSymbol.getChildSymbolTable().getSymbol(symbolName) != null) {
                return true;
            }
		}

		for (Symbol symbol: this) {
			if (symbol.getName().equals(symbolName)) {
				return true;
			}
		}

		if (this.parent != null) {
			return this.parent.checkType(symbolName);
		}
		return false;
	}

	public void info() {
		System.out.println("\n===========TDS :"+ this.name + "==========");

		for (Symbol symbol: this) {
			System.out.println(symbol);
		}
		// if (this.symbolParent instanceof ClassSymbol && ((ClassSymbol) this.symbolParent).getParentClass() != null){
		// 	System.out.println("heritage"+((ClassSymbol) this.symbolParent).getParentClass());
		// }
		System.out.println("===============================\n");
		for (Symbol symbol: this) {
			SymbolTable st = symbol.getChildSymbolTable();
			if (st != null){
				st.info();
			}
		}
	}
}

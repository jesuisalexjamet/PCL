package main.symbols;

import java.util.ArrayList;

public class SymbolTable extends ArrayList<Symbol> {
	private SymbolTable parent;
	private String name;
	public SymbolTable(SymbolTable parent,String name) {
		this.parent = parent;
		this.name = name;
	}
	
	public SymbolTable getParent() {
		return this.parent;
	}
	
	/*public Symbol getSymbol(String symbolName) {		
		for (Symbol symbol: this) {
			if (symbol.getName() == symbolName) {
				System.out.println(""+symbolName+" in " + this.name);
				return symbol;
				
			}
		}
		if (this.parent != null) {
			return this.parent.getSymbol(symbolName);
		}
		else{
			System.out.println("No "+symbolName+" in " + this.name);
			System.out.println("\n===========TDS :"+ this.name + "==========");
			
			for (Symbol symbol: this) {
				System.out.println(symbol);
			}
			System.out.println("===============================\n");
		}
		System.out.println("Error : "+symbolName+" doesn't exist");
		return null;
	}*/
	public Symbol getSymbol(String symbolName) {
		if (symbolName == "WRITE"){
			System.out.println("write:"+this.name);
		}
		if (symbolName == null){
			return null;
		}
		for (Symbol symbol: this) {
			if (symbol.getName().equals(symbolName)) {
				return symbol;
				
			}
		}
		if (this.parent != null) {
			return this.parent.getSymbol(symbolName);
		}
		System.out.println("Error : "+symbolName+" doesn't exist");
		return null;
	}
	public boolean checkType(String symbolName) {
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
		
		System.out.println("===============================\n");
		for (Symbol symbol: this) {
			SymbolTable st = symbol.getChildSymbolTable();
			if (st != null){
				st.info();
			}
		}
	}
}

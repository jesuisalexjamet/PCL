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
	
	public Symbol getSymbol(String symbolName) {		
		for (Symbol symbol: this) {
			if (symbol.getName() == symbolName) {				
				return symbol;
			}
		}
		
		if (this.parent != null) {
			return this.parent.getSymbol(symbolName);
		}
				
		return null;
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
	
	
	public static void main(String[] args) {
		SymbolTable root = new SymbolTable(null,"Root");
		
		Primitive integer = new Primitive("int", root);
		Primitive string = new Primitive("string", root);
		Primitive method = new Primitive("method", root);
		Primitive classPrimitive = new Primitive("class", root);
				
		ClassSymbol A = new ClassSymbol("A", "class", root);
		
		new Variable("a", "int", A.getChildSymbolTable());
		new Variable("b", "int", A.getChildSymbolTable());
		Method f = new Method("f", "method", A.getChildSymbolTable(), 2, "int");
		
		Variable f_a = new Variable("a", "A", f.getChildSymbolTable());
		
		root.info();
	}
}

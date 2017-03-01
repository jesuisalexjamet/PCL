package main.symbols;

public class Primitive extends Symbol {
	public Primitive(String name, SymbolTable parentSymbolTable) {
		super(name, null, parentSymbolTable);
	}
	
	public String toString() {
		return "name: " + this.name + " type: Primitive";
	}
	
	@Override
	public SymbolTable getChildSymbolTable() {
		return null;
	}
}

package main.symbols;

public class Variable extends Symbol {
	public Variable(String name, String type, SymbolTable parentSymbolTable) {
		super(name, type, parentSymbolTable);
		
		// Vérification de la validité du type.
	}
	public Variable(String name, String type, SymbolTable parentSymbolTable,int offset) {
		super(name, type, parentSymbolTable);
		this.offset = offset;
		
		// Vérification de la validité du type.
	}
	
	@Override
	public SymbolTable getChildSymbolTable() {
		return null;
	}
}

package main.symbols;

public class ClassSymbol extends Symbol {
	private SymbolTable childSymbolTable;
	
	public ClassSymbol(String name, SymbolTable parentSymbolTable) {
		super(name, "class", parentSymbolTable);
		
		this.childSymbolTable = new SymbolTable(this.parentSymbolTable,name);
	}
	
	@Override
	public SymbolTable getChildSymbolTable() {
		return this.childSymbolTable;
	}
}

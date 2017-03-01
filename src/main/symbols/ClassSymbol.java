package main.symbols;

public class ClassSymbol extends Symbol {
	private SymbolTable childSymbolTable;
	
	public ClassSymbol(String name, String type, SymbolTable parentSymbolTable) {
		super(name, type, parentSymbolTable);
		
		this.childSymbolTable = new SymbolTable(this.parentSymbolTable,name);
	}
	
	@Override
	public SymbolTable getChildSymbolTable() {
		return this.childSymbolTable;
	}
}

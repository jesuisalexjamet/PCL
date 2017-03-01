package main.symbols;

public class Method extends Symbol {
	private SymbolTable childSymbolTable;
	private int argCount;
	private Symbol returnType;
	
	public Method(String name, String type,
				SymbolTable parentSymbolTable,
				int argCount,
				String returnType) {
		super(name, type, parentSymbolTable);
		
		this.argCount = argCount;
		this.childSymbolTable = new SymbolTable(this.parentSymbolTable,name);
		this.returnType = this.parentSymbolTable.getSymbol(returnType);
	}
	
	@Override
	public SymbolTable getChildSymbolTable() {
		return this.childSymbolTable;
	}
}

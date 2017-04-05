package main.symbols;

public class Method extends Symbol {
	private SymbolTable childSymbolTable;
	private int argCount;
	private Symbol returnType;
	
	public Method(String name,
				SymbolTable parentSymbolTable,
				int argCount,
				String returnType) {
		super(name, "method", parentSymbolTable);
		
		this.argCount = argCount;
		this.childSymbolTable = new SymbolTable(this.parentSymbolTable,this);
		this.returnType = this.parentSymbolTable.getSymbol(returnType);
		this.arg = this.returnType;
	}
	
	public Symbol getReturnType() {
		return this.returnType;
	}
	public int getArgCount(){
		return this.argCount;
	}
	@Override
	public SymbolTable getChildSymbolTable() {
		return this.childSymbolTable;
	}
	
	@Override
	public String toString() {
		return super.toString()+" return :" + this.returnType.getName() + " numberArg :" + this.argCount;
	}
}

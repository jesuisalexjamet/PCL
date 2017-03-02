package main.symbols;

public class ClassSymbol extends Symbol {
	private SymbolTable childSymbolTable;
	private ClassSymbol parentClass;
	public ClassSymbol(String name, SymbolTable parentSymbolTable,String parentClass) {
		super(name, "class", parentSymbolTable);
		this.parentClass = (ClassSymbol) parentSymbolTable.getSymbol(parentClass);
		this.childSymbolTable = new SymbolTable(this.parentSymbolTable,name);
	}
	public ClassSymbol(String name, SymbolTable parentSymbolTable) {
		super(name, "class", parentSymbolTable);
		this.parentClass = null;
		this.childSymbolTable = new SymbolTable(this.parentSymbolTable,name);
	}
	@Override
	public SymbolTable getChildSymbolTable() {
		return this.childSymbolTable;
	}
	@Override
	public String toString() {
		if (parentClass == null){
			return super.toString();
		}else{
			return super.toString()+" heritage :" + this.parentClass.getName();
		}
	}
}

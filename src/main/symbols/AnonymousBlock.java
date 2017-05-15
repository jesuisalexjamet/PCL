package main.symbols;

public class AnonymousBlock extends Symbol {
	static int count = 0;
	private SymbolTable childSymbolTable;
	public AnonymousBlock(SymbolTable parentSymbolTable) {
		super(Integer.toString(count),"block",parentSymbolTable);
		count += 1;
		this.childSymbolTable = new SymbolTable(this.parentSymbolTable,name);
	}
	public AnonymousBlock(SymbolTable parentSymbolTable,int offset) {
		super(Integer.toString(count),"block",parentSymbolTable);
		this.offset = offset;
		count += 1;
		this.childSymbolTable = new SymbolTable(this.parentSymbolTable,name);
	}
	@Override
	public SymbolTable getChildSymbolTable() {
		return this.childSymbolTable;
	}

}

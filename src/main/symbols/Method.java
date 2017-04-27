package main.symbols;

import java.util.ArrayList;
import java.util.List;

public class Method extends Symbol {
	private SymbolTable childSymbolTable;
	private int argCount;
	private Symbol returnType;
	private ArrayList<String> argTypeList = new ArrayList<String>();
	
	public Method(String name,
				SymbolTable parentSymbolTable,
				int argCount,
				String returnType,
				ArrayList<String> argList) {
		super(name, "method", parentSymbolTable);
		
		this.argCount = argCount;
		this.childSymbolTable = new SymbolTable(this.parentSymbolTable,this);
		this.returnType = this.parentSymbolTable.getSymbol(returnType);
		this.arg = this.returnType;
		this.argTypeList=argList;
	}
	
	public Symbol getReturnType() {
		return this.returnType;
	}
	
	public ArrayList<String> getArgList() {
		return this.argTypeList;
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
		return super.toString()+" return :" + this.returnType.getName() + " numberArg :" + this.argCount + " argType :" + argTypeList;
	}
}

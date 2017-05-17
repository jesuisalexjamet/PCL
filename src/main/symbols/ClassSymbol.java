package main.symbols;

public class ClassSymbol extends Symbol {
	private SymbolTable childSymbolTable;
	private ClassSymbol parentClass;
	/**
	 * Constructeur avec heritage
	 * @param name
	 * @param parentSymbolTable
	 * @param parentClass
	 */
	public ClassSymbol(String name, SymbolTable parentSymbolTable,String parentClass) {
		super(name, "class", parentSymbolTable);
		this.parentClass = (ClassSymbol) parentSymbolTable.getSymbol(parentClass);
		this.childSymbolTable = new SymbolTable(this.parentSymbolTable,this);
	}
	/**
	 * Constructeur avec heritage et déplacement
	 * @param name
	 * @param parentSymbolTable
	 * @param parentClass
	 * @param offset
	 */
	public ClassSymbol(String name, SymbolTable parentSymbolTable,String parentClass, int offset) {
		super(name, "class", parentSymbolTable);
		this.offset=offset;
		this.parentClass = (ClassSymbol) parentSymbolTable.getSymbol(parentClass);
		this.childSymbolTable = new SymbolTable(this.parentSymbolTable,this);
	}
	/**
	 * Constructeur sans heritage mais avec déplacement
	 * @param name
	 * @param parentSymbolTable
	 * @param offset
	 */
	public ClassSymbol(String name, SymbolTable parentSymbolTable,int offset) {
		super(name, "class", parentSymbolTable);
		this.offset = offset;
		this.parentClass = null;
		this.childSymbolTable = new SymbolTable(this.parentSymbolTable,name);
	}
	
	/**
	 * Constructeur sans heritage
	 * @param name
	 * @param parentSymbolTable
	 */
	public ClassSymbol(String name, SymbolTable parentSymbolTable) {
		super(name, "class", parentSymbolTable);
		this.parentClass = null;
		this.childSymbolTable = new SymbolTable(this.parentSymbolTable,name);
	}
	/**
	 * getMethod donne la method associé au nom. Cherche d'abord dans la TDS de la class puis dans celle de la class herité.
	 * @param name nom de la method
	 * @return la method
	 */
	public Symbol getSymbol(String name){
		for (Symbol s: this.childSymbolTable){
			if (s.getName().equals(name)){
				return s;
			}
		}
		if (this.parentClass != null){
			return this.parentClass.getSymbol(name);
		}
		return null;
	}
	/**
	 * Retourne le symbole représentant la classe parente de la classe courante.
	 * 
	 * @return Symbole représentant la classe parente de la classe courante.
	 */
	public ClassSymbol getParentClass() {
		return this.parentClass;
	}
	public int getMethodCount() {
		int count = 0;
		
		for (Symbol curr: this.childSymbolTable) {
			if (curr instanceof Method) {
				count++;
			}
		}
		
		return count;
	}
	public int getAttributesCount() {
		int count = 0;
		
		for (Symbol curr: this.childSymbolTable) {
			if (curr instanceof Variable) {
				count++;
			}
		}
		
		return count;
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

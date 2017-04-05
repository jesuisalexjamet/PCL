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
	public Method getMethod(String name){
		for (Symbol s: this.childSymbolTable){
			if ((s instanceof Method) && (s.getName().equals(name))){
				return (Method) s;
			}
		}
		if (this.parentClass != null){
			return this.parentClass.getMethod(name);
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

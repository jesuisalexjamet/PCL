package main.symbols;
import java.util.*;
import org.antlr.runtime.tree.CommonTree;
public class SymbolTableBuilder {
	private CommonTree tree;
	private SymbolTable root;
	public SymbolTableBuilder(CommonTree tree){
		this.tree = tree;
		root = new SymbolTable(null, "Root");
		new Primitive("int", root);
		new Primitive("string", root);
		new Primitive("class", root);
		new Primitive("method", root);
	}
	public SymbolTable getSymboleTable(){
		for (CommonTree child : (List<CommonTree>) this.tree.getChildren()){
			this.checkChild(child, root);
		}
		return this.root;
	}
	
	private void checkChild(CommonTree parent,SymbolTable ST){
		String txt = parent.getText();
		List<CommonTree> children = parent.getChildren();
		switch (txt) {
		case "DECL_CLASS":
			ClassSymbol cls = new ClassSymbol(children.get(0).getText(),"class",ST);
			for (CommonTree child : children){
				this.checkChild(child, cls.getChildSymbolTable());
			}
			break;
		case "DECL_METHOD":
			int count = 1;
			while (children.get(count).getText() == "METHOD_ARGS"){
				count +=1;
			}
			Method mtd = new Method(children.get(0).getText(),"method",ST,count-1,children.get(count).getText());
			for (CommonTree child : children){
				this.checkChild(child, mtd.getChildSymbolTable());
			}
			break;
		case "DECL_VAR":
			String type = children.get(1).getText();
			Variable var = new Variable(children.get(0).getText(),type,ST);
			break;
		default:
			break;
		}
	}

}

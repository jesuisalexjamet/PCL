package main.symbols;
import main.symbols.controls.*;
import java.util.*;
import org.antlr.runtime.tree.CommonTree;
import main.antlr.errors.AbstractSemanticErrorReporter;
public class SymbolTableBuilder {
	private CommonTree tree;
	private SymbolTable root;
	private AbstractSemanticErrorReporter reporter;
	public SymbolTableBuilder(CommonTree tree,AbstractSemanticErrorReporter semanticErrorReporter){
		this.reporter = semanticErrorReporter;
		this.tree = tree;
		root = new SymbolTable(null, "Root");
		new Primitive("int", root);
		new Primitive("string", root);
		new Primitive("class", root);
		new Primitive("method", root);
		new Primitive("void", root);
		new Primitive("block", root);
	}
	public SymbolTable getSymboleTable(){
		int i=0;
		for (CommonTree child : (List<CommonTree>) this.tree.getChildren()){
			this.checkChild(child, root,i);		
			}
		return this.root;
	}
	
	public AbstractSemanticErrorReporter getErrorReporter() {
		return this.reporter;
	}

	private void checkChild(CommonTree parent,SymbolTable ST,int i){
		String txt = parent.getText();
		List<CommonTree> children = parent.getChildren();
		
		String type;
		switch (txt) {
		case "THIS":
			CheckMethod.checkThis(ST, reporter);
			break;
		case "SUPER":
			CheckHeritage.checkSuperInInheritedClass(ST, reporter, parent.getLine(), parent.getCharPositionInLine());
			CheckHeritage.checkSuperCalledInClass(ST, reporter, parent.getLine(), parent.getCharPositionInLine());
			CheckHeritage.checkCallSuperOnParent(parent.getChild(0).getText(), ST, reporter, parent.getLine(), parent.getCharPositionInLine());
			break;
		case "super":
			CheckHeritage.checkSuperInInheritedClass(ST, reporter, parent.getLine(), parent.getCharPositionInLine());
			CheckHeritage.checkSuperCalledInClass(ST, reporter, parent.getLine(), parent.getCharPositionInLine());
			CheckHeritage.checkCallSuperOnParent(parent.getParent().getChild(1).getText(), ST, reporter, parent.getLine(), parent.getCharPositionInLine());
			break;
		case "RETURN":
			CheckMethod.checkReturn(children.get(0).getText(), ST, reporter);
			break;
		case "DECL_CLASS":
			String parentClass = children.get(1).getText();
			
			ClassSymbol cls;

			if (!ST.checkType(parentClass)){
				cls = new ClassSymbol(children.get(0).getText(), ST,i+2);
			} else {
				cls = new ClassSymbol(children.get(0).getText(),ST,parentClass,i+4);
			}
			
			for (CommonTree child : children){
				this.checkChild(child, cls.getChildSymbolTable(),i);
			}
			
			break;
		case "DECL_METHOD":
			ArrayList<String> arglist = new ArrayList<String>();
			int count = 1;
			while (children.get(count).getText() == "METHOD_ARGS"){
				
				String argtype = ((CommonTree) children.get(count).getChildren().get(1)).getText();
				arglist.add(argtype);
				count +=1;
			}
			List enfant = children.get(count).getChildren();

			type = children.get(count).getText();
			if (!ST.checkType(type)){
				type = "void";
			}
			Method mtd = new Method(children.get(0).getText(),ST,count-1,type,arglist,i+2);
			for (CommonTree child : children){
				this.checkChild(child, mtd.getChildSymbolTable(),i);
			}
			
			CheckHeritage.checkOverloadedMethod(mtd, (ClassSymbol) ST.getSymbol(ST.getName()), reporter, parent.getLine(), parent.getCharPositionInLine());
			break;
		case "BODY":
            AnonymousBlock anonymous = new AnonymousBlock(ST);

            for (CommonTree child : children){
                this.checkChild(child, anonymous.getChildSymbolTable(),i);
            }
			break;
		case "AFFECT":
			 String left = children.get(0).getText();
			 String right = children.get(1).getText();
			 CheckAffectation.checkAffectation(left, right, ST, reporter,children.get(0).getChildren(),children.get(1).getChildren(),parent.getLine(),parent.getCharPositionInLine());
			 break;
		case "DECL_VAR":
			type = children.get(1).getText();
			if (!CheckDeclaration.checkDoubleDeclaration(children.get(0).getText(), ST, reporter)) {
				new Variable(children.get(0).getText(),type,ST,i-25);
			}
			break;
		case "METHOD_ARGS":
			type = children.get(1).getText();
			new Variable(children.get(0).getText(),type,ST,42);
			break;
		case "DO":
			CheckMethod.checkDO(children, ST, reporter);
			break;
		
		case "FOR":
			CheckBoucle.checkBounds(children, ST, reporter);
			CheckBoucle.checkModification(children, ST, reporter);
			CheckBoucle.checkOrder(children, ST, reporter);
			break;
		case "COND":
			CheckCondition.checkCond(children, ST, reporter,parent.getLine(),parent.getCharPositionInLine());
		/*
		case "/":
			CheckComparaison.checkComparaison(children.get(0).getText(), children.get(1).getText(), ST, reporter,children.get(0).getChildren(),children.get(1).getChildren());
			break;
		case "*":
			CheckComparaison.checkComparaison(children.get(0).getText(), children.get(1).getText(), ST, reporter,children.get(0).getChildren(),children.get(1).getChildren());
			break;
		case "-":
			CheckComparaison.checkComparaison(children.get(0).getText(), children.get(1).getText(), ST, reporter,children.get(0).getChildren(),children.get(1).getChildren());
			break;
		case "+":
			CheckComparaison.checkComparaison(children.get(0).getText(), children.get(1).getText(), ST, reporter,children.get(0).getChildren(),children.get(1).getChildren());
			break;
		case ">":
			CheckComparaison.checkComparaison(children.get(0).getText(), children.get(1).getText(), ST, reporter,children.get(0).getChildren(),children.get(1).getChildren());
			break;
		case "<":
			CheckComparaison.checkComparaison(children.get(0).getText(), children.get(1).getText(), ST, reporter,children.get(0).getChildren(),children.get(1).getChildren());
			break;
		case ">=":
			CheckComparaison.checkComparaison(children.get(0).getText(), children.get(1).getText(), ST, reporter,children.get(0).getChildren(),children.get(1).getChildren());
			break;
		case "<=":
			CheckComparaison.checkComparaison(children.get(0).getText(), children.get(1).getText(), ST, reporter,children.get(0).getChildren(),children.get(1).getChildren());
			break;
		case "==":
			CheckComparaison.checkComparaison(children.get(0).getText(), children.get(1).getText(), ST, reporter,children.get(0).getChildren(),children.get(1).getChildren());
			break;
		case "!=":
			CheckComparaison.checkComparaison(children.get(0).getText(), children.get(1).getText(), ST, reporter,children.get(0).getChildren(),children.get(1).getChildren());
			break;
		default:
			break;
			
		*/
		}
		
		if (children != null) {
			if ( !txt.equals("BODY") && !txt.equals("DECL_CLASS") && !txt.equals("DECL_METHOD")) 
				for (CommonTree child : children){
						this.checkChild(child, ST,i);		
			}
		}
	}

}

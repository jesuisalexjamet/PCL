package main.assembly;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;

import main.compiler.Program;
import main.symbols.*;

/**
 * AssemblyBuilder est une classe dédiée à la traduction des structures
 * de données que sont la table des symboles et l'arbre abstrait d'un
 * programme en langage d'assemblage.
 * 
 * Cette classe implémente le design pattern Singleton: il n'existe qu'une
 * unique instance de cette classe pendant toute l'exécution du programme.
 * 
 * @author alexandrejamet
 *
 */
public class AssemblyBuilder {
	private static AssemblyBuilder _instance = null;
	/**
	 * Constructeur par défaut de la classe AssemblyBuilder.
	 */
	private AssemblyBuilder() {
		
	}
	
	/**
	 * Retourne l'unique instance de la classe AssemblyBuilder.
	 * Initialise la dite instance si nécessaire.
	 * 
	 * @return L'unique instance de la classe AssemblyBuilder
	 */
	public static AssemblyBuilder getInstance() {
		// Instanciation de l'unique instance de la classe.
		if (AssemblyBuilder._instance == null) {
			AssemblyBuilder._instance = new AssemblyBuilder();
		}
		
		return AssemblyBuilder._instance;
	}
	
	/**
	 * Méthode de traduction d'un programme en langage d'assemblage.
	 * 
	 * On supposse que le programme est correct tant syntaxiquement
	 * que sémantiquement.
	 * 
	 * Pour plus d'informations sur l'algorithme de traduction en
	 * langage d'assemblage, se réferer à la fiche docs/assembly-builder.md.
	 * 
	 * @param prg Le programme a traduire en langage d'assemblage
	 * @return Le programme traduit en langage d'assemblage sous forme
	 * d'une chaîne de caractères.
	 */
	public String translateProgram(Program prg) {
		String assPrg = this.bootstrap(prg) + "\n";
		assPrg += this.translateGlobalVariables(prg) + "\n";
		assPrg += this.translateClasses(prg) + "\n";
		assPrg += this.translateGlobalInstructions(prg) + "\n";
		return assPrg;
	}
	
	/**
	 * Méthode permettant d'obtenir une séquence d'amorçage spécifique au
	 * programme passé en paramètre.
	 * 
	 * @param prg Le programme pour lequel doit être produit une séquence d'amorçage
	 * @return La séquence d'amorçage spécifique au programme passé en paramètre
	 * sous la forme d'un code source écrit en lagnage d'assemblage.
	 */
	private String bootstrap(Program prg) {
		return new String("SP EQU R15\nHP EQU R14\n\nORG 0x0000\n");
	}
	
	/**
	 * Méthode permettant d'obtenir une représentation sous forme de langage d'assemblage
	 * des descripteurs de classes à partir du programme passé en paramètre. Cette méthode
	 * propose également une traduction des méthodes des classes.
	 * 
	 * @param prg Le programme pour lequel doit être produit des descripteurs de classes
	 * sous la forme de langage d'assemblage.
	 * @return L'ensemble des descripteurs de classes du programme sous la forme de langage
	 * d'assemblage.
	 */
	private String translateClasses(Program prg) {
		String res;
		String descriptors = "";
		String descriptorsInit = "INIT_DESCRIPTOR ";
		String methods = "";
		
		// Pour chaque déclaration de classes...
		for (Symbol curr: prg.getSymbolTable()) {
			if (curr instanceof ClassSymbol) {
				ClassSymbol currClass = (ClassSymbol) curr;
				ClassSymbol parentClass = (ClassSymbol) currClass.getParentClass();
				
				int descriptorSize = 1; // Taille du descripteur en mots.
				
				// On ajoute à descriptorSize le nombre de méthode de la classe...
				descriptorSize += currClass.getMethodCount();
				
				descriptors += String.format("%1s_CLASSDESCRIPTOR RSW %d\n", currClass.getName().toUpperCase(), descriptorSize);
				
				// Consturction de la séquence d'initialisation du descripteur de classe.
				if (parentClass != null) {
					descriptorsInit += String.format("LDW R1, #%1s_CLASSDESCRIPTOR\nSTW R1, @%2s_CLASSDESCRIPTOR\n", parentClass.getName().toUpperCase(), currClass.getName().toUpperCase());
				} else {
					descriptorsInit += String.format("LDW R1, #0xFFFF\nSTW R1, @%1s_CLASSDESCRIPTOR\n", currClass.getName().toUpperCase());
				}
				
				int classDescriptorOffset = 2;
				
				for (Symbol classChild: currClass.getChildSymbolTable()) {
					if (classChild instanceof Method) {
						descriptorsInit += String.format("LDW R1, #%1s_%2s\nSTW R1, @(%3s_CLASSDESCRIPTOR + %d)\n", currClass.getName().toUpperCase(), classChild.getName().toUpperCase(), currClass.getName().toUpperCase(), classDescriptorOffset);
						
						classDescriptorOffset += 2;
						
						// Recherche du noeud de l'arbre abstrait correspondant à la définition de la méthode.
						CommonTree matchingNode = prg.getAbstractTree();
						
						for (CommonTree node: (List<CommonTree>) prg.getAbstractTree().getChildren()) {
							if (node.getText() == "DECL_CLASS" && node.getChild(0).getText() == currClass.getName()) {
								matchingNode = node;
								break;
							}
						}
						
						for (CommonTree node: (List<CommonTree>) matchingNode.getChildren()) {
							if (node.getText() == "DECL_METHOD" && node.getChild(0).getText() == classChild.getName()) {
								matchingNode = node;
								break;
							}
						}
						
						methods += this.translateMethods(classChild.getChildSymbolTable(), matchingNode) + "\n";
					}
				}
				
				descriptorsInit += "\n";
			}
		}
		
		res = descriptors + "\n";
		res += descriptorsInit + "\n";
		res += methods;
		
		return res;
	}
	
	/**
	 * Méthode permettant d'obtenir une représentation sous forme de langage d'assemblage
	 * des différentes méthodes définies dans le programme sous la forme de langage d'assemblage.
	 * 
	 * @param prg
	 * @return
	 */
	private String translateMethods(SymbolTable table, CommonTree tree) {
		String res = String.format("%1s_%2s ", table.getParent().getName().toUpperCase(), table.getName().toUpperCase());
		
		return res;
	}
	
	/**
	 * Méthode permettant d'obtenir une représentation sous forme de langage d'assemblage
	 * de l'ensemble des variables globales définies dans le programme.
	 * 
	 * @param prg
	 * @return
	 */
	private String translateGlobalVariables(Program prg) {
		String res = "";
		
		// On parcours les l'ensemble des variables définies à la racines de la table des symboles.
		for (Symbol curr: prg.getSymbolTable()) {
			if (curr instanceof Variable) {
				res += String.format("%1s RSW 1\n", curr.getName().toUpperCase());
			}
		}
		
		return res;
	}
	
	/**
	 * Méthode permettant d'obtenir une représentation sous forme de langage d'assemblage les déclarations de variables
	 * 
	 * @param tree, ST
	 * @return
	 */
	private String translateDeclaration(CommonTree tree, SymbolTable ST) {
		String res = "";
		String node = tree.getText();
		if (node.equals("DECL_VAR")) {
			res += "STW (SP)2, SP";
		}
		return res;
	}
	
	/**
	 * Méthode permettant d'obtenir une représentation sous forme de langage d'assemblage les affectations de variables
	 * 
	 * @param tree, ST
	 * @return
	 */
	private String translateAffectation(CommonTree tree, SymbolTable ST) {
			String res = "";
			CommonTree childOne = (CommonTree) tree.getChild(0);
			CommonTree childTwo = (CommonTree) tree.getChild(1);
			Symbol symb = ST.getSymbol(childOne.getText());
			if (symb.getType().getName().equals("int")) {
				int offset = symb.getOffset();
				String value = childTwo.getText();
				if (!value.matches("([+,-,*,/])")) {
					res += "STW "+value+", (SP)"+Integer.toString(offset) +"\n";
				}
				else {
					res += translateArithmetic(childTwo,ST);
					res += "STW R3,(SP)"+Integer.toString(offset)+"\n";
				}
					
			}
			return res;
	}
	
	/**
	 * Méthode permettant d'obtenir une représentation sous forme de langage d'assemblage les opérations arithmétiques
	 * 
	 * @param tree, ST
	 * @return
	 */
	private String translateArithmetic(CommonTree tree, SymbolTable ST) {
		String res = "";
		String operation = tree.getText();
		if (!operation.matches("([+,-,*,/])")){
			res += translateArithmetic((CommonTree) tree.getChild(0), ST);
			res += translateArithmetic((CommonTree) tree.getChild(1), ST);
			return res;
		}
		CommonTree childOne = (CommonTree) tree.getChild(0);
		CommonTree childTwo = (CommonTree) tree.getChild(1);
		if (childTwo.getText().matches("([+,-,*,/])")) {
			res += translateArithmetic(childTwo,ST);
		}
		else if (childTwo.getText().matches("[0-9]+")) {
			res += "LDW R1, #" + childTwo.getText()+ "\n";
			res = res + "STW R1, -(SP)\n";
		}
		else {
			
		}
		if (childOne.getText().matches("([+,-,*,/])")) {
			res += translateArithmetic(childOne,ST);
		}
		else if (childOne.getText().matches("[0-9]+")) {
			res += "LDW R1, #" + childOne.getText()+ "\n";
			res = res + "STW R1, -(SP)\n";
		}
		else {
			
			res+="coucou";
		}
		
		
		switch (operation) {
		case "+": res += "LDW R1, (SP)+\nLDW R2, (SP)+\nADD R1, R2, R3\nSTW R3, -(SP) \n"; break;
		case "-": res += "LDW R1, (SP)+\nLDW R2, (SP)+\nSUB R1, R2, R3\nSTW R3, -(SP) \n"; break;
		case "*": res += "LDW R1, (SP)+\nLDW R2, (SP)+\nMUL R1, R2, R3\nSTW R3, -(SP) \n"; break;
		case "/": res += "LDW R1, (SP)+\nLDW R2, (SP)+\nDIV R1, R2, R3\nSTW R3, -(SP) \n"; break;
	}
		return res;
	}
	/**
	 * Méthode permettant d'obtenir une représentation sous forme de langage d'assemblage
	 * des instructions présentent dans le portée globale.
	 * 
	 * @param prg
	 * @return
	 */
	private String translateGlobalInstructions(Program prg) {
		String res = "MAIN ";
		CommonTree tree = prg.getAbstractTree();
		SymbolTable ST = prg.getSymbolTable();
		res += this.mainTranslate(tree, ST);
		return res;
	}
	public String mainTranslate(CommonTree tree, SymbolTable ST){
		String res = "";
		for (CommonTree child : (List<CommonTree>) tree.getChildren()){
			switch (child.getText()){
			case "AFFECT": res += this.translateAffectation(child, ST); break;
			case "DECL_METHOD": break;
			}
		}
		return res;
	}
}

grammar Looc;

options {
	langage=Java;
	k=1;
	output=AST;
	ASTLabelType=CommonTree;
}

tokens {
	PROG;
	VARDECL;
	CLASSDECL;
	FUNCDECL;
	INSTR;
	
	
	
}

program: 	 class_decl* var_decl* instruction+
			;

class_decl: 	'class' IDF_CLASS ('inherit' IDF_CLASS)? '=' '(' class_item_decl ')' 
				;

class_item_decl: 	var_decl* method_decl*
					;

var_decl: 	'var' IDF ':' type ';' 
		;

type: 	IDF_CLASS
		| 'int'
		| 'string'
		;

method_decl:	'method' IDF '(' method_args* ')'  method_decl_suite 
				;

method_decl_suite: '{' var_decl* instruction+ '}'
					| ':' type '{' var_decl* instruction+ '}'
					;

method_args:	IDF ':' type (',' IDF ':' type )*
				;

instruction:	IDF ':=' definition ';'
		| 'if' expression 'then'  instruction+ ('else' instruction+)?'fi'
		| 'for' IDF 'in' expression '..' expression  'do' instruction+ 'end' 
		| '{'  var_decl* instruction+  '}' 
		| 'do' expression_start '.' IDF '('expression (',' expression)* ')' ';' 
		| print
		| read
		| retour 
		;
		

definition: expression?
		;

print:	'write' print_suite ';' 
	;

print_suite:	expression 
		| CSTE_CHAINE //{System.out.print($CSTE_CHAINE.text);} 
		;

read:	'read' IDF ';' 
		;

retour:		'return' '(' expression ')' ';' 
			;

expression_start
	:	IDF
	|'this'
	|'super'
	;	

expression
	:	'(' expression ')' expression_suite
		| IDF expression_suite
		| '-' CSTE_ENT expression_suite
		| 'this' expression_suite
		| 'super' expression_suite
		| CSTE_ENT expression_suite
		| CSTE_CHAINE
		| 'new' IDF_CLASS
		|
		;
		
expression_suite:
		'.' IDF '(' expression (',' expression)* ')'
		| multOper* oper*
		| oper*
		| comparaison expression
		;

multOper
	:	
		  '/' atom
		| '*'  atom 
		| '%'  atom 
	;

oper returns [int value]
	:	'+' atom multOper*
		|'-' atom multOper*

		;

atom returns [int value]
    :   CSTE_ENT //{$value = Integer.parseInt($INT.text);}
    |   IDF
    |  '(' expression ')' //{$value = $expression.value;}
    ;
comparaison:	'<' strict
		| '>' strict
		| '=='
		| '!='
		;
strict: 	'='
		|
		;
IDF_CLASS : ('A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
IDF : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
CSTE_ENT :   ('0'..'9')+ ;
CSTE_CHAINE :	'"' ('a'..'z'|'A'..'Z'|'0'..'9'|';'|':'|'/'|','|'?'|'!'|'%'|'@'|'#'|'~'|'&'|'\\'|'-'|'_'|'|'|'('|')'|'{'|'}'|'['|']'|'='|' ')+ '"';
WS  :   (' '|'\t'|'\n'|'\r') {$channel=HIDDEN;} ;		


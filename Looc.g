grammar Looc;

options {
	k=1;
	output=AST;
	ASTLabelType=CommonTree;
}

tokens {
	ROOT;
	DECCLASS;
	DECVAR;
	DECMETH;
	METHARGS;
	COND;
	FOR;
	DO;
	AFFECT;
	WRITE;
	RETURN;
	OPER;


}

program: 	 class_decl* var_decl* instruction+ -> ^(ROOT class_decl* var_decl* instruction+)
			;

class_decl: 	'class' IDF_CLASS ('inherit' IDF_CLASS)? '=' '(' class_item_decl ')' -> ^(DECCLASS IDF_CLASS (IDF_CLASS)? class_item_decl)
				;

class_item_decl: 	var_decl* method_decl* -> var_decl* method_decl*
					;

var_decl: 	'var' IDF ':' type ';' -> ^(DECVAR IDF type)
		;

type: 	IDF_CLASS
	| 'int'
	| 'string'
	;

method_decl:	'method' IDF '(' method_args* ')'  (':' type)? '{'var_decl* instruction+ '}' -> ^(DECMETH IDF method_args* type? var_decl* instruction)
				;


method_args:	IDF ':' type (',' IDF ':' type )* -> ^(METHARGS IDF type)
				;

instruction:	IDF ':=' expression ';' -> ^(AFFECT IDF expression)
		| 'if' expression 'then'  c=instruction+ ('else' d=instruction+)?'fi' -> ^(COND expression $c ($d)?)
		| 'for' IDF 'in' g=expression '..' h=expression  'do' instruction+ 'end' -> ^(FOR IDF $g $h instruction)
		| '{'  var_decl* instruction+  '}' -> var_decl* instruction
		| 'do' expression_start '.' IDF '('expression (',' expression)* ')' ';' -> ^(DO expression_start IDF expression*)
		| print
		| read
		| retour
		;



print:	'write' expression ';' -> ^(WRITE expression)
	;


read:	'read' IDF ';'
		;

retour:		'return' '(' expression ')' ';' -> ^(RETURN expression)
			;

expression_start
	:	IDF
		|'this'
		|'super'
	;

expression
	:	'(' expression ')' expression_suite -> expression expression_suite
		| IDF ^expression_suite
		| '-' CSTE_ENT ^expression_suite
		| 'this' ^expression_suite
		| 'super' ^expression_suite
		| CSTE_ENT ^expression_suite
		| 'new'! IDF_CLASS
		| CSTE_CHAINE
		|
		;

expression_suite:
		'.' IDF '(' expression (',' expression)* ')' -> IDF expression*
		| multOper+ oper* -> multOper+ oper*
		| oper* -> oper*
		| comparaison expression -> comparaison expression
		;

multOper
	:	/*e=atom {$value = $e.value;}*/
		 '/' ^atom
		| '*'  ^atom
		| '%'  ^atom
	;

oper
	:	'+' ^atom multOper*//{$value += $e.value;}
		|'-' ^atom multOper* //{$value -= $e.value;}
		;

atom
    :   CSTE_ENT //{$value = Integer.parseInt($INT.text);}
    |   IDF
    |  '(' expression ')'-> expression //{$value = $expression.value;}
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
CSTE_CHAINE :	'"' ('a'..'z'|'A'..'Z'|'0'..'9'|';'|':'|'/'|','|'?'|'!'|'%'|'@'|'#'|'~'|'&'|'\\'|'-'|'_'|'|'|'('|')'|'{'|'}'|'['|']'|'='|' ')* '"';
WS  :   (' '|'\t'|'\r'| '\n') {$channel=HIDDEN;} ;

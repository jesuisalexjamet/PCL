grammar Looc;

program: 	class_decl* var_decl* instruction+
			;

class_decl: 	'class' IDF_CLASS ('inherit' IDF_CLASS)? '=' '('NEWLINE class_item_decl ')' NEWLINE
				;

class_item_decl: 	var_decl* method_decl*
					;

var_decl: 	'var' IDF ':' type ';' NEWLINE
		;

type: 	IDF_CLASS
		| 'int'
		| 'string'
		;

method_decl:	'method' IDF '(' method_args* ')'  method_decl_suite NEWLINE
				;

method_decl_suite: '{'NEWLINE var_decl* instruction+ '}'
					| ':' type '{' var_decl* instruction+ '}'
					;

method_args:	IDF ':' type (',' IDF ':' type )*
				;

instruction:	IDF ':=' definition ';'NEWLINE
		| 'if' expression 'then' NEWLINE instruction+ ('else'NEWLINE instruction+)?'fi'NEWLINE
		| 'for' IDF 'in' expression '..' expression  'do'NEWLINE instruction+ 'end' NEWLINE
		| '{' NEWLINE var_decl* instruction+ NEWLINE '}' NEWLINE
		| 'do' expression_start '.' IDF '(' expression (',' expression)* ')' ';' NEWLINE
		| print
		| read
		| retour NEWLINE
		;


definition: expression
		|
		;

print:	'write' print_suite ';'NEWLINE
	;

print_suite:	expression
		| CSTE_CHAINE {System.out.print($CSTE_CHAINE.text);}
		;

read:	'read' IDF ';' NEWLINE
		;

retour:		'return' '(' expression ')' ';' NEWLINE
			;

expression: 	expression_start expression_suite
		;


expression_start
	:	 '(' expression ')'
		| IDF
		| '-' CSTE_ENT
		| 'this'
		| 'super'
		| CSTE_ENT
		| 'new' IDF_CLASS
		;

expression_suite:
		'.' IDF '(' expression (',' expression)* ')'
		| multOper
		| oper
		| comparaison expression
		;

multOper returns [int value]
	:	/*e=atom {$value = $e.value;}*/
		(  '/' atom
		| '*'  atom
		| '%'  atom
		)+
		|
	;

oper returns [int value]
	:	('+' atom multOper //{$value += $e.value;}
		|'-' atom multOper //{$value -= $e.value;}
		)+
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
NEWLINE:	('\r'? '\n')* ;
WS  :   (' '|'\t')+ {$channel=HIDDEN;} ;

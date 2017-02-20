grammar Looc;

options {
    k=1;
    output=AST;
    ASTLabelType=CommonTree;
}

tokens {
    ROOT;
    DECL_CLASS;
    DECL_VAR;
    DECL_METHOD;
    METHOD_ARGS;
    COND;
    FOR;
    DO;
    AFFECT;
    WRITE;
    RETURN;
    OPER;
    READ;
}

@header {
    package main.antlr;
}

@lexer::header {
    package main.antlr;
}

program
    :   class_decl* var_decl* instruction+ -> ^(ROOT class_decl* var_decl* instruction+)
    ;

class_decl
    :   'class' IDF_CLASS ('inherit' IDF_CLASS)? '=' '(' class_item_decl ')' -> ^(DECL_CLASS IDF_CLASS (IDF_CLASS)? class_item_decl)
    ;

class_item_decl
    :   var_decl* method_decl* -> var_decl* method_decl*
    ;

var_decl
    :   'var' IDF ':' type ';' -> ^(DECL_VAR IDF type)
    ;

type
    :   IDF_CLASS
    |   'int'
    |   'string'
    ;

method_decl
    :   'method' IDF '(' method_args* ')'  (':' type)? '{'var_decl* instruction+ '}' -> ^(DECL_METHOD IDF method_args* type? var_decl* instruction)
    ;

method_args
    :   IDF ':' type (',' IDF ':' type )* -> ^(METHOD_ARGS IDF type)
    ;

instruction
    :   IDF ':=' expression ';' -> ^(AFFECT IDF expression)
    |   'if' expression 'then'  c=instruction+ ('else' d=instruction+)?'fi' -> ^(COND expression $c ($d)?)
    |   'for' IDF 'in' g=expression '..' h=expression  'do' instruction+ 'end' -> ^(FOR IDF $g $h instruction)
    |   '{'  var_decl* instruction+  '}' -> var_decl* instruction
    |   'do' expression_start '.' IDF '('expression (',' expression)* ')' ';' -> ^(DO expression_start IDF expression*)
    |   print
    |   read
    |   retour
    ;

print
    :   'write' expression ';' -> ^(WRITE expression)
    ;

read:    'read' IDF ';' -> ^(READ IDF)
        ;

retour
    :   'return' '(' expression ')' ';' -> ^(RETURN expression)
    ;

expression_start
    :   IDF
    |   'this'
    |   'super'
    ;

expression
    :   '-' (IDF|CSTE_ENT)  ('.' IDF '(' expression (',' expression)* ')'|comparaison expression)?
    |   'this' ( '.' IDF '(' expression (',' expression)* ')')?
    |   'super' ( '.' IDF '(' expression (',' expression)* ')')?
    |   oper* ( '.'! IDF ^'('! expression (','! expression)* ')'!|comparaison ^expression)?
    |   'new'! IDF_CLASS
    |   CSTE_CHAINE
    ;

multOper
    :    /*e=atom {$value = $e.value;}*/
        atom  (('/'|'*'|'%') ^atom)*
    ;

oper
    :   multOper (('+'|'-') ^multOper)*//{$value += $e.value;}
    ;

atom
    :   CSTE_ENT
    |   IDF
    |  '(' expression ')'-> expression //{$value = $expression.value;}
    ;

comparaison
    :   '<' strict
    |   '>' strict
    |   '=='
    |   '!='
    ;

strict
    :   '='
    |
    ;

IDF_CLASS:      ('A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
IDF:            ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
CSTE_ENT:       ('0'..'9')+ ;
CSTE_CHAINE:    '"' ('a'..'z'|'A'..'Z'|'0'..'9'|';'|':'|'/'|','|'?'|'!'|'%'|'@'|'#'|'~'|'&'|'\\'|'-'|'_'|'|'|'('|')'|'{'|'}'|'['|']'|'='|' ')* '"';
WS:             (' '|'\t'|'\r'| '\n') {$channel=HIDDEN;} ;

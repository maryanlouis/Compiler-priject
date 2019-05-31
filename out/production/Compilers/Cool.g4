grammar Cool;
import LexerGramCool;
program
   : programBlocks
   ;

programBlocks
   : classDefine ';' programBlocks # classes
   | EOF # eof
   ;

classDefine
   : CLASS TYPEID (INHERITS TYPEID)? '{' (feature ';')* '}'
   ;

feature
   : OBJECTID '(' (formal (',' formal)*)? ')' ':' TYPEID '{' expression '}' # method
   | OBJECTID ':' TYPEID (ASSIGNMENT expression)? # property
   ;

formal
   : OBJECTID ':' TYPEID
   ;

/* method argument */
expression
   : expression ('@' TYPEID)? '.' OBJECTID '(' (expression (',' expression)*)* ')' # methodCall
   | OBJECTID '(' (expression (',' expression)*)* ')' # ownMethodCall
   | IF expression THEN expression ELSE expression FI # if
   | WHILE expression LOOP expression POOL # while
   | '{' (expression ';') + '}' # block
   | LET OBJECTID ':' TYPEID (ASSIGNMENT expression)? (',' OBJECTID ':' TYPEID (ASSIGNMENT expression)?)* IN expression # letIn
   | CASE expression OF (OBJECTID ':' TYPEID CASE_ARROW expression ';') + ESAC # case
   | NEW TYPEID # new
   | INTEGER_NEGATIVE expression # negative
   | ISVOID expression # isvoid
   | expression MULTIPLY expression # multiply
   | expression DIVISION expression # division
   | expression ADD expression # add
   | expression MINUS expression # minus
   | expression LESS_THAN expression # lessThan
   | expression LESS_EQUAL expression # lessEqual
   | expression EQUAL expression # equal
   | NOT expression # boolNot
   | '(' expression ')' # parentheses
   | OBJECTID # id
   | INT # int
   | STRING # string
   | TRUE # true
   | FALSE # false
   | OBJECTID ASSIGNMENT expression # assignment
   ;


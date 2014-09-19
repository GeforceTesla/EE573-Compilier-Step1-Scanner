grammar Micro;

r :
	'PROGRAM' | 'BEGIN' | 'END' | 'FUNCTION' | 'READ' | 'WRITE' | 'IF' |
	'ELSE' | 'ENDIF' | 'WHILE' | 'ENDWHILE' | 'CONTINUE' | 'BREAK' |
	'RETURN' | 'INT' | 'VOID' | 'STRING' | 'FLOAT' ;

OPERATOR :
	':=' | '+' | '-' | '*' | '/' | '=' | '!=' | '<' | '>' | '(' |
	')' | ';' | ',' | '<=' | '>=' ;

INTLITERAL :
	[0-9]+;

FLOATLITERAL :
	([0-9]+ '.' [0-9]+) | ('.' [0-9]+) ;

STRINGLITERAL :
	'"' ~('"')*'"' ;

ID :
	[A-za-z]([A-za-z] | [0-9])+ | [A-za-z] ;

WS :
	([ \t\r\n]+ | '--' ~('\n')*) -> skip ;

/* Program */
program :
	'PROGRAM' id 'BEGIN' pgm_body 'END' ;
id :
	ID ;
pgm_body :
	decl func_declarations ;
decl :
	string_decl decl | var_decl decl |  ;

/* Global String Declaration */
string_decl :
	'STRING' id ':=' str ';' ;
str :
	STRINGLITERAL ;

/* Variable Declaration */
var_decl :
	var_type id_list ';' ;
var_type :
	'FLOAT' | 'INT' ;
any_type :
	var_type | 'VOID' ;
id_list :
	id id_tail ;
id_tail :
	',' id id_tail |  ;

/* Function Paramater List */
param_decl_list :
	param_decl param_decl_tail |  ;
param_decl :
	var_type id ;
param_decl_tail :
	',' param_decl param_decl_tail |  ;

/* Function Declarations */
func_declarations :
	func_decl func_declarations |  ;
func_decl :
	'FUNCTION' any_type id '(' param_decl_list ')' 'BEGIN' func_body 'END' ;
func_body :
	decl stmt_list ;

/* Statement List */
stmt_list :
	stmt stmt_list |  ;
stmt :
	base_stmt | if_stmt | while_stmt ;
base_stmt :
	assign_stmt | read_stmt | write_stmt | return_stmt ;

/* Basic Statements */
assign_stmt :
	assign_expr ';' ;
assign_expr :
	id ':=' expr ;
read_stmt :
	'READ' '(' id_list ')'';' ;
write_stmt :
	'WRITE' '(' id_list ')'';' ;
return_stmt :
	'RETURN' expr ';' ;

/* Expressions */
expr :
	 expr_prefix factor ;
expr_prefix :
	expr_prefix factor addop |  ;
factor :
	factor_prefix postfix_expr ;
factor_prefix :
	factor_prefix postfix_expr mulop |  ;
postfix_expr :
	primary | call_expr ;
call_expr :
	id '(' expr_list ')' ;
expr_list :
	expr expr_list_tail |  ;
expr_list_tail :
	',' expr expr_list_tail |  ;
primary :
	'(' expr ')' | id | INTLITERAL | FLOATLITERAL ;
addop :
	'+' | '-' ;
mulop :
	'*' | '/' ;

/* Complex Statements and Condition */ 
if_stmt :
	'IF' '(' cond ')' decl stmt_list else_part 'ENDIF' ;
else_part :
	'ELSE' decl stmt_list |  ;
cond :
	expr compop expr ;
compop :
	'<' | '>' | '=' | '!=' | '<=' | '>=' ;

/* ECE 573 students use this version of do_while_stmt */
while_stmt :
	'WHILE' '(' cond ')' decl aug_stmt_list 'ENDWHILE' ;

/* CONTINUE and BREAK statements. ECE 573 students only */
aug_stmt_list :
	aug_stmt aug_stmt_list |  ;
aug_stmt :
	base_stmt | aug_if_stmt | while_stmt | 'CONTINUE'';' | 'BREAK'';' ;

/* Augmented IF statements for ECE 573 students */ 
aug_if_stmt :
	'IF' '(' cond ')' decl aug_stmt_list aug_else_part 'ENDIF' ;
aug_else_part :
	'ELSE' decl aug_stmt_list aug_else_part |  ;

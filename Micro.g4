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

COMMENT :
	'--' ~('\n')* ;

ID :
	[A-za-z]([A-za-z] | [0-9])+ | [A-za-z] ;

WS :
	[ \t\r\n]+ -> skip ;

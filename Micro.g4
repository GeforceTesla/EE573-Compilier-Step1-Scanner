grammar Micro;

keyword :
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

IDENTIFIERS :
	[A-za-z]([A-za-z] | [0-9])+ ;

WS :
	[ \t\r\n]+ -> skip ;

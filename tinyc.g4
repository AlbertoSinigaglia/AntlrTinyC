grammar tinyc;

start     : program EOF ;
program   : statement | statement program ;
          
statement : decl ';' | assign ';' | branch | out ';' | loop;

loop      : 'while' '(' relation ')' '{' program '}';
decl      : 'int' ID ;
assign    : ID '='  ( expr | arith | relation );
out       : 'write' '(' expr ')' | 'write' '(' STRING ')' ;
branch    : 'if' '(' relation ')' '{' program '}' | 'if' '(' relation ')' '{' program '}' 'else' '{' program '}';
expr      : NUMBER | ID | input;
read      : 'read' '(' ')';
arith     : expr | arith arithmetic_operator arith | '(' arith ')';
relation  : arith | relation logic_operator relation | relation comparison_operator relation | '(' relation ')';
input     : read;
arithmetic_operator : ADD | SUB | MUL | DIV | MOD;
logic_operator : AND | OR | NOT;
comparison_operator : EQ | LT | LEQ | GT | GEQ | NEQ;

ADD       : '+'; 
SUB       : '-';
MUL       : '*';
DIV       : '/';
MOD       : '%';
AND       : '&&' ;
OR        : '||' ;
NOT       : '!' ;
EQ        : '==' ;
LT        : '<' ;
LEQ       : '<=' ;
GT        : '>' ;
GEQ       : '>=' ;
NEQ       : '!=' ;
ID        : [a-z]+ ;
NUMBER    : [0-9]+ ;
STRING    : '"'.*?'"';
COMMENT   : '/*' .*? '*/' -> skip ;     // .*? matches anything until the first */
LINE_COMMENT : '//' ~[\r\n]* -> skip ;  // ~[\r\n]* matches anything but \r and \n
WS        : [ \n\t\r]+ -> skip;
ErrorChar : . ;


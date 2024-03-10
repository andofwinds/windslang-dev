grammar winds;


cmdLine:
    (anyCommand)* EOF;

anyCommand:
    ((command args) |
     assign |
     ops    |
     run
    );

command:
    ('global'  |
    'extern'   |
    'section'  |
    'override' |
    'call'     |
    'syscall'  |
    'return'   );

args:
    (function  |
     NAME      |
     STRING    |
     INTEGER   |
     HEX       |
     register  |
     NULL
    );

function:
    NAME funargs ( | '>' (register ':' args)+ );

funargs:
    '(' ( | (NAME ',')+NAME| NAME ) ')';

assign:
    typeofvar NAME '=' args;

typeofvar:
    ( | 'db' |
     'dw' |
     'dd' |
     'dq' );

ops:
    (plusop |
     minusop
    );

plusop:
    firstop '+' lastop;

minusop:
    firstop '-' lastop;

firstop:
    (INTEGER | HEX | register);

lastop:
    (INTEGER | HEX | register);

register:
    '!' NAME;

run:
    RUN;

STRING  : '"' .*? '"';
INTEGER : [0-9]+;
HEX     : '0x' [0-9A-Fa-f]+;
NULL    : 'null';
RUN     : 'run';
NAME    : [a-zA-Z_]+;
SPACE   : [ \t\r\n]+        -> channel(HIDDEN);
COMMENT : '</!' .*? '!/>'   -> channel(HIDDEN);
LCOMMENT: '>?' ~[\r\n]* ('\r'? '\n' | EOF) -> channel(HIDDEN);
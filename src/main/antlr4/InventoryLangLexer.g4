lexer grammar InventoryLangLexer;

@header { package com.deathbytape.parsers.generated; }

/* Lexer defns */
BUY: 'buy';
SELL: 'sell';
COLON: ':';
TAB: [\t];
WS: [ ]+;
NEWLINE: [\r\n]+;
NAME: [a-zA-Z]+;
INTEGER: NUM+;
DECIMAL: (NUM* PT NUM NUM?);

fragment
NUM: ('0'..'9');
fragment
PT: '.';
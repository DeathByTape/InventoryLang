parser grammar InventoryLangParser;

@header { package com.deathbytape.parsers.generated; }
options { tokenVocab = InventoryLangLexer; }

/* Parser defn */
ilang: (item NEWLINE)*;
item: NAME COLON NEWLINE ops;
ops: operation
   | operation NEWLINE ops
   ;
operation: TAB action WS amount WS price;
action: BUY
      | SELL
      ;
amount: INTEGER;
price: INTEGER | DECIMAL;

package com.deathbytape.parsers;
/**
 * com.deathbytape.parsers.InventoryLang.java
 *
 * Entry point for InventoryLanguage. This is a toy language used as an example
 * to create a DSL in antlr.
 *
 * Author: Dennis J. McWherter, Jr. <dennis@deathbytape.com>
 */

import com.deathbytape.parsers.generated.InventoryLangLexer;
import com.deathbytape.parsers.generated.InventoryLangParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.Map;

public class InventoryLang {
  public static void main(String args[]) {
    if (args.length < 1) {
      System.err.println("Usage: java -jar invlang.jar <filename>");
      return;
    }

    // Get parsers
    ParseTree treeStream1 = getFileParseTree(args[0]);
    ParseTree treeStream2 = getFileParseTree(args[0]);

    if (treeStream1 == null || treeStream2 == null) {
      return;
    }

    // Use visitor pattern to make use of the parse tree
    // NOTE: This is a bit wasteful, but exists for purpose of
    // demonstration. We parse the file 2x since the visitors
    // are stream parsers.
    StockVisitor stock = new StockVisitor();
    ProfitVisitor profit = new ProfitVisitor();
    Map<String, Integer> inStock = stock.visit(treeStream1);
    Map<String, Float> profits = profit.visit(treeStream2);

    // Display the useful information:
    System.out.println("Inventory listing:");
    float totalProfit = 0.f;
    for (Map.Entry<String, Integer> stockKv : inStock.entrySet()) {
      String item = stockKv.getKey();
      int stockVal = stockKv.getValue();
      float itemProfit = profits.get(item);
      totalProfit += itemProfit;
      System.out.println("Item: " + item + ", number in stock: " + stockVal + ", profit: " + itemProfit);
    }
    System.out.println("======================");
    System.out.println("Total Profit: " + totalProfit);
  }

  private static ParseTree getFileParseTree(String filename) {
    ANTLRFileStream fs;
    try {
      fs = new ANTLRFileStream(filename);
    } catch (IOException e) {
      System.err.println("Could not open file '" + filename + "': " + e.getMessage());
      return null;
    }

    InventoryLangLexer lexer = new InventoryLangLexer(fs);
    InventoryLangParser parser = new InventoryLangParser(new CommonTokenStream(lexer));
    return parser.ilang();
  }
}

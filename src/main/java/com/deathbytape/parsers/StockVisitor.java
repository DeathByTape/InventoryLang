package com.deathbytape.parsers;
/**
 * StockVisitor.java
 *
 * Visitor to determine the amount of specified items remaining in stock.
 *
 * Author: Dennis J. McWherter, Jr. <dennis@deathbytape.com>
 */

import com.deathbytape.parsers.generated.InventoryLangParser;
import com.deathbytape.parsers.generated.InventoryLangParserBaseVisitor;

import java.util.HashMap;
import java.util.Map;

public class StockVisitor extends InventoryLangParserBaseVisitor<Map<String, Integer>> {
  private String currentItem;
  private HashMap<String, Integer> inventory = new HashMap<String, Integer>();

  @Override
  public Map<String, Integer> visitIlang(InventoryLangParser.IlangContext ctx) {
    for (InventoryLangParser.ItemContext iCtx : ctx.item()) {
      this.visit(iCtx);
    }
    return inventory;
  }

  @Override
  public Map<String, Integer> visitItem(InventoryLangParser.ItemContext ctx) {
    currentItem = ctx.NAME().getText();
    return this.visit(ctx.ops());
  }

  @Override
  public Map<String, Integer> visitOperation(InventoryLangParser.OperationContext ctx) {
    int multiplier = "sell".equals(ctx.action().getText()) ? -1 : 1;
    Integer amt = Integer.valueOf(ctx.amount().getText());
    int value = multiplier * amt;
    if (!inventory.containsKey(currentItem)) {
      inventory.put(currentItem, value);
    } else {
      int currentVal = inventory.get(currentItem);
      inventory.put(currentItem, currentVal + value);
    }
    return inventory;
  }
}

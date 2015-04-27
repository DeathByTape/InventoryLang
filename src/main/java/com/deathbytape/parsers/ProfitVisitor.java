package com.deathbytape.parsers;
/**
 * ProfitVisitor.java
 *
 * Visitor to determine amount of profit per item from inventory lang.
 *
 * Author: Dennis J. McWherter, Jr. <dennis@deathbytape.com>
 */

import com.deathbytape.parsers.generated.InventoryLangParser;
import com.deathbytape.parsers.generated.InventoryLangParserBaseVisitor;

import java.util.HashMap;
import java.util.Map;

public class ProfitVisitor extends InventoryLangParserBaseVisitor<Map<String, Float>> {
  private String currentItem;
  private HashMap<String, Float> profit = new HashMap<String, Float>();

  @Override
  public Map<String, Float> visitIlang(InventoryLangParser.IlangContext ctx) {
    for (InventoryLangParser.ItemContext iCtx : ctx.item()) {
      this.visit(iCtx);
    }
    return profit;
  }

  @Override
  public Map<String, Float> visitItem(InventoryLangParser.ItemContext ctx) {
    currentItem = ctx.NAME().getText();
    return this.visit(ctx.ops());
  }

  @Override
  public Map<String, Float> visitOperation(InventoryLangParser.OperationContext ctx) {
    int multiplier = "sell".equals(ctx.action().getText()) ? 1 : -1;
    Integer amt = Integer.valueOf(ctx.amount().getText());
    Float price = Float.valueOf(ctx.price().getText());
    float value = multiplier * amt * price;
    if (!profit.containsKey(currentItem)) {
      profit.put(currentItem, value);
    } else {
      float currentVal = profit.get(currentItem);
      profit.put(currentItem, currentVal + value);
    }
    return profit;
  }
}

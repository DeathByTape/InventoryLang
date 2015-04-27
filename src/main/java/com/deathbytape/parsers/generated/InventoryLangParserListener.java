// Generated from InventoryLangParser.g4 by ANTLR 4.5
 package com.deathbytape.parsers.generated; 
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InventoryLangParser}.
 */
public interface InventoryLangParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InventoryLangParser#ilang}.
	 * @param ctx the parse tree
	 */
	void enterIlang(InventoryLangParser.IlangContext ctx);
	/**
	 * Exit a parse tree produced by {@link InventoryLangParser#ilang}.
	 * @param ctx the parse tree
	 */
	void exitIlang(InventoryLangParser.IlangContext ctx);
	/**
	 * Enter a parse tree produced by {@link InventoryLangParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(InventoryLangParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link InventoryLangParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(InventoryLangParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link InventoryLangParser#ops}.
	 * @param ctx the parse tree
	 */
	void enterOps(InventoryLangParser.OpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InventoryLangParser#ops}.
	 * @param ctx the parse tree
	 */
	void exitOps(InventoryLangParser.OpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link InventoryLangParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(InventoryLangParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link InventoryLangParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(InventoryLangParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link InventoryLangParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(InventoryLangParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InventoryLangParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(InventoryLangParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InventoryLangParser#amount}.
	 * @param ctx the parse tree
	 */
	void enterAmount(InventoryLangParser.AmountContext ctx);
	/**
	 * Exit a parse tree produced by {@link InventoryLangParser#amount}.
	 * @param ctx the parse tree
	 */
	void exitAmount(InventoryLangParser.AmountContext ctx);
	/**
	 * Enter a parse tree produced by {@link InventoryLangParser#price}.
	 * @param ctx the parse tree
	 */
	void enterPrice(InventoryLangParser.PriceContext ctx);
	/**
	 * Exit a parse tree produced by {@link InventoryLangParser#price}.
	 * @param ctx the parse tree
	 */
	void exitPrice(InventoryLangParser.PriceContext ctx);
}
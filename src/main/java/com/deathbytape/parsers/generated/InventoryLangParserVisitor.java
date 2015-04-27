// Generated from InventoryLangParser.g4 by ANTLR 4.5
 package com.deathbytape.parsers.generated; 
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InventoryLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InventoryLangParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InventoryLangParser#ilang}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIlang(InventoryLangParser.IlangContext ctx);
	/**
	 * Visit a parse tree produced by {@link InventoryLangParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(InventoryLangParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link InventoryLangParser#ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOps(InventoryLangParser.OpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link InventoryLangParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(InventoryLangParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link InventoryLangParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(InventoryLangParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InventoryLangParser#amount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmount(InventoryLangParser.AmountContext ctx);
	/**
	 * Visit a parse tree produced by {@link InventoryLangParser#price}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrice(InventoryLangParser.PriceContext ctx);
}
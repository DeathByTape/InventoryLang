// Generated from InventoryLangParser.g4 by ANTLR 4.5
 package com.deathbytape.parsers.generated; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InventoryLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BUY=1, SELL=2, COLON=3, TAB=4, WS=5, NEWLINE=6, NAME=7, INTEGER=8, DECIMAL=9;
	public static final int
		RULE_ilang = 0, RULE_item = 1, RULE_ops = 2, RULE_operation = 3, RULE_action = 4, 
		RULE_amount = 5, RULE_price = 6;
	public static final String[] ruleNames = {
		"ilang", "item", "ops", "operation", "action", "amount", "price"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'buy'", "'sell'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BUY", "SELL", "COLON", "TAB", "WS", "NEWLINE", "NAME", "INTEGER", 
		"DECIMAL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "InventoryLangParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InventoryLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IlangContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(InventoryLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(InventoryLangParser.NEWLINE, i);
		}
		public IlangContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ilang; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryLangParserListener ) ((InventoryLangParserListener)listener).enterIlang(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryLangParserListener ) ((InventoryLangParserListener)listener).exitIlang(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InventoryLangParserVisitor ) return ((InventoryLangParserVisitor<? extends T>)visitor).visitIlang(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IlangContext ilang() throws RecognitionException {
		IlangContext _localctx = new IlangContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ilang);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(14);
				item();
				setState(15);
				match(NEWLINE);
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(InventoryLangParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(InventoryLangParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(InventoryLangParser.NEWLINE, 0); }
		public OpsContext ops() {
			return getRuleContext(OpsContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryLangParserListener ) ((InventoryLangParserListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryLangParserListener ) ((InventoryLangParserListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InventoryLangParserVisitor ) return ((InventoryLangParserVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(NAME);
			setState(23);
			match(COLON);
			setState(24);
			match(NEWLINE);
			setState(25);
			ops();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpsContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(InventoryLangParser.NEWLINE, 0); }
		public OpsContext ops() {
			return getRuleContext(OpsContext.class,0);
		}
		public OpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryLangParserListener ) ((InventoryLangParserListener)listener).enterOps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryLangParserListener ) ((InventoryLangParserListener)listener).exitOps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InventoryLangParserVisitor ) return ((InventoryLangParserVisitor<? extends T>)visitor).visitOps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpsContext ops() throws RecognitionException {
		OpsContext _localctx = new OpsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ops);
		try {
			setState(32);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				operation();
				setState(29);
				match(NEWLINE);
				setState(30);
				ops();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(InventoryLangParser.TAB, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(InventoryLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(InventoryLangParser.WS, i);
		}
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public PriceContext price() {
			return getRuleContext(PriceContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryLangParserListener ) ((InventoryLangParserListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryLangParserListener ) ((InventoryLangParserListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InventoryLangParserVisitor ) return ((InventoryLangParserVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(TAB);
			setState(35);
			action();
			setState(36);
			match(WS);
			setState(37);
			amount();
			setState(38);
			match(WS);
			setState(39);
			price();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode BUY() { return getToken(InventoryLangParser.BUY, 0); }
		public TerminalNode SELL() { return getToken(InventoryLangParser.SELL, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryLangParserListener ) ((InventoryLangParserListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryLangParserListener ) ((InventoryLangParserListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InventoryLangParserVisitor ) return ((InventoryLangParserVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !(_la==BUY || _la==SELL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmountContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(InventoryLangParser.INTEGER, 0); }
		public AmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryLangParserListener ) ((InventoryLangParserListener)listener).enterAmount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryLangParserListener ) ((InventoryLangParserListener)listener).exitAmount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InventoryLangParserVisitor ) return ((InventoryLangParserVisitor<? extends T>)visitor).visitAmount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmountContext amount() throws RecognitionException {
		AmountContext _localctx = new AmountContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_amount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PriceContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(InventoryLangParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(InventoryLangParser.DECIMAL, 0); }
		public PriceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_price; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryLangParserListener ) ((InventoryLangParserListener)listener).enterPrice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryLangParserListener ) ((InventoryLangParserListener)listener).exitPrice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InventoryLangParserVisitor ) return ((InventoryLangParserVisitor<? extends T>)visitor).visitPrice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PriceContext price() throws RecognitionException {
		PriceContext _localctx = new PriceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_price);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13\62\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\7\2\24\n\2\f"+
		"\2\16\2\27\13\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4#\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16"+
		"\2\4\3\2\3\4\3\2\n\13,\2\25\3\2\2\2\4\30\3\2\2\2\6\"\3\2\2\2\b$\3\2\2"+
		"\2\n+\3\2\2\2\f-\3\2\2\2\16/\3\2\2\2\20\21\5\4\3\2\21\22\7\b\2\2\22\24"+
		"\3\2\2\2\23\20\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3"+
		"\3\2\2\2\27\25\3\2\2\2\30\31\7\t\2\2\31\32\7\5\2\2\32\33\7\b\2\2\33\34"+
		"\5\6\4\2\34\5\3\2\2\2\35#\5\b\5\2\36\37\5\b\5\2\37 \7\b\2\2 !\5\6\4\2"+
		"!#\3\2\2\2\"\35\3\2\2\2\"\36\3\2\2\2#\7\3\2\2\2$%\7\6\2\2%&\5\n\6\2&\'"+
		"\7\7\2\2\'(\5\f\7\2()\7\7\2\2)*\5\16\b\2*\t\3\2\2\2+,\t\2\2\2,\13\3\2"+
		"\2\2-.\7\n\2\2.\r\3\2\2\2/\60\t\3\2\2\60\17\3\2\2\2\4\25\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
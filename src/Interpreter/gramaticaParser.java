// Generated from C:/Users/50230/IdeaProjects/minicompilador/src\gramatica.g4 by ANTLR 4.12.0
package Interpreter;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, INT=2, STRING=3, PRINTLN=4, IF=5, ELSE=6, ASIGN=7, PLUS=8, 
		MINUS=9, MULT=10, DIV=11, GT=12, LT=13, GEQ=14, LEQ=15, EQ=16, BRACKET_OPEN=17, 
		BRACKET_CLOSE=18, PAR_OPEN=19, PAR_CLOSE=20, SEMICOLON=21, ID=22, NUMBER=23, 
		CADENA=24, WS=25, LINE_COMMENT=26;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_if_decl = 2, RULE_sentence = 3, 
		RULE_var_decl = 4, RULE_var_assig = 5, RULE_println = 6, RULE_asig_op = 7, 
		RULE_operacion = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "if_decl", "sentence", "var_decl", "var_assig", "println", 
			"asig_op", "operacion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'entero'", "'texto'", "'imprimir'", "'si'", "'entonces'", 
			"':='", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'=='", 
			"'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "INT", "STRING", "PRINTLN", "IF", "ELSE", "ASIGN", "PLUS", 
			"MINUS", "MULT", "DIV", "GT", "LT", "GEQ", "LEQ", "EQ", "BRACKET_OPEN", 
			"BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "ID", "NUMBER", 
			"CADENA", "WS", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			program();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(gramaticaParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(gramaticaParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(gramaticaParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(PROGRAM);
			setState(21);
			match(ID);
			setState(22);
			match(BRACKET_OPEN);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12582972L) != 0)) {
				{
				{
				setState(23);
				sentence();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(BRACKET_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_declContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(gramaticaParser.IF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(gramaticaParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(gramaticaParser.BRACKET_OPEN, i);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(gramaticaParser.BRACKET_CLOSE); }
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(gramaticaParser.BRACKET_CLOSE, i);
		}
		public TerminalNode ELSE() { return getToken(gramaticaParser.ELSE, 0); }
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(gramaticaParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(gramaticaParser.NUMBER, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(gramaticaParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(gramaticaParser.CADENA, i);
		}
		public TerminalNode GT() { return getToken(gramaticaParser.GT, 0); }
		public TerminalNode LT() { return getToken(gramaticaParser.LT, 0); }
		public TerminalNode GEQ() { return getToken(gramaticaParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(gramaticaParser.LEQ, 0); }
		public TerminalNode EQ() { return getToken(gramaticaParser.EQ, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public If_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterIf_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitIf_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitIf_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_declContext if_decl() throws RecognitionException {
		If_declContext _localctx = new If_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(IF);
			setState(32);
			match(PAR_OPEN);
			setState(33);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(34);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126976L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(35);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(36);
			match(PAR_CLOSE);
			setState(37);
			match(BRACKET_OPEN);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12582972L) != 0)) {
				{
				{
				setState(38);
				sentence();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(BRACKET_CLOSE);
			setState(45);
			match(ELSE);
			setState(46);
			match(BRACKET_OPEN);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12582972L) != 0)) {
				{
				{
				setState(47);
				sentence();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(BRACKET_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_assigContext var_assig() {
			return getRuleContext(Var_assigContext.class,0);
		}
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public Asig_opContext asig_op() {
			return getRuleContext(Asig_opContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public If_declContext if_decl() {
			return getRuleContext(If_declContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentence);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				var_assig();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				println();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				asig_op();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				operacion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				if_decl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public TerminalNode INT() { return getToken(gramaticaParser.INT, 0); }
		public TerminalNode STRING() { return getToken(gramaticaParser.STRING, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(64);
			match(ID);
			setState(65);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_assigContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
		public TerminalNode ASIGN() { return getToken(gramaticaParser.ASIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public TerminalNode CADENA() { return getToken(gramaticaParser.CADENA, 0); }
		public Asig_opContext asig_op() {
			return getRuleContext(Asig_opContext.class,0);
		}
		public Var_assigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVar_assig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVar_assig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVar_assig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assigContext var_assig() throws RecognitionException {
		Var_assigContext _localctx = new Var_assigContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_assig);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(ID);
				setState(68);
				match(ASIGN);
				setState(69);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(70);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				asig_op();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode PRINTLN() { return getToken(gramaticaParser.PRINTLN, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public TerminalNode CADENA() { return getToken(gramaticaParser.CADENA, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_println);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(PRINTLN);
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(76);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Asig_opContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode ASIGN() { return getToken(gramaticaParser.ASIGN, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public Asig_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAsig_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAsig_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAsig_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asig_opContext asig_op() throws RecognitionException {
		Asig_opContext _localctx = new Asig_opContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asig_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
			setState(79);
			match(ASIGN);
			setState(80);
			operacion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperacionContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(gramaticaParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(gramaticaParser.NUMBER, i);
		}
		public TerminalNode PLUS() { return getToken(gramaticaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(gramaticaParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(gramaticaParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(gramaticaParser.DIV, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(82);
				match(NUMBER);
				setState(83);
				match(PLUS);
				setState(84);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(85);
				match(NUMBER);
				setState(86);
				match(MINUS);
				setState(87);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(88);
				match(NUMBER);
				setState(89);
				match(MULT);
				setState(90);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(91);
				match(NUMBER);
				setState(92);
				match(DIV);
				setState(93);
				match(NUMBER);
				}
				break;
			}
			setState(96);
			match(SEMICOLON);
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
		"\u0004\u0001\u001ac\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u0019\b\u0001\n\u0001\f\u0001\u001c\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002(\b\u0002\n\u0002"+
		"\f\u0002+\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u00021\b\u0002\n\u0002\f\u00024\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003>\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005I\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b_\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0000\u0003\u0001\u0000\u0016\u0018\u0001\u0000\f\u0010\u0001\u0000"+
		"\u0002\u0003e\u0000\u0012\u0001\u0000\u0000\u0000\u0002\u0014\u0001\u0000"+
		"\u0000\u0000\u0004\u001f\u0001\u0000\u0000\u0000\u0006=\u0001\u0000\u0000"+
		"\u0000\b?\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000\fJ\u0001"+
		"\u0000\u0000\u0000\u000eN\u0001\u0000\u0000\u0000\u0010^\u0001\u0000\u0000"+
		"\u0000\u0012\u0013\u0003\u0002\u0001\u0000\u0013\u0001\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0005\u0001\u0000\u0000\u0015\u0016\u0005\u0016\u0000"+
		"\u0000\u0016\u001a\u0005\u0011\u0000\u0000\u0017\u0019\u0003\u0006\u0003"+
		"\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000"+
		"\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000"+
		"\u0000\u001b\u001d\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0005\u0012\u0000\u0000\u001e\u0003\u0001\u0000\u0000"+
		"\u0000\u001f \u0005\u0005\u0000\u0000 !\u0005\u0013\u0000\u0000!\"\u0007"+
		"\u0000\u0000\u0000\"#\u0007\u0001\u0000\u0000#$\u0007\u0000\u0000\u0000"+
		"$%\u0005\u0014\u0000\u0000%)\u0005\u0011\u0000\u0000&(\u0003\u0006\u0003"+
		"\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000,-\u0005\u0012\u0000\u0000-.\u0005\u0006\u0000\u0000"+
		".2\u0005\u0011\u0000\u0000/1\u0003\u0006\u0003\u00000/\u0001\u0000\u0000"+
		"\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000"+
		"\u0000\u000035\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000056\u0005"+
		"\u0012\u0000\u00006\u0005\u0001\u0000\u0000\u00007>\u0003\b\u0004\u0000"+
		"8>\u0003\n\u0005\u00009>\u0003\f\u0006\u0000:>\u0003\u000e\u0007\u0000"+
		";>\u0003\u0010\b\u0000<>\u0003\u0004\u0002\u0000=7\u0001\u0000\u0000\u0000"+
		"=8\u0001\u0000\u0000\u0000=9\u0001\u0000\u0000\u0000=:\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000>\u0007\u0001"+
		"\u0000\u0000\u0000?@\u0007\u0002\u0000\u0000@A\u0005\u0016\u0000\u0000"+
		"AB\u0005\u0015\u0000\u0000B\t\u0001\u0000\u0000\u0000CD\u0005\u0016\u0000"+
		"\u0000DE\u0005\u0007\u0000\u0000EF\u0007\u0000\u0000\u0000FI\u0005\u0015"+
		"\u0000\u0000GI\u0003\u000e\u0007\u0000HC\u0001\u0000\u0000\u0000HG\u0001"+
		"\u0000\u0000\u0000I\u000b\u0001\u0000\u0000\u0000JK\u0005\u0004\u0000"+
		"\u0000KL\u0007\u0000\u0000\u0000LM\u0005\u0015\u0000\u0000M\r\u0001\u0000"+
		"\u0000\u0000NO\u0005\u0016\u0000\u0000OP\u0005\u0007\u0000\u0000PQ\u0003"+
		"\u0010\b\u0000Q\u000f\u0001\u0000\u0000\u0000RS\u0005\u0017\u0000\u0000"+
		"ST\u0005\b\u0000\u0000T_\u0005\u0017\u0000\u0000UV\u0005\u0017\u0000\u0000"+
		"VW\u0005\t\u0000\u0000W_\u0005\u0017\u0000\u0000XY\u0005\u0017\u0000\u0000"+
		"YZ\u0005\n\u0000\u0000Z_\u0005\u0017\u0000\u0000[\\\u0005\u0017\u0000"+
		"\u0000\\]\u0005\u000b\u0000\u0000]_\u0005\u0017\u0000\u0000^R\u0001\u0000"+
		"\u0000\u0000^U\u0001\u0000\u0000\u0000^X\u0001\u0000\u0000\u0000^[\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0005\u0015\u0000\u0000"+
		"a\u0011\u0001\u0000\u0000\u0000\u0006\u001a)2=H^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

}
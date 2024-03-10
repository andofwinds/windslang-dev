// Generated from /home/andofwinds/Documents/windslang/src/main/winds.g4 by ANTLR 4.13.1
package org.forsaken;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class windsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STRING=10, INTEGER=11, HEX=12, NAME=13, SPACE=14, COMMENT=15;
	public static final int
		RULE_cmdLine = 0, RULE_anyCommand = 1, RULE_command = 2, RULE_args = 3, 
		RULE_function = 4, RULE_assign = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmdLine", "anyCommand", "command", "args", "function", "assign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'global'", "'extern'", "'section'", "'override'", "'call'", "'syscall'", 
			"'('", "')'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "STRING", 
			"INTEGER", "HEX", "NAME", "SPACE", "COMMENT"
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
	public String getGrammarFileName() { return "winds.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public windsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdLineContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(windsParser.EOF, 0); }
		public List<AnyCommandContext> anyCommand() {
			return getRuleContexts(AnyCommandContext.class);
		}
		public AnyCommandContext anyCommand(int i) {
			return getRuleContext(AnyCommandContext.class,i);
		}
		public CmdLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).enterCmdLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).exitCmdLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof windsVisitor ) return ((windsVisitor<? extends T>)visitor).visitCmdLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdLineContext cmdLine() throws RecognitionException {
		CmdLineContext _localctx = new CmdLineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmdLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8318L) != 0)) {
				{
				{
				setState(12);
				anyCommand();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			match(EOF);
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
	public static class AnyCommandContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public AnyCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).enterAnyCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).exitAnyCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof windsVisitor ) return ((windsVisitor<? extends T>)visitor).visitAnyCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyCommandContext anyCommand() throws RecognitionException {
		AnyCommandContext _localctx = new AnyCommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_anyCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
				{
				{
				setState(20);
				command();
				setState(21);
				args();
				}
				}
				break;
			case NAME:
				{
				setState(23);
				assign();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof windsVisitor ) return ((windsVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode NAME() { return getToken(windsParser.NAME, 0); }
		public TerminalNode STRING() { return getToken(windsParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(windsParser.INTEGER, 0); }
		public TerminalNode HEX() { return getToken(windsParser.HEX, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof windsVisitor ) return ((windsVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(28);
				function();
				}
				break;
			case 2:
				{
				setState(29);
				match(NAME);
				}
				break;
			case 3:
				{
				setState(30);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(31);
				match(INTEGER);
				}
				break;
			case 5:
				{
				setState(32);
				match(HEX);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(windsParser.NAME, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof windsVisitor ) return ((windsVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(NAME);
			setState(36);
			match(T__6);
			setState(37);
			args();
			setState(38);
			match(T__7);
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(windsParser.NAME, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof windsVisitor ) return ((windsVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(NAME);
			setState(41);
			match(T__8);
			setState(42);
			args();
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
		"\u0004\u0001\u000f-\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000"+
		"\u0011\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\"\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0000\u0006\u0000"+
		"\u0002\u0004\u0006\b\n\u0000\u0001\u0001\u0000\u0001\u0006,\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0002\u0018\u0001\u0000\u0000\u0000\u0004\u001a"+
		"\u0001\u0000\u0000\u0000\u0006!\u0001\u0000\u0000\u0000\b#\u0001\u0000"+
		"\u0000\u0000\n(\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000"+
		"\r\f\u0001\u0000\u0000\u0000\u000e\u0011\u0001\u0000\u0000\u0000\u000f"+
		"\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0012"+
		"\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0005\u0000\u0000\u0001\u0013\u0001\u0001\u0000\u0000\u0000\u0014\u0015"+
		"\u0003\u0004\u0002\u0000\u0015\u0016\u0003\u0006\u0003\u0000\u0016\u0019"+
		"\u0001\u0000\u0000\u0000\u0017\u0019\u0003\n\u0005\u0000\u0018\u0014\u0001"+
		"\u0000\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u0003\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0007\u0000\u0000\u0000\u001b\u0005\u0001"+
		"\u0000\u0000\u0000\u001c\"\u0003\b\u0004\u0000\u001d\"\u0005\r\u0000\u0000"+
		"\u001e\"\u0005\n\u0000\u0000\u001f\"\u0005\u000b\u0000\u0000 \"\u0005"+
		"\f\u0000\u0000!\u001c\u0001\u0000\u0000\u0000!\u001d\u0001\u0000\u0000"+
		"\u0000!\u001e\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!"+
		" \u0001\u0000\u0000\u0000\"\u0007\u0001\u0000\u0000\u0000#$\u0005\r\u0000"+
		"\u0000$%\u0005\u0007\u0000\u0000%&\u0003\u0006\u0003\u0000&\'\u0005\b"+
		"\u0000\u0000\'\t\u0001\u0000\u0000\u0000()\u0005\r\u0000\u0000)*\u0005"+
		"\t\u0000\u0000*+\u0003\u0006\u0003\u0000+\u000b\u0001\u0000\u0000\u0000"+
		"\u0003\u000f\u0018!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
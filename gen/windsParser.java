// Generated from /home/andofwinds/Documents/windslang/src/main/winds.g4 by ANTLR 4.13.1
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, STRING=22, INTEGER=23, HEX=24, 
		NULL=25, RUN=26, NAME=27, SPACE=28, COMMENT=29, LCOMMENT=30;
	public static final int
		RULE_cmdLine = 0, RULE_anyCommand = 1, RULE_command = 2, RULE_args = 3, 
		RULE_function = 4, RULE_funargs = 5, RULE_assign = 6, RULE_typeofvar = 7, 
		RULE_ops = 8, RULE_plusop = 9, RULE_minusop = 10, RULE_firstop = 11, RULE_lastop = 12, 
		RULE_register = 13, RULE_run = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmdLine", "anyCommand", "command", "args", "function", "funargs", "assign", 
			"typeofvar", "ops", "plusop", "minusop", "firstop", "lastop", "register", 
			"run"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'global'", "'extern'", "'section'", "'override'", "'call'", "'syscall'", 
			"'interrupt'", "'return'", "'>'", "':'", "'('", "','", "')'", "'='", 
			"'db'", "'dw'", "'dd'", "'dq'", "'+'", "'-'", "'!'", null, null, null, 
			"'null'", "'run'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "STRING", 
			"INTEGER", "HEX", "NULL", "RUN", "NAME", "SPACE", "COMMENT", "LCOMMENT"
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 229081598L) != 0)) {
				{
				{
				setState(30);
				anyCommand();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
		public OpsContext ops() {
			return getRuleContext(OpsContext.class,0);
		}
		public RunContext run() {
			return getRuleContext(RunContext.class,0);
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
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				{
				{
				setState(38);
				command();
				setState(39);
				args();
				}
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case NAME:
				{
				setState(41);
				assign();
				}
				break;
			case T__20:
			case INTEGER:
			case HEX:
				{
				setState(42);
				ops();
				}
				break;
			case RUN:
				{
				setState(43);
				run();
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
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 510L) != 0)) ) {
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
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public TerminalNode NULL() { return getToken(windsParser.NULL, 0); }
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
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(48);
				function();
				}
				break;
			case 2:
				{
				setState(49);
				match(NAME);
				}
				break;
			case 3:
				{
				setState(50);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(51);
				match(INTEGER);
				}
				break;
			case 5:
				{
				setState(52);
				match(HEX);
				}
				break;
			case 6:
				{
				setState(53);
				register();
				}
				break;
			case 7:
				{
				setState(54);
				match(NULL);
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
		public FunargsContext funargs() {
			return getRuleContext(FunargsContext.class,0);
		}
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(NAME);
			setState(58);
			funargs();
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__20:
			case INTEGER:
			case HEX:
			case RUN:
			case NAME:
				{
				}
				break;
			case T__8:
				{
				setState(60);
				match(T__8);
				setState(65); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(61);
						register();
						setState(62);
						match(T__9);
						setState(63);
						args();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(67); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class FunargsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(windsParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(windsParser.NAME, i);
		}
		public FunargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).enterFunargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).exitFunargs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof windsVisitor ) return ((windsVisitor<? extends T>)visitor).visitFunargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunargsContext funargs() throws RecognitionException {
		FunargsContext _localctx = new FunargsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funargs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__10);
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(75); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(73);
						match(NAME);
						setState(74);
						match(T__11);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(77); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(79);
				match(NAME);
				}
				break;
			case 3:
				{
				setState(80);
				match(NAME);
				}
				break;
			}
			setState(83);
			match(T__12);
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
		public TypeofvarContext typeofvar() {
			return getRuleContext(TypeofvarContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			typeofvar();
			setState(86);
			match(NAME);
			setState(87);
			match(T__13);
			setState(88);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeofvarContext extends ParserRuleContext {
		public TypeofvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeofvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).enterTypeofvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).exitTypeofvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof windsVisitor ) return ((windsVisitor<? extends T>)visitor).visitTypeofvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeofvarContext typeofvar() throws RecognitionException {
		TypeofvarContext _localctx = new TypeofvarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeofvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				}
				break;
			case T__14:
				{
				setState(91);
				match(T__14);
				}
				break;
			case T__15:
				{
				setState(92);
				match(T__15);
				}
				break;
			case T__16:
				{
				setState(93);
				match(T__16);
				}
				break;
			case T__17:
				{
				setState(94);
				match(T__17);
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
	public static class OpsContext extends ParserRuleContext {
		public PlusopContext plusop() {
			return getRuleContext(PlusopContext.class,0);
		}
		public MinusopContext minusop() {
			return getRuleContext(MinusopContext.class,0);
		}
		public OpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).enterOps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).exitOps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof windsVisitor ) return ((windsVisitor<? extends T>)visitor).visitOps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpsContext ops() throws RecognitionException {
		OpsContext _localctx = new OpsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(97);
				plusop();
				}
				break;
			case 2:
				{
				setState(98);
				minusop();
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
	public static class PlusopContext extends ParserRuleContext {
		public FirstopContext firstop() {
			return getRuleContext(FirstopContext.class,0);
		}
		public LastopContext lastop() {
			return getRuleContext(LastopContext.class,0);
		}
		public PlusopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).enterPlusop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).exitPlusop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof windsVisitor ) return ((windsVisitor<? extends T>)visitor).visitPlusop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusopContext plusop() throws RecognitionException {
		PlusopContext _localctx = new PlusopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_plusop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			firstop();
			setState(102);
			match(T__18);
			setState(103);
			lastop();
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
	public static class MinusopContext extends ParserRuleContext {
		public FirstopContext firstop() {
			return getRuleContext(FirstopContext.class,0);
		}
		public LastopContext lastop() {
			return getRuleContext(LastopContext.class,0);
		}
		public MinusopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).enterMinusop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).exitMinusop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof windsVisitor ) return ((windsVisitor<? extends T>)visitor).visitMinusop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusopContext minusop() throws RecognitionException {
		MinusopContext _localctx = new MinusopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_minusop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			firstop();
			setState(106);
			match(T__19);
			setState(107);
			lastop();
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
	public static class FirstopContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(windsParser.INTEGER, 0); }
		public TerminalNode HEX() { return getToken(windsParser.HEX, 0); }
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public FirstopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).enterFirstop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).exitFirstop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof windsVisitor ) return ((windsVisitor<? extends T>)visitor).visitFirstop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstopContext firstop() throws RecognitionException {
		FirstopContext _localctx = new FirstopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_firstop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(109);
				match(INTEGER);
				}
				break;
			case HEX:
				{
				setState(110);
				match(HEX);
				}
				break;
			case T__20:
				{
				setState(111);
				register();
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
	public static class LastopContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(windsParser.INTEGER, 0); }
		public TerminalNode HEX() { return getToken(windsParser.HEX, 0); }
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public LastopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).enterLastop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).exitLastop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof windsVisitor ) return ((windsVisitor<? extends T>)visitor).visitLastop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastopContext lastop() throws RecognitionException {
		LastopContext _localctx = new LastopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lastop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(114);
				match(INTEGER);
				}
				break;
			case HEX:
				{
				setState(115);
				match(HEX);
				}
				break;
			case T__20:
				{
				setState(116);
				register();
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
	public static class RegisterContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(windsParser.NAME, 0); }
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).enterRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).exitRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof windsVisitor ) return ((windsVisitor<? extends T>)visitor).visitRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_register);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__20);
			setState(120);
			match(NAME);
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
	public static class RunContext extends ParserRuleContext {
		public TerminalNode RUN() { return getToken(windsParser.RUN, 0); }
		public RunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).enterRun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof windsListener ) ((windsListener)listener).exitRun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof windsVisitor ) return ((windsVisitor<? extends T>)visitor).visitRun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunContext run() throws RecognitionException {
		RunContext _localctx = new RunContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_run);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(RUN);
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
		"\u0004\u0001\u001e}\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"-\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00038\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004B\b\u0004\u000b\u0004\f\u0004C\u0003"+
		"\u0004F\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004"+
		"\u0005L\b\u0005\u000b\u0005\f\u0005M\u0001\u0005\u0001\u0005\u0003\u0005"+
		"R\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007`\b\u0007\u0001\b\u0001\b\u0003\bd\b\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000bq\b\u000b\u0001\f\u0001\f\u0001\f\u0003"+
		"\fv\b\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0000"+
		"\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u0000\u0001\u0001\u0000\u0001\b\u0085\u0000!\u0001"+
		"\u0000\u0000\u0000\u0002,\u0001\u0000\u0000\u0000\u0004.\u0001\u0000\u0000"+
		"\u0000\u00067\u0001\u0000\u0000\u0000\b9\u0001\u0000\u0000\u0000\nG\u0001"+
		"\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000\u000e_\u0001\u0000\u0000"+
		"\u0000\u0010c\u0001\u0000\u0000\u0000\u0012e\u0001\u0000\u0000\u0000\u0014"+
		"i\u0001\u0000\u0000\u0000\u0016p\u0001\u0000\u0000\u0000\u0018u\u0001"+
		"\u0000\u0000\u0000\u001aw\u0001\u0000\u0000\u0000\u001cz\u0001\u0000\u0000"+
		"\u0000\u001e \u0003\u0002\u0001\u0000\u001f\u001e\u0001\u0000\u0000\u0000"+
		" #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005"+
		"\u0000\u0000\u0001%\u0001\u0001\u0000\u0000\u0000&\'\u0003\u0004\u0002"+
		"\u0000\'(\u0003\u0006\u0003\u0000(-\u0001\u0000\u0000\u0000)-\u0003\f"+
		"\u0006\u0000*-\u0003\u0010\b\u0000+-\u0003\u001c\u000e\u0000,&\u0001\u0000"+
		"\u0000\u0000,)\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,+\u0001"+
		"\u0000\u0000\u0000-\u0003\u0001\u0000\u0000\u0000./\u0007\u0000\u0000"+
		"\u0000/\u0005\u0001\u0000\u0000\u000008\u0003\b\u0004\u000018\u0005\u001b"+
		"\u0000\u000028\u0005\u0016\u0000\u000038\u0005\u0017\u0000\u000048\u0005"+
		"\u0018\u0000\u000058\u0003\u001a\r\u000068\u0005\u0019\u0000\u000070\u0001"+
		"\u0000\u0000\u000071\u0001\u0000\u0000\u000072\u0001\u0000\u0000\u0000"+
		"73\u0001\u0000\u0000\u000074\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u000076\u0001\u0000\u0000\u00008\u0007\u0001\u0000\u0000\u00009:\u0005"+
		"\u001b\u0000\u0000:E\u0003\n\u0005\u0000;F\u0001\u0000\u0000\u0000<A\u0005"+
		"\t\u0000\u0000=>\u0003\u001a\r\u0000>?\u0005\n\u0000\u0000?@\u0003\u0006"+
		"\u0003\u0000@B\u0001\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DF\u0001\u0000\u0000\u0000E;\u0001\u0000\u0000\u0000E<\u0001\u0000\u0000"+
		"\u0000F\t\u0001\u0000\u0000\u0000GQ\u0005\u000b\u0000\u0000HR\u0001\u0000"+
		"\u0000\u0000IJ\u0005\u001b\u0000\u0000JL\u0005\f\u0000\u0000KI\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OR\u0005\u001b\u0000\u0000"+
		"PR\u0005\u001b\u0000\u0000QH\u0001\u0000\u0000\u0000QK\u0001\u0000\u0000"+
		"\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0005\r\u0000"+
		"\u0000T\u000b\u0001\u0000\u0000\u0000UV\u0003\u000e\u0007\u0000VW\u0005"+
		"\u001b\u0000\u0000WX\u0005\u000e\u0000\u0000XY\u0003\u0006\u0003\u0000"+
		"Y\r\u0001\u0000\u0000\u0000Z`\u0001\u0000\u0000\u0000[`\u0005\u000f\u0000"+
		"\u0000\\`\u0005\u0010\u0000\u0000]`\u0005\u0011\u0000\u0000^`\u0005\u0012"+
		"\u0000\u0000_Z\u0001\u0000\u0000\u0000_[\u0001\u0000\u0000\u0000_\\\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000"+
		"`\u000f\u0001\u0000\u0000\u0000ad\u0003\u0012\t\u0000bd\u0003\u0014\n"+
		"\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000d\u0011\u0001"+
		"\u0000\u0000\u0000ef\u0003\u0016\u000b\u0000fg\u0005\u0013\u0000\u0000"+
		"gh\u0003\u0018\f\u0000h\u0013\u0001\u0000\u0000\u0000ij\u0003\u0016\u000b"+
		"\u0000jk\u0005\u0014\u0000\u0000kl\u0003\u0018\f\u0000l\u0015\u0001\u0000"+
		"\u0000\u0000mq\u0005\u0017\u0000\u0000nq\u0005\u0018\u0000\u0000oq\u0003"+
		"\u001a\r\u0000pm\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001"+
		"\u0000\u0000\u0000q\u0017\u0001\u0000\u0000\u0000rv\u0005\u0017\u0000"+
		"\u0000sv\u0005\u0018\u0000\u0000tv\u0003\u001a\r\u0000ur\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\u0019\u0001"+
		"\u0000\u0000\u0000wx\u0005\u0015\u0000\u0000xy\u0005\u001b\u0000\u0000"+
		"y\u001b\u0001\u0000\u0000\u0000z{\u0005\u001a\u0000\u0000{\u001d\u0001"+
		"\u0000\u0000\u0000\u000b!,7CEMQ_cpu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
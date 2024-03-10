// Generated from /home/andofwinds/Documents/windslang/src/main/winds.g4 by ANTLR 4.13.1
package org.forsaken;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class windsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STRING=10, INTEGER=11, HEX=12, NAME=13, SPACE=14, COMMENT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"STRING", "INTEGER", "HEX", "NAME", "SPACE", "COMMENT"
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


	public windsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "winds.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000f\u0083\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0005\tT\b\t\n\t\f\tW\t\t\u0001\t\u0001"+
		"\t\u0001\n\u0004\n\\\b\n\u000b\n\f\n]\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0004\u000bd\b\u000b\u000b\u000b\f\u000be\u0001\f\u0004\f"+
		"i\b\f\u000b\f\f\fj\u0001\r\u0004\rn\b\r\u000b\r\f\ro\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000ey\b"+
		"\u000e\n\u000e\f\u000e|\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0002Uz\u0000\u000f\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0004"+
		"\u0001\u000009\u0002\u000009AZ\u0003\u0000AZ__az\u0003\u0000\t\n\r\r "+
		" \u0088\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003"+
		"&\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000\u0000\u00075\u0001"+
		"\u0000\u0000\u0000\t>\u0001\u0000\u0000\u0000\u000bC\u0001\u0000\u0000"+
		"\u0000\rK\u0001\u0000\u0000\u0000\u000fM\u0001\u0000\u0000\u0000\u0011"+
		"O\u0001\u0000\u0000\u0000\u0013Q\u0001\u0000\u0000\u0000\u0015[\u0001"+
		"\u0000\u0000\u0000\u0017_\u0001\u0000\u0000\u0000\u0019h\u0001\u0000\u0000"+
		"\u0000\u001bm\u0001\u0000\u0000\u0000\u001ds\u0001\u0000\u0000\u0000\u001f"+
		" \u0005g\u0000\u0000 !\u0005l\u0000\u0000!\"\u0005o\u0000\u0000\"#\u0005"+
		"b\u0000\u0000#$\u0005a\u0000\u0000$%\u0005l\u0000\u0000%\u0002\u0001\u0000"+
		"\u0000\u0000&\'\u0005e\u0000\u0000\'(\u0005x\u0000\u0000()\u0005t\u0000"+
		"\u0000)*\u0005e\u0000\u0000*+\u0005r\u0000\u0000+,\u0005n\u0000\u0000"+
		",\u0004\u0001\u0000\u0000\u0000-.\u0005s\u0000\u0000./\u0005e\u0000\u0000"+
		"/0\u0005c\u0000\u000001\u0005t\u0000\u000012\u0005i\u0000\u000023\u0005"+
		"o\u0000\u000034\u0005n\u0000\u00004\u0006\u0001\u0000\u0000\u000056\u0005"+
		"o\u0000\u000067\u0005v\u0000\u000078\u0005e\u0000\u000089\u0005r\u0000"+
		"\u00009:\u0005r\u0000\u0000:;\u0005i\u0000\u0000;<\u0005d\u0000\u0000"+
		"<=\u0005e\u0000\u0000=\b\u0001\u0000\u0000\u0000>?\u0005c\u0000\u0000"+
		"?@\u0005a\u0000\u0000@A\u0005l\u0000\u0000AB\u0005l\u0000\u0000B\n\u0001"+
		"\u0000\u0000\u0000CD\u0005s\u0000\u0000DE\u0005y\u0000\u0000EF\u0005s"+
		"\u0000\u0000FG\u0005c\u0000\u0000GH\u0005a\u0000\u0000HI\u0005l\u0000"+
		"\u0000IJ\u0005l\u0000\u0000J\f\u0001\u0000\u0000\u0000KL\u0005(\u0000"+
		"\u0000L\u000e\u0001\u0000\u0000\u0000MN\u0005)\u0000\u0000N\u0010\u0001"+
		"\u0000\u0000\u0000OP\u0005=\u0000\u0000P\u0012\u0001\u0000\u0000\u0000"+
		"QU\u0005\"\u0000\u0000RT\t\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000"+
		"TW\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005\"\u0000"+
		"\u0000Y\u0014\u0001\u0000\u0000\u0000Z\\\u0007\u0000\u0000\u0000[Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^\u0016\u0001\u0000\u0000\u0000_`\u00050\u0000"+
		"\u0000`a\u0005x\u0000\u0000ac\u0001\u0000\u0000\u0000bd\u0007\u0001\u0000"+
		"\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0018\u0001\u0000\u0000\u0000"+
		"gi\u0007\u0002\u0000\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\u001a\u0001"+
		"\u0000\u0000\u0000ln\u0007\u0003\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qr\u0006\r\u0000\u0000r\u001c\u0001\u0000"+
		"\u0000\u0000st\u0005<\u0000\u0000tu\u0005/\u0000\u0000uv\u0005!\u0000"+
		"\u0000vz\u0001\u0000\u0000\u0000wy\t\u0000\u0000\u0000xw\u0001\u0000\u0000"+
		"\u0000y|\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005"+
		"!\u0000\u0000~\u007f\u0005/\u0000\u0000\u007f\u0080\u0005>\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0006\u000e\u0000\u0000"+
		"\u0082\u001e\u0001\u0000\u0000\u0000\u0007\u0000U]ejoz\u0001\u0000\u0001"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
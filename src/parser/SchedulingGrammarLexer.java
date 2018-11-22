// Generated from /home/paskahlis/Documents/mine/RPLSD/Schedule DSL/src/grammar/SchedulingGrammar.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SchedulingGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, BUAT=9, 
		UBAH=10, HAPUS=11, LIHAT=12, KELAS=13, RUANG=14, DENGAN=15, FASILITAS=16, 
		KAPASITAS=17, KEBUTUHAN=18, PREFERENSI=19, SKS=20, HARI=21, JAM=22, NUMBER=23, 
		KODE_VALUE=24, TEXT=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "BUAT", 
		"UBAH", "HAPUS", "LIHAT", "KELAS", "RUANG", "DENGAN", "FASILITAS", "KAPASITAS", 
		"KEBUTUHAN", "PREFERENSI", "SKS", "HARI", "JAM", "NUMBER", "KODE_VALUE", 
		"TEXT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "','", "'SENIN'", "'SELASA'", "'RABU'", "'KAMIS'", 
		"'JUMAT'", "'BUAT'", "'UBAH'", "'HAPUS'", "'LIHAT'", "'KELAS'", "'RUANG'", 
		"'DENGAN'", "'FASILITAS'", "'KAPASITAS'", "'KEBUTUHAN'", "'PREFERENSI'", 
		"'SKS'", "'HARI'", "'JAM KE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "BUAT", "UBAH", 
		"HAPUS", "LIHAT", "KELAS", "RUANG", "DENGAN", "FASILITAS", "KAPASITAS", 
		"KEBUTUHAN", "PREFERENSI", "SKS", "HARI", "JAM", "NUMBER", "KODE_VALUE", 
		"TEXT", "WS"
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


	public SchedulingGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SchedulingGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00d9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\6\30\u00bf\n\30\r\30\16\30\u00c0\3\31\7\31\u00c4\n"+
		"\31\f\31\16\31\u00c7\13\31\3\31\6\31\u00ca\n\31\r\31\16\31\u00cb\3\32"+
		"\6\32\u00cf\n\32\r\32\16\32\u00d0\3\33\6\33\u00d4\n\33\r\33\16\33\u00d5"+
		"\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\3\2\6\3\2\62;\4\2C\\c|\6\2//\62;C\\c|\5\2\13\f\17\17\"\"\2\u00dd\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2"+
		"\2\2\t=\3\2\2\2\13C\3\2\2\2\rJ\3\2\2\2\17O\3\2\2\2\21U\3\2\2\2\23[\3\2"+
		"\2\2\25`\3\2\2\2\27e\3\2\2\2\31k\3\2\2\2\33q\3\2\2\2\35w\3\2\2\2\37}\3"+
		"\2\2\2!\u0084\3\2\2\2#\u008e\3\2\2\2%\u0098\3\2\2\2\'\u00a2\3\2\2\2)\u00ad"+
		"\3\2\2\2+\u00b1\3\2\2\2-\u00b6\3\2\2\2/\u00be\3\2\2\2\61\u00c5\3\2\2\2"+
		"\63\u00ce\3\2\2\2\65\u00d3\3\2\2\2\678\7=\2\28\4\3\2\2\29:\7?\2\2:\6\3"+
		"\2\2\2;<\7.\2\2<\b\3\2\2\2=>\7U\2\2>?\7G\2\2?@\7P\2\2@A\7K\2\2AB\7P\2"+
		"\2B\n\3\2\2\2CD\7U\2\2DE\7G\2\2EF\7N\2\2FG\7C\2\2GH\7U\2\2HI\7C\2\2I\f"+
		"\3\2\2\2JK\7T\2\2KL\7C\2\2LM\7D\2\2MN\7W\2\2N\16\3\2\2\2OP\7M\2\2PQ\7"+
		"C\2\2QR\7O\2\2RS\7K\2\2ST\7U\2\2T\20\3\2\2\2UV\7L\2\2VW\7W\2\2WX\7O\2"+
		"\2XY\7C\2\2YZ\7V\2\2Z\22\3\2\2\2[\\\7D\2\2\\]\7W\2\2]^\7C\2\2^_\7V\2\2"+
		"_\24\3\2\2\2`a\7W\2\2ab\7D\2\2bc\7C\2\2cd\7J\2\2d\26\3\2\2\2ef\7J\2\2"+
		"fg\7C\2\2gh\7R\2\2hi\7W\2\2ij\7U\2\2j\30\3\2\2\2kl\7N\2\2lm\7K\2\2mn\7"+
		"J\2\2no\7C\2\2op\7V\2\2p\32\3\2\2\2qr\7M\2\2rs\7G\2\2st\7N\2\2tu\7C\2"+
		"\2uv\7U\2\2v\34\3\2\2\2wx\7T\2\2xy\7W\2\2yz\7C\2\2z{\7P\2\2{|\7I\2\2|"+
		"\36\3\2\2\2}~\7F\2\2~\177\7G\2\2\177\u0080\7P\2\2\u0080\u0081\7I\2\2\u0081"+
		"\u0082\7C\2\2\u0082\u0083\7P\2\2\u0083 \3\2\2\2\u0084\u0085\7H\2\2\u0085"+
		"\u0086\7C\2\2\u0086\u0087\7U\2\2\u0087\u0088\7K\2\2\u0088\u0089\7N\2\2"+
		"\u0089\u008a\7K\2\2\u008a\u008b\7V\2\2\u008b\u008c\7C\2\2\u008c\u008d"+
		"\7U\2\2\u008d\"\3\2\2\2\u008e\u008f\7M\2\2\u008f\u0090\7C\2\2\u0090\u0091"+
		"\7R\2\2\u0091\u0092\7C\2\2\u0092\u0093\7U\2\2\u0093\u0094\7K\2\2\u0094"+
		"\u0095\7V\2\2\u0095\u0096\7C\2\2\u0096\u0097\7U\2\2\u0097$\3\2\2\2\u0098"+
		"\u0099\7M\2\2\u0099\u009a\7G\2\2\u009a\u009b\7D\2\2\u009b\u009c\7W\2\2"+
		"\u009c\u009d\7V\2\2\u009d\u009e\7W\2\2\u009e\u009f\7J\2\2\u009f\u00a0"+
		"\7C\2\2\u00a0\u00a1\7P\2\2\u00a1&\3\2\2\2\u00a2\u00a3\7R\2\2\u00a3\u00a4"+
		"\7T\2\2\u00a4\u00a5\7G\2\2\u00a5\u00a6\7H\2\2\u00a6\u00a7\7G\2\2\u00a7"+
		"\u00a8\7T\2\2\u00a8\u00a9\7G\2\2\u00a9\u00aa\7P\2\2\u00aa\u00ab\7U\2\2"+
		"\u00ab\u00ac\7K\2\2\u00ac(\3\2\2\2\u00ad\u00ae\7U\2\2\u00ae\u00af\7M\2"+
		"\2\u00af\u00b0\7U\2\2\u00b0*\3\2\2\2\u00b1\u00b2\7J\2\2\u00b2\u00b3\7"+
		"C\2\2\u00b3\u00b4\7T\2\2\u00b4\u00b5\7K\2\2\u00b5,\3\2\2\2\u00b6\u00b7"+
		"\7L\2\2\u00b7\u00b8\7C\2\2\u00b8\u00b9\7O\2\2\u00b9\u00ba\7\"\2\2\u00ba"+
		"\u00bb\7M\2\2\u00bb\u00bc\7G\2\2\u00bc.\3\2\2\2\u00bd\u00bf\t\2\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\60\3\2\2\2\u00c2\u00c4\t\3\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00ca\4\62;\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\62\3\2\2\2\u00cd\u00cf"+
		"\t\4\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\64\3\2\2\2\u00d2\u00d4\t\5\2\2\u00d3\u00d2\3\2\2"+
		"\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d8\b\33\2\2\u00d8\66\3\2\2\2\t\2\u00c0\u00c5\u00cb\u00ce"+
		"\u00d0\u00d5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
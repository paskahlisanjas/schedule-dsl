// Generated from /home/paskahlis/Documents/mine/RPLSD/Schedule DSL/src/grammar/SchedulingGrammar.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SchedulingGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, BUAT=9, 
		UBAH=10, HAPUS=11, LIHAT=12, KELAS=13, RUANG=14, DENGAN=15, FASILITAS=16, 
		KAPASITAS=17, KEBUTUHAN=18, PREFERENSI=19, SKS=20, HARI=21, JAM=22, WS=23, 
		NUMBER=24, KODE_VALUE=25, TEXT=26;
	public static final int
		RULE_ekspresi = 0, RULE_perintah = 1, RULE_entitas = 2, RULE_objek = 3, 
		RULE_kode = 4, RULE_atribut = 5, RULE_meta_kebutuhan = 6, RULE_meta_fasilitas = 7, 
		RULE_kebutuhan = 8, RULE_fasilitas = 9, RULE_sks = 10, RULE_kapasitas = 11, 
		RULE_preferensi = 12, RULE_hari = 13, RULE_jam = 14;
	public static final String[] ruleNames = {
		"ekspresi", "perintah", "entitas", "objek", "kode", "atribut", "meta_kebutuhan", 
		"meta_fasilitas", "kebutuhan", "fasilitas", "sks", "kapasitas", "preferensi", 
		"hari", "jam"
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
		"KEBUTUHAN", "PREFERENSI", "SKS", "HARI", "JAM", "WS", "NUMBER", "KODE_VALUE", 
		"TEXT"
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
	public String getGrammarFileName() { return "SchedulingGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SchedulingGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EkspresiContext extends ParserRuleContext {
		public PerintahContext perintah() {
			return getRuleContext(PerintahContext.class,0);
		}
		public EntitasContext entitas() {
			return getRuleContext(EntitasContext.class,0);
		}
		public EkspresiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ekspresi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).enterEkspresi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).exitEkspresi(this);
		}
	}

	public final EkspresiContext ekspresi() throws RecognitionException {
		EkspresiContext _localctx = new EkspresiContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ekspresi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			perintah();
			setState(31);
			entitas();
			setState(32);
			match(T__0);
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

	public static class PerintahContext extends ParserRuleContext {
		public TerminalNode BUAT() { return getToken(SchedulingGrammarParser.BUAT, 0); }
		public TerminalNode UBAH() { return getToken(SchedulingGrammarParser.UBAH, 0); }
		public TerminalNode HAPUS() { return getToken(SchedulingGrammarParser.HAPUS, 0); }
		public TerminalNode LIHAT() { return getToken(SchedulingGrammarParser.LIHAT, 0); }
		public PerintahContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perintah; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).enterPerintah(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).exitPerintah(this);
		}
	}

	public final PerintahContext perintah() throws RecognitionException {
		PerintahContext _localctx = new PerintahContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_perintah);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BUAT) | (1L << UBAH) | (1L << HAPUS) | (1L << LIHAT))) != 0)) ) {
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

	public static class EntitasContext extends ParserRuleContext {
		public ObjekContext objek() {
			return getRuleContext(ObjekContext.class,0);
		}
		public KodeContext kode() {
			return getRuleContext(KodeContext.class,0);
		}
		public TerminalNode DENGAN() { return getToken(SchedulingGrammarParser.DENGAN, 0); }
		public AtributContext atribut() {
			return getRuleContext(AtributContext.class,0);
		}
		public EntitasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entitas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).enterEntitas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).exitEntitas(this);
		}
	}

	public final EntitasContext entitas() throws RecognitionException {
		EntitasContext _localctx = new EntitasContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_entitas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			objek();
			setState(37);
			kode();
			setState(38);
			match(DENGAN);
			setState(39);
			atribut();
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

	public static class ObjekContext extends ParserRuleContext {
		public TerminalNode KELAS() { return getToken(SchedulingGrammarParser.KELAS, 0); }
		public TerminalNode RUANG() { return getToken(SchedulingGrammarParser.RUANG, 0); }
		public ObjekContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objek; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).enterObjek(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).exitObjek(this);
		}
	}

	public final ObjekContext objek() throws RecognitionException {
		ObjekContext _localctx = new ObjekContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_objek);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !(_la==KELAS || _la==RUANG) ) {
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

	public static class KodeContext extends ParserRuleContext {
		public TerminalNode KODE_VALUE() { return getToken(SchedulingGrammarParser.KODE_VALUE, 0); }
		public KodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).enterKode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).exitKode(this);
		}
	}

	public final KodeContext kode() throws RecognitionException {
		KodeContext _localctx = new KodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_kode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(KODE_VALUE);
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

	public static class AtributContext extends ParserRuleContext {
		public List<TerminalNode> FASILITAS() { return getTokens(SchedulingGrammarParser.FASILITAS); }
		public TerminalNode FASILITAS(int i) {
			return getToken(SchedulingGrammarParser.FASILITAS, i);
		}
		public List<Meta_fasilitasContext> meta_fasilitas() {
			return getRuleContexts(Meta_fasilitasContext.class);
		}
		public Meta_fasilitasContext meta_fasilitas(int i) {
			return getRuleContext(Meta_fasilitasContext.class,i);
		}
		public List<TerminalNode> SKS() { return getTokens(SchedulingGrammarParser.SKS); }
		public TerminalNode SKS(int i) {
			return getToken(SchedulingGrammarParser.SKS, i);
		}
		public List<SksContext> sks() {
			return getRuleContexts(SksContext.class);
		}
		public SksContext sks(int i) {
			return getRuleContext(SksContext.class,i);
		}
		public List<TerminalNode> KEBUTUHAN() { return getTokens(SchedulingGrammarParser.KEBUTUHAN); }
		public TerminalNode KEBUTUHAN(int i) {
			return getToken(SchedulingGrammarParser.KEBUTUHAN, i);
		}
		public List<Meta_kebutuhanContext> meta_kebutuhan() {
			return getRuleContexts(Meta_kebutuhanContext.class);
		}
		public Meta_kebutuhanContext meta_kebutuhan(int i) {
			return getRuleContext(Meta_kebutuhanContext.class,i);
		}
		public List<TerminalNode> PREFERENSI() { return getTokens(SchedulingGrammarParser.PREFERENSI); }
		public TerminalNode PREFERENSI(int i) {
			return getToken(SchedulingGrammarParser.PREFERENSI, i);
		}
		public List<PreferensiContext> preferensi() {
			return getRuleContexts(PreferensiContext.class);
		}
		public PreferensiContext preferensi(int i) {
			return getRuleContext(PreferensiContext.class,i);
		}
		public List<TerminalNode> KAPASITAS() { return getTokens(SchedulingGrammarParser.KAPASITAS); }
		public TerminalNode KAPASITAS(int i) {
			return getToken(SchedulingGrammarParser.KAPASITAS, i);
		}
		public List<KapasitasContext> kapasitas() {
			return getRuleContexts(KapasitasContext.class);
		}
		public KapasitasContext kapasitas(int i) {
			return getRuleContext(KapasitasContext.class,i);
		}
		public AtributContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).enterAtribut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).exitAtribut(this);
		}
	}

	public final AtributContext atribut() throws RecognitionException {
		AtributContext _localctx = new AtributContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atribut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(60);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FASILITAS:
					{
					setState(45);
					match(FASILITAS);
					setState(46);
					match(T__1);
					setState(47);
					meta_fasilitas();
					}
					break;
				case SKS:
					{
					setState(48);
					match(SKS);
					setState(49);
					match(T__1);
					setState(50);
					sks();
					}
					break;
				case KEBUTUHAN:
					{
					setState(51);
					match(KEBUTUHAN);
					setState(52);
					match(T__1);
					setState(53);
					meta_kebutuhan();
					}
					break;
				case PREFERENSI:
					{
					setState(54);
					match(PREFERENSI);
					setState(55);
					match(T__1);
					setState(56);
					preferensi();
					}
					break;
				case KAPASITAS:
					{
					setState(57);
					match(KAPASITAS);
					setState(58);
					match(T__1);
					setState(59);
					kapasitas();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FASILITAS) | (1L << KAPASITAS) | (1L << KEBUTUHAN) | (1L << PREFERENSI) | (1L << SKS))) != 0) );
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

	public static class Meta_kebutuhanContext extends ParserRuleContext {
		public List<KebutuhanContext> kebutuhan() {
			return getRuleContexts(KebutuhanContext.class);
		}
		public KebutuhanContext kebutuhan(int i) {
			return getRuleContext(KebutuhanContext.class,i);
		}
		public Meta_kebutuhanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meta_kebutuhan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).enterMeta_kebutuhan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).exitMeta_kebutuhan(this);
		}
	}

	public final Meta_kebutuhanContext meta_kebutuhan() throws RecognitionException {
		Meta_kebutuhanContext _localctx = new Meta_kebutuhanContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_meta_kebutuhan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				kebutuhan();
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(65);
					match(T__2);
					}
				}

				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
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

	public static class Meta_fasilitasContext extends ParserRuleContext {
		public List<FasilitasContext> fasilitas() {
			return getRuleContexts(FasilitasContext.class);
		}
		public FasilitasContext fasilitas(int i) {
			return getRuleContext(FasilitasContext.class,i);
		}
		public Meta_fasilitasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meta_fasilitas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).enterMeta_fasilitas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).exitMeta_fasilitas(this);
		}
	}

	public final Meta_fasilitasContext meta_fasilitas() throws RecognitionException {
		Meta_fasilitasContext _localctx = new Meta_fasilitasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_meta_fasilitas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				fasilitas();
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(73);
					match(T__2);
					}
				}

				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
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

	public static class KebutuhanContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SchedulingGrammarParser.TEXT, 0); }
		public KebutuhanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kebutuhan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).enterKebutuhan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).exitKebutuhan(this);
		}
	}

	public final KebutuhanContext kebutuhan() throws RecognitionException {
		KebutuhanContext _localctx = new KebutuhanContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_kebutuhan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(TEXT);
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

	public static class FasilitasContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SchedulingGrammarParser.TEXT, 0); }
		public FasilitasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fasilitas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).enterFasilitas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).exitFasilitas(this);
		}
	}

	public final FasilitasContext fasilitas() throws RecognitionException {
		FasilitasContext _localctx = new FasilitasContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fasilitas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(TEXT);
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

	public static class SksContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SchedulingGrammarParser.NUMBER, 0); }
		public SksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).enterSks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).exitSks(this);
		}
	}

	public final SksContext sks() throws RecognitionException {
		SksContext _localctx = new SksContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(NUMBER);
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

	public static class KapasitasContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SchedulingGrammarParser.NUMBER, 0); }
		public KapasitasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kapasitas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).enterKapasitas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).exitKapasitas(this);
		}
	}

	public final KapasitasContext kapasitas() throws RecognitionException {
		KapasitasContext _localctx = new KapasitasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_kapasitas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(NUMBER);
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

	public static class PreferensiContext extends ParserRuleContext {
		public TerminalNode HARI() { return getToken(SchedulingGrammarParser.HARI, 0); }
		public HariContext hari() {
			return getRuleContext(HariContext.class,0);
		}
		public TerminalNode JAM() { return getToken(SchedulingGrammarParser.JAM, 0); }
		public JamContext jam() {
			return getRuleContext(JamContext.class,0);
		}
		public PreferensiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preferensi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).enterPreferensi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).exitPreferensi(this);
		}
	}

	public final PreferensiContext preferensi() throws RecognitionException {
		PreferensiContext _localctx = new PreferensiContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_preferensi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(HARI);
			setState(89);
			hari();
			setState(90);
			match(JAM);
			setState(91);
			jam();
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

	public static class HariContext extends ParserRuleContext {
		public HariContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hari; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).enterHari(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).exitHari(this);
		}
	}

	public final HariContext hari() throws RecognitionException {
		HariContext _localctx = new HariContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_hari);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
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

	public static class JamContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SchedulingGrammarParser.NUMBER, 0); }
		public JamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).enterJam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).exitJam(this);
		}
	}

	public final JamContext jam() throws RecognitionException {
		JamContext _localctx = new JamContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(NUMBER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34d\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\6\7?\n\7\r\7\16\7@\3\b\3\b\5\bE\n\b\6\bG\n\b"+
		"\r\b\16\bH\3\t\3\t\5\tM\n\t\6\tO\n\t\r\t\16\tP\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\2\2\21\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5\3\2\13\16\3\2\17\20\3\2\6\n"+
		"\2]\2 \3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b+\3\2\2\2\n-\3\2\2\2\f>\3\2\2\2"+
		"\16F\3\2\2\2\20N\3\2\2\2\22R\3\2\2\2\24T\3\2\2\2\26V\3\2\2\2\30X\3\2\2"+
		"\2\32Z\3\2\2\2\34_\3\2\2\2\36a\3\2\2\2 !\5\4\3\2!\"\5\6\4\2\"#\7\3\2\2"+
		"#\3\3\2\2\2$%\t\2\2\2%\5\3\2\2\2&\'\5\b\5\2\'(\5\n\6\2()\7\21\2\2)*\5"+
		"\f\7\2*\7\3\2\2\2+,\t\3\2\2,\t\3\2\2\2-.\7\33\2\2.\13\3\2\2\2/\60\7\22"+
		"\2\2\60\61\7\4\2\2\61?\5\20\t\2\62\63\7\26\2\2\63\64\7\4\2\2\64?\5\26"+
		"\f\2\65\66\7\24\2\2\66\67\7\4\2\2\67?\5\16\b\289\7\25\2\29:\7\4\2\2:?"+
		"\5\32\16\2;<\7\23\2\2<=\7\4\2\2=?\5\30\r\2>/\3\2\2\2>\62\3\2\2\2>\65\3"+
		"\2\2\2>8\3\2\2\2>;\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\r\3\2\2\2BD"+
		"\5\22\n\2CE\7\5\2\2DC\3\2\2\2DE\3\2\2\2EG\3\2\2\2FB\3\2\2\2GH\3\2\2\2"+
		"HF\3\2\2\2HI\3\2\2\2I\17\3\2\2\2JL\5\24\13\2KM\7\5\2\2LK\3\2\2\2LM\3\2"+
		"\2\2MO\3\2\2\2NJ\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\21\3\2\2\2RS\7"+
		"\34\2\2S\23\3\2\2\2TU\7\34\2\2U\25\3\2\2\2VW\7\32\2\2W\27\3\2\2\2XY\7"+
		"\32\2\2Y\31\3\2\2\2Z[\7\27\2\2[\\\5\34\17\2\\]\7\30\2\2]^\5\36\20\2^\33"+
		"\3\2\2\2_`\t\4\2\2`\35\3\2\2\2ab\7\32\2\2b\37\3\2\2\2\b>@DHLP";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, BUAT=11, UBAH=12, HAPUS=13, LIHAT=14, KELAS=15, RUANG=16, DENGAN=17, 
		FASILITAS=18, KAPASITAS=19, KEBUTUHAN=20, PREFERENSI=21, KETERSEDIAAN=22, 
		SKS=23, HARI=24, JAM=25, JADWAL=26, WS=27, NUMBER=28, KODE_VALUE=29, TEXT=30;
	public static final int
		RULE_ekspresi = 0, RULE_perintah = 1, RULE_entitas = 2, RULE_objek = 3, 
		RULE_kode = 4, RULE_atribut = 5, RULE_meta_kebutuhan = 6, RULE_meta_fasilitas = 7, 
		RULE_kebutuhan = 8, RULE_fasilitas = 9, RULE_sks = 10, RULE_kapasitas = 11, 
		RULE_preferensi = 12, RULE_ketersediaan = 13, RULE_hari = 14, RULE_jam = 15;
	public static final String[] ruleNames = {
		"ekspresi", "perintah", "entitas", "objek", "kode", "atribut", "meta_kebutuhan", 
		"meta_fasilitas", "kebutuhan", "fasilitas", "sks", "kapasitas", "preferensi", 
		"ketersediaan", "hari", "jam"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "','", "'YA'", "'TIDAK'", "'SENIN'", "'SELASA'", "'RABU'", 
		"'KAMIS'", "'JUMAT'", "'BUAT'", "'UBAH'", "'HAPUS'", "'LIHAT'", "'KELAS'", 
		"'RUANG'", "'DENGAN'", "'FASILITAS'", "'KAPASITAS'", "'KEBUTUHAN'", "'PREFERENSI'", 
		"'KETERSEDIAAN'", "'SKS'", "'HARI'", "'JAM'", "'JADWAL'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "BUAT", 
		"UBAH", "HAPUS", "LIHAT", "KELAS", "RUANG", "DENGAN", "FASILITAS", "KAPASITAS", 
		"KEBUTUHAN", "PREFERENSI", "KETERSEDIAAN", "SKS", "HARI", "JAM", "JADWAL", 
		"WS", "NUMBER", "KODE_VALUE", "TEXT"
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
			setState(32);
			perintah();
			setState(33);
			entitas();
			setState(34);
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
			setState(36);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			objek();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KODE_VALUE) {
				{
				setState(39);
				kode();
				}
			}

			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DENGAN) {
				{
				setState(42);
				match(DENGAN);
				setState(43);
				atribut();
				}
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

	public static class ObjekContext extends ParserRuleContext {
		public TerminalNode KELAS() { return getToken(SchedulingGrammarParser.KELAS, 0); }
		public TerminalNode RUANG() { return getToken(SchedulingGrammarParser.RUANG, 0); }
		public TerminalNode JADWAL() { return getToken(SchedulingGrammarParser.JADWAL, 0); }
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
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KELAS) | (1L << RUANG) | (1L << JADWAL))) != 0)) ) {
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
			setState(48);
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
		public List<TerminalNode> KETERSEDIAAN() { return getTokens(SchedulingGrammarParser.KETERSEDIAAN); }
		public TerminalNode KETERSEDIAAN(int i) {
			return getToken(SchedulingGrammarParser.KETERSEDIAAN, i);
		}
		public List<KetersediaanContext> ketersediaan() {
			return getRuleContexts(KetersediaanContext.class);
		}
		public KetersediaanContext ketersediaan(int i) {
			return getRuleContext(KetersediaanContext.class,i);
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
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(68);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FASILITAS:
					{
					setState(50);
					match(FASILITAS);
					setState(51);
					match(T__1);
					setState(52);
					meta_fasilitas();
					}
					break;
				case SKS:
					{
					setState(53);
					match(SKS);
					setState(54);
					match(T__1);
					setState(55);
					sks();
					}
					break;
				case KEBUTUHAN:
					{
					setState(56);
					match(KEBUTUHAN);
					setState(57);
					match(T__1);
					setState(58);
					meta_kebutuhan();
					}
					break;
				case PREFERENSI:
					{
					setState(59);
					match(PREFERENSI);
					setState(60);
					match(T__1);
					setState(61);
					preferensi();
					}
					break;
				case KAPASITAS:
					{
					setState(62);
					match(KAPASITAS);
					setState(63);
					match(T__1);
					setState(64);
					kapasitas();
					}
					break;
				case KETERSEDIAAN:
					{
					setState(65);
					match(KETERSEDIAAN);
					setState(66);
					match(T__1);
					setState(67);
					ketersediaan();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FASILITAS) | (1L << KAPASITAS) | (1L << KEBUTUHAN) | (1L << PREFERENSI) | (1L << KETERSEDIAAN) | (1L << SKS))) != 0) );
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
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				kebutuhan();
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
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				fasilitas();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(81);
					match(T__2);
					}
				}

				}
				}
				setState(86); 
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
			setState(88);
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
			setState(90);
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
			setState(92);
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
			setState(94);
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
			setState(96);
			match(HARI);
			setState(97);
			hari();
			setState(98);
			match(JAM);
			setState(99);
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

	public static class KetersediaanContext extends ParserRuleContext {
		public KetersediaanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ketersediaan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).enterKetersediaan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchedulingGrammarListener ) ((SchedulingGrammarListener)listener).exitKetersediaan(this);
		}
	}

	public final KetersediaanContext ketersediaan() throws RecognitionException {
		KetersediaanContext _localctx = new KetersediaanContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ketersediaan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
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
		enterRule(_localctx, 28, RULE_hari);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_jam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 n\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\5\4+\n\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7G\n\7\r"+
		"\7\16\7H\3\b\3\b\5\bM\n\b\6\bO\n\b\r\b\16\bP\3\t\3\t\5\tU\n\t\6\tW\n\t"+
		"\r\t\16\tX\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \2\6\3\2\r\20\4\2\21\22\34\34\3\2\6\7\3\2\b\f\2i\2\"\3\2"+
		"\2\2\4&\3\2\2\2\6(\3\2\2\2\b\60\3\2\2\2\n\62\3\2\2\2\fF\3\2\2\2\16N\3"+
		"\2\2\2\20V\3\2\2\2\22Z\3\2\2\2\24\\\3\2\2\2\26^\3\2\2\2\30`\3\2\2\2\32"+
		"b\3\2\2\2\34g\3\2\2\2\36i\3\2\2\2 k\3\2\2\2\"#\5\4\3\2#$\5\6\4\2$%\7\3"+
		"\2\2%\3\3\2\2\2&\'\t\2\2\2\'\5\3\2\2\2(*\5\b\5\2)+\5\n\6\2*)\3\2\2\2*"+
		"+\3\2\2\2+.\3\2\2\2,-\7\23\2\2-/\5\f\7\2.,\3\2\2\2./\3\2\2\2/\7\3\2\2"+
		"\2\60\61\t\3\2\2\61\t\3\2\2\2\62\63\7\37\2\2\63\13\3\2\2\2\64\65\7\24"+
		"\2\2\65\66\7\4\2\2\66G\5\20\t\2\678\7\31\2\289\7\4\2\29G\5\26\f\2:;\7"+
		"\26\2\2;<\7\4\2\2<G\5\16\b\2=>\7\27\2\2>?\7\4\2\2?G\5\32\16\2@A\7\25\2"+
		"\2AB\7\4\2\2BG\5\30\r\2CD\7\30\2\2DE\7\4\2\2EG\5\34\17\2F\64\3\2\2\2F"+
		"\67\3\2\2\2F:\3\2\2\2F=\3\2\2\2F@\3\2\2\2FC\3\2\2\2GH\3\2\2\2HF\3\2\2"+
		"\2HI\3\2\2\2I\r\3\2\2\2JL\5\22\n\2KM\7\5\2\2LK\3\2\2\2LM\3\2\2\2MO\3\2"+
		"\2\2NJ\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\17\3\2\2\2RT\5\24\13\2S"+
		"U\7\5\2\2TS\3\2\2\2TU\3\2\2\2UW\3\2\2\2VR\3\2\2\2WX\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2Y\21\3\2\2\2Z[\7 \2\2[\23\3\2\2\2\\]\7 \2\2]\25\3\2\2\2^_\7"+
		"\36\2\2_\27\3\2\2\2`a\7\36\2\2a\31\3\2\2\2bc\7\32\2\2cd\5\36\20\2de\7"+
		"\33\2\2ef\5 \21\2f\33\3\2\2\2gh\t\4\2\2h\35\3\2\2\2ij\t\5\2\2j\37\3\2"+
		"\2\2kl\7\36\2\2l!\3\2\2\2\n*.FHLPTX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
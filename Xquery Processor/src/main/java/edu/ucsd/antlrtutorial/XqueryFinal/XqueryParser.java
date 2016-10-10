// Generated from edu\u005Cucsd\antlrtutorial\XqueryFinal\Xquery.g4 by ANTLR 4.5
package edu.ucsd.antlrtutorial.XqueryFinal;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XqueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, StringConstant=43, ID=44, Ws=45;
	public static final int
		RULE_r = 0, RULE_ap = 1, RULE_ap1 = 2, RULE_ap3 = 3, RULE_rp = 4, RULE_many = 5, 
		RULE_self = 6, RULE_parent = 7, RULE_text = 8, RULE_tagName = 9, RULE_fileName = 10, 
		RULE_attName = 11, RULE_f = 12, RULE_not = 13, RULE_fBracket = 14, RULE_xq = 15, 
		RULE_forClause = 16, RULE_letClause = 17, RULE_whereClause = 18, RULE_cond = 19, 
		RULE_returnClause = 20, RULE_some = 21, RULE_oxq = 22, RULE_forJ = 23, 
		RULE_path = 24, RULE_condJ = 25, RULE_returnJ = 26, RULE_var = 27;
	public static final String[] ruleNames = {
		"r", "ap", "ap1", "ap3", "rp", "many", "self", "parent", "text", "tagName", 
		"fileName", "attName", "f", "not", "fBracket", "xq", "forClause", "letClause", 
		"whereClause", "cond", "returnClause", "some", "oxq", "forJ", "path", 
		"condJ", "returnJ", "var"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'document'", "'('", "')'", "'/'", "'//'", "'@'", "'['", "']'", 
		"','", "'*'", "'.'", "'..'", "'text()'", "'\"'", "'='", "' eq '", "'=='", 
		"' is '", "' and '", "' or '", "'not '", "'<'", "'>'", "'{'", "'}'", "'</'", 
		"'for '", "' in '", "'let '", "':='", "'where '", "'empty '", "' return '", 
		"'some '", "' satisfies '", "'for'", "'where'", "'return'", "'in'", "'eq'", 
		"'and'", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "StringConstant", "ID", "Ws"
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
	public String getGrammarFileName() { return "Xquery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XqueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public OxqContext oxq() {
			return getRuleContext(OxqContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			setState(58);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				oxq();
				}
				break;
			case T__0:
			case T__1:
			case T__21:
			case T__26:
			case T__28:
			case T__41:
			case StringConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				xq(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ApContext extends ParserRuleContext {
		public Ap1Context ap1() {
			return getRuleContext(Ap1Context.class,0);
		}
		public Ap3Context ap3() {
			return getRuleContext(Ap3Context.class,0);
		}
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitAp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitAp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ap);
		try {
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				ap1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				ap3();
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

	public static class Ap1Context extends ParserRuleContext {
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Ap1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterAp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitAp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitAp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ap1Context ap1() throws RecognitionException {
		Ap1Context _localctx = new Ap1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_ap1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__0);
			setState(65);
			match(T__1);
			setState(66);
			fileName();
			setState(67);
			match(T__2);
			setState(68);
			match(T__3);
			setState(69);
			rp(0);
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

	public static class Ap3Context extends ParserRuleContext {
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Ap3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterAp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitAp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitAp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ap3Context ap3() throws RecognitionException {
		Ap3Context _localctx = new Ap3Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_ap3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__0);
			setState(72);
			match(T__1);
			setState(73);
			fileName();
			setState(74);
			match(T__2);
			setState(75);
			match(T__4);
			setState(76);
			rp(0);
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

	public static class RpContext extends ParserRuleContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public ManyContext many() {
			return getRuleContext(ManyContext.class,0);
		}
		public SelfContext self() {
			return getRuleContext(SelfContext.class,0);
		}
		public ParentContext parent() {
			return getRuleContext(ParentContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitRp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(79);
				tagName();
				}
				break;
			case T__9:
				{
				setState(80);
				many();
				}
				break;
			case T__10:
				{
				setState(81);
				self();
				}
				break;
			case T__11:
				{
				setState(82);
				parent();
				}
				break;
			case T__12:
				{
				setState(83);
				text();
				}
				break;
			case T__5:
				{
				setState(84);
				match(T__5);
				setState(85);
				attName();
				}
				break;
			case T__1:
				{
				setState(86);
				match(T__1);
				setState(87);
				rp(0);
				setState(88);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(92);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(93);
						match(T__3);
						setState(94);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(95);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(96);
						match(T__4);
						setState(97);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(98);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(99);
						match(T__8);
						setState(100);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(101);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(102);
						match(T__6);
						setState(103);
						f(0);
						setState(104);
						match(T__7);
						}
						break;
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ManyContext extends ParserRuleContext {
		public ManyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_many; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitMany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitMany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ManyContext many() throws RecognitionException {
		ManyContext _localctx = new ManyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_many);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__9);
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

	public static class SelfContext extends ParserRuleContext {
		public SelfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitSelf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitSelf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfContext self() throws RecognitionException {
		SelfContext _localctx = new SelfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_self);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__10);
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

	public static class ParentContext extends ParserRuleContext {
		public ParentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitParent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParentContext parent() throws RecognitionException {
		ParentContext _localctx = new ParentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__11);
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

	public static class TextContext extends ParserRuleContext {
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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

	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XqueryParser.ID, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
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

	public static class FileNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XqueryParser.ID, 0); }
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__13);
			setState(122);
			match(ID);
			setState(123);
			match(T__13);
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

	public static class AttNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XqueryParser.ID, 0); }
		public AttNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterAttName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitAttName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitAttName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttNameContext attName() throws RecognitionException {
		AttNameContext _localctx = new AttNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ID);
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

	public static class FContext extends ParserRuleContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FBracketContext fBracket() {
			return getRuleContext(FBracketContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(128);
				rp(0);
				}
				break;
			case 2:
				{
				setState(129);
				rp(0);
				setState(130);
				match(T__14);
				setState(131);
				rp(0);
				}
				break;
			case 3:
				{
				setState(133);
				rp(0);
				setState(134);
				match(T__15);
				setState(135);
				rp(0);
				}
				break;
			case 4:
				{
				setState(137);
				rp(0);
				setState(138);
				match(T__16);
				setState(139);
				rp(0);
				}
				break;
			case 5:
				{
				setState(141);
				rp(0);
				setState(142);
				match(T__17);
				setState(143);
				rp(0);
				}
				break;
			case 6:
				{
				setState(145);
				fBracket();
				}
				break;
			case 7:
				{
				setState(146);
				not();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(155);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(149);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(150);
						match(T__18);
						setState(151);
						f(3);
						}
						break;
					case 2:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(152);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(153);
						match(T__19);
						setState(154);
						f(2);
						}
						break;
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NotContext extends ParserRuleContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__20);
			setState(161);
			f(0);
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

	public static class FBracketContext extends ParserRuleContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterFBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitFBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitFBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FBracketContext fBracket() throws RecognitionException {
		FBracketContext _localctx = new FBracketContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__1);
			setState(164);
			f(0);
			setState(165);
			match(T__2);
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

	public static class XqContext extends ParserRuleContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode StringConstant() { return getToken(XqueryParser.StringConstant, 0); }
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitXq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			switch (_input.LA(1)) {
			case T__28:
				{
				setState(168);
				letClause();
				setState(169);
				xq(1);
				}
				break;
			case T__41:
				{
				setState(171);
				var();
				}
				break;
			case StringConstant:
				{
				setState(172);
				match(StringConstant);
				}
				break;
			case T__0:
				{
				setState(173);
				ap();
				}
				break;
			case T__1:
				{
				setState(174);
				match(T__1);
				setState(175);
				xq(0);
				setState(176);
				match(T__2);
				}
				break;
			case T__21:
				{
				setState(178);
				match(T__21);
				setState(179);
				tagName();
				setState(180);
				match(T__22);
				setState(181);
				match(T__23);
				setState(182);
				xq(0);
				setState(183);
				match(T__24);
				setState(184);
				match(T__25);
				setState(185);
				tagName();
				setState(186);
				match(T__22);
				}
				break;
			case T__26:
				{
				setState(188);
				forClause();
				setState(190);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(189);
					letClause();
					}
				}

				setState(193);
				_la = _input.LA(1);
				if (_la==T__30) {
					{
					setState(192);
					whereClause();
					}
				}

				setState(195);
				returnClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(199);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(200);
						match(T__8);
						setState(201);
						xq(7);
						}
						break;
					case 2:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(202);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(203);
						match(T__3);
						setState(204);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(205);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(206);
						match(T__4);
						setState(207);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ForClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__26);
			setState(214);
			var();
			setState(215);
			match(T__27);
			setState(216);
			xq(0);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(217);
				match(T__8);
				setState(218);
				var();
				setState(219);
				match(T__27);
				setState(220);
				xq(0);
				}
				}
				setState(226);
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

	public static class LetClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__28);
			setState(228);
			var();
			setState(229);
			match(T__29);
			setState(230);
			xq(0);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(231);
				match(T__8);
				setState(232);
				var();
				setState(233);
				match(T__29);
				setState(234);
				xq(0);
				}
				}
				setState(240);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__30);
			setState(242);
			cond(0);
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

	public static class CondContext extends ParserRuleContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public SomeContext some() {
			return getRuleContext(SomeContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_cond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(245);
				match(T__20);
				setState(246);
				cond(1);
				}
				break;
			case 2:
				{
				setState(247);
				xq(0);
				setState(248);
				match(T__14);
				setState(249);
				xq(0);
				}
				break;
			case 3:
				{
				setState(251);
				xq(0);
				setState(252);
				match(T__15);
				setState(253);
				xq(0);
				}
				break;
			case 4:
				{
				setState(255);
				xq(0);
				setState(256);
				match(T__16);
				setState(257);
				xq(0);
				}
				break;
			case 5:
				{
				setState(259);
				xq(0);
				setState(260);
				match(T__17);
				setState(261);
				xq(0);
				}
				break;
			case 6:
				{
				setState(263);
				match(T__31);
				setState(264);
				match(T__1);
				setState(265);
				xq(0);
				setState(266);
				match(T__2);
				}
				break;
			case 7:
				{
				setState(268);
				some();
				}
				break;
			case 8:
				{
				setState(269);
				match(T__1);
				setState(270);
				cond(0);
				setState(271);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(281);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(275);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(276);
						match(T__18);
						setState(277);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(278);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(279);
						match(T__19);
						setState(280);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ReturnClauseContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__32);
			setState(287);
			xq(0);
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

	public static class SomeContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public SomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_some; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterSome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitSome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitSome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomeContext some() throws RecognitionException {
		SomeContext _localctx = new SomeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_some);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__33);
			setState(290);
			var();
			setState(291);
			match(T__27);
			setState(292);
			xq(0);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(293);
				match(T__8);
				setState(294);
				var();
				setState(295);
				match(T__27);
				setState(296);
				xq(0);
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(T__34);
			setState(304);
			cond(0);
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

	public static class OxqContext extends ParserRuleContext {
		public ForJContext forJ() {
			return getRuleContext(ForJContext.class,0);
		}
		public CondJContext condJ() {
			return getRuleContext(CondJContext.class,0);
		}
		public ReturnJContext returnJ() {
			return getRuleContext(ReturnJContext.class,0);
		}
		public OxqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oxq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterOxq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitOxq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitOxq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OxqContext oxq() throws RecognitionException {
		OxqContext _localctx = new OxqContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_oxq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__35);
			setState(307);
			forJ();
			setState(308);
			match(T__36);
			setState(309);
			condJ(0);
			setState(310);
			match(T__37);
			setState(311);
			returnJ(0);
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

	public static class ForJContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<PathContext> path() {
			return getRuleContexts(PathContext.class);
		}
		public PathContext path(int i) {
			return getRuleContext(PathContext.class,i);
		}
		public ForJContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forJ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterForJ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitForJ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitForJ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForJContext forJ() throws RecognitionException {
		ForJContext _localctx = new ForJContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forJ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			var();
			setState(314);
			match(T__38);
			setState(315);
			path();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(316);
				match(T__8);
				setState(317);
				var();
				setState(318);
				match(T__38);
				setState(319);
				path();
				}
				}
				setState(325);
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

	public static class PathContext extends ParserRuleContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_path);
		int _la;
		try {
			setState(331);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				ap();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				var();
				setState(328);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(329);
				rp(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CondJContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode StringConstant() { return getToken(XqueryParser.StringConstant, 0); }
		public List<CondJContext> condJ() {
			return getRuleContexts(CondJContext.class);
		}
		public CondJContext condJ(int i) {
			return getRuleContext(CondJContext.class,i);
		}
		public CondJContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condJ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterCondJ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitCondJ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitCondJ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondJContext condJ() throws RecognitionException {
		return condJ(0);
	}

	private CondJContext condJ(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondJContext _localctx = new CondJContext(_ctx, _parentState);
		CondJContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_condJ, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(334);
				var();
				setState(335);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__39) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(336);
				var();
				}
				break;
			case 2:
				{
				setState(338);
				var();
				setState(339);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__39) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(340);
				match(StringConstant);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondJContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condJ);
					setState(344);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(345);
					match(T__40);
					setState(346);
					condJ(2);
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ReturnJContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<ReturnJContext> returnJ() {
			return getRuleContexts(ReturnJContext.class);
		}
		public ReturnJContext returnJ(int i) {
			return getRuleContext(ReturnJContext.class,i);
		}
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public ReturnJContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnJ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterReturnJ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitReturnJ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitReturnJ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnJContext returnJ() throws RecognitionException {
		return returnJ(0);
	}

	private ReturnJContext returnJ(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ReturnJContext _localctx = new ReturnJContext(_ctx, _parentState);
		ReturnJContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_returnJ, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(353);
				path();
				}
				break;
			case 2:
				{
				setState(354);
				var();
				}
				break;
			case 3:
				{
				setState(355);
				match(T__1);
				setState(356);
				returnJ(0);
				setState(357);
				match(T__2);
				}
				break;
			case 4:
				{
				setState(359);
				match(T__21);
				setState(360);
				tagName();
				setState(361);
				match(T__22);
				setState(362);
				match(T__23);
				setState(363);
				returnJ(0);
				setState(364);
				match(T__24);
				setState(365);
				match(T__25);
				setState(366);
				tagName();
				setState(367);
				match(T__22);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ReturnJContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_returnJ);
					setState(371);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(372);
					match(T__8);
					setState(373);
					returnJ(3);
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XqueryParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqueryListener ) ((XqueryListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XqueryVisitor ) return ((XqueryVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__41);
			setState(380);
			match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 12:
			return f_sempred((FContext)_localctx, predIndex);
		case 15:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 19:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 25:
			return condJ_sempred((CondJContext)_localctx, predIndex);
		case 26:
			return returnJ_sempred((ReturnJContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean condJ_sempred(CondJContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean returnJ_sempred(ReturnJContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u0181\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\5\2=\n\2\3\3\3\3\5\3"+
		"A\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0096\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u009e"+
		"\n\16\f\16\16\16\u00a1\13\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c1\n\21\3\21\5\21\u00c4"+
		"\n\21\3\21\3\21\5\21\u00c8\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u00d3\n\21\f\21\16\21\u00d6\13\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u00e1\n\22\f\22\16\22\u00e4\13\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00ef\n\23\f\23\16\23\u00f2\13"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u0114\n\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u011c\n\25\f\25\16\25\u011f\13\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u012d\n\27\f\27\16\27\u0130\13\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\7\31\u0144\n\31\f\31\16\31\u0147\13\31\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u014e\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0159\n\33\3\33\3\33\3\33\7\33\u015e\n\33\f\33\16\33\u0161"+
		"\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0174\n\34\3\34\3\34\3\34\7\34\u0179\n\34\f"+
		"\34\16\34\u017c\13\34\3\35\3\35\3\35\3\35\2\b\n\32 (\64\66\36\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\4\3\2\6\7\4\2"+
		"\21\21**\u0197\2<\3\2\2\2\4@\3\2\2\2\6B\3\2\2\2\bI\3\2\2\2\n\\\3\2\2\2"+
		"\fq\3\2\2\2\16s\3\2\2\2\20u\3\2\2\2\22w\3\2\2\2\24y\3\2\2\2\26{\3\2\2"+
		"\2\30\177\3\2\2\2\32\u0095\3\2\2\2\34\u00a2\3\2\2\2\36\u00a5\3\2\2\2 "+
		"\u00c7\3\2\2\2\"\u00d7\3\2\2\2$\u00e5\3\2\2\2&\u00f3\3\2\2\2(\u0113\3"+
		"\2\2\2*\u0120\3\2\2\2,\u0123\3\2\2\2.\u0134\3\2\2\2\60\u013b\3\2\2\2\62"+
		"\u014d\3\2\2\2\64\u0158\3\2\2\2\66\u0173\3\2\2\28\u017d\3\2\2\2:=\5.\30"+
		"\2;=\5 \21\2<:\3\2\2\2<;\3\2\2\2=\3\3\2\2\2>A\5\6\4\2?A\5\b\5\2@>\3\2"+
		"\2\2@?\3\2\2\2A\5\3\2\2\2BC\7\3\2\2CD\7\4\2\2DE\5\26\f\2EF\7\5\2\2FG\7"+
		"\6\2\2GH\5\n\6\2H\7\3\2\2\2IJ\7\3\2\2JK\7\4\2\2KL\5\26\f\2LM\7\5\2\2M"+
		"N\7\7\2\2NO\5\n\6\2O\t\3\2\2\2PQ\b\6\1\2Q]\5\24\13\2R]\5\f\7\2S]\5\16"+
		"\b\2T]\5\20\t\2U]\5\22\n\2VW\7\b\2\2W]\5\30\r\2XY\7\4\2\2YZ\5\n\6\2Z["+
		"\7\5\2\2[]\3\2\2\2\\P\3\2\2\2\\R\3\2\2\2\\S\3\2\2\2\\T\3\2\2\2\\U\3\2"+
		"\2\2\\V\3\2\2\2\\X\3\2\2\2]n\3\2\2\2^_\f\6\2\2_`\7\6\2\2`m\5\n\6\7ab\f"+
		"\5\2\2bc\7\7\2\2cm\5\n\6\6de\f\3\2\2ef\7\13\2\2fm\5\n\6\4gh\f\4\2\2hi"+
		"\7\t\2\2ij\5\32\16\2jk\7\n\2\2km\3\2\2\2l^\3\2\2\2la\3\2\2\2ld\3\2\2\2"+
		"lg\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\13\3\2\2\2pn\3\2\2\2qr\7\f\2"+
		"\2r\r\3\2\2\2st\7\r\2\2t\17\3\2\2\2uv\7\16\2\2v\21\3\2\2\2wx\7\17\2\2"+
		"x\23\3\2\2\2yz\7.\2\2z\25\3\2\2\2{|\7\20\2\2|}\7.\2\2}~\7\20\2\2~\27\3"+
		"\2\2\2\177\u0080\7.\2\2\u0080\31\3\2\2\2\u0081\u0082\b\16\1\2\u0082\u0096"+
		"\5\n\6\2\u0083\u0084\5\n\6\2\u0084\u0085\7\21\2\2\u0085\u0086\5\n\6\2"+
		"\u0086\u0096\3\2\2\2\u0087\u0088\5\n\6\2\u0088\u0089\7\22\2\2\u0089\u008a"+
		"\5\n\6\2\u008a\u0096\3\2\2\2\u008b\u008c\5\n\6\2\u008c\u008d\7\23\2\2"+
		"\u008d\u008e\5\n\6\2\u008e\u0096\3\2\2\2\u008f\u0090\5\n\6\2\u0090\u0091"+
		"\7\24\2\2\u0091\u0092\5\n\6\2\u0092\u0096\3\2\2\2\u0093\u0096\5\36\20"+
		"\2\u0094\u0096\5\34\17\2\u0095\u0081\3\2\2\2\u0095\u0083\3\2\2\2\u0095"+
		"\u0087\3\2\2\2\u0095\u008b\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0094\3\2\2\2\u0096\u009f\3\2\2\2\u0097\u0098\f\4\2\2\u0098"+
		"\u0099\7\25\2\2\u0099\u009e\5\32\16\5\u009a\u009b\f\3\2\2\u009b\u009c"+
		"\7\26\2\2\u009c\u009e\5\32\16\4\u009d\u0097\3\2\2\2\u009d\u009a\3\2\2"+
		"\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\33"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\27\2\2\u00a3\u00a4\5\32\16"+
		"\2\u00a4\35\3\2\2\2\u00a5\u00a6\7\4\2\2\u00a6\u00a7\5\32\16\2\u00a7\u00a8"+
		"\7\5\2\2\u00a8\37\3\2\2\2\u00a9\u00aa\b\21\1\2\u00aa\u00ab\5$\23\2\u00ab"+
		"\u00ac\5 \21\3\u00ac\u00c8\3\2\2\2\u00ad\u00c8\58\35\2\u00ae\u00c8\7-"+
		"\2\2\u00af\u00c8\5\4\3\2\u00b0\u00b1\7\4\2\2\u00b1\u00b2\5 \21\2\u00b2"+
		"\u00b3\7\5\2\2\u00b3\u00c8\3\2\2\2\u00b4\u00b5\7\30\2\2\u00b5\u00b6\5"+
		"\24\13\2\u00b6\u00b7\7\31\2\2\u00b7\u00b8\7\32\2\2\u00b8\u00b9\5 \21\2"+
		"\u00b9\u00ba\7\33\2\2\u00ba\u00bb\7\34\2\2\u00bb\u00bc\5\24\13\2\u00bc"+
		"\u00bd\7\31\2\2\u00bd\u00c8\3\2\2\2\u00be\u00c0\5\"\22\2\u00bf\u00c1\5"+
		"$\23\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00c4\5&\24\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\5*\26\2\u00c6\u00c8\3\2\2\2\u00c7\u00a9\3\2\2\2\u00c7"+
		"\u00ad\3\2\2\2\u00c7\u00ae\3\2\2\2\u00c7\u00af\3\2\2\2\u00c7\u00b0\3\2"+
		"\2\2\u00c7\u00b4\3\2\2\2\u00c7\u00be\3\2\2\2\u00c8\u00d4\3\2\2\2\u00c9"+
		"\u00ca\f\b\2\2\u00ca\u00cb\7\13\2\2\u00cb\u00d3\5 \21\t\u00cc\u00cd\f"+
		"\7\2\2\u00cd\u00ce\7\6\2\2\u00ce\u00d3\5\n\6\2\u00cf\u00d0\f\6\2\2\u00d0"+
		"\u00d1\7\7\2\2\u00d1\u00d3\5\n\6\2\u00d2\u00c9\3\2\2\2\u00d2\u00cc\3\2"+
		"\2\2\u00d2\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5!\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\35\2\2"+
		"\u00d8\u00d9\58\35\2\u00d9\u00da\7\36\2\2\u00da\u00e2\5 \21\2\u00db\u00dc"+
		"\7\13\2\2\u00dc\u00dd\58\35\2\u00dd\u00de\7\36\2\2\u00de\u00df\5 \21\2"+
		"\u00df\u00e1\3\2\2\2\u00e0\u00db\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3#\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e6\7\37\2\2\u00e6\u00e7\58\35\2\u00e7\u00e8\7 \2\2\u00e8\u00f0\5 "+
		"\21\2\u00e9\u00ea\7\13\2\2\u00ea\u00eb\58\35\2\u00eb\u00ec\7 \2\2\u00ec"+
		"\u00ed\5 \21\2\u00ed\u00ef\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ef\u00f2\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1%\3\2\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f3\u00f4\7!\2\2\u00f4\u00f5\5(\25\2\u00f5\'\3\2\2\2\u00f6"+
		"\u00f7\b\25\1\2\u00f7\u00f8\7\27\2\2\u00f8\u0114\5(\25\3\u00f9\u00fa\5"+
		" \21\2\u00fa\u00fb\7\21\2\2\u00fb\u00fc\5 \21\2\u00fc\u0114\3\2\2\2\u00fd"+
		"\u00fe\5 \21\2\u00fe\u00ff\7\22\2\2\u00ff\u0100\5 \21\2\u0100\u0114\3"+
		"\2\2\2\u0101\u0102\5 \21\2\u0102\u0103\7\23\2\2\u0103\u0104\5 \21\2\u0104"+
		"\u0114\3\2\2\2\u0105\u0106\5 \21\2\u0106\u0107\7\24\2\2\u0107\u0108\5"+
		" \21\2\u0108\u0114\3\2\2\2\u0109\u010a\7\"\2\2\u010a\u010b\7\4\2\2\u010b"+
		"\u010c\5 \21\2\u010c\u010d\7\5\2\2\u010d\u0114\3\2\2\2\u010e\u0114\5,"+
		"\27\2\u010f\u0110\7\4\2\2\u0110\u0111\5(\25\2\u0111\u0112\7\5\2\2\u0112"+
		"\u0114\3\2\2\2\u0113\u00f6\3\2\2\2\u0113\u00f9\3\2\2\2\u0113\u00fd\3\2"+
		"\2\2\u0113\u0101\3\2\2\2\u0113\u0105\3\2\2\2\u0113\u0109\3\2\2\2\u0113"+
		"\u010e\3\2\2\2\u0113\u010f\3\2\2\2\u0114\u011d\3\2\2\2\u0115\u0116\f\5"+
		"\2\2\u0116\u0117\7\25\2\2\u0117\u011c\5(\25\6\u0118\u0119\f\4\2\2\u0119"+
		"\u011a\7\26\2\2\u011a\u011c\5(\25\5\u011b\u0115\3\2\2\2\u011b\u0118\3"+
		"\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		")\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7#\2\2\u0121\u0122\5 \21\2\u0122"+
		"+\3\2\2\2\u0123\u0124\7$\2\2\u0124\u0125\58\35\2\u0125\u0126\7\36\2\2"+
		"\u0126\u012e\5 \21\2\u0127\u0128\7\13\2\2\u0128\u0129\58\35\2\u0129\u012a"+
		"\7\36\2\2\u012a\u012b\5 \21\2\u012b\u012d\3\2\2\2\u012c\u0127\3\2\2\2"+
		"\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7%\2\2\u0132\u0133\5(\25\2\u0133"+
		"-\3\2\2\2\u0134\u0135\7&\2\2\u0135\u0136\5\60\31\2\u0136\u0137\7\'\2\2"+
		"\u0137\u0138\5\64\33\2\u0138\u0139\7(\2\2\u0139\u013a\5\66\34\2\u013a"+
		"/\3\2\2\2\u013b\u013c\58\35\2\u013c\u013d\7)\2\2\u013d\u0145\5\62\32\2"+
		"\u013e\u013f\7\13\2\2\u013f\u0140\58\35\2\u0140\u0141\7)\2\2\u0141\u0142"+
		"\5\62\32\2\u0142\u0144\3\2\2\2\u0143\u013e\3\2\2\2\u0144\u0147\3\2\2\2"+
		"\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\61\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0148\u014e\5\4\3\2\u0149\u014a\58\35\2\u014a\u014b\t\2\2\2\u014b"+
		"\u014c\5\n\6\2\u014c\u014e\3\2\2\2\u014d\u0148\3\2\2\2\u014d\u0149\3\2"+
		"\2\2\u014e\63\3\2\2\2\u014f\u0150\b\33\1\2\u0150\u0151\58\35\2\u0151\u0152"+
		"\t\3\2\2\u0152\u0153\58\35\2\u0153\u0159\3\2\2\2\u0154\u0155\58\35\2\u0155"+
		"\u0156\t\3\2\2\u0156\u0157\7-\2\2\u0157\u0159\3\2\2\2\u0158\u014f\3\2"+
		"\2\2\u0158\u0154\3\2\2\2\u0159\u015f\3\2\2\2\u015a\u015b\f\3\2\2\u015b"+
		"\u015c\7+\2\2\u015c\u015e\5\64\33\4\u015d\u015a\3\2\2\2\u015e\u0161\3"+
		"\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\65\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0162\u0163\b\34\1\2\u0163\u0174\5\62\32\2\u0164\u0174"+
		"\58\35\2\u0165\u0166\7\4\2\2\u0166\u0167\5\66\34\2\u0167\u0168\7\5\2\2"+
		"\u0168\u0174\3\2\2\2\u0169\u016a\7\30\2\2\u016a\u016b\5\24\13\2\u016b"+
		"\u016c\7\31\2\2\u016c\u016d\7\32\2\2\u016d\u016e\5\66\34\2\u016e\u016f"+
		"\7\33\2\2\u016f\u0170\7\34\2\2\u0170\u0171\5\24\13\2\u0171\u0172\7\31"+
		"\2\2\u0172\u0174\3\2\2\2\u0173\u0162\3\2\2\2\u0173\u0164\3\2\2\2\u0173"+
		"\u0165\3\2\2\2\u0173\u0169\3\2\2\2\u0174\u017a\3\2\2\2\u0175\u0176\f\4"+
		"\2\2\u0176\u0177\7\13\2\2\u0177\u0179\5\66\34\5\u0178\u0175\3\2\2\2\u0179"+
		"\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\67\3\2\2"+
		"\2\u017c\u017a\3\2\2\2\u017d\u017e\7,\2\2\u017e\u017f\7.\2\2\u017f9\3"+
		"\2\2\2\33<@\\ln\u0095\u009d\u009f\u00c0\u00c3\u00c7\u00d2\u00d4\u00e2"+
		"\u00f0\u0113\u011b\u011d\u012e\u0145\u014d\u0158\u015f\u0173\u017a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
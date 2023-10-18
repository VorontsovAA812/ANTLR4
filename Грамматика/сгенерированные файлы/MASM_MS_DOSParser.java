// Generated from MASM_MS_DOS.G4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MASM_MS_DOSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, NUMBER=26, INT=27, REAL=28, DB=29, DW=30, DD=31, DF=32, DP=33, 
		DQ=34, DT=35, MOV=36, XCLHG=37, ADD=38, SUB=39, JMP=40, DATA=41, CODE=42, 
		END=43, ID=44, WS=45;
	public static final int
		RULE_programm = 0, RULE_simplified_segment_directives = 1, RULE_data_segment = 2, 
		RULE_data_directive = 3, RULE_name = 4, RULE_type_and_value = 5, RULE_value = 6, 
		RULE_code_segment = 7, RULE_instruction = 8, RULE_comand = 9, RULE_mov = 10, 
		RULE_xclhg = 11, RULE_add = 12, RULE_sub = 13, RULE_jmp = 14, RULE_operand1 = 15, 
		RULE_operand2 = 16, RULE_memory_reference = 17, RULE_register = 18, RULE_general_registers = 19, 
		RULE_end = 20, RULE_metka = 21, RULE_id = 22, RULE_sixteen_bit_register = 23, 
		RULE_eight_bit_high_register = 24, RULE_eight_bit_low_register = 25, RULE_segment_registers = 26, 
		RULE_index_registers = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"programm", "simplified_segment_directives", "data_segment", "data_directive", 
			"name", "type_and_value", "value", "code_segment", "instruction", "comand", 
			"mov", "xclhg", "add", "sub", "jmp", "operand1", "operand2", "memory_reference", 
			"register", "general_registers", "end", "metka", "id", "sixteen_bit_register", 
			"eight_bit_high_register", "eight_bit_low_register", "segment_registers", 
			"index_registers"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'?'", "','", "'['", "']'", "':'", "'AX'", "'BX'", "'CX'", "'DX'", 
			"'SI'", "'DI'", "'BP'", "'SP'", "'AH'", "'BH'", "'CH'", "'DH'", "'AL'", 
			"'BL'", "'CL'", "'DL'", "'CS'", "'DS'", "'ES'", "'SS'", null, null, null, 
			null, null, null, null, null, null, null, "'mov'", "'xclhg'", "'add'", 
			"'sub'", "'jmp'", "'.data'", "'.code'", "'end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "NUMBER", "INT", "REAL", "DB", "DW", "DD", "DF", "DP", "DQ", 
			"DT", "MOV", "XCLHG", "ADD", "SUB", "JMP", "DATA", "CODE", "END", "ID", 
			"WS"
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
	public String getGrammarFileName() { return "MASM_MS_DOS.G4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MASM_MS_DOSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgrammContext extends ParserRuleContext {
		public Simplified_segment_directivesContext simplified_segment_directives() {
			return getRuleContext(Simplified_segment_directivesContext.class,0);
		}
		public ProgrammContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterProgramm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitProgramm(this);
		}
	}

	public final ProgrammContext programm() throws RecognitionException {
		ProgrammContext _localctx = new ProgrammContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			simplified_segment_directives();
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
	public static class Simplified_segment_directivesContext extends ParserRuleContext {
		public Data_segmentContext data_segment() {
			return getRuleContext(Data_segmentContext.class,0);
		}
		public Code_segmentContext code_segment() {
			return getRuleContext(Code_segmentContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public Simplified_segment_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplified_segment_directives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterSimplified_segment_directives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitSimplified_segment_directives(this);
		}
	}

	public final Simplified_segment_directivesContext simplified_segment_directives() throws RecognitionException {
		Simplified_segment_directivesContext _localctx = new Simplified_segment_directivesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_simplified_segment_directives);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			data_segment();
			setState(59);
			code_segment();
			setState(60);
			end();
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
	public static class Data_segmentContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(MASM_MS_DOSParser.DATA, 0); }
		public List<Data_directiveContext> data_directive() {
			return getRuleContexts(Data_directiveContext.class);
		}
		public Data_directiveContext data_directive(int i) {
			return getRuleContext(Data_directiveContext.class,i);
		}
		public Data_segmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterData_segment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitData_segment(this);
		}
	}

	public final Data_segmentContext data_segment() throws RecognitionException {
		Data_segmentContext _localctx = new Data_segmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_data_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(DATA);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER || _la==ID) {
				{
				{
				setState(63);
				data_directive();
				}
				}
				setState(68);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Data_directiveContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Type_and_valueContext type_and_value() {
			return getRuleContext(Type_and_valueContext.class,0);
		}
		public Data_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterData_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitData_directive(this);
		}
	}

	public final Data_directiveContext data_directive() throws RecognitionException {
		Data_directiveContext _localctx = new Data_directiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_data_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(69);
			name();
			setState(70);
			type_and_value();
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
	public static class NameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			id();
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
	public static class Type_and_valueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode DB() { return getToken(MASM_MS_DOSParser.DB, 0); }
		public TerminalNode DW() { return getToken(MASM_MS_DOSParser.DW, 0); }
		public TerminalNode DD() { return getToken(MASM_MS_DOSParser.DD, 0); }
		public TerminalNode DF() { return getToken(MASM_MS_DOSParser.DF, 0); }
		public TerminalNode DP() { return getToken(MASM_MS_DOSParser.DP, 0); }
		public TerminalNode DQ() { return getToken(MASM_MS_DOSParser.DQ, 0); }
		public TerminalNode DT() { return getToken(MASM_MS_DOSParser.DT, 0); }
		public Type_and_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_and_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterType_and_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitType_and_value(this);
		}
	}

	public final Type_and_valueContext type_and_value() throws RecognitionException {
		Type_and_valueContext _localctx = new Type_and_valueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type_and_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 68182605824L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(75);
			value();
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
	public static class ValueContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(T__0);
				}
				break;
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				id();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Code_segmentContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(MASM_MS_DOSParser.CODE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Code_segmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterCode_segment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitCode_segment(this);
		}
	}

	public final Code_segmentContext code_segment() throws RecognitionException {
		Code_segmentContext _localctx = new Code_segmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_code_segment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(CODE);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					instruction();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class InstructionContext extends ParserRuleContext {
		public ComandContext comand() {
			return getRuleContext(ComandContext.class,0);
		}
		public MetkaContext metka() {
			return getRuleContext(MetkaContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(88);
				metka();
				}
			}

			setState(91);
			comand();
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
	public static class ComandContext extends ParserRuleContext {
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public MovContext mov() {
			return getRuleContext(MovContext.class,0);
		}
		public XclhgContext xclhg() {
			return getRuleContext(XclhgContext.class,0);
		}
		public JmpContext jmp() {
			return getRuleContext(JmpContext.class,0);
		}
		public ComandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterComand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitComand(this);
		}
	}

	public final ComandContext comand() throws RecognitionException {
		ComandContext _localctx = new ComandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comand);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				add();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				sub();
				}
				break;
			case MOV:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				mov();
				}
				break;
			case XCLHG:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				xclhg();
				}
				break;
			case JMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				jmp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MovContext extends ParserRuleContext {
		public TerminalNode MOV() { return getToken(MASM_MS_DOSParser.MOV, 0); }
		public Operand1Context operand1() {
			return getRuleContext(Operand1Context.class,0);
		}
		public Operand2Context operand2() {
			return getRuleContext(Operand2Context.class,0);
		}
		public MovContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mov; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterMov(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitMov(this);
		}
	}

	public final MovContext mov() throws RecognitionException {
		MovContext _localctx = new MovContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mov);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(100);
			match(MOV);
			setState(101);
			operand1();
			setState(102);
			match(T__1);
			setState(103);
			operand2();
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
	public static class XclhgContext extends ParserRuleContext {
		public TerminalNode XCLHG() { return getToken(MASM_MS_DOSParser.XCLHG, 0); }
		public Operand1Context operand1() {
			return getRuleContext(Operand1Context.class,0);
		}
		public Operand2Context operand2() {
			return getRuleContext(Operand2Context.class,0);
		}
		public XclhgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xclhg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterXclhg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitXclhg(this);
		}
	}

	public final XclhgContext xclhg() throws RecognitionException {
		XclhgContext _localctx = new XclhgContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_xclhg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(105);
			match(XCLHG);
			setState(106);
			operand1();
			setState(107);
			match(T__1);
			setState(108);
			operand2();
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
	public static class AddContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MASM_MS_DOSParser.ADD, 0); }
		public Operand1Context operand1() {
			return getRuleContext(Operand1Context.class,0);
		}
		public Operand2Context operand2() {
			return getRuleContext(Operand2Context.class,0);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitAdd(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(110);
			match(ADD);
			setState(111);
			operand1();
			setState(112);
			match(T__1);
			setState(113);
			operand2();
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
	public static class SubContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(MASM_MS_DOSParser.SUB, 0); }
		public Operand1Context operand1() {
			return getRuleContext(Operand1Context.class,0);
		}
		public Operand2Context operand2() {
			return getRuleContext(Operand2Context.class,0);
		}
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitSub(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(115);
			match(SUB);
			setState(116);
			operand1();
			setState(117);
			match(T__1);
			setState(118);
			operand2();
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
	public static class JmpContext extends ParserRuleContext {
		public TerminalNode JMP() { return getToken(MASM_MS_DOSParser.JMP, 0); }
		public TerminalNode ID() { return getToken(MASM_MS_DOSParser.ID, 0); }
		public JmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterJmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitJmp(this);
		}
	}

	public final JmpContext jmp() throws RecognitionException {
		JmpContext _localctx = new JmpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(120);
			match(JMP);
			setState(121);
			match(ID);
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
	public static class Operand1Context extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public Operand1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterOperand1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitOperand1(this);
		}
	}

	public final Operand1Context operand1() throws RecognitionException {
		Operand1Context _localctx = new Operand1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_operand1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case ID:
				{
				setState(123);
				id();
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
				{
				setState(124);
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
	public static class Operand2Context extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public Operand2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterOperand2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitOperand2(this);
		}
	}

	public final Operand2Context operand2() throws RecognitionException {
		Operand2Context _localctx = new Operand2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case ID:
				{
				setState(127);
				id();
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
				{
				setState(128);
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
	public static class Memory_referenceContext extends ParserRuleContext {
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public Memory_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterMemory_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitMemory_reference(this);
		}
	}

	public final Memory_referenceContext memory_reference() throws RecognitionException {
		Memory_referenceContext _localctx = new Memory_referenceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_memory_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__2);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67108800L) != 0)) {
				{
				setState(132);
				register();
				}
			}

			setState(135);
			match(T__3);
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
		public General_registersContext general_registers() {
			return getRuleContext(General_registersContext.class,0);
		}
		public Segment_registersContext segment_registers() {
			return getRuleContext(Segment_registersContext.class,0);
		}
		public Index_registersContext index_registers() {
			return getRuleContext(Index_registersContext.class,0);
		}
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitRegister(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_register);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				general_registers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				segment_registers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				index_registers();
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
	public static class General_registersContext extends ParserRuleContext {
		public Sixteen_bit_registerContext sixteen_bit_register() {
			return getRuleContext(Sixteen_bit_registerContext.class,0);
		}
		public Eight_bit_high_registerContext eight_bit_high_register() {
			return getRuleContext(Eight_bit_high_registerContext.class,0);
		}
		public Eight_bit_low_registerContext eight_bit_low_register() {
			return getRuleContext(Eight_bit_low_registerContext.class,0);
		}
		public General_registersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_registers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterGeneral_registers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitGeneral_registers(this);
		}
	}

	public final General_registersContext general_registers() throws RecognitionException {
		General_registersContext _localctx = new General_registersContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_general_registers);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				sixteen_bit_register();
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				eight_bit_high_register();
				}
				break;
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				eight_bit_low_register();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EndContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(MASM_MS_DOSParser.END, 0); }
		public MetkaContext metka() {
			return getRuleContext(MetkaContext.class,0);
		}
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(147);
				metka();
				}
			}

			setState(150);
			match(END);
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
	public static class MetkaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MASM_MS_DOSParser.ID, 0); }
		public MetkaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metka; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterMetka(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitMetka(this);
		}
	}

	public final MetkaContext metka() throws RecognitionException {
		MetkaContext _localctx = new MetkaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_metka);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ID);
			setState(153);
			match(T__4);
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
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MASM_MS_DOSParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(MASM_MS_DOSParser.NUMBER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
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
	public static class Sixteen_bit_registerContext extends ParserRuleContext {
		public Sixteen_bit_registerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sixteen_bit_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterSixteen_bit_register(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitSixteen_bit_register(this);
		}
	}

	public final Sixteen_bit_registerContext sixteen_bit_register() throws RecognitionException {
		Sixteen_bit_registerContext _localctx = new Sixteen_bit_registerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sixteen_bit_register);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16320L) != 0)) ) {
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
	public static class Eight_bit_high_registerContext extends ParserRuleContext {
		public Eight_bit_high_registerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eight_bit_high_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterEight_bit_high_register(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitEight_bit_high_register(this);
		}
	}

	public final Eight_bit_high_registerContext eight_bit_high_register() throws RecognitionException {
		Eight_bit_high_registerContext _localctx = new Eight_bit_high_registerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_eight_bit_high_register);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0)) ) {
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
	public static class Eight_bit_low_registerContext extends ParserRuleContext {
		public Eight_bit_low_registerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eight_bit_low_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterEight_bit_low_register(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitEight_bit_low_register(this);
		}
	}

	public final Eight_bit_low_registerContext eight_bit_low_register() throws RecognitionException {
		Eight_bit_low_registerContext _localctx = new Eight_bit_low_registerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_eight_bit_low_register);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
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
	public static class Segment_registersContext extends ParserRuleContext {
		public Segment_registersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_registers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterSegment_registers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitSegment_registers(this);
		}
	}

	public final Segment_registersContext segment_registers() throws RecognitionException {
		Segment_registersContext _localctx = new Segment_registersContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_segment_registers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
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
	public static class Index_registersContext extends ParserRuleContext {
		public Index_registersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_registers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).enterIndex_registers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASM_MS_DOSListener ) ((MASM_MS_DOSListener)listener).exitIndex_registers(this);
		}
	}

	public final Index_registersContext index_registers() throws RecognitionException {
		Index_registersContext _localctx = new Index_registersContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_index_registers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001-\u00a8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0005\u0002A\b\u0002\n\u0002\f\u0002D\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006P\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0005\u0007T\b\u0007\n\u0007\f\u0007W\t\u0007"+
		"\u0001\b\u0003\bZ\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\tc\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f~\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0082\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0086\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u008d\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0092\b\u0013\u0001\u0014\u0003\u0014\u0095\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0000"+
		"\u0000\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\u0007\u0001\u0000\u001d#\u0002"+
		"\u0000\u001a\u001a,,\u0001\u0000\u0006\r\u0001\u0000\u000e\u0011\u0001"+
		"\u0000\u0012\u0015\u0001\u0000\u0016\u0019\u0001\u0000\n\u000b\u009b\u0000"+
		"8\u0001\u0000\u0000\u0000\u0002:\u0001\u0000\u0000\u0000\u0004>\u0001"+
		"\u0000\u0000\u0000\u0006E\u0001\u0000\u0000\u0000\bH\u0001\u0000\u0000"+
		"\u0000\nJ\u0001\u0000\u0000\u0000\fO\u0001\u0000\u0000\u0000\u000eQ\u0001"+
		"\u0000\u0000\u0000\u0010Y\u0001\u0000\u0000\u0000\u0012b\u0001\u0000\u0000"+
		"\u0000\u0014d\u0001\u0000\u0000\u0000\u0016i\u0001\u0000\u0000\u0000\u0018"+
		"n\u0001\u0000\u0000\u0000\u001as\u0001\u0000\u0000\u0000\u001cx\u0001"+
		"\u0000\u0000\u0000\u001e}\u0001\u0000\u0000\u0000 \u0081\u0001\u0000\u0000"+
		"\u0000\"\u0083\u0001\u0000\u0000\u0000$\u008c\u0001\u0000\u0000\u0000"+
		"&\u0091\u0001\u0000\u0000\u0000(\u0094\u0001\u0000\u0000\u0000*\u0098"+
		"\u0001\u0000\u0000\u0000,\u009b\u0001\u0000\u0000\u0000.\u009d\u0001\u0000"+
		"\u0000\u00000\u009f\u0001\u0000\u0000\u00002\u00a1\u0001\u0000\u0000\u0000"+
		"4\u00a3\u0001\u0000\u0000\u00006\u00a5\u0001\u0000\u0000\u000089\u0003"+
		"\u0002\u0001\u00009\u0001\u0001\u0000\u0000\u0000:;\u0003\u0004\u0002"+
		"\u0000;<\u0003\u000e\u0007\u0000<=\u0003(\u0014\u0000=\u0003\u0001\u0000"+
		"\u0000\u0000>B\u0005)\u0000\u0000?A\u0003\u0006\u0003\u0000@?\u0001\u0000"+
		"\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000C\u0005\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000EF\u0003\b\u0004\u0000FG\u0003\n\u0005\u0000G\u0007\u0001\u0000"+
		"\u0000\u0000HI\u0003,\u0016\u0000I\t\u0001\u0000\u0000\u0000JK\u0007\u0000"+
		"\u0000\u0000KL\u0003\f\u0006\u0000L\u000b\u0001\u0000\u0000\u0000MP\u0005"+
		"\u0001\u0000\u0000NP\u0003,\u0016\u0000OM\u0001\u0000\u0000\u0000ON\u0001"+
		"\u0000\u0000\u0000P\r\u0001\u0000\u0000\u0000QU\u0005*\u0000\u0000RT\u0003"+
		"\u0010\b\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u000f\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000XZ\u0003*\u0015\u0000YX\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0003\u0012"+
		"\t\u0000\\\u0011\u0001\u0000\u0000\u0000]c\u0003\u0018\f\u0000^c\u0003"+
		"\u001a\r\u0000_c\u0003\u0014\n\u0000`c\u0003\u0016\u000b\u0000ac\u0003"+
		"\u001c\u000e\u0000b]\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000\u0000"+
		"b_\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000"+
		"\u0000c\u0013\u0001\u0000\u0000\u0000de\u0005$\u0000\u0000ef\u0003\u001e"+
		"\u000f\u0000fg\u0005\u0002\u0000\u0000gh\u0003 \u0010\u0000h\u0015\u0001"+
		"\u0000\u0000\u0000ij\u0005%\u0000\u0000jk\u0003\u001e\u000f\u0000kl\u0005"+
		"\u0002\u0000\u0000lm\u0003 \u0010\u0000m\u0017\u0001\u0000\u0000\u0000"+
		"no\u0005&\u0000\u0000op\u0003\u001e\u000f\u0000pq\u0005\u0002\u0000\u0000"+
		"qr\u0003 \u0010\u0000r\u0019\u0001\u0000\u0000\u0000st\u0005\'\u0000\u0000"+
		"tu\u0003\u001e\u000f\u0000uv\u0005\u0002\u0000\u0000vw\u0003 \u0010\u0000"+
		"w\u001b\u0001\u0000\u0000\u0000xy\u0005(\u0000\u0000yz\u0005,\u0000\u0000"+
		"z\u001d\u0001\u0000\u0000\u0000{~\u0003,\u0016\u0000|~\u0003$\u0012\u0000"+
		"}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u001f\u0001\u0000"+
		"\u0000\u0000\u007f\u0082\u0003,\u0016\u0000\u0080\u0082\u0003$\u0012\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000"+
		"\u0082!\u0001\u0000\u0000\u0000\u0083\u0085\u0005\u0003\u0000\u0000\u0084"+
		"\u0086\u0003$\u0012\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005\u0004\u0000\u0000\u0088#\u0001\u0000\u0000\u0000\u0089\u008d\u0003"+
		"&\u0013\u0000\u008a\u008d\u00034\u001a\u0000\u008b\u008d\u00036\u001b"+
		"\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d%\u0001\u0000\u0000\u0000"+
		"\u008e\u0092\u0003.\u0017\u0000\u008f\u0092\u00030\u0018\u0000\u0090\u0092"+
		"\u00032\u0019\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\'\u0001\u0000"+
		"\u0000\u0000\u0093\u0095\u0003*\u0015\u0000\u0094\u0093\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005+\u0000\u0000\u0097)\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005,\u0000\u0000\u0099\u009a\u0005\u0005\u0000\u0000\u009a+\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0007\u0001\u0000\u0000\u009c-\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0007\u0002\u0000\u0000\u009e/\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0007\u0003\u0000\u0000\u00a01\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0007\u0004\u0000\u0000\u00a23\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0007\u0005\u0000\u0000\u00a45\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0007\u0006\u0000\u0000\u00a67\u0001\u0000\u0000\u0000\u000bBOUYb}\u0081"+
		"\u0085\u008c\u0091\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
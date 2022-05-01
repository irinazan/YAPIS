// Generated from D:/yapis\ElsetLanguage.g4 by ANTLR 4.9.2
package com.elset.compiler.gen;

import com.elset.compiler.core.CoroutineServiceV1;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.Objects;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoroutineService {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, BEGIN=5, SET=6, ELEMENT=7, ADD=8, REMOVE=9,
		END=10, PRINT=11, INT=12, WHILE=13, FOR=14, CONST=15, IF=16, THEN=17, 
		CALL=18, RETURN=19, SEPARATOR=20, DELIMITER=21, COLON=22, GLOBAL=23, ID=24, 
		STRING=25, NUMBER=26, WS=27, PLUS=28, MINUS=29, MULTIPLY=30, DIVIDE=31, 
		NEGATION=32, EQUAL=33, NON_EQUAL=34, LESS=35, LESS_OR_EQUALS=36, GREATER=37, 
		GREATER_OR_EQUALS=38, O_BRACKET=39, C_BRACKET=40, K_O_BRACKET=41, K_C_BRACKET=42;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_digit_expression = 3, 
		RULE_intialize_set = 4, RULE_intialize_element = 5, RULE_assign_var_method_invocation = 6, 
		RULE_assign_set = 7, RULE_assign_var = 8, RULE_print = 9, RULE_operations = 10, 
		RULE_operarions_with_set = 11, RULE_simple_compare = 12, RULE_hard_compare = 13, 
		RULE_while_cicle = 14, RULE_if_then = 15, RULE_for_each = 16, RULE_global_assign_set = 17, 
		RULE_global_assign_var = 18, RULE_type = 19, RULE_type_1 = 20, RULE_signature = 21, 
		RULE_subprogram_return = 22, RULE_subprogram_non_return = 23, RULE_block_return = 24, 
		RULE_block_non_return = 25, RULE_signature_method_invokation = 26, RULE_method_invokation = 27, 
		RULE_global_program = 28;

	public CoroutineService(CoroutineContext commonPool) {
	}

	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "digit_expression", "intialize_set", 
			"intialize_element", "assign_var_method_invocation", "assign_set", "assign_var", 
			"print", "operations", "operarions_with_set", "simple_compare", "hard_compare", 
			"while_cicle", "if_then", "for_each", "global_assign_set", "global_assign_var", 
			"type", "type_1", "signature", "subprogram_return", "subprogram_non_return", 
			"block_return", "block_non_return", "signature_method_invokation", "method_invokation", 
			"global_program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main_program'", "','", "'='", "'sub_program'", "'begin'", "'set'", 
			"'element'", "'add'", "'remove'", "'end'", "'print'", "'int'", "'while'", 
			"'for'", "'const'", "'if'", "'then'", "'call'", "'return'", "';'", "'.'", 
			"':'", "'global'", null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
			"'!'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'('", "')'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "BEGIN", "SET", "ELEMENT", "ADD", "REMOVE", 
			"END", "PRINT", "INT", "WHILE", "FOR", "CONST", "IF", "THEN", "CALL", 
			"RETURN", "SEPARATOR", "DELIMITER", "COLON", "GLOBAL", "ID", "STRING", 
			"NUMBER", "WS", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "NEGATION", "EQUAL", 
			"NON_EQUAL", "LESS", "LESS_OR_EQUALS", "GREATER", "GREATER_OR_EQUALS", 
			"O_BRACKET", "C_BRACKET", "K_O_BRACKET", "K_C_BRACKET"
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

	public static void setDefaultContext(CoroutineContext rContext)
	{
		Objects.requireNonNull(rContext);

		CoroutineContext rDefaultContext = rContext;
	}

	public static CoroutineService newVirtualThreadExecutor() {
	}

	public CoroutineContext getDefaultContext()
	{
		CoroutineContext rDefaultContext = null;
		return rDefaultContext;
	}

	public static class CoroutineContext {
	}

	public static class Coroutines
	{
		private CoroutineContext rDefaultContext = new CoroutineContext();

		public static CoroutineServiceV1 newVirtualThreadExecutor() {
			return null;
		}
	}


	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u013f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\3\3\3"+
		"\7\3B\n\3\f\3\16\3E\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4S\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5d\n\5\f\5\16\5g\13\5\3\6\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6x\n\6\3\7\3\7\3\b\3\b\5\b~\n\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\5\t\u0086\n\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u008f\n\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0095\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\5\17\u00b2\n\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00bc"+
		"\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00c5\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u00e4"+
		"\n\27\f\27\16\27\u00e7\13\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u00f4\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u00fd\n\31\3\31\3\31\5\31\u0101\n\31\3\32\3\32\7\32\u0105\n\32\f\32\16"+
		"\32\u0108\13\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\7\33\u0111\n\33\f\33"+
		"\16\33\u0114\13\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u011d\n\34"+
		"\f\34\16\34\u0120\13\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u012a"+
		"\n\35\3\35\3\35\3\36\3\36\7\36\u0130\n\36\f\36\16\36\u0133\13\36\3\36"+
		"\3\36\7\36\u0137\n\36\f\36\16\36\u013a\13\36\3\36\3\36\3\36\3\36\2\3\b"+
		"\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\n"+
		"\3\2 !\3\2\36\37\3\2\36!\3\2\32\34\3\2\n\13\3\2#(\4\2\b\t\16\16\4\2\t"+
		"\t\16\16\2\u0145\2<\3\2\2\2\4?\3\2\2\2\6R\3\2\2\2\b[\3\2\2\2\nw\3\2\2"+
		"\2\fy\3\2\2\2\16{\3\2\2\2\20\u0083\3\2\2\2\22\u008c\3\2\2\2\24\u0098\3"+
		"\2\2\2\26\u009e\3\2\2\2\30\u00a3\3\2\2\2\32\u00ac\3\2\2\2\34\u00b1\3\2"+
		"\2\2\36\u00b7\3\2\2\2 \u00c0\3\2\2\2\"\u00cb\3\2\2\2$\u00d4\3\2\2\2&\u00d7"+
		"\3\2\2\2(\u00da\3\2\2\2*\u00dc\3\2\2\2,\u00de\3\2\2\2.\u00ed\3\2\2\2\60"+
		"\u00f7\3\2\2\2\62\u0102\3\2\2\2\64\u010e\3\2\2\2\66\u0119\3\2\2\28\u0124"+
		"\3\2\2\2:\u0131\3\2\2\2<=\7\3\2\2=>\5\4\3\2>\3\3\2\2\2?C\7\7\2\2@B\5\6"+
		"\4\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\f"+
		"\2\2G\5\3\2\2\2HS\5\22\n\2IS\5\20\t\2JS\5\26\f\2KS\5\16\b\2LS\5\36\20"+
		"\2MS\5 \21\2NS\58\35\2OS\5\24\13\2PS\5\30\r\2QS\5\"\22\2RH\3\2\2\2RI\3"+
		"\2\2\2RJ\3\2\2\2RK\3\2\2\2RL\3\2\2\2RM\3\2\2\2RN\3\2\2\2RO\3\2\2\2RP\3"+
		"\2\2\2RQ\3\2\2\2S\7\3\2\2\2TU\b\5\1\2U\\\7\32\2\2VW\7)\2\2WX\5\b\5\2X"+
		"Y\7*\2\2Y\\\3\2\2\2Z\\\7\34\2\2[T\3\2\2\2[V\3\2\2\2[Z\3\2\2\2\\e\3\2\2"+
		"\2]^\f\7\2\2^_\t\2\2\2_d\5\b\5\b`a\f\6\2\2ab\t\3\2\2bd\5\b\5\7c]\3\2\2"+
		"\2c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\t\3\2\2\2ge\3\2\2\2hi\7,\2"+
		"\2ix\7+\2\2jo\7+\2\2kl\7\32\2\2ln\7\4\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2"+
		"\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\32\2\2sx\7,\2\2tu\7\32\2\2uv\t\4"+
		"\2\2vx\7\32\2\2wh\3\2\2\2wj\3\2\2\2wt\3\2\2\2x\13\3\2\2\2yz\7\33\2\2z"+
		"\r\3\2\2\2{}\5(\25\2|~\7\21\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\7\32\2\2\u0080\u0081\7\5\2\2\u0081\u0082\58\35\2\u0082\17\3\2\2\2\u0083"+
		"\u0085\7\b\2\2\u0084\u0086\7\21\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\32\2\2\u0088\u0089\7\5\2\2\u0089"+
		"\u008a\5\n\6\2\u008a\u008b\7\26\2\2\u008b\21\3\2\2\2\u008c\u008e\5*\26"+
		"\2\u008d\u008f\7\21\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\7\32\2\2\u0091\u0094\7\5\2\2\u0092\u0095\5"+
		"\b\5\2\u0093\u0095\5\f\7\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\7\26\2\2\u0097\23\3\2\2\2\u0098\u0099\7\r\2"+
		"\2\u0099\u009a\7)\2\2\u009a\u009b\t\5\2\2\u009b\u009c\7*\2\2\u009c\u009d"+
		"\7\26\2\2\u009d\25\3\2\2\2\u009e\u009f\7\32\2\2\u009f\u00a0\7\5\2\2\u00a0"+
		"\u00a1\5\b\5\2\u00a1\u00a2\7\26\2\2\u00a2\27\3\2\2\2\u00a3\u00a4\7\32"+
		"\2\2\u00a4\u00a5\7\27\2\2\u00a5\u00a6\t\6\2\2\u00a6\u00a7\7)\2\2\u00a7"+
		"\u00a8\7\32\2\2\u00a8\u00a9\7*\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\26"+
		"\2\2\u00ab\31\3\2\2\2\u00ac\u00ad\5\b\5\2\u00ad\u00ae\t\7\2\2\u00ae\u00af"+
		"\5\b\5\2\u00af\33\3\2\2\2\u00b0\u00b2\7\"\2\2\u00b1\u00b0\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7)\2\2\u00b4\u00b5\5\32"+
		"\16\2\u00b5\u00b6\7*\2\2\u00b6\35\3\2\2\2\u00b7\u00b8\7\17\2\2\u00b8\u00bb"+
		"\7)\2\2\u00b9\u00bc\5\32\16\2\u00ba\u00bc\5\34\17\2\u00bb\u00b9\3\2\2"+
		"\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7*\2\2\u00be\u00bf"+
		"\5\4\3\2\u00bf\37\3\2\2\2\u00c0\u00c1\7\22\2\2\u00c1\u00c4\7)\2\2\u00c2"+
		"\u00c5\5\32\16\2\u00c3\u00c5\5\34\17\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7*\2\2\u00c7\u00c8\5\4\3\2\u00c8"+
		"\u00c9\7\23\2\2\u00c9\u00ca\5\4\3\2\u00ca!\3\2\2\2\u00cb\u00cc\7\20\2"+
		"\2\u00cc\u00cd\7)\2\2\u00cd\u00ce\7\t\2\2\u00ce\u00cf\7\32\2\2\u00cf\u00d0"+
		"\7\30\2\2\u00d0\u00d1\7\32\2\2\u00d1\u00d2\7*\2\2\u00d2\u00d3\5\4\3\2"+
		"\u00d3#\3\2\2\2\u00d4\u00d5\7\31\2\2\u00d5\u00d6\5\20\t\2\u00d6%\3\2\2"+
		"\2\u00d7\u00d8\7\31\2\2\u00d8\u00d9\5\22\n\2\u00d9\'\3\2\2\2\u00da\u00db"+
		"\t\b\2\2\u00db)\3\2\2\2\u00dc\u00dd\t\t\2\2\u00dd+\3\2\2\2\u00de\u00e5"+
		"\7)\2\2\u00df\u00e0\5(\25\2\u00e0\u00e1\7\32\2\2\u00e1\u00e2\7\4\2\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00e9\5(\25\2\u00e9\u00ea\7\32\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7"+
		"*\2\2\u00ec-\3\2\2\2\u00ed\u00ee\7\6\2\2\u00ee\u00ef\5(\25\2\u00ef\u00f3"+
		"\7\32\2\2\u00f0\u00f4\5,\27\2\u00f1\u00f2\7)\2\2\u00f2\u00f4\7*\2\2\u00f3"+
		"\u00f0\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\5\62"+
		"\32\2\u00f6/\3\2\2\2\u00f7\u00f8\7\6\2\2\u00f8\u00fc\7\32\2\2\u00f9\u00fd"+
		"\5,\27\2\u00fa\u00fb\7)\2\2\u00fb\u00fd\7*\2\2\u00fc\u00f9\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u0101\5\64\33\2\u00ff\u0101\5"+
		"\4\3\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\61\3\2\2\2\u0102"+
		"\u0106\7\7\2\2\u0103\u0105\5\6\4\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010a\7\25\2\2\u010a\u010b\7\32\2\2\u010b\u010c\7"+
		"\26\2\2\u010c\u010d\7\f\2\2\u010d\63\3\2\2\2\u010e\u0112\7\7\2\2\u010f"+
		"\u0111\5\6\4\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0116\7\25\2\2\u0116\u0117\7\26\2\2\u0117\u0118\7\f\2\2\u0118\65\3\2"+
		"\2\2\u0119\u011e\7)\2\2\u011a\u011b\7\32\2\2\u011b\u011d\7\4\2\2\u011c"+
		"\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7\32\2\2\u0122"+
		"\u0123\7*\2\2\u0123\67\3\2\2\2\u0124\u0125\7\24\2\2\u0125\u0129\7\32\2"+
		"\2\u0126\u012a\5\66\34\2\u0127\u0128\7)\2\2\u0128\u012a\7*\2\2\u0129\u0126"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7\26\2\2"+
		"\u012c9\3\2\2\2\u012d\u0130\5$\23\2\u012e\u0130\5&\24\2\u012f\u012d\3"+
		"\2\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0138\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0137\5\60"+
		"\31\2\u0135\u0137\5.\30\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2"+
		"\2\2\u013a\u0138\3\2\2\2\u013b\u013c\5\2\2\2\u013c\u013d\b\36\1\2\u013d"+
		";\3\2\2\2\34CR[ceow}\u0085\u008e\u0094\u00b1\u00bb\u00c4\u00e5\u00f3\u00fc"+
		"\u0100\u0106\u0112\u011e\u0129\u012f\u0131\u0136\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
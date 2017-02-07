// $ANTLR 3.5.2 Looc.g 2017-02-07 13:49:45
package main.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LoocLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int CSTE_CHAINE=4;
	public static final int CSTE_ENT=5;
	public static final int IDF=6;
	public static final int IDF_CLASS=7;
	public static final int NEWLINE=8;
	public static final int WS=9;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public LoocLexer() {} 
	public LoocLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public LoocLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Looc.g"; }

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:2:7: ( '!=' )
			// Looc.g:2:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:3:7: ( '%' )
			// Looc.g:3:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:4:7: ( '(' )
			// Looc.g:4:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:5:7: ( ')' )
			// Looc.g:5:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:6:7: ( '*' )
			// Looc.g:6:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:7:7: ( '+' )
			// Looc.g:7:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:8:7: ( ',' )
			// Looc.g:8:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:9:7: ( '-' )
			// Looc.g:9:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:10:7: ( '.' )
			// Looc.g:10:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:11:7: ( '..' )
			// Looc.g:11:9: '..'
			{
			match(".."); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:12:7: ( '/' )
			// Looc.g:12:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:13:7: ( ':' )
			// Looc.g:13:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:14:7: ( ':=' )
			// Looc.g:14:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:15:7: ( ';' )
			// Looc.g:15:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:16:7: ( '<' )
			// Looc.g:16:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:17:7: ( '=' )
			// Looc.g:17:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:18:7: ( '==' )
			// Looc.g:18:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:19:7: ( '>' )
			// Looc.g:19:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:20:7: ( 'class' )
			// Looc.g:20:9: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:21:7: ( 'do' )
			// Looc.g:21:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:22:7: ( 'else' )
			// Looc.g:22:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:23:7: ( 'end' )
			// Looc.g:23:9: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:24:7: ( 'fi' )
			// Looc.g:24:9: 'fi'
			{
			match("fi"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:25:7: ( 'for' )
			// Looc.g:25:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:26:7: ( 'if' )
			// Looc.g:26:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:27:7: ( 'in' )
			// Looc.g:27:9: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:28:7: ( 'inherit' )
			// Looc.g:28:9: 'inherit'
			{
			match("inherit"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:29:7: ( 'int' )
			// Looc.g:29:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:30:7: ( 'method' )
			// Looc.g:30:9: 'method'
			{
			match("method"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:31:7: ( 'new' )
			// Looc.g:31:9: 'new'
			{
			match("new"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:32:7: ( 'read' )
			// Looc.g:32:9: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:33:7: ( 'return' )
			// Looc.g:33:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:34:7: ( 'string' )
			// Looc.g:34:9: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:35:7: ( 'super' )
			// Looc.g:35:9: 'super'
			{
			match("super"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:36:7: ( 'then' )
			// Looc.g:36:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:37:7: ( 'this' )
			// Looc.g:37:9: 'this'
			{
			match("this"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:38:7: ( 'var' )
			// Looc.g:38:9: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:39:7: ( 'write' )
			// Looc.g:39:9: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:40:7: ( '{' )
			// Looc.g:40:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:41:7: ( '}' )
			// Looc.g:41:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "IDF_CLASS"
	public final void mIDF_CLASS() throws RecognitionException {
		try {
			int _type = IDF_CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:107:11: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// Looc.g:107:13: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Looc.g:107:23: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Looc.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDF_CLASS"

	// $ANTLR start "IDF"
	public final void mIDF() throws RecognitionException {
		try {
			int _type = IDF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:108:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// Looc.g:108:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Looc.g:108:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Looc.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDF"

	// $ANTLR start "CSTE_ENT"
	public final void mCSTE_ENT() throws RecognitionException {
		try {
			int _type = CSTE_ENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:109:10: ( ( '0' .. '9' )+ )
			// Looc.g:109:14: ( '0' .. '9' )+
			{
			// Looc.g:109:14: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Looc.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CSTE_ENT"

	// $ANTLR start "CSTE_CHAINE"
	public final void mCSTE_CHAINE() throws RecognitionException {
		try {
			int _type = CSTE_CHAINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:110:13: ( '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ';' | ':' | '/' | ',' | '?' | '!' | '%' | '@' | '#' | '~' | '&' | '\\\\' | '-' | '_' | '|' | '(' | ')' | '{' | '}' | '[' | ']' | '=' | ' ' )+ '\"' )
			// Looc.g:110:15: '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ';' | ':' | '/' | ',' | '?' | '!' | '%' | '@' | '#' | '~' | '&' | '\\\\' | '-' | '_' | '|' | '(' | ')' | '{' | '}' | '[' | ']' | '=' | ' ' )+ '\"'
			{
			match('\"'); 
			// Looc.g:110:19: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ';' | ':' | '/' | ',' | '?' | '!' | '%' | '@' | '#' | '~' | '&' | '\\\\' | '-' | '_' | '|' | '(' | ')' | '{' | '}' | '[' | ']' | '=' | ' ' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= ' ' && LA4_0 <= '!')||LA4_0=='#'||(LA4_0 >= '%' && LA4_0 <= '&')||(LA4_0 >= '(' && LA4_0 <= ')')||(LA4_0 >= ',' && LA4_0 <= '-')||(LA4_0 >= '/' && LA4_0 <= ';')||LA4_0=='='||(LA4_0 >= '?' && LA4_0 <= ']')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= '~')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Looc.g:
					{
					if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||input.LA(1)=='#'||(input.LA(1) >= '%' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= ')')||(input.LA(1) >= ',' && input.LA(1) <= '-')||(input.LA(1) >= '/' && input.LA(1) <= ';')||input.LA(1)=='='||(input.LA(1) >= '?' && input.LA(1) <= ']')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= '~') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CSTE_CHAINE"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:111:8: ( ( ( '\\r' )? '\\n' )* )
			// Looc.g:111:10: ( ( '\\r' )? '\\n' )*
			{
			// Looc.g:111:10: ( ( '\\r' )? '\\n' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\n'||LA6_0=='\r') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Looc.g:111:11: ( '\\r' )? '\\n'
					{
					// Looc.g:111:11: ( '\\r' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='\r') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// Looc.g:111:11: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					}
					break;

				default :
					break loop6;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Looc.g:112:5: ( ( ' ' | '\\t' )+ )
			// Looc.g:112:9: ( ' ' | '\\t' )+
			{
			// Looc.g:112:9: ( ' ' | '\\t' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='\t'||LA7_0==' ') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Looc.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// Looc.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | IDF_CLASS | IDF | CSTE_ENT | CSTE_CHAINE | NEWLINE | WS )
		int alt8=46;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// Looc.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// Looc.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// Looc.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// Looc.g:1:28: T__13
				{
				mT__13(); 

				}
				break;
			case 5 :
				// Looc.g:1:34: T__14
				{
				mT__14(); 

				}
				break;
			case 6 :
				// Looc.g:1:40: T__15
				{
				mT__15(); 

				}
				break;
			case 7 :
				// Looc.g:1:46: T__16
				{
				mT__16(); 

				}
				break;
			case 8 :
				// Looc.g:1:52: T__17
				{
				mT__17(); 

				}
				break;
			case 9 :
				// Looc.g:1:58: T__18
				{
				mT__18(); 

				}
				break;
			case 10 :
				// Looc.g:1:64: T__19
				{
				mT__19(); 

				}
				break;
			case 11 :
				// Looc.g:1:70: T__20
				{
				mT__20(); 

				}
				break;
			case 12 :
				// Looc.g:1:76: T__21
				{
				mT__21(); 

				}
				break;
			case 13 :
				// Looc.g:1:82: T__22
				{
				mT__22(); 

				}
				break;
			case 14 :
				// Looc.g:1:88: T__23
				{
				mT__23(); 

				}
				break;
			case 15 :
				// Looc.g:1:94: T__24
				{
				mT__24(); 

				}
				break;
			case 16 :
				// Looc.g:1:100: T__25
				{
				mT__25(); 

				}
				break;
			case 17 :
				// Looc.g:1:106: T__26
				{
				mT__26(); 

				}
				break;
			case 18 :
				// Looc.g:1:112: T__27
				{
				mT__27(); 

				}
				break;
			case 19 :
				// Looc.g:1:118: T__28
				{
				mT__28(); 

				}
				break;
			case 20 :
				// Looc.g:1:124: T__29
				{
				mT__29(); 

				}
				break;
			case 21 :
				// Looc.g:1:130: T__30
				{
				mT__30(); 

				}
				break;
			case 22 :
				// Looc.g:1:136: T__31
				{
				mT__31(); 

				}
				break;
			case 23 :
				// Looc.g:1:142: T__32
				{
				mT__32(); 

				}
				break;
			case 24 :
				// Looc.g:1:148: T__33
				{
				mT__33(); 

				}
				break;
			case 25 :
				// Looc.g:1:154: T__34
				{
				mT__34(); 

				}
				break;
			case 26 :
				// Looc.g:1:160: T__35
				{
				mT__35(); 

				}
				break;
			case 27 :
				// Looc.g:1:166: T__36
				{
				mT__36(); 

				}
				break;
			case 28 :
				// Looc.g:1:172: T__37
				{
				mT__37(); 

				}
				break;
			case 29 :
				// Looc.g:1:178: T__38
				{
				mT__38(); 

				}
				break;
			case 30 :
				// Looc.g:1:184: T__39
				{
				mT__39(); 

				}
				break;
			case 31 :
				// Looc.g:1:190: T__40
				{
				mT__40(); 

				}
				break;
			case 32 :
				// Looc.g:1:196: T__41
				{
				mT__41(); 

				}
				break;
			case 33 :
				// Looc.g:1:202: T__42
				{
				mT__42(); 

				}
				break;
			case 34 :
				// Looc.g:1:208: T__43
				{
				mT__43(); 

				}
				break;
			case 35 :
				// Looc.g:1:214: T__44
				{
				mT__44(); 

				}
				break;
			case 36 :
				// Looc.g:1:220: T__45
				{
				mT__45(); 

				}
				break;
			case 37 :
				// Looc.g:1:226: T__46
				{
				mT__46(); 

				}
				break;
			case 38 :
				// Looc.g:1:232: T__47
				{
				mT__47(); 

				}
				break;
			case 39 :
				// Looc.g:1:238: T__48
				{
				mT__48(); 

				}
				break;
			case 40 :
				// Looc.g:1:244: T__49
				{
				mT__49(); 

				}
				break;
			case 41 :
				// Looc.g:1:250: IDF_CLASS
				{
				mIDF_CLASS(); 

				}
				break;
			case 42 :
				// Looc.g:1:260: IDF
				{
				mIDF(); 

				}
				break;
			case 43 :
				// Looc.g:1:264: CSTE_ENT
				{
				mCSTE_ENT(); 

				}
				break;
			case 44 :
				// Looc.g:1:273: CSTE_CHAINE
				{
				mCSTE_CHAINE(); 

				}
				break;
			case 45 :
				// Looc.g:1:285: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 46 :
				// Looc.g:1:293: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\1\42\10\uffff\1\45\1\uffff\1\47\2\uffff\1\51\1\uffff\14\37\2\uffff\1"+
		"\73\13\uffff\1\37\1\75\2\37\1\100\1\37\1\102\1\105\10\37\1\73\1\uffff"+
		"\1\37\1\uffff\1\37\1\122\1\uffff\1\123\1\uffff\1\37\1\125\1\uffff\1\37"+
		"\1\127\6\37\1\136\2\37\1\141\2\uffff\1\37\1\uffff\1\37\1\uffff\1\144\3"+
		"\37\1\150\1\151\1\uffff\1\37\1\153\1\uffff\2\37\1\uffff\2\37\1\160\2\uffff"+
		"\1\161\1\uffff\1\37\1\163\1\164\1\165\2\uffff\1\166\4\uffff";
	static final String DFA8_eofS =
		"\167\uffff";
	static final String DFA8_minS =
		"\1\11\10\uffff\1\56\1\uffff\1\75\2\uffff\1\75\1\uffff\1\154\1\157\1\154"+
		"\1\151\1\146\3\145\1\164\1\150\1\141\1\162\2\uffff\1\60\13\uffff\1\141"+
		"\1\60\1\163\1\144\1\60\1\162\2\60\1\164\1\167\1\141\1\162\1\160\1\145"+
		"\1\162\1\151\1\60\1\uffff\1\163\1\uffff\1\145\1\60\1\uffff\1\60\1\uffff"+
		"\1\145\1\60\1\uffff\1\150\1\60\1\144\1\165\1\151\1\145\1\156\1\163\1\60"+
		"\1\164\1\163\1\60\2\uffff\1\162\1\uffff\1\157\1\uffff\1\60\1\162\1\156"+
		"\1\162\2\60\1\uffff\1\145\1\60\1\uffff\1\151\1\144\1\uffff\1\156\1\147"+
		"\1\60\2\uffff\1\60\1\uffff\1\164\3\60\2\uffff\1\60\4\uffff";
	static final String DFA8_maxS =
		"\1\175\10\uffff\1\56\1\uffff\1\75\2\uffff\1\75\1\uffff\1\154\1\157\1\156"+
		"\1\157\1\156\3\145\1\165\1\150\1\141\1\162\2\uffff\1\172\13\uffff\1\141"+
		"\1\172\1\163\1\144\1\172\1\162\2\172\1\164\1\167\1\164\1\162\1\160\1\151"+
		"\1\162\1\151\1\172\1\uffff\1\163\1\uffff\1\145\1\172\1\uffff\1\172\1\uffff"+
		"\1\145\1\172\1\uffff\1\150\1\172\1\144\1\165\1\151\1\145\1\156\1\163\1"+
		"\172\1\164\1\163\1\172\2\uffff\1\162\1\uffff\1\157\1\uffff\1\172\1\162"+
		"\1\156\1\162\2\172\1\uffff\1\145\1\172\1\uffff\1\151\1\144\1\uffff\1\156"+
		"\1\147\1\172\2\uffff\1\172\1\uffff\1\164\3\172\2\uffff\1\172\4\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\1\uffff\1\16\1"+
		"\17\1\uffff\1\22\14\uffff\1\47\1\50\1\uffff\1\52\1\53\1\54\1\55\1\56\1"+
		"\12\1\11\1\15\1\14\1\21\1\20\21\uffff\1\51\1\uffff\1\24\2\uffff\1\27\1"+
		"\uffff\1\31\2\uffff\1\32\14\uffff\1\26\1\30\1\uffff\1\34\1\uffff\1\36"+
		"\6\uffff\1\45\2\uffff\1\25\2\uffff\1\37\3\uffff\1\43\1\44\1\uffff\1\23"+
		"\4\uffff\1\42\1\46\1\uffff\1\35\1\40\1\41\1\33";
	static final String DFA8_specialS =
		"\167\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\43\26\uffff\1\43\1\1\1\41\2\uffff\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7"+
			"\1\10\1\11\1\12\12\40\1\13\1\14\1\15\1\16\1\17\2\uffff\32\36\6\uffff"+
			"\2\37\1\20\1\21\1\22\1\23\2\37\1\24\3\37\1\25\1\26\3\37\1\27\1\30\1\31"+
			"\1\37\1\32\1\33\3\37\1\34\1\uffff\1\35",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\44",
			"",
			"\1\46",
			"",
			"",
			"\1\50",
			"",
			"\1\52",
			"\1\53",
			"\1\54\1\uffff\1\55",
			"\1\56\5\uffff\1\57",
			"\1\60\7\uffff\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\74",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\76",
			"\1\77",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\101",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\7\37\1\103\13\37\1\104\6\37",
			"\1\106",
			"\1\107",
			"\1\110\22\uffff\1\111",
			"\1\112",
			"\1\113",
			"\1\114\3\uffff\1\115",
			"\1\116",
			"\1\117",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\1\120",
			"",
			"\1\121",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\124",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\126",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\137",
			"\1\140",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"",
			"\1\142",
			"",
			"\1\143",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\145",
			"\1\146",
			"\1\147",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\152",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\154",
			"\1\155",
			"",
			"\1\156",
			"\1\157",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\162",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | IDF_CLASS | IDF | CSTE_ENT | CSTE_CHAINE | NEWLINE | WS );";
		}
	}

}

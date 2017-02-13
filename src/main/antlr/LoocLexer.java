// $ANTLR 3.3 Nov 30, 2010 12:50:56 Looc.g 2017-02-13 11:28:27
package main.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LoocLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
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
    public static final int IDF_CLASS=4;
    public static final int IDF=5;
    public static final int CSTE_ENT=6;
    public static final int CSTE_CHAINE=7;
    public static final int WS=8;

    // delegates
    // delegators

    public LoocLexer() {;}
    public LoocLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LoocLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Looc.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:3:6: ( 'class' )
            // Looc.g:3:8: 'class'
            {
            match("class");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:4:7: ( 'inherit' )
            // Looc.g:4:9: 'inherit'
            {
            match("inherit");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:5:7: ( '=' )
            // Looc.g:5:9: '='
            {
            match('=');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:6:7: ( '(' )
            // Looc.g:6:9: '('
            {
            match('(');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:7:7: ( ')' )
            // Looc.g:7:9: ')'
            {
            match(')');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:8:7: ( 'var' )
            // Looc.g:8:9: 'var'
            {
            match("var");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:9:7: ( ':' )
            // Looc.g:9:9: ':'
            {
            match(':');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:10:7: ( ';' )
            // Looc.g:10:9: ';'
            {
            match(';');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:11:7: ( 'int' )
            // Looc.g:11:9: 'int'
            {
            match("int");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:12:7: ( 'string' )
            // Looc.g:12:9: 'string'
            {
            match("string");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:13:7: ( 'method' )
            // Looc.g:13:9: 'method'
            {
            match("method");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:14:7: ( '{' )
            // Looc.g:14:9: '{'
            {
            match('{');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:15:7: ( '}' )
            // Looc.g:15:9: '}'
            {
            match('}');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:16:7: ( ',' )
            // Looc.g:16:9: ','
            {
            match(',');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:17:7: ( ':=' )
            // Looc.g:17:9: ':='
            {
            match(":=");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:18:7: ( 'if' )
            // Looc.g:18:9: 'if'
            {
            match("if");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:19:7: ( 'then' )
            // Looc.g:19:9: 'then'
            {
            match("then");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:20:7: ( 'else' )
            // Looc.g:20:9: 'else'
            {
            match("else");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:21:7: ( 'fi' )
            // Looc.g:21:9: 'fi'
            {
            match("fi");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:22:7: ( 'for' )
            // Looc.g:22:9: 'for'
            {
            match("for");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:23:7: ( 'in' )
            // Looc.g:23:9: 'in'
            {
            match("in");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:24:7: ( '..' )
            // Looc.g:24:9: '..'
            {
            match("..");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:25:7: ( 'do' )
            // Looc.g:25:9: 'do'
            {
            match("do");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:26:7: ( 'end' )
            // Looc.g:26:9: 'end'
            {
            match("end");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:27:7: ( '.' )
            // Looc.g:27:9: '.'
            {
            match('.');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:28:7: ( 'write' )
            // Looc.g:28:9: 'write'
            {
            match("write");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:29:7: ( 'read' )
            // Looc.g:29:9: 'read'
            {
            match("read");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:30:7: ( 'return' )
            // Looc.g:30:9: 'return'
            {
            match("return");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:31:7: ( 'this' )
            // Looc.g:31:9: 'this'
            {
            match("this");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:32:7: ( 'super' )
            // Looc.g:32:9: 'super'
            {
            match("super");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:33:7: ( '-' )
            // Looc.g:33:9: '-'
            {
            match('-');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:34:7: ( 'new' )
            // Looc.g:34:9: 'new'
            {
            match("new");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:35:7: ( '/' )
            // Looc.g:35:9: '/'
            {
            match('/');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:36:7: ( '*' )
            // Looc.g:36:9: '*'
            {
            match('*');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:37:7: ( '%' )
            // Looc.g:37:9: '%'
            {
            match('%');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:38:7: ( '+' )
            // Looc.g:38:9: '+'
            {
            match('+');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:39:7: ( '<' )
            // Looc.g:39:9: '<'
            {
            match('<');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:40:7: ( '>' )
            // Looc.g:40:9: '>'
            {
            match('>');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:41:7: ( '==' )
            // Looc.g:41:9: '=='
            {
            match("==");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:42:7: ( '!=' )
            // Looc.g:42:9: '!='
            {
            match("!=");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "IDF_CLASS"
    public final void mIDF_CLASS() throws RecognitionException {
        try {
            int _type = IDF_CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:108:11: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // Looc.g:108:13: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            // Looc.g:108:13: ( 'A' .. 'Z' )
            // Looc.g:108:14: 'A' .. 'Z'
            {
            matchRange('A','Z');

            }

            // Looc.g:108:23: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Looc.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDF_CLASS"

    // $ANTLR start "IDF"
    public final void mIDF() throws RecognitionException {
        try {
            int _type = IDF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:109:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // Looc.g:109:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Looc.g:109:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Looc.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDF"

    // $ANTLR start "CSTE_ENT"
    public final void mCSTE_ENT() throws RecognitionException {
        try {
            int _type = CSTE_ENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:110:10: ( ( '0' .. '9' )+ )
            // Looc.g:110:14: ( '0' .. '9' )+
            {
            // Looc.g:110:14: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Looc.g:110:15: '0' .. '9'
            	    {
            	    matchRange('0','9');

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CSTE_ENT"

    // $ANTLR start "CSTE_CHAINE"
    public final void mCSTE_CHAINE() throws RecognitionException {
        try {
            int _type = CSTE_CHAINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:111:13: ( '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ';' | ':' | '/' | ',' | '?' | '!' | '%' | '@' | '#' | '~' | '&' | '\\\\' | '-' | '_' | '|' | '(' | ')' | '{' | '}' | '[' | ']' | '=' | ' ' )+ '\"' )
            // Looc.g:111:15: '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ';' | ':' | '/' | ',' | '?' | '!' | '%' | '@' | '#' | '~' | '&' | '\\\\' | '-' | '_' | '|' | '(' | ')' | '{' | '}' | '[' | ']' | '=' | ' ' )+ '\"'
            {
            match('\"');
            // Looc.g:111:19: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ';' | ':' | '/' | ',' | '?' | '!' | '%' | '@' | '#' | '~' | '&' | '\\\\' | '-' | '_' | '|' | '(' | ')' | '{' | '}' | '[' | ']' | '=' | ' ' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=' ' && LA4_0<='!')||LA4_0=='#'||(LA4_0>='%' && LA4_0<='&')||(LA4_0>='(' && LA4_0<=')')||(LA4_0>=',' && LA4_0<='-')||(LA4_0>='/' && LA4_0<=';')||LA4_0=='='||(LA4_0>='?' && LA4_0<=']')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='~')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Looc.g:
            	    {
            	    if ( (input.LA(1)>=' ' && input.LA(1)<='!')||input.LA(1)=='#'||(input.LA(1)>='%' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<=')')||(input.LA(1)>=',' && input.LA(1)<='-')||(input.LA(1)>='/' && input.LA(1)<=';')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<=']')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='~') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match('\"');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CSTE_CHAINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:112:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // Looc.g:112:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // Looc.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | IDF_CLASS | IDF | CSTE_ENT | CSTE_CHAINE | WS )
        int alt5=45;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // Looc.g:1:10: T__9
                {
                mT__9();

                }
                break;
            case 2 :
                // Looc.g:1:15: T__10
                {
                mT__10();

                }
                break;
            case 3 :
                // Looc.g:1:21: T__11
                {
                mT__11();

                }
                break;
            case 4 :
                // Looc.g:1:27: T__12
                {
                mT__12();

                }
                break;
            case 5 :
                // Looc.g:1:33: T__13
                {
                mT__13();

                }
                break;
            case 6 :
                // Looc.g:1:39: T__14
                {
                mT__14();

                }
                break;
            case 7 :
                // Looc.g:1:45: T__15
                {
                mT__15();

                }
                break;
            case 8 :
                // Looc.g:1:51: T__16
                {
                mT__16();

                }
                break;
            case 9 :
                // Looc.g:1:57: T__17
                {
                mT__17();

                }
                break;
            case 10 :
                // Looc.g:1:63: T__18
                {
                mT__18();

                }
                break;
            case 11 :
                // Looc.g:1:69: T__19
                {
                mT__19();

                }
                break;
            case 12 :
                // Looc.g:1:75: T__20
                {
                mT__20();

                }
                break;
            case 13 :
                // Looc.g:1:81: T__21
                {
                mT__21();

                }
                break;
            case 14 :
                // Looc.g:1:87: T__22
                {
                mT__22();

                }
                break;
            case 15 :
                // Looc.g:1:93: T__23
                {
                mT__23();

                }
                break;
            case 16 :
                // Looc.g:1:99: T__24
                {
                mT__24();

                }
                break;
            case 17 :
                // Looc.g:1:105: T__25
                {
                mT__25();

                }
                break;
            case 18 :
                // Looc.g:1:111: T__26
                {
                mT__26();

                }
                break;
            case 19 :
                // Looc.g:1:117: T__27
                {
                mT__27();

                }
                break;
            case 20 :
                // Looc.g:1:123: T__28
                {
                mT__28();

                }
                break;
            case 21 :
                // Looc.g:1:129: T__29
                {
                mT__29();

                }
                break;
            case 22 :
                // Looc.g:1:135: T__30
                {
                mT__30();

                }
                break;
            case 23 :
                // Looc.g:1:141: T__31
                {
                mT__31();

                }
                break;
            case 24 :
                // Looc.g:1:147: T__32
                {
                mT__32();

                }
                break;
            case 25 :
                // Looc.g:1:153: T__33
                {
                mT__33();

                }
                break;
            case 26 :
                // Looc.g:1:159: T__34
                {
                mT__34();

                }
                break;
            case 27 :
                // Looc.g:1:165: T__35
                {
                mT__35();

                }
                break;
            case 28 :
                // Looc.g:1:171: T__36
                {
                mT__36();

                }
                break;
            case 29 :
                // Looc.g:1:177: T__37
                {
                mT__37();

                }
                break;
            case 30 :
                // Looc.g:1:183: T__38
                {
                mT__38();

                }
                break;
            case 31 :
                // Looc.g:1:189: T__39
                {
                mT__39();

                }
                break;
            case 32 :
                // Looc.g:1:195: T__40
                {
                mT__40();

                }
                break;
            case 33 :
                // Looc.g:1:201: T__41
                {
                mT__41();

                }
                break;
            case 34 :
                // Looc.g:1:207: T__42
                {
                mT__42();

                }
                break;
            case 35 :
                // Looc.g:1:213: T__43
                {
                mT__43();

                }
                break;
            case 36 :
                // Looc.g:1:219: T__44
                {
                mT__44();

                }
                break;
            case 37 :
                // Looc.g:1:225: T__45
                {
                mT__45();

                }
                break;
            case 38 :
                // Looc.g:1:231: T__46
                {
                mT__46();

                }
                break;
            case 39 :
                // Looc.g:1:237: T__47
                {
                mT__47();

                }
                break;
            case 40 :
                // Looc.g:1:243: T__48
                {
                mT__48();

                }
                break;
            case 41 :
                // Looc.g:1:249: IDF_CLASS
                {
                mIDF_CLASS();

                }
                break;
            case 42 :
                // Looc.g:1:259: IDF
                {
                mIDF();

                }
                break;
            case 43 :
                // Looc.g:1:263: CSTE_ENT
                {
                mCSTE_ENT();

                }
                break;
            case 44 :
                // Looc.g:1:272: CSTE_CHAINE
                {
                mCSTE_CHAINE();

                }
                break;
            case 45 :
                // Looc.g:1:284: WS
                {
                mWS();

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\2\37\1\47\2\uffff\1\37\1\52\1\uffff\2\37\3\uffff\3\37\1"+
        "\64\3\37\1\uffff\1\37\7\uffff\1\72\4\uffff\1\37\1\76\1\77\2\uffff"+
        "\1\37\2\uffff\6\37\1\110\1\37\2\uffff\1\112\3\37\1\72\1\uffff\2"+
        "\37\1\121\2\uffff\1\122\6\37\1\131\1\uffff\1\132\1\uffff\3\37\1"+
        "\136\2\37\2\uffff\3\37\1\144\1\145\1\146\2\uffff\1\37\1\150\1\37"+
        "\1\uffff\1\152\2\37\1\155\1\37\3\uffff\1\157\1\uffff\1\37\1\uffff"+
        "\1\37\1\162\1\uffff\1\163\1\uffff\1\164\1\165\4\uffff";
    static final String DFA5_eofS =
        "\166\uffff";
    static final String DFA5_minS =
        "\1\11\1\154\1\146\1\75\2\uffff\1\141\1\75\1\uffff\1\164\1\145\3"+
        "\uffff\1\150\1\154\1\151\1\56\1\157\1\162\1\145\1\uffff\1\145\7"+
        "\uffff\1\60\4\uffff\1\141\2\60\2\uffff\1\162\2\uffff\1\162\1\160"+
        "\1\164\1\145\1\163\1\144\1\60\1\162\2\uffff\1\60\1\151\1\141\1\167"+
        "\1\60\1\uffff\1\163\1\145\1\60\2\uffff\1\60\1\151\1\145\1\150\1"+
        "\156\1\163\1\145\1\60\1\uffff\1\60\1\uffff\1\164\1\144\1\165\1\60"+
        "\1\163\1\162\2\uffff\1\156\1\162\1\157\3\60\2\uffff\1\145\1\60\1"+
        "\162\1\uffff\1\60\1\151\1\147\1\60\1\144\3\uffff\1\60\1\uffff\1"+
        "\156\1\uffff\1\164\1\60\1\uffff\1\60\1\uffff\2\60\4\uffff";
    static final String DFA5_maxS =
        "\1\175\1\154\1\156\1\75\2\uffff\1\141\1\75\1\uffff\1\165\1\145\3"+
        "\uffff\1\150\1\156\1\157\1\56\1\157\1\162\1\145\1\uffff\1\145\7"+
        "\uffff\1\172\4\uffff\1\141\2\172\2\uffff\1\162\2\uffff\1\162\1\160"+
        "\1\164\1\151\1\163\1\144\1\172\1\162\2\uffff\1\172\1\151\1\164\1"+
        "\167\1\172\1\uffff\1\163\1\145\1\172\2\uffff\1\172\1\151\1\145\1"+
        "\150\1\156\1\163\1\145\1\172\1\uffff\1\172\1\uffff\1\164\1\144\1"+
        "\165\1\172\1\163\1\162\2\uffff\1\156\1\162\1\157\3\172\2\uffff\1"+
        "\145\1\172\1\162\1\uffff\1\172\1\151\1\147\1\172\1\144\3\uffff\1"+
        "\172\1\uffff\1\156\1\uffff\1\164\1\172\1\uffff\1\172\1\uffff\2\172"+
        "\4\uffff";
    static final String DFA5_acceptS =
        "\4\uffff\1\4\1\5\2\uffff\1\10\2\uffff\1\14\1\15\1\16\7\uffff\1\37"+
        "\1\uffff\1\41\1\42\1\43\1\44\1\45\1\46\1\50\1\uffff\1\52\1\53\1"+
        "\54\1\55\3\uffff\1\47\1\3\1\uffff\1\17\1\7\10\uffff\1\26\1\31\5"+
        "\uffff\1\51\3\uffff\1\25\1\20\10\uffff\1\23\1\uffff\1\27\6\uffff"+
        "\1\11\1\6\6\uffff\1\30\1\24\3\uffff\1\40\5\uffff\1\21\1\35\1\22"+
        "\1\uffff\1\33\1\uffff\1\1\2\uffff\1\36\1\uffff\1\32\2\uffff\1\12"+
        "\1\13\1\34\1\2";
    static final String DFA5_specialS =
        "\166\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\42\2\uffff\1\42\22\uffff\1\42\1\35\1\41\2\uffff\1\31\2\uffff"+
            "\1\4\1\5\1\30\1\32\1\15\1\25\1\21\1\27\12\40\1\7\1\10\1\33\1"+
            "\3\1\34\2\uffff\32\36\6\uffff\2\37\1\1\1\22\1\17\1\20\2\37\1"+
            "\2\3\37\1\12\1\26\3\37\1\24\1\11\1\16\1\37\1\6\1\23\3\37\1\13"+
            "\1\uffff\1\14",
            "\1\43",
            "\1\45\7\uffff\1\44",
            "\1\46",
            "",
            "",
            "\1\50",
            "\1\51",
            "",
            "\1\53\1\54",
            "\1\55",
            "",
            "",
            "",
            "\1\56",
            "\1\57\1\uffff\1\60",
            "\1\61\5\uffff\1\62",
            "\1\63",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "\1\70",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "",
            "",
            "\1\73",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\7\37\1\74\13\37\1"+
            "\75\6\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\100",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104\3\uffff\1\105",
            "\1\106",
            "\1\107",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\111",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\113",
            "\1\114\22\uffff\1\115",
            "\1\116",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\117",
            "\1\120",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\137",
            "\1\140",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\147",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\151",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\153",
            "\1\154",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\156",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\160",
            "",
            "\1\161",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | IDF_CLASS | IDF | CSTE_ENT | CSTE_CHAINE | WS );";
        }
    }


}

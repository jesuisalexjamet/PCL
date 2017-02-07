// $ANTLR 3.5.2 Looc.g 2017-02-07 13:49:45
package main.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LoocParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CSTE_CHAINE", "CSTE_ENT", "IDF", 
		"IDF_CLASS", "NEWLINE", "WS", "'!='", "'%'", "'('", "')'", "'*'", "'+'", 
		"','", "'-'", "'.'", "'..'", "'/'", "':'", "':='", "';'", "'<'", "'='", 
		"'=='", "'>'", "'class'", "'do'", "'else'", "'end'", "'fi'", "'for'", 
		"'if'", "'in'", "'inherit'", "'int'", "'method'", "'new'", "'read'", "'return'", 
		"'string'", "'super'", "'then'", "'this'", "'var'", "'write'", "'{'", 
		"'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public LoocParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public LoocParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return LoocParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Looc.g"; }



	// $ANTLR start "program"
	// Looc.g:3:1: program : ( class_decl )* ( var_decl )* ( instruction )+ ;
	public final void program() throws RecognitionException {
		try {
			// Looc.g:3:8: ( ( class_decl )* ( var_decl )* ( instruction )+ )
			// Looc.g:3:11: ( class_decl )* ( var_decl )* ( instruction )+
			{
			// Looc.g:3:11: ( class_decl )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==28) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Looc.g:3:11: class_decl
					{
					pushFollow(FOLLOW_class_decl_in_program10);
					class_decl();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			// Looc.g:3:23: ( var_decl )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==46) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Looc.g:3:23: var_decl
					{
					pushFollow(FOLLOW_var_decl_in_program13);
					var_decl();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			// Looc.g:3:33: ( instruction )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==IDF||LA3_0==29||(LA3_0 >= 33 && LA3_0 <= 34)||(LA3_0 >= 40 && LA3_0 <= 41)||(LA3_0 >= 47 && LA3_0 <= 48)) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Looc.g:3:33: instruction
					{
					pushFollow(FOLLOW_instruction_in_program16);
					instruction();
					state._fsp--;

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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "class_decl"
	// Looc.g:6:1: class_decl : 'class' IDF_CLASS ( 'inherit' IDF_CLASS )? '=' '(' NEWLINE class_item_decl ')' NEWLINE ;
	public final void class_decl() throws RecognitionException {
		try {
			// Looc.g:6:11: ( 'class' IDF_CLASS ( 'inherit' IDF_CLASS )? '=' '(' NEWLINE class_item_decl ')' NEWLINE )
			// Looc.g:6:14: 'class' IDF_CLASS ( 'inherit' IDF_CLASS )? '=' '(' NEWLINE class_item_decl ')' NEWLINE
			{
			match(input,28,FOLLOW_28_in_class_decl29); 
			match(input,IDF_CLASS,FOLLOW_IDF_CLASS_in_class_decl31); 
			// Looc.g:6:32: ( 'inherit' IDF_CLASS )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==36) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Looc.g:6:33: 'inherit' IDF_CLASS
					{
					match(input,36,FOLLOW_36_in_class_decl34); 
					match(input,IDF_CLASS,FOLLOW_IDF_CLASS_in_class_decl36); 
					}
					break;

			}

			match(input,25,FOLLOW_25_in_class_decl40); 
			match(input,12,FOLLOW_12_in_class_decl42); 
			match(input,NEWLINE,FOLLOW_NEWLINE_in_class_decl43); 
			pushFollow(FOLLOW_class_item_decl_in_class_decl45);
			class_item_decl();
			state._fsp--;

			match(input,13,FOLLOW_13_in_class_decl47); 
			match(input,NEWLINE,FOLLOW_NEWLINE_in_class_decl49); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "class_decl"



	// $ANTLR start "class_item_decl"
	// Looc.g:9:1: class_item_decl : ( var_decl )* ( method_decl )* ;
	public final void class_item_decl() throws RecognitionException {
		try {
			// Looc.g:9:16: ( ( var_decl )* ( method_decl )* )
			// Looc.g:9:19: ( var_decl )* ( method_decl )*
			{
			// Looc.g:9:19: ( var_decl )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==46) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Looc.g:9:19: var_decl
					{
					pushFollow(FOLLOW_var_decl_in_class_item_decl62);
					var_decl();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			// Looc.g:9:29: ( method_decl )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==38) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Looc.g:9:29: method_decl
					{
					pushFollow(FOLLOW_method_decl_in_class_item_decl65);
					method_decl();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "class_item_decl"



	// $ANTLR start "var_decl"
	// Looc.g:12:1: var_decl : 'var' IDF ':' type ';' NEWLINE ;
	public final void var_decl() throws RecognitionException {
		try {
			// Looc.g:12:9: ( 'var' IDF ':' type ';' NEWLINE )
			// Looc.g:12:12: 'var' IDF ':' type ';' NEWLINE
			{
			match(input,46,FOLLOW_46_in_var_decl80); 
			match(input,IDF,FOLLOW_IDF_in_var_decl82); 
			match(input,21,FOLLOW_21_in_var_decl84); 
			pushFollow(FOLLOW_type_in_var_decl86);
			type();
			state._fsp--;

			match(input,23,FOLLOW_23_in_var_decl88); 
			match(input,NEWLINE,FOLLOW_NEWLINE_in_var_decl90); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "var_decl"



	// $ANTLR start "type"
	// Looc.g:15:1: type : ( IDF_CLASS | 'int' | 'string' );
	public final void type() throws RecognitionException {
		try {
			// Looc.g:15:5: ( IDF_CLASS | 'int' | 'string' )
			// Looc.g:
			{
			if ( input.LA(1)==IDF_CLASS||input.LA(1)==37||input.LA(1)==42 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"



	// $ANTLR start "method_decl"
	// Looc.g:20:1: method_decl : 'method' IDF '(' ( method_args )* ')' method_decl_suite NEWLINE ;
	public final void method_decl() throws RecognitionException {
		try {
			// Looc.g:20:12: ( 'method' IDF '(' ( method_args )* ')' method_decl_suite NEWLINE )
			// Looc.g:20:14: 'method' IDF '(' ( method_args )* ')' method_decl_suite NEWLINE
			{
			match(input,38,FOLLOW_38_in_method_decl123); 
			match(input,IDF,FOLLOW_IDF_in_method_decl125); 
			match(input,12,FOLLOW_12_in_method_decl127); 
			// Looc.g:20:31: ( method_args )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==IDF) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Looc.g:20:31: method_args
					{
					pushFollow(FOLLOW_method_args_in_method_decl129);
					method_args();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			match(input,13,FOLLOW_13_in_method_decl132); 
			pushFollow(FOLLOW_method_decl_suite_in_method_decl135);
			method_decl_suite();
			state._fsp--;

			match(input,NEWLINE,FOLLOW_NEWLINE_in_method_decl137); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "method_decl"



	// $ANTLR start "method_decl_suite"
	// Looc.g:23:1: method_decl_suite : ( '{' NEWLINE ( var_decl )* ( instruction )+ '}' | ':' type '{' ( var_decl )* ( instruction )+ '}' );
	public final void method_decl_suite() throws RecognitionException {
		try {
			// Looc.g:23:18: ( '{' NEWLINE ( var_decl )* ( instruction )+ '}' | ':' type '{' ( var_decl )* ( instruction )+ '}' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==48) ) {
				alt12=1;
			}
			else if ( (LA12_0==21) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// Looc.g:23:20: '{' NEWLINE ( var_decl )* ( instruction )+ '}'
					{
					match(input,48,FOLLOW_48_in_method_decl_suite149); 
					match(input,NEWLINE,FOLLOW_NEWLINE_in_method_decl_suite150); 
					// Looc.g:23:31: ( var_decl )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==46) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// Looc.g:23:31: var_decl
							{
							pushFollow(FOLLOW_var_decl_in_method_decl_suite152);
							var_decl();
							state._fsp--;

							}
							break;

						default :
							break loop8;
						}
					}

					// Looc.g:23:41: ( instruction )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==IDF||LA9_0==29||(LA9_0 >= 33 && LA9_0 <= 34)||(LA9_0 >= 40 && LA9_0 <= 41)||(LA9_0 >= 47 && LA9_0 <= 48)) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// Looc.g:23:41: instruction
							{
							pushFollow(FOLLOW_instruction_in_method_decl_suite155);
							instruction();
							state._fsp--;

							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					match(input,49,FOLLOW_49_in_method_decl_suite158); 
					}
					break;
				case 2 :
					// Looc.g:24:8: ':' type '{' ( var_decl )* ( instruction )+ '}'
					{
					match(input,21,FOLLOW_21_in_method_decl_suite167); 
					pushFollow(FOLLOW_type_in_method_decl_suite169);
					type();
					state._fsp--;

					match(input,48,FOLLOW_48_in_method_decl_suite171); 
					// Looc.g:24:21: ( var_decl )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==46) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// Looc.g:24:21: var_decl
							{
							pushFollow(FOLLOW_var_decl_in_method_decl_suite173);
							var_decl();
							state._fsp--;

							}
							break;

						default :
							break loop10;
						}
					}

					// Looc.g:24:31: ( instruction )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==IDF||LA11_0==29||(LA11_0 >= 33 && LA11_0 <= 34)||(LA11_0 >= 40 && LA11_0 <= 41)||(LA11_0 >= 47 && LA11_0 <= 48)) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// Looc.g:24:31: instruction
							{
							pushFollow(FOLLOW_instruction_in_method_decl_suite176);
							instruction();
							state._fsp--;

							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					match(input,49,FOLLOW_49_in_method_decl_suite179); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "method_decl_suite"



	// $ANTLR start "method_args"
	// Looc.g:27:1: method_args : IDF ':' type ( ',' IDF ':' type )* ;
	public final void method_args() throws RecognitionException {
		try {
			// Looc.g:27:12: ( IDF ':' type ( ',' IDF ':' type )* )
			// Looc.g:27:14: IDF ':' type ( ',' IDF ':' type )*
			{
			match(input,IDF,FOLLOW_IDF_in_method_args192); 
			match(input,21,FOLLOW_21_in_method_args194); 
			pushFollow(FOLLOW_type_in_method_args196);
			type();
			state._fsp--;

			// Looc.g:27:27: ( ',' IDF ':' type )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==16) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// Looc.g:27:28: ',' IDF ':' type
					{
					match(input,16,FOLLOW_16_in_method_args199); 
					match(input,IDF,FOLLOW_IDF_in_method_args201); 
					match(input,21,FOLLOW_21_in_method_args203); 
					pushFollow(FOLLOW_type_in_method_args205);
					type();
					state._fsp--;

					}
					break;

				default :
					break loop13;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "method_args"



	// $ANTLR start "instruction"
	// Looc.g:30:1: instruction : ( IDF ':=' definition ';' NEWLINE | 'if' expression 'then' NEWLINE ( instruction )+ ( 'else' NEWLINE ( instruction )+ )? 'fi' NEWLINE | 'for' IDF 'in' expression '..' expression 'do' NEWLINE ( instruction )+ 'end' NEWLINE | '{' NEWLINE ( var_decl )* ( instruction )+ NEWLINE '}' NEWLINE | 'do' expression_start '.' IDF '(' expression ( ',' expression )* ')' ';' NEWLINE | print | read | retour NEWLINE );
	public final void instruction() throws RecognitionException {
		try {
			// Looc.g:30:12: ( IDF ':=' definition ';' NEWLINE | 'if' expression 'then' NEWLINE ( instruction )+ ( 'else' NEWLINE ( instruction )+ )? 'fi' NEWLINE | 'for' IDF 'in' expression '..' expression 'do' NEWLINE ( instruction )+ 'end' NEWLINE | '{' NEWLINE ( var_decl )* ( instruction )+ NEWLINE '}' NEWLINE | 'do' expression_start '.' IDF '(' expression ( ',' expression )* ')' ';' NEWLINE | print | read | retour NEWLINE )
			int alt21=8;
			switch ( input.LA(1) ) {
			case IDF:
				{
				alt21=1;
				}
				break;
			case 34:
				{
				alt21=2;
				}
				break;
			case 33:
				{
				alt21=3;
				}
				break;
			case 48:
				{
				alt21=4;
				}
				break;
			case 29:
				{
				alt21=5;
				}
				break;
			case 47:
				{
				alt21=6;
				}
				break;
			case 40:
				{
				alt21=7;
				}
				break;
			case 41:
				{
				alt21=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// Looc.g:30:14: IDF ':=' definition ';' NEWLINE
					{
					match(input,IDF,FOLLOW_IDF_in_instruction220); 
					match(input,22,FOLLOW_22_in_instruction222); 
					pushFollow(FOLLOW_definition_in_instruction224);
					definition();
					state._fsp--;

					match(input,23,FOLLOW_23_in_instruction226); 
					match(input,NEWLINE,FOLLOW_NEWLINE_in_instruction227); 
					}
					break;
				case 2 :
					// Looc.g:31:5: 'if' expression 'then' NEWLINE ( instruction )+ ( 'else' NEWLINE ( instruction )+ )? 'fi' NEWLINE
					{
					match(input,34,FOLLOW_34_in_instruction233); 
					pushFollow(FOLLOW_expression_in_instruction235);
					expression();
					state._fsp--;

					match(input,44,FOLLOW_44_in_instruction237); 
					match(input,NEWLINE,FOLLOW_NEWLINE_in_instruction239); 
					// Looc.g:31:36: ( instruction )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==IDF||LA14_0==29||(LA14_0 >= 33 && LA14_0 <= 34)||(LA14_0 >= 40 && LA14_0 <= 41)||(LA14_0 >= 47 && LA14_0 <= 48)) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// Looc.g:31:36: instruction
							{
							pushFollow(FOLLOW_instruction_in_instruction241);
							instruction();
							state._fsp--;

							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					// Looc.g:31:49: ( 'else' NEWLINE ( instruction )+ )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==30) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// Looc.g:31:50: 'else' NEWLINE ( instruction )+
							{
							match(input,30,FOLLOW_30_in_instruction245); 
							match(input,NEWLINE,FOLLOW_NEWLINE_in_instruction246); 
							// Looc.g:31:64: ( instruction )+
							int cnt15=0;
							loop15:
							while (true) {
								int alt15=2;
								int LA15_0 = input.LA(1);
								if ( (LA15_0==IDF||LA15_0==29||(LA15_0 >= 33 && LA15_0 <= 34)||(LA15_0 >= 40 && LA15_0 <= 41)||(LA15_0 >= 47 && LA15_0 <= 48)) ) {
									alt15=1;
								}

								switch (alt15) {
								case 1 :
									// Looc.g:31:64: instruction
									{
									pushFollow(FOLLOW_instruction_in_instruction248);
									instruction();
									state._fsp--;

									}
									break;

								default :
									if ( cnt15 >= 1 ) break loop15;
									EarlyExitException eee = new EarlyExitException(15, input);
									throw eee;
								}
								cnt15++;
							}

							}
							break;

					}

					match(input,32,FOLLOW_32_in_instruction252); 
					match(input,NEWLINE,FOLLOW_NEWLINE_in_instruction253); 
					}
					break;
				case 3 :
					// Looc.g:32:5: 'for' IDF 'in' expression '..' expression 'do' NEWLINE ( instruction )+ 'end' NEWLINE
					{
					match(input,33,FOLLOW_33_in_instruction259); 
					match(input,IDF,FOLLOW_IDF_in_instruction261); 
					match(input,35,FOLLOW_35_in_instruction263); 
					pushFollow(FOLLOW_expression_in_instruction265);
					expression();
					state._fsp--;

					match(input,19,FOLLOW_19_in_instruction267); 
					pushFollow(FOLLOW_expression_in_instruction269);
					expression();
					state._fsp--;

					match(input,29,FOLLOW_29_in_instruction272); 
					match(input,NEWLINE,FOLLOW_NEWLINE_in_instruction273); 
					// Looc.g:32:60: ( instruction )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==IDF||LA17_0==29||(LA17_0 >= 33 && LA17_0 <= 34)||(LA17_0 >= 40 && LA17_0 <= 41)||(LA17_0 >= 47 && LA17_0 <= 48)) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// Looc.g:32:60: instruction
							{
							pushFollow(FOLLOW_instruction_in_instruction275);
							instruction();
							state._fsp--;

							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					match(input,31,FOLLOW_31_in_instruction278); 
					match(input,NEWLINE,FOLLOW_NEWLINE_in_instruction280); 
					}
					break;
				case 4 :
					// Looc.g:33:5: '{' NEWLINE ( var_decl )* ( instruction )+ NEWLINE '}' NEWLINE
					{
					match(input,48,FOLLOW_48_in_instruction286); 
					match(input,NEWLINE,FOLLOW_NEWLINE_in_instruction288); 
					// Looc.g:33:17: ( var_decl )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==46) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// Looc.g:33:17: var_decl
							{
							pushFollow(FOLLOW_var_decl_in_instruction290);
							var_decl();
							state._fsp--;

							}
							break;

						default :
							break loop18;
						}
					}

					// Looc.g:33:27: ( instruction )+
					int cnt19=0;
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==IDF||LA19_0==29||(LA19_0 >= 33 && LA19_0 <= 34)||(LA19_0 >= 40 && LA19_0 <= 41)||(LA19_0 >= 47 && LA19_0 <= 48)) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// Looc.g:33:27: instruction
							{
							pushFollow(FOLLOW_instruction_in_instruction293);
							instruction();
							state._fsp--;

							}
							break;

						default :
							if ( cnt19 >= 1 ) break loop19;
							EarlyExitException eee = new EarlyExitException(19, input);
							throw eee;
						}
						cnt19++;
					}

					match(input,NEWLINE,FOLLOW_NEWLINE_in_instruction296); 
					match(input,49,FOLLOW_49_in_instruction298); 
					match(input,NEWLINE,FOLLOW_NEWLINE_in_instruction300); 
					}
					break;
				case 5 :
					// Looc.g:34:5: 'do' expression_start '.' IDF '(' expression ( ',' expression )* ')' ';' NEWLINE
					{
					match(input,29,FOLLOW_29_in_instruction306); 
					pushFollow(FOLLOW_expression_start_in_instruction308);
					expression_start();
					state._fsp--;

					match(input,18,FOLLOW_18_in_instruction310); 
					match(input,IDF,FOLLOW_IDF_in_instruction312); 
					match(input,12,FOLLOW_12_in_instruction314); 
					pushFollow(FOLLOW_expression_in_instruction316);
					expression();
					state._fsp--;

					// Looc.g:34:50: ( ',' expression )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==16) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// Looc.g:34:51: ',' expression
							{
							match(input,16,FOLLOW_16_in_instruction319); 
							pushFollow(FOLLOW_expression_in_instruction321);
							expression();
							state._fsp--;

							}
							break;

						default :
							break loop20;
						}
					}

					match(input,13,FOLLOW_13_in_instruction325); 
					match(input,23,FOLLOW_23_in_instruction327); 
					match(input,NEWLINE,FOLLOW_NEWLINE_in_instruction329); 
					}
					break;
				case 6 :
					// Looc.g:35:5: print
					{
					pushFollow(FOLLOW_print_in_instruction335);
					print();
					state._fsp--;

					}
					break;
				case 7 :
					// Looc.g:36:5: read
					{
					pushFollow(FOLLOW_read_in_instruction341);
					read();
					state._fsp--;

					}
					break;
				case 8 :
					// Looc.g:37:5: retour NEWLINE
					{
					pushFollow(FOLLOW_retour_in_instruction347);
					retour();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_instruction349); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "instruction"



	// $ANTLR start "definition"
	// Looc.g:41:1: definition : ( expression |);
	public final void definition() throws RecognitionException {
		try {
			// Looc.g:41:11: ( expression |)
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( ((LA22_0 >= CSTE_ENT && LA22_0 <= IDF)||LA22_0==12||LA22_0==17||LA22_0==39||LA22_0==43||LA22_0==45) ) {
				alt22=1;
			}
			else if ( (LA22_0==23) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// Looc.g:41:13: expression
					{
					pushFollow(FOLLOW_expression_in_definition360);
					expression();
					state._fsp--;

					}
					break;
				case 2 :
					// Looc.g:43:3: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "definition"



	// $ANTLR start "print"
	// Looc.g:45:1: print : 'write' print_suite ';' NEWLINE ;
	public final void print() throws RecognitionException {
		try {
			// Looc.g:45:6: ( 'write' print_suite ';' NEWLINE )
			// Looc.g:45:8: 'write' print_suite ';' NEWLINE
			{
			match(input,47,FOLLOW_47_in_print374); 
			pushFollow(FOLLOW_print_suite_in_print376);
			print_suite();
			state._fsp--;

			match(input,23,FOLLOW_23_in_print378); 
			match(input,NEWLINE,FOLLOW_NEWLINE_in_print379); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "print"



	// $ANTLR start "print_suite"
	// Looc.g:48:1: print_suite : ( expression | CSTE_CHAINE );
	public final void print_suite() throws RecognitionException {
		Token CSTE_CHAINE1=null;

		try {
			// Looc.g:48:12: ( expression | CSTE_CHAINE )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( ((LA23_0 >= CSTE_ENT && LA23_0 <= IDF)||LA23_0==12||LA23_0==17||LA23_0==39||LA23_0==43||LA23_0==45) ) {
				alt23=1;
			}
			else if ( (LA23_0==CSTE_CHAINE) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// Looc.g:48:14: expression
					{
					pushFollow(FOLLOW_expression_in_print_suite388);
					expression();
					state._fsp--;

					}
					break;
				case 2 :
					// Looc.g:49:5: CSTE_CHAINE
					{
					CSTE_CHAINE1=(Token)match(input,CSTE_CHAINE,FOLLOW_CSTE_CHAINE_in_print_suite394); 
					System.out.print((CSTE_CHAINE1!=null?CSTE_CHAINE1.getText():null));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "print_suite"



	// $ANTLR start "read"
	// Looc.g:52:1: read : 'read' IDF ';' NEWLINE ;
	public final void read() throws RecognitionException {
		try {
			// Looc.g:52:5: ( 'read' IDF ';' NEWLINE )
			// Looc.g:52:7: 'read' IDF ';' NEWLINE
			{
			match(input,40,FOLLOW_40_in_read406); 
			match(input,IDF,FOLLOW_IDF_in_read408); 
			match(input,23,FOLLOW_23_in_read410); 
			match(input,NEWLINE,FOLLOW_NEWLINE_in_read412); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "read"



	// $ANTLR start "retour"
	// Looc.g:55:1: retour : 'return' '(' expression ')' ';' NEWLINE ;
	public final void retour() throws RecognitionException {
		try {
			// Looc.g:55:7: ( 'return' '(' expression ')' ';' NEWLINE )
			// Looc.g:55:10: 'return' '(' expression ')' ';' NEWLINE
			{
			match(input,41,FOLLOW_41_in_retour423); 
			match(input,12,FOLLOW_12_in_retour425); 
			pushFollow(FOLLOW_expression_in_retour427);
			expression();
			state._fsp--;

			match(input,13,FOLLOW_13_in_retour429); 
			match(input,23,FOLLOW_23_in_retour431); 
			match(input,NEWLINE,FOLLOW_NEWLINE_in_retour433); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "retour"



	// $ANTLR start "expression"
	// Looc.g:58:1: expression : expression_start expression_suite ;
	public final void expression() throws RecognitionException {
		try {
			// Looc.g:58:11: ( expression_start expression_suite )
			// Looc.g:58:14: expression_start expression_suite
			{
			pushFollow(FOLLOW_expression_start_in_expression445);
			expression_start();
			state._fsp--;

			pushFollow(FOLLOW_expression_suite_in_expression447);
			expression_suite();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "expression_start"
	// Looc.g:62:1: expression_start : ( '(' expression ')' | IDF | '-' CSTE_ENT | 'this' | 'super' | CSTE_ENT | 'new' IDF_CLASS );
	public final void expression_start() throws RecognitionException {
		try {
			// Looc.g:63:2: ( '(' expression ')' | IDF | '-' CSTE_ENT | 'this' | 'super' | CSTE_ENT | 'new' IDF_CLASS )
			int alt24=7;
			switch ( input.LA(1) ) {
			case 12:
				{
				alt24=1;
				}
				break;
			case IDF:
				{
				alt24=2;
				}
				break;
			case 17:
				{
				alt24=3;
				}
				break;
			case 45:
				{
				alt24=4;
				}
				break;
			case 43:
				{
				alt24=5;
				}
				break;
			case CSTE_ENT:
				{
				alt24=6;
				}
				break;
			case 39:
				{
				alt24=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// Looc.g:63:5: '(' expression ')'
					{
					match(input,12,FOLLOW_12_in_expression_start461); 
					pushFollow(FOLLOW_expression_in_expression_start463);
					expression();
					state._fsp--;

					match(input,13,FOLLOW_13_in_expression_start465); 
					}
					break;
				case 2 :
					// Looc.g:64:5: IDF
					{
					match(input,IDF,FOLLOW_IDF_in_expression_start471); 
					}
					break;
				case 3 :
					// Looc.g:65:5: '-' CSTE_ENT
					{
					match(input,17,FOLLOW_17_in_expression_start477); 
					match(input,CSTE_ENT,FOLLOW_CSTE_ENT_in_expression_start479); 
					}
					break;
				case 4 :
					// Looc.g:66:5: 'this'
					{
					match(input,45,FOLLOW_45_in_expression_start485); 
					}
					break;
				case 5 :
					// Looc.g:67:5: 'super'
					{
					match(input,43,FOLLOW_43_in_expression_start491); 
					}
					break;
				case 6 :
					// Looc.g:68:5: CSTE_ENT
					{
					match(input,CSTE_ENT,FOLLOW_CSTE_ENT_in_expression_start497); 
					}
					break;
				case 7 :
					// Looc.g:69:5: 'new' IDF_CLASS
					{
					match(input,39,FOLLOW_39_in_expression_start503); 
					match(input,IDF_CLASS,FOLLOW_IDF_CLASS_in_expression_start505); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expression_start"



	// $ANTLR start "expression_suite"
	// Looc.g:72:1: expression_suite : ( '.' IDF '(' expression ( ',' expression )* ')' | multOper | oper | comparaison expression );
	public final void expression_suite() throws RecognitionException {
		try {
			// Looc.g:72:17: ( '.' IDF '(' expression ( ',' expression )* ')' | multOper | oper | comparaison expression )
			int alt26=4;
			switch ( input.LA(1) ) {
			case 18:
				{
				alt26=1;
				}
				break;
			case 11:
			case 13:
			case 14:
			case 16:
			case 19:
			case 20:
			case 23:
			case 29:
			case 44:
				{
				alt26=2;
				}
				break;
			case 15:
			case 17:
				{
				alt26=3;
				}
				break;
			case 10:
			case 24:
			case 26:
			case 27:
				{
				alt26=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// Looc.g:73:3: '.' IDF '(' expression ( ',' expression )* ')'
					{
					match(input,18,FOLLOW_18_in_expression_suite517); 
					match(input,IDF,FOLLOW_IDF_in_expression_suite519); 
					match(input,12,FOLLOW_12_in_expression_suite521); 
					pushFollow(FOLLOW_expression_in_expression_suite523);
					expression();
					state._fsp--;

					// Looc.g:73:26: ( ',' expression )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==16) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// Looc.g:73:27: ',' expression
							{
							match(input,16,FOLLOW_16_in_expression_suite526); 
							pushFollow(FOLLOW_expression_in_expression_suite528);
							expression();
							state._fsp--;

							}
							break;

						default :
							break loop25;
						}
					}

					match(input,13,FOLLOW_13_in_expression_suite532); 
					}
					break;
				case 2 :
					// Looc.g:74:5: multOper
					{
					pushFollow(FOLLOW_multOper_in_expression_suite538);
					multOper();
					state._fsp--;

					}
					break;
				case 3 :
					// Looc.g:75:5: oper
					{
					pushFollow(FOLLOW_oper_in_expression_suite544);
					oper();
					state._fsp--;

					}
					break;
				case 4 :
					// Looc.g:76:5: comparaison expression
					{
					pushFollow(FOLLOW_comparaison_in_expression_suite550);
					comparaison();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression_suite552);
					expression();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expression_suite"



	// $ANTLR start "multOper"
	// Looc.g:79:1: multOper returns [int value] : ( ( '/' atom | '*' atom | '%' atom )+ |);
	public final int multOper() throws RecognitionException {
		int value = 0;


		try {
			// Looc.g:80:2: ( ( '/' atom | '*' atom | '%' atom )+ |)
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==11||LA28_0==14||LA28_0==20) ) {
				alt28=1;
			}
			else if ( (LA28_0==13||(LA28_0 >= 15 && LA28_0 <= 17)||LA28_0==19||LA28_0==23||LA28_0==29||LA28_0==44) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// Looc.g:81:3: ( '/' atom | '*' atom | '%' atom )+
					{
					// Looc.g:81:3: ( '/' atom | '*' atom | '%' atom )+
					int cnt27=0;
					loop27:
					while (true) {
						int alt27=4;
						switch ( input.LA(1) ) {
						case 20:
							{
							alt27=1;
							}
							break;
						case 14:
							{
							alt27=2;
							}
							break;
						case 11:
							{
							alt27=3;
							}
							break;
						}
						switch (alt27) {
						case 1 :
							// Looc.g:81:6: '/' atom
							{
							match(input,20,FOLLOW_20_in_multOper575); 
							pushFollow(FOLLOW_atom_in_multOper577);
							atom();
							state._fsp--;

							}
							break;
						case 2 :
							// Looc.g:82:5: '*' atom
							{
							match(input,14,FOLLOW_14_in_multOper583); 
							pushFollow(FOLLOW_atom_in_multOper586);
							atom();
							state._fsp--;

							}
							break;
						case 3 :
							// Looc.g:83:5: '%' atom
							{
							match(input,11,FOLLOW_11_in_multOper592); 
							pushFollow(FOLLOW_atom_in_multOper595);
							atom();
							state._fsp--;

							}
							break;

						default :
							if ( cnt27 >= 1 ) break loop27;
							EarlyExitException eee = new EarlyExitException(27, input);
							throw eee;
						}
						cnt27++;
					}

					}
					break;
				case 2 :
					// Looc.g:86:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "multOper"



	// $ANTLR start "oper"
	// Looc.g:88:1: oper returns [int value] : ( '+' atom multOper | '-' atom multOper )+ ;
	public final int oper() throws RecognitionException {
		int value = 0;


		try {
			// Looc.g:89:2: ( ( '+' atom multOper | '-' atom multOper )+ )
			// Looc.g:89:4: ( '+' atom multOper | '-' atom multOper )+
			{
			// Looc.g:89:4: ( '+' atom multOper | '-' atom multOper )+
			int cnt29=0;
			loop29:
			while (true) {
				int alt29=3;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==15) ) {
					alt29=1;
				}
				else if ( (LA29_0==17) ) {
					alt29=2;
				}

				switch (alt29) {
				case 1 :
					// Looc.g:89:5: '+' atom multOper
					{
					match(input,15,FOLLOW_15_in_oper620); 
					pushFollow(FOLLOW_atom_in_oper622);
					atom();
					state._fsp--;

					pushFollow(FOLLOW_multOper_in_oper624);
					multOper();
					state._fsp--;

					}
					break;
				case 2 :
					// Looc.g:90:4: '-' atom multOper
					{
					match(input,17,FOLLOW_17_in_oper630); 
					pushFollow(FOLLOW_atom_in_oper632);
					atom();
					state._fsp--;

					pushFollow(FOLLOW_multOper_in_oper634);
					multOper();
					state._fsp--;

					}
					break;

				default :
					if ( cnt29 >= 1 ) break loop29;
					EarlyExitException eee = new EarlyExitException(29, input);
					throw eee;
				}
				cnt29++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "oper"



	// $ANTLR start "atom"
	// Looc.g:94:1: atom returns [int value] : ( CSTE_ENT | IDF | '(' expression ')' );
	public final int atom() throws RecognitionException {
		int value = 0;


		try {
			// Looc.g:95:5: ( CSTE_ENT | IDF | '(' expression ')' )
			int alt30=3;
			switch ( input.LA(1) ) {
			case CSTE_ENT:
				{
				alt30=1;
				}
				break;
			case IDF:
				{
				alt30=2;
				}
				break;
			case 12:
				{
				alt30=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// Looc.g:95:9: CSTE_ENT
					{
					match(input,CSTE_ENT,FOLLOW_CSTE_ENT_in_atom661); 
					}
					break;
				case 2 :
					// Looc.g:96:9: IDF
					{
					match(input,IDF,FOLLOW_IDF_in_atom672); 
					}
					break;
				case 3 :
					// Looc.g:97:8: '(' expression ')'
					{
					match(input,12,FOLLOW_12_in_atom681); 
					pushFollow(FOLLOW_expression_in_atom683);
					expression();
					state._fsp--;

					match(input,13,FOLLOW_13_in_atom685); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "atom"



	// $ANTLR start "comparaison"
	// Looc.g:99:1: comparaison : ( '<' strict | '>' strict | '==' | '!=' );
	public final void comparaison() throws RecognitionException {
		try {
			// Looc.g:99:12: ( '<' strict | '>' strict | '==' | '!=' )
			int alt31=4;
			switch ( input.LA(1) ) {
			case 24:
				{
				alt31=1;
				}
				break;
			case 27:
				{
				alt31=2;
				}
				break;
			case 26:
				{
				alt31=3;
				}
				break;
			case 10:
				{
				alt31=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// Looc.g:99:14: '<' strict
					{
					match(input,24,FOLLOW_24_in_comparaison697); 
					pushFollow(FOLLOW_strict_in_comparaison699);
					strict();
					state._fsp--;

					}
					break;
				case 2 :
					// Looc.g:100:5: '>' strict
					{
					match(input,27,FOLLOW_27_in_comparaison705); 
					pushFollow(FOLLOW_strict_in_comparaison707);
					strict();
					state._fsp--;

					}
					break;
				case 3 :
					// Looc.g:101:5: '=='
					{
					match(input,26,FOLLOW_26_in_comparaison713); 
					}
					break;
				case 4 :
					// Looc.g:102:5: '!='
					{
					match(input,10,FOLLOW_10_in_comparaison719); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "comparaison"



	// $ANTLR start "strict"
	// Looc.g:104:1: strict : ( '=' |);
	public final void strict() throws RecognitionException {
		try {
			// Looc.g:104:7: ( '=' |)
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==25) ) {
				alt32=1;
			}
			else if ( ((LA32_0 >= CSTE_ENT && LA32_0 <= IDF)||LA32_0==12||LA32_0==17||LA32_0==39||LA32_0==43||LA32_0==45) ) {
				alt32=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// Looc.g:104:10: '='
					{
					match(input,25,FOLLOW_25_in_strict729); 
					}
					break;
				case 2 :
					// Looc.g:106:3: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "strict"

	// Delegated rules



	public static final BitSet FOLLOW_class_decl_in_program10 = new BitSet(new long[]{0x0001C30630000040L});
	public static final BitSet FOLLOW_var_decl_in_program13 = new BitSet(new long[]{0x0001C30620000040L});
	public static final BitSet FOLLOW_instruction_in_program16 = new BitSet(new long[]{0x0001830620000042L});
	public static final BitSet FOLLOW_28_in_class_decl29 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_IDF_CLASS_in_class_decl31 = new BitSet(new long[]{0x0000001002000000L});
	public static final BitSet FOLLOW_36_in_class_decl34 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_IDF_CLASS_in_class_decl36 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_class_decl40 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_class_decl42 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_class_decl43 = new BitSet(new long[]{0x0000404000002000L});
	public static final BitSet FOLLOW_class_item_decl_in_class_decl45 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_class_decl47 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_class_decl49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_decl_in_class_item_decl62 = new BitSet(new long[]{0x0000404000000002L});
	public static final BitSet FOLLOW_method_decl_in_class_item_decl65 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_46_in_var_decl80 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDF_in_var_decl82 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_var_decl84 = new BitSet(new long[]{0x0000042000000080L});
	public static final BitSet FOLLOW_type_in_var_decl86 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_var_decl88 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_var_decl90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_method_decl123 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDF_in_method_decl125 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_method_decl127 = new BitSet(new long[]{0x0000000000002040L});
	public static final BitSet FOLLOW_method_args_in_method_decl129 = new BitSet(new long[]{0x0000000000002040L});
	public static final BitSet FOLLOW_13_in_method_decl132 = new BitSet(new long[]{0x0001000000200000L});
	public static final BitSet FOLLOW_method_decl_suite_in_method_decl135 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_method_decl137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_method_decl_suite149 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_method_decl_suite150 = new BitSet(new long[]{0x0001C30620000040L});
	public static final BitSet FOLLOW_var_decl_in_method_decl_suite152 = new BitSet(new long[]{0x0001C30620000040L});
	public static final BitSet FOLLOW_instruction_in_method_decl_suite155 = new BitSet(new long[]{0x0003830620000040L});
	public static final BitSet FOLLOW_49_in_method_decl_suite158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_method_decl_suite167 = new BitSet(new long[]{0x0000042000000080L});
	public static final BitSet FOLLOW_type_in_method_decl_suite169 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_method_decl_suite171 = new BitSet(new long[]{0x0001C30620000040L});
	public static final BitSet FOLLOW_var_decl_in_method_decl_suite173 = new BitSet(new long[]{0x0001C30620000040L});
	public static final BitSet FOLLOW_instruction_in_method_decl_suite176 = new BitSet(new long[]{0x0003830620000040L});
	public static final BitSet FOLLOW_49_in_method_decl_suite179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_method_args192 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_method_args194 = new BitSet(new long[]{0x0000042000000080L});
	public static final BitSet FOLLOW_type_in_method_args196 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_16_in_method_args199 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDF_in_method_args201 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_method_args203 = new BitSet(new long[]{0x0000042000000080L});
	public static final BitSet FOLLOW_type_in_method_args205 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_IDF_in_instruction220 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_instruction222 = new BitSet(new long[]{0x0000288000821060L});
	public static final BitSet FOLLOW_definition_in_instruction224 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_instruction226 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_instruction227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_instruction233 = new BitSet(new long[]{0x0000288000021060L});
	public static final BitSet FOLLOW_expression_in_instruction235 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_instruction237 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_instruction239 = new BitSet(new long[]{0x0001830620000040L});
	public static final BitSet FOLLOW_instruction_in_instruction241 = new BitSet(new long[]{0x0001830760000040L});
	public static final BitSet FOLLOW_30_in_instruction245 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_instruction246 = new BitSet(new long[]{0x0001830620000040L});
	public static final BitSet FOLLOW_instruction_in_instruction248 = new BitSet(new long[]{0x0001830720000040L});
	public static final BitSet FOLLOW_32_in_instruction252 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_instruction253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_instruction259 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDF_in_instruction261 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_instruction263 = new BitSet(new long[]{0x0000288000021060L});
	public static final BitSet FOLLOW_expression_in_instruction265 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_instruction267 = new BitSet(new long[]{0x0000288000021060L});
	public static final BitSet FOLLOW_expression_in_instruction269 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_instruction272 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_instruction273 = new BitSet(new long[]{0x0001830620000040L});
	public static final BitSet FOLLOW_instruction_in_instruction275 = new BitSet(new long[]{0x00018306A0000040L});
	public static final BitSet FOLLOW_31_in_instruction278 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_instruction280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_instruction286 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_instruction288 = new BitSet(new long[]{0x0001C30620000040L});
	public static final BitSet FOLLOW_var_decl_in_instruction290 = new BitSet(new long[]{0x0001C30620000040L});
	public static final BitSet FOLLOW_instruction_in_instruction293 = new BitSet(new long[]{0x0001830620000140L});
	public static final BitSet FOLLOW_NEWLINE_in_instruction296 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_instruction298 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_instruction300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_instruction306 = new BitSet(new long[]{0x0000288000021060L});
	public static final BitSet FOLLOW_expression_start_in_instruction308 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_instruction310 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDF_in_instruction312 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_instruction314 = new BitSet(new long[]{0x0000288000021060L});
	public static final BitSet FOLLOW_expression_in_instruction316 = new BitSet(new long[]{0x0000000000012000L});
	public static final BitSet FOLLOW_16_in_instruction319 = new BitSet(new long[]{0x0000288000021060L});
	public static final BitSet FOLLOW_expression_in_instruction321 = new BitSet(new long[]{0x0000000000012000L});
	public static final BitSet FOLLOW_13_in_instruction325 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_instruction327 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_instruction329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_instruction335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_instruction341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_retour_in_instruction347 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_instruction349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_definition360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_print374 = new BitSet(new long[]{0x0000288000021070L});
	public static final BitSet FOLLOW_print_suite_in_print376 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_print378 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_print379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_print_suite388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CSTE_CHAINE_in_print_suite394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_read406 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDF_in_read408 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_read410 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_read412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_retour423 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_retour425 = new BitSet(new long[]{0x0000288000021060L});
	public static final BitSet FOLLOW_expression_in_retour427 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_retour429 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_retour431 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_retour433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_start_in_expression445 = new BitSet(new long[]{0x000000000D16CC00L});
	public static final BitSet FOLLOW_expression_suite_in_expression447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_expression_start461 = new BitSet(new long[]{0x0000288000021060L});
	public static final BitSet FOLLOW_expression_in_expression_start463 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_expression_start465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_expression_start471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_expression_start477 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CSTE_ENT_in_expression_start479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_expression_start485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_expression_start491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CSTE_ENT_in_expression_start497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_expression_start503 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_IDF_CLASS_in_expression_start505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_expression_suite517 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDF_in_expression_suite519 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_expression_suite521 = new BitSet(new long[]{0x0000288000021060L});
	public static final BitSet FOLLOW_expression_in_expression_suite523 = new BitSet(new long[]{0x0000000000012000L});
	public static final BitSet FOLLOW_16_in_expression_suite526 = new BitSet(new long[]{0x0000288000021060L});
	public static final BitSet FOLLOW_expression_in_expression_suite528 = new BitSet(new long[]{0x0000000000012000L});
	public static final BitSet FOLLOW_13_in_expression_suite532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multOper_in_expression_suite538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oper_in_expression_suite544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparaison_in_expression_suite550 = new BitSet(new long[]{0x0000288000021060L});
	public static final BitSet FOLLOW_expression_in_expression_suite552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_multOper575 = new BitSet(new long[]{0x0000000000001060L});
	public static final BitSet FOLLOW_atom_in_multOper577 = new BitSet(new long[]{0x0000000000104802L});
	public static final BitSet FOLLOW_14_in_multOper583 = new BitSet(new long[]{0x0000000000001060L});
	public static final BitSet FOLLOW_atom_in_multOper586 = new BitSet(new long[]{0x0000000000104802L});
	public static final BitSet FOLLOW_11_in_multOper592 = new BitSet(new long[]{0x0000000000001060L});
	public static final BitSet FOLLOW_atom_in_multOper595 = new BitSet(new long[]{0x0000000000104802L});
	public static final BitSet FOLLOW_15_in_oper620 = new BitSet(new long[]{0x0000000000001060L});
	public static final BitSet FOLLOW_atom_in_oper622 = new BitSet(new long[]{0x000000000012C800L});
	public static final BitSet FOLLOW_multOper_in_oper624 = new BitSet(new long[]{0x0000000000028002L});
	public static final BitSet FOLLOW_17_in_oper630 = new BitSet(new long[]{0x0000000000001060L});
	public static final BitSet FOLLOW_atom_in_oper632 = new BitSet(new long[]{0x000000000012C800L});
	public static final BitSet FOLLOW_multOper_in_oper634 = new BitSet(new long[]{0x0000000000028002L});
	public static final BitSet FOLLOW_CSTE_ENT_in_atom661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_atom672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_atom681 = new BitSet(new long[]{0x0000288000021060L});
	public static final BitSet FOLLOW_expression_in_atom683 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_atom685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_comparaison697 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_strict_in_comparaison699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_comparaison705 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_strict_in_comparaison707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_comparaison713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_comparaison719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_strict729 = new BitSet(new long[]{0x0000000000000002L});
}

package tests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import org.antlr.runtime.*;

import main.antlr.*;

public class GrammarTests {
	private static ANTLRFileStream input;
	private static LoocLexer lexer;
	private static CommonTokenStream tokens;
	private static LoocParser parser;
	
	private static void initTest(String filepath) throws Exception {
		input = new ANTLRFileStream(filepath);
		lexer = new LoocLexer(input);
		tokens = new CommonTokenStream(lexer);
		parser = new LoocParser(tokens);
	}

	@Test
	public void testClass() throws Exception {
		initTest("tests/class.looc");
		
		parser.program();
		
		if (parser.getNumberOfSyntaxErrors() > 0) {
			fail("Une erreur a été détectée.");
		}
	}
	
	@Test
	public void testFonction() throws Exception {
		initTest("tests/fonction.looc");
		
		parser.program();
		
		if (parser.getNumberOfSyntaxErrors() > 0) {
			fail("Une erreur a été détectée.");
		}
	}
	
	@Test
	public void testFor() throws Exception {
		initTest("tests/for.looc");
		
		parser.program();
		
		if (parser.getNumberOfSyntaxErrors() > 0) {
			fail("Une erreur a été détectée.");
		}
	}
	
	@Test
	public void testIfComp() throws Exception {
		initTest("tests/if_comp.looc");
		
		parser.program();
		
		if (parser.getNumberOfSyntaxErrors() > 0) {
			fail("Une erreur a été détectée.");
		}
	}
	
	@Test
	public void testIf() throws Exception {
		initTest("tests/if.looc");
		
		parser.program();
		
		if (parser.getNumberOfSyntaxErrors() > 0) {
			fail("Une erreur a été détectée.");
		}
	}
	
	@Test
	public void testPrio() throws Exception {
		initTest("tests/prio.looc");
		
		parser.program();
		
		if (parser.getNumberOfSyntaxErrors() > 0) {
			fail("Une erreur a été détectée.");
		}
	}
	
	@Test
	public void testRead() throws Exception {
		initTest("tests/read.looc");
		
		parser.program();
		
		if (parser.getNumberOfSyntaxErrors() > 0) {
			fail("Une erreur a été détectée.");
		}
	}
}

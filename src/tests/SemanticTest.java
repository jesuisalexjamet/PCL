package tests;

import static org.junit.Assert.*;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.junit.Test;

import main.compiler.Program;

public class SemanticTest {
	private static Program program;
	
	private static void initTest(String filepath) throws Exception {
		program = new Program(filepath, false, false, "");
	}
	
	@Test
	public void testAffectation() throws Exception {
		initTest("tests/semantic_affectation.looc");
		
		program.processAbstractTree();
		program.processSymbolTable();
		
		if (program.getSemanticErrorReporter().getErrorCount() == 0) {
			fail("Aucune erreurs sémantiques détectées.");
		}
	}

	@Test
	public void testArithmetic() throws Exception {
		initTest("tests/semantic_arithmetic.looc");
		
		program.processAbstractTree();
		program.processSymbolTable();
		
		if (program.getSemanticErrorReporter().getErrorCount() == 0) {
			fail("Aucune erreurs sémantiques détectées.");
		};
	}
	
	@Test
	public void testDivideByZero() throws Exception {
		initTest("tests/semantic_div0.looc");
		
		program.processAbstractTree();
		program.processSymbolTable();
		
		if (program.getSemanticErrorReporter().getErrorCount() == 0) {
			fail("Aucune erreurs sémantiques détectées.");
		}
	}
	
	@Test
	public void testLoop() throws Exception {
		initTest("tests/semantic_loop.looc");
		
		program.processAbstractTree();
		program.processSymbolTable();
		
		if (program.getSemanticErrorReporter().getErrorCount() == 0) {
			fail("Aucune erreurs sémantiques détectées.");
		}
	}
	
	@Test
	public void testMethod() throws Exception {
		initTest("tests/semantic_method.looc");
		
		program.processAbstractTree();
		program.processSymbolTable();
		
		if (program.getSemanticErrorReporter().getErrorCount() == 0) {
			fail("Aucune erreurs sémantiques détectées.");
		}
	}
}

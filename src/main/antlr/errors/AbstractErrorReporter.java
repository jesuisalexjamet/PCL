package main.antlr.errors;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.antlr.runtime.RecognitionException;

public abstract class AbstractErrorReporter {
	private int errorCount;
	private List<String> errors;

	public AbstractErrorReporter() {
		this.errorCount = 0;
		this.errors = new LinkedList<String>();
	}
	
	public void incrementErrorCount() {
		this.errorCount++;
	}
	
	public int getErrorCount() {
		return this.errorCount;
	}
	
	public List<String> getErrors() {
		return this.errors;
	}
	
	public final void reportError(String errorMessage) {
		this.errors.add(errorMessage);
		
		this.incrementErrorCount();
	}
	
	public final void reportError(String errorMessage, int line) {
		this.reportError(String.format("%1s <line: %2d>", errorMessage, line));
	}
	
	public final void reportError(String errorMessage, int line, int column) {
		this.reportError(String.format("%1s <line: %2d, column: %3d>", errorMessage, line, column));
	}
	
	public abstract void output() throws Exception;
}

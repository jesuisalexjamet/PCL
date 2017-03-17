package main.antlr.errors;

public class StdErrSyntaxErrorReporter extends AbstractSyntaxErrorReporter {

	public StdErrSyntaxErrorReporter() {
	}

	@Override
	public void output() {
		System.err.println("Parser has detected " + this.getErrorCount() + " syntax errors.");
		
		for (String message: this.getErrors()) {
			System.err.println("[Syntax Error] " + message);
		}
	}

}

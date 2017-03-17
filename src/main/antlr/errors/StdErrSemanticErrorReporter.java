package main.antlr.errors;

public class StdErrSemanticErrorReporter extends AbstractSemanticErrorReporter {

	public StdErrSemanticErrorReporter() {
	}

	@Override
	public void output() {
		System.err.println("Semantic analyser has detected " + this.getErrorCount() + " semantic errors.");
		
		for (String message: this.getErrors()) {
			System.err.println("[Semantic Error] " + message);
		}
	}

}

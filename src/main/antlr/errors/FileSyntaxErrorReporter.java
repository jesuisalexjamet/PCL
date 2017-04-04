package main.antlr.errors;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSyntaxErrorReporter extends AbstractSyntaxErrorReporter {
	private File outputFile;
	private FileWriter outputFileWriter;

	public FileSyntaxErrorReporter(String filepath) throws IOException {
		this.outputFile = new File(filepath);
		this.outputFileWriter = new FileWriter(this.outputFile, false);
	}

	@Override
	public void output() throws Exception {
		this.outputFileWriter.write("Syntax analyser has detected " + this.getErrorCount() + " syntax errors.\n");
		
		for (String message: this.getErrors()) {
			this.outputFileWriter.write("[Syntax Error] " + message + "\n");
		}
		
		this.outputFileWriter.close();
	}
}

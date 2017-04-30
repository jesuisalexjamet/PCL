package main.antlr.errors;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSemanticErrorReporter extends AbstractSemanticErrorReporter {
	private File outputFile;
	private FileWriter outputFileWriter;

	public FileSemanticErrorReporter(String filepath) throws IOException {
		this.outputFile = new File(filepath);
		this.outputFileWriter = new FileWriter(this.outputFile, true);
	}

	@Override
	public void output() throws Exception {
		this.outputFileWriter.write("Semantic analyser has detected " + this.getErrorCount() + " semantic errors.\n");
		
		for (String message: this.getErrors()) {
			this.outputFileWriter.write("[Semantic Error] " + message + "\n");
		}
		
		this.outputFileWriter.close();
	}
}

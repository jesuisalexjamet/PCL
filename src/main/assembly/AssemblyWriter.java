package main.assembly;

import java.io.*;

public class AssemblyWriter {
	
	private FileWriter assemblyFile;
	private File file;
	
	public AssemblyWriter(String name) {
		file = new File(name + ".asm");
		try {
			if (file.exists()) {
				assemblyFile = new FileWriter(file);				
			}
			else {
				System.out.println("Problem with file");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeInFile(String txt) {
		try {
			this.assemblyFile.write(txt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

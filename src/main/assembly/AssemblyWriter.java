package main.assembly;

import java.io.*;

public class AssemblyWriter {
	
	private FileWriter assemblyFile = null;
	private File file= null;
	
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
	
	public void writeInFile(String txt,String name) throws IOException {
		file = new File(name + ".asm");
		assemblyFile = new FileWriter(file);	
		//try {
			this.assemblyFile.write(txt);
		//} catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
			assemblyFile.close();
	}
	

}

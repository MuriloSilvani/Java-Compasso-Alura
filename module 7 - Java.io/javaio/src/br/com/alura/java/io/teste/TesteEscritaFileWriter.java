package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
	public static void main(String[] args) throws IOException {

//		FileOutputStream fileOut = new FileOutputStream("file.txt");
//		Writer output = new OutputStreamWriter(fileOut);
//		BufferedWriter bufferOut = new BufferedWriter(output);

		BufferedWriter bufferOut = new BufferedWriter(new FileWriter("file.txt"));
		
		bufferOut.write("linha 1");
		bufferOut.newLine();
		bufferOut.write("linha 2");

	
		bufferOut.close();
	}
}

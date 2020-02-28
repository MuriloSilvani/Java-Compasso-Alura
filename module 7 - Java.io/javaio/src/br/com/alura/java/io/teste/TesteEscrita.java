package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {

		FileOutputStream fileOut = new FileOutputStream("file.txt");
		Writer output = new OutputStreamWriter(fileOut);
		BufferedWriter bufferOut = new BufferedWriter(output);

		bufferOut.write("teste");
		bufferOut.newLine();
		bufferOut.write("teste");
		bufferOut.newLine();
	
		bufferOut.close();
	}
}

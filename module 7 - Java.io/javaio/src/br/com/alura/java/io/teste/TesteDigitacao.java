package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteDigitacao {

	public static void main(String[] args) throws IOException {

		InputStream file = System.in;
		Reader input = new InputStreamReader(file);
		BufferedReader buffer = new BufferedReader(input);
		
		FileOutputStream fileOut = new FileOutputStream("file2.txt");
		Writer output = new OutputStreamWriter(fileOut);
		BufferedWriter bufferOut = new BufferedWriter(output);

		String linha = buffer.readLine();
		while (linha != null && !linha.isEmpty()) {
			bufferOut.write(linha);
			bufferOut.newLine();
			linha = buffer.readLine();
		}
		
		buffer.close();
		bufferOut.close();
	}
}

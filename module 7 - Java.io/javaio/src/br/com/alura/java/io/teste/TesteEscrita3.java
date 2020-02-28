package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscrita3 {
	public static void main(String[] args) throws IOException {

//		FileOutputStream fileOut = new FileOutputStream("file.txt");
//		Writer output = new OutputStreamWriter(fileOut);
//		BufferedWriter bufferOut = new BufferedWriter(output);

//		BufferedWriter bufferOut = new BufferedWriter(new FileWriter("file.txt"));

		PrintStream ps = new PrintStream(new File("file3.txt"));
		PrintWriter pw = new PrintWriter(new File("file3.txt"));

		ps.println("teste");
		pw.println("teste");

	
		ps.close();
	}
}

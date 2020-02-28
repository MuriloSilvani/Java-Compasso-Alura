package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrata com arquivo

		// retorna binario
		FileInputStream file = new FileInputStream("file.txt");
		// retorna em caracteres
		Reader input = new InputStreamReader(file);
		// agrupa caracteres por linha string ou algo assim
		BufferedReader buffer = new BufferedReader(input);
		//

		String linha = buffer.readLine();
		while (linha != null) {
			System.out.println(linha);
			linha = buffer.readLine();
		}
		System.out.println("\n\n");
		buffer.close();

	}

}

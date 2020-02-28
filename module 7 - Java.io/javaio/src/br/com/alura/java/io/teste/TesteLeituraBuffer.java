package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TesteLeituraBuffer {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(new FileInputStream(new File("file.txt"))));
		
		while(bufferRead.readLine() != null) {
			String linha = bufferRead.readLine();
			System.out.println(linha);
		}
		
		
		bufferRead.close();
	}
}

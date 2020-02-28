package br.com.javabrasil;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

public class CEP {

	public static void main(String[] args) {

//		try {
//			URL url = new URL("http://viacep.com.br/ws/01001000/xml/");
//			HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
//			conexao.setRequestMethod("GET");
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		ViaCEPClient cliente = new ViaCEPClient();
		try {

			ViaCEPEndereco endereco = cliente.getEndereco("89802040");
			System.out.println(endereco.getLogradouro());
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}

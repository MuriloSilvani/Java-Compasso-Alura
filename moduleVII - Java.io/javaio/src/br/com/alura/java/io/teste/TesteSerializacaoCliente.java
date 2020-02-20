package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Murilo Silvani");
		cliente.setCpf("12350935906");
		cliente.setProfissao("Dev");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		oos.writeObject(cliente);
		oos.close();
		
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		cliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente.getNome());
	}
}

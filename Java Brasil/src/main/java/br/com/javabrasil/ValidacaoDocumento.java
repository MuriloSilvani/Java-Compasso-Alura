package br.com.javabrasil;

import java.io.IOException;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class ValidacaoDocumento {

	public static void main(String[] args) throws IOException {

//		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Digite o cpf:");
//		String bufferValue = buffer.readLine();

//		Validar cpf
		String cpf = "12350935906";

		try {
			validarDocumentos(new CPFValidator(), cpf);
			System.out.println("CPF V�LIDO");

		} catch (InvalidStateException e) {
			System.out.println("CPF INV�LIDO : " + e);
		}

//		Validar cnpj
		String cnpj = "82588641000173";

		try {
			validarDocumentos(new CNPJValidator(), cnpj);
			System.out.println("CNPJ V�LIDO");

		} catch (InvalidStateException e) {
			System.out.println("CNPJ INV�LIDO :" + e);
		}

//		Validar Titulo eleitor
		String tituloEleitor = "417453530116";

		try {
			validarDocumentos(new TituloEleitoralValidator(), tituloEleitor);
			System.out.println("T�TULO V�LIDO");

		} catch (InvalidStateException e) {
			System.out.println("T�TULO INV�LIDO :" + e);
		}
	}

	private static void validarDocumentos(Validator<String> validador, String documento) {
		validador.assertValid(documento);
	}

}

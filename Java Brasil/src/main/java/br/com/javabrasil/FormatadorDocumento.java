package br.com.javabrasil;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDocumento {

	public static void main(String[] args) {

		String cpf = "123.509.359-06";
		String cnpj = "82588641000173";
		String tituloEleitor = "417453530116";
		

		CNPJFormatter formatadorCNPJ = new CNPJFormatter();
		TituloEleitoralFormatter formatadorTituloEleitoral = new TituloEleitoralFormatter();
		
		System.out.println("CPF Sem formatar: " + cpf);
		System.out.println("CPF Com formatar: " + unformatarDocumento(new CPFFormatter(), cpf));
		
		System.out.println("CNPJ Sem formatar: " + cnpj);
		System.out.println("CNPJ Com formatar: " + formatadorCNPJ.format(cnpj));
		
		System.out.println("TituloEleitoral Sem formatar: " + tituloEleitor);
		System.out.println("TituloEleitoral Com formatar: " + formatadorTituloEleitoral.format(tituloEleitor));
		
		
		
	}

	private static String unformatarDocumento(Formatter formatador, String documento){
		return formatador.unformat(documento);
	}
}

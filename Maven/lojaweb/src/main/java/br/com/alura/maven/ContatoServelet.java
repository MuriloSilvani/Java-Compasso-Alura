package br.com.alura.maven;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.stella.tinytype.CPF;

@WebServlet(urlPatterns= {"/contato"})
public class ContatoServelet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Produto prod = new Produto("Produto nome", 99.99);
		
		String cpf = "12350935906";
		boolean cpfvalido = new CPF(cpf).isValido();
		
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"+cpf+"é valid? "+ cpfvalido +"</html>");
		
		writer.close();
	}
}

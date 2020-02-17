package br.com.alura.maven;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.stella.tinytype.CPF;

@WebServlet(urlPatterns= {"/teste"})
public class RotaTeste extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		PrintWriter writer = resp.getWriter();
		writer.println("<html> Teste </html>");
		
		writer.close();
	}
}

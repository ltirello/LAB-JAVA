package br.com.cursos.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	public class ClienteServlet extends HttpServlet {
		
	private static final long serialVersionUID = 1L;
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String filtro = request.getParameter("filtro");
		List<String> resultado = filtrarClientes(filtro);
		
		PrintWriter writer = response.getWriter();
		
		writer.write("<html><body>");
		writer.write("<ul>");
		
		for (String item : resultado) {
			writer.write("<li>" + item + "</li>");
			}
		
		writer.write("</ul>");
		writer.write("</body></html>");
	}
		private List<String> filtrarClientes(String filtro) {
		
		List<String> clientes = new ArrayList<String>();
		List<String> listafiltrado = new ArrayList<String>();
		
		clientes.add("Allan");
		clientes.add("Mundin");
		clientes.add("Lennin");
		clientes.add("Tulin");	
		clientes.add("Sergio");
		clientes.add("Lucas");
		clientes.add("Daniel");
		clientes.add("Ismael");
		clientes.add("Alexsandro");
		
		if(filtro != null && !filtro.equals("")) {
		   for(String cliente : clientes) {
			   if(cliente.toUpperCase().contains(filtro.toUpperCase()))
				   listafiltrado.add(cliente);
		   }
		} else {
			listafiltrado = clientes;
		}
		return listafiltrado;
		}

}

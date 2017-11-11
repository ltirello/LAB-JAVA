package br.com.cliente.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.cliente.model.Cliente;

public class ClienteDao {
	
	private List<Cliente> clientes; 
	
	public ClienteDao() {
	initMock();
	}
	
	private void iniMock() {
	
		clientes = new ArrayList<Cliente>();

		clientes.add(new cliente(1, "JANDEILSON", "Nascimento", 30, "99999"));
	}

		public List<Clientes> obterTodosClientes()  {
			return this.clientes;
		}
	
}

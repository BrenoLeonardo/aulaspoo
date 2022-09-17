package br.edu.senai.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.edu.senai.conexao.ConnectionFactory;
import br.edu.senai.model.Cliente;
import br.edu.senai.persistence.ClienteDao;


public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(null, "Roberta da Silva", "23232323", "robertas@hotmail.com");
		Cliente cliente2 = new Cliente(null, "Mariane", "23232344", "mariana@hotmail.com");
		
		Connection connection = new ConnectionFactory().getConnection();
		
		ClienteDao clienteDao = new ClienteDao(connection);
		try {
			connection.setAutoCommit(false);
			clienteDao.inserirCliente(cliente1);
			clienteDao.inserirCliente(cliente2);
			connection.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		//ClienteDao clienteDao = new ClienteDao();
		
		
		//clienteDao.inserirCliente(cliente);
		//clienteDao.atualizarCliente(cliente);
		//clienteDao.removerCliente(cliente);
		//System.out.println(clienteDao.listarClientes());
		
		//for (Cliente c : clienteDao.listarClientes()) {
			//System.out.println(c);
		//}
	//CRUD(CREATE RETRIEVE UPDATE DELETE)
		
		//System.out.println(clienteDao.listarClientes("dri"));
	}

}

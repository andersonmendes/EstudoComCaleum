package br.com.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.jdbc.ConnectionFactory;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
	Connection connection = new ConnectionFactory().getConnection();
	System.out.println("Conex�o aberta!");
	connection.close();
	}
}

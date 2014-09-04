package br.com.jdbc.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.jdbc.ConnectionFactory;

public class JDBCInsere {

	public static void main(String[] args) throws SQLException {
		
		Connection con = null;
		try {
			con = new ConnectionFactory().getConnection();
			
			String sql = "insert into contatos(nome,email,endereco,dataNascimento) values (?,?,?,?)";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, "Caleum");
			stmt.setString(2, "contato@caleum.com.br");
			stmt.setString(3, "R. Vergueiro 3185");
			stmt.setDate(4, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
			
			stmt.execute();
			stmt.close();
			
			System.out.println("Gravado!");
			con.close();
					
		} catch(SQLException e) {
			System.out.println(e);
		} finally {
			con.close();
		}
		
		

	}

}

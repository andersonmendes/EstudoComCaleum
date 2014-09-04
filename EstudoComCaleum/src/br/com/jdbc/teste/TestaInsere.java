package br.com.jdbc.teste;

import java.util.Calendar;

import br.com.jdbc.modelo.Contato;
import br.com.jdbc.modelo.ContatoDAO;

public class TestaInsere {
	public static void main(String[] args) {
	
	Contato contato = new Contato();
	
	contato.setNome("Anderson");
	contato.setEmail("anderson.mendes0@gmail.com");
	contato.setEndereco("Rua Jose Peixoto");
	contato.setDataNascimento(Calendar.getInstance());
	
	ContatoDAO dao = new ContatoDAO();
	dao.adiciona(contato);
	
	System.out.println("Gravado!");
	}
}

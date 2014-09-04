package br.com.jdbc.teste;

import br.com.jdbc.modelo.Contato;
import br.com.jdbc.modelo.ContatoDAO;

public class TestaAltera {
	public static void main(String[] args) {
	
		ContatoDAO dao = new ContatoDAO();
		Contato contato = new Contato();
		
		contato.setNome("Thereza Cristina");
		contato.setEmail("thereza@gmail.com");
		contato.setEndereco("Rua Captião Damasceno");
		contato.setId((long) 1);
		
		dao.altera(contato);
	
	
	}
}

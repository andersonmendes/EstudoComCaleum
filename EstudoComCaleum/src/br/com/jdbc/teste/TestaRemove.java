package br.com.jdbc.teste;

import br.com.jdbc.modelo.Contato;
import br.com.jdbc.modelo.ContatoDAO;

public class TestaRemove {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		
		Contato contato = new Contato();
		
		contato.setId((long)2);
		
		dao.remove(contato);

	}

}

package br.com.jdbc.teste;

import java.util.List;

import br.com.jdbc.modelo.Contato;
import br.com.jdbc.modelo.ContatoDAO;

public class TestaLista {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		
		List<Contato> contatos = dao.getLista();
		
		for(Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			  System.out.println("Email: " + contato.getEmail());
			  System.out.println("Endereço: " + contato.getEndereco());
			  System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "\n");
		}

	}

}

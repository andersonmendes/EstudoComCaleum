package br.com.jdbc.teste;

import java.util.List;
import java.util.Scanner;

import br.com.jdbc.modelo.Contato;
import br.com.jdbc.modelo.ContatoDAO;

public class TestaListaRefinada {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		Scanner leitura = new Scanner(System.in);
		
		
		System.out.println("Digite a 1ª letra do nome para refinar a busca: ");
		String letra = leitura.nextLine();
		
		List<Contato> contatos = dao.listaContatosRefinado(letra);
		
		for(Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			  System.out.println("Email: " + contato.getEmail());
			  System.out.println("Endereço: " + contato.getEndereco());
			  System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "\n");
		}

	}

}

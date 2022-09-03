package br.edu.senai.teste;

import br.edu.senai.tarefa.Cidade;
import br.edu.senai.tarefa.Contato;
import br.edu.senai.tarefa.Endereco;
import br.edu.senai.tarefa.Estado;
import br.edu.senai.tarefa.Telefone;

public abstract class TesteContato {

	public static void main(String[] args) {
		Estado estado1 = new Estado("Rio de Janeiro", "RJ");
		Cidade cidade1 = new Cidade("Petropólis", estado1);
		Endereco endereco1 = new Endereco("Fonseca","Ramos","181", cidade1);
		Telefone telefone1 = new Telefone("2234-1250");
		Telefone telefone2 = new Telefone("2237-1350");
		Contato contato1 = new Contato("Bruno",new Telefone[2], endereco1);
		
		contato1.setTelefone(telefone1);
		contato1.setTelenone(telefone2);
		
		System.out.println(contato1.getNome());
		contato1.getTelefones();
		
		
	}
}

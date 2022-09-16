package br.edu.senai.tarefa;

import java.util.ArrayList;

public class Contato {
	private String nome;
	//private Telefone[] telefones;
	//private Telefone[] - {new Telefone("1234567"), new Telefone("98765432");
	private ArrayList<Telefone> telefones = new ArrayList<>();
	private Endereco endereco;
	
	
	public Contato(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Telefone> getTelefones() {
		return telefones;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public void contaTelefones(Telefone telefone) {
			for	(Telefone telefones : telefones) {
				System.out.println();
		}
		/*
		 for (int i = 0; i < telefones.length; i++) {
			if(telefones[i] == null) {
				telefones[i] = telefone;
				break;
			} 
		 */
		
	}
}

	


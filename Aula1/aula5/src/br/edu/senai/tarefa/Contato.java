package br.edu.senai.tarefa;

public class Contato {
	private String nome;
	Telefone[] telefones;
	Endereco endereco;
	
	
	public Contato(String nome, Telefone[] telefones, Endereco endereco) {
		super();
		this.nome = nome;
		this.telefones = telefones;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public void contaTelefones(Telefone telefone) {
		for (int i = 0; i < telefones.length; i++) {
			if(telefones[i] == null) {
				telefones[i] = telefone;
				break;
			}
		}
		
	}
}

	


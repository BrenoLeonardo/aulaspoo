package br.org.senai.tarefaExercicio;

public class Proprietario {
	private String nome;

	public Proprietario(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Proprietario [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}
	
}

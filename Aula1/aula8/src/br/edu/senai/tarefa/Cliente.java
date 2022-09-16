package br.edu.senai.tarefa;

public class Cliente {
	private Integer id;
	private String nome; 
	private Integer idade;
	private String telefone;
	
	public Cliente(Integer id, String nome, Integer idade, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}
	
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + "]";
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getTelefone() {
		return telefone;
	}
	
	
}

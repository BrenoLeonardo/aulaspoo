package br.org.serratec.tarefas;

public class Funcionario {
	private String nome;
	private Double salario;
	
	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}

	public Double getSalario() {
		return salario;
	}

	public Double calcularInss() {
		Double inss = salario * 0.11;
		return inss;
	}
	
	public Double calcularValeTransporte() {
		Double vale = salario * 0.06;
		return vale;
	}
}

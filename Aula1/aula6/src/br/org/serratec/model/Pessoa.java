package br.org.serratec.model;

public class Pessoa implements Tributacao {
	private String nome;
	private Double rendimentos;
	
	public Pessoa(String nome, Double rendimentos) {
		this.nome = nome;
		this.rendimentos = rendimentos;
	}
	
	public String toString() {
		return "Pessoa [nome=" + nome + ", rendimentos=" + rendimentos + "]";
	}

	public String getNome() {
		return nome;
	}

	public Double getRendimentos() {
		return rendimentos;
	}

	public Double calcularImpostoDeRenda() {
		return rendimentos * impostoDeRendaPF;
	}

	public Double calcularICMS() {
		return 0.0;
	}

}

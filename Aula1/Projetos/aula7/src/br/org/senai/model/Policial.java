package br.org.senai.model;

//essa classe não poderá ter filhos  (fez vasectomia)
//Imutável math
//public final class Policial {
public class Policial{
	private String nome;
	private String matricula;
	
	public Policial(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	
	//quando coloca o final do método estamos proibindo a sobrescrita
	public final String toString() {
		return "Policial [nome=" + nome + ", matricula=" + matricula + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}
	
	
}

package br.edu.senai.tarefa;

public class Atleta {
	private String atleta;
	private Integer idade;
	private String posicao;
	
	public Atleta(String atleta, Integer idade, String posicao) {
		super();
		this.atleta = atleta;
		this.idade = idade;
		this.posicao = posicao;
	}
	
	public String toString() {
		return "Atleta [atleta=" + atleta + "]";
	}

	public String getAtleta() {
		return atleta;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getPosicao() {
		return posicao;
	}

}

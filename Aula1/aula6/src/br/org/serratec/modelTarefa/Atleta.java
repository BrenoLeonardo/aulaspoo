package br.org.serratec.modelTarefa;

public class Atleta implements Olimpiadas {
	private String nome;
	private Double peso;
	private String modalidade;
	private Pais pais;
	private static int totalParticipantes;
	
	public Atleta(String nome, Double peso, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
		
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getNome() {
		return nome;
	}

	public Double getPeso() {
		return peso;
	}

	public Pais getPais() {
		return pais;
	}
	
	public String verificaSituacao() {
		if(peso > 90) {
			setModalidade("Peso pesado");
			totalParticipantes++;
			return "participará";
		}else if(peso <= 90 && peso >= 60) {
			setModalidade("Peso médio");
			totalParticipantes++;
			return "paticipará";
		}else {
			return "não participará";
		}
	}
	
	public static int getTotalParticipantes() {
		return totalParticipantes;
	}
	
	
}

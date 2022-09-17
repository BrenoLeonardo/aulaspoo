package br.edu.senai.model;

public class Time {
	private String nomeTime;
	private String treinador;
	private Atleta[] atletas;
	
	public Time(String nomeTime, String treinador, Atleta[] atletas) {
		super();
		this.nomeTime = nomeTime;
		this.treinador = treinador;
		this.atletas = atletas;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public String getTreinador() {
		return treinador;
	}

	public Atleta[] getAtleta() {
		return atletas;
	}
	
	public void adicionarAtletas(Atleta atleta) {
		for(int i = 0; i < atletas.length; i++) {
			if(atletas[i]  == null) {
				atletas[i] = atleta;
				break;
			}
		}
	}
	
	public void listaAtletas() {
		for (int i = 0; i < atletas.length; i++) {
			System.out.println("Nome dos atletas: "+atletas[i].getNomeAtleta());
		}
	}
}

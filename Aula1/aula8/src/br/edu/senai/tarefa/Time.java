package br.edu.senai.tarefa;

public class Time {
	private String nomeTime;
	private String tecnico;
	private String diretor;
	
	public Time(String nomeTime, String tecnico, String diretor) {
		super();
		this.nomeTime = nomeTime;
		this.tecnico = tecnico;
		this.diretor = diretor;
	}
	
	public String toString() {
		return "Time [nomeTime=" + nomeTime + "]";
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public String getTecnico() {
		return tecnico;
	}

	public String getDiretor() {
		return diretor;
	}
	
}

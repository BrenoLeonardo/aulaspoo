package br.org.senai.model;

import br.org.senai.enums.PeriodoCurso;

public class Curso {
	private String nome;
	private PeriodoCurso periodo;
	
	public Curso(String nome, PeriodoCurso periodo) {
		super();
		this.nome = nome;
		this.periodo = periodo;
	}
	
	public String toString() {
		return "Curso [nome=" + nome + ", periodo=" + periodo + "]";
	}

	public String getNome() {
		return nome;
	}

	public PeriodoCurso getPeriodo() {
		return periodo;
	}
}

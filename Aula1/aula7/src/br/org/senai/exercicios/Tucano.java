package br.org.senai.exercicios;

import java.time.LocalDate;

public class Tucano extends Ave {
	private Double peso;
	
	
	public Tucano(String nome, LocalDate dataVacinacao, String cor, Double peso) {
		super(nome, dataVacinacao, cor);
		this.peso = peso;
	}

	public Double getPeso() {
		return peso;
	}

	public String voar() {
		
		return null;
	}

	public String emitirSom() {
		
		return null;
	}

}

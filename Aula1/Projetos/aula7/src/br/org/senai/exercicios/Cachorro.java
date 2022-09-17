package br.org.senai.exercicios;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements AnimalDomestico {
	private Boolean castrado;

	public Cachorro(String nome, LocalDate dataVacinacao, String raca, Boolean castrado) {
		super(nome, dataVacinacao, raca);
		this.castrado = castrado;
	}

	
	public Boolean getCastrado() {
		return castrado;
	}


	public boolean levarVeterinario() {
		
		return null;
	}

	
	public boolean alimentar() {
		
		return null;
	}

}

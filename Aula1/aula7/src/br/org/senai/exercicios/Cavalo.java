package br.org.senai.exercicios;

import java.time.LocalDate;

public class Cavalo extends Mamifero implements AnimalCompeticao{
	private String marcaFerradura;
	
	public Cavalo(String nome, LocalDate dataVacinacao, String raca, String marcaFerradura) {
		super(nome, dataVacinacao, raca);
		this.marcaFerradura = marcaFerradura;
	}
	
	public String getMarcaFerradura() {
		return marcaFerradura;
	}



	public void amamentar() {

	}

	public String emitirSom() {

		return null;
	}
	
	public void trocarFerradura() {
		
	}
	
	public void viajar() {
		
	}

}

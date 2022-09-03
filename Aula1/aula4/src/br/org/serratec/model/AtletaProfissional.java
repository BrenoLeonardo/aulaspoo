package br.org.serratec.model;

public class AtletaProfissional extends Maratona {
	private Double peso;

	public AtletaProfissional(String nome, String sexo, Integer idade, Double altura, Double peso) {
		super(nome, sexo, idade, altura);
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Peso: "+peso;
	}

	public Double getPeso() {
		return peso;
	}
	
	
}

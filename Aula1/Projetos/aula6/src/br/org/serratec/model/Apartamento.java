package br.org.serratec.model;

public class Apartamento extends Imovel{
	private Integer andar;

	public Apartamento(String local, Double valor, Integer andar) {
		super(local, valor);
		this.andar = andar;
	}
	
	public String toString() {
		return super.toString() +" Apartamento: " + andar;
	}

	public Integer getAndar() {
		return andar;
	}
	
}

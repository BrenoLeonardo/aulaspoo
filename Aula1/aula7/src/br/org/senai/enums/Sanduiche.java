package br.org.senai.enums;

public enum Sanduiche {
	HAMBURGUER("Hamburguer",20.0),
	MISTO("Misto Quente", 8.0),
	HOTDOG("Cachorro Quente",12.0);
	
	private String tipoSanduiche;
	private Double valor;
	
	private Sanduiche(String tipoSanduiche, Double valor) {
		this.tipoSanduiche = tipoSanduiche;
		this.valor = valor;
	}

	public String getTipoSanduiche() {
		return tipoSanduiche;
	}

	public Double getValor() {
		return valor;
	}
	
	public String toString() {
		return "Tipo: "+tipoSanduiche+"\nvalor: "+valor;
	}
}

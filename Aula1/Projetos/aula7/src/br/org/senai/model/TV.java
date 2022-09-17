package br.org.senai.model;

import br.org.senai.enums.MarcaTV;

public class TV {
	private String modelo;
	private Double tamanho;
	private MarcaTV marca;
	
	public TV(String modelo, Double tamanho, MarcaTV marca) {
		super();
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.marca = marca;
	}

	public String toString() {
		return "TV [modelo=" + modelo + ", tamanho=" + tamanho + ", marca=" + marca + "]";
	}

	public String getModelo() {
		return modelo;
	}

	public Double getTamanho() {
		return tamanho;
	}

	public MarcaTV getMarca() {
		return marca;
	}	
}

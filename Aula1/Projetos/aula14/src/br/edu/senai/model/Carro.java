package br.edu.senai.model;

import java.util.Optional;

public class Carro {
	private String marca;
	private String modelo;
	private Optional<Seguro> seguro;
	
	public Carro(String marca, String modelo, Optional<Seguro> seguro) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.seguro = seguro;
	}

	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", seguro=" + seguro + "]";
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public Optional<Seguro> getSeguro() {
		return seguro;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setSeguro(Optional<Seguro> seguro) {
		this.seguro = seguro;
	}
	
	
	
}

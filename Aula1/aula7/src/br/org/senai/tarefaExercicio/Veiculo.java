package br.org.senai.tarefaExercicio;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina{
	protected String modelo;
	protected Double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	
	public Veiculo(String modelo, Double valorCobrado, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.valorCobrado = valorCobrado;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	public String toString() {
		return "Veiculo [modelo=" + modelo + ", valorCobrado=" + valorCobrado + ", dataConserto=" + dataConserto
				+ ", proprietario=" + proprietario + "]";
	}

	public String getModelo() {
		return modelo;
	}

	public Double getValorCobrado() {
		return valorCobrado;
	}

	public LocalDate getDataConserto() {
		return dataConserto;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

}	

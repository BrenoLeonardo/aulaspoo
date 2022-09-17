package br.org.serratec.model;

public class Imovel {
	protected String local;
	protected Double valor;
	protected Proprietario proprietario;
	
	public Imovel(String local, Double valor) {
		super();
		this.local = local;
		this.valor = valor;
	}
	
	public String toString() {
		return "Local: "+local+"- Valor: "+valor;
	}

	public String getLocal() {
		return local;
	}

	public Double getValor() {
		return valor;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	
	//CALCULAR O ITBI SOBRE 3.5% DO VALOR DA VENDA
	public Double calcularITBI() {
		return valor * 0.035;
	}
	
	
}

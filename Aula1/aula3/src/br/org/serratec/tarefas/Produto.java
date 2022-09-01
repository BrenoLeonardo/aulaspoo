package br.org.serratec.tarefas;

public class Produto {
	private String descricao;
	private Double valor;
	Integer quantidade;
	
	public Produto(String descricao, Double valor, Integer quantidade) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public Double getValor() {
		return valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}
	
	public Double Total(){
		Double total = quantidade * valor;
		return total;
	}

	public Double calcularIcms() {
		Double icms = Total() * 0.12;
		return icms;
	}
	

}

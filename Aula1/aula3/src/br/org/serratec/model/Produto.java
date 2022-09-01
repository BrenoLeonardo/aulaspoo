package br.org.serratec.model;

public class Produto {
	private Integer codigo;
	private String descricao;
	private Double valor;
	//Este atributo pertence a classe 
	private static int totalProdutos;
	
	//Main - não pode fazer new Produto()
	public Produto(Integer codigo, String descricao, Double valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		totalProdutos++;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getValor() {
		return valor;
	}

	public static int getTotalProdutos() {
		return totalProdutos;
	}
	
	
}

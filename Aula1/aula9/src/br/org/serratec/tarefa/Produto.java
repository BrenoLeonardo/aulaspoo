package br.org.serratec.tarefa;

import java.time.LocalDate;

public class Produto extends Venda{
	private Integer codigo;
	private String descricao;
	private Double valor;
	private Categoria categoria;
	
	public Produto(Produto produto, LocalDate dataCompra, Integer quantidade, Integer codigo, String descricao,
			Double valor, Categoria categoria) {
		super(produto, dataCompra, quantidade);
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.categoria = categoria;
	}

	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", valor=" + valor + ", categoria="
				+ categoria + "]";
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

	public Categoria getCategoria() {
		return categoria;
	}
	
	public void calcularVenda() {
		double calcular = valor * quantidade;
	}
	
	public void mostrarVenda() {
		calcularVenda();
	}
	
	
}

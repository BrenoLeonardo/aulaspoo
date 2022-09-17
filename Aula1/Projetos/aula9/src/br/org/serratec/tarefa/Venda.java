package br.org.serratec.tarefa;

import java.time.LocalDate;

public abstract class Venda implements FinalizarVenda {
	protected Produto produto;
	protected LocalDate dataCompra;
	protected Integer quantidade;
	protected static Double valorTotal;

	public Venda(Produto produto, LocalDate dataCompra, Integer quantidade) {
		super();
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
	}

	public String toString() {
		return "Venda [produto=" + produto + ", quantidade=" + quantidade + "]";
	}

	
	public Produto getProduto() {
		return produto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public static Double getValorTotal() {
		return valorTotal;
	}
	
	public abstract void calcularVenda();
	
	public abstract void mostrarVenda();
	
	
	
	
	
}

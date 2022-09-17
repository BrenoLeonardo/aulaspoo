package br.org.serratec.modelTarefa;

public class Operacao implements Livraria{
	protected String tipo;
	protected Double ValorOperacao;
	protected Livro livro;
	
	public Operacao(String tipo, Livro livro) {
		super();
		this.tipo = tipo;
		this.livro = livro;
	}
	
	public String toString() {
		return "Tipo: " + tipo + ", Valor: "+ String.format("%.2f", ValorOperacao);
		}
		
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public String getTipo() {
		return tipo;
	}

	public Double getValorOperacao() {
		return ValorOperacao;
	}
	
	public void emprestarLivro() {
		ValorOperacao = livro.getValor() * 2/100 + taxaEmprestimo;
	}
	
	public void venderLivro() {
		ValorOperacao = livro.getValor() * 1.09;
	}
}

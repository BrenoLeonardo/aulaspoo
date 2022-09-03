package br.org.serratec.modelTarefa;

public class Operacao implements Livraria{
	protected String tipo;
	protected Double ValorOperacao;
	protected Livro livro;
	
	public Operacao(String tipo, Double valorOperacao, Livro livro) {
		super();
		this.tipo = tipo;
		ValorOperacao = valorOperacao;
		this.livro = livro;
	}
	
	public String toString() {
		return "Operacao [tipo=" + tipo + ", ValorOperacao=" + ValorOperacao + ", livro=" + livro + "]";
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
	
	public void venderLivro() {
		valorOperacao = valor * 1.09;
	}
	
	public void emprestarLivro() {
		valorOperacao = valor * 1.02 + taxaEmprestimo;
	}
	
}

package br.org.serratec.modelTarefa;

public class Livro extends Operacao {
	private String autor;
	private String titulo;
	private Double valor;
	
	public Livro(String tipo, Double valorOperacao, Livro livro, String autor, String titulo, Double valor) {
		super(tipo, valorOperacao, livro);
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}
	
	public String toString() {
		return "Livro [autor=" + autor + ", titulo=" + titulo + ", valor=" + valor + "]";
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public Double getValor() {
		return valor;
	}
	
	public void reajusste() {
		
	}
}

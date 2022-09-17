package br.org.serratec.modelTarefa;

public class Livro {
	private String autor;
	private String titulo;
	private Double valor;
	
	public Livro(String autor, String titulo, Double valor) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}

	public String toString() {
		return "\nAutor: " + autor + ", título: " + titulo;
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
	
	public void reajusste(Double valor) {
		this.valor = this.valor + this.valor * valor/100;
	}
}

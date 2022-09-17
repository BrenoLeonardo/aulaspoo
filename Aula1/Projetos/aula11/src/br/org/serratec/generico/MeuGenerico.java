package br.org.serratec.generico;

public class MeuGenerico <T> {
	private T valor;

	public MeuGenerico(T valor) {
		this.valor = valor;
	}

	public T getValor() {
		return valor;
	}

	public String toString() {
		return "MeuGenerico [valor=" + valor + "]";
	}
	
	
}

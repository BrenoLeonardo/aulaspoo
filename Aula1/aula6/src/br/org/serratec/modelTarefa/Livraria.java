package br.org.serratec.modelTarefa;

public interface Livraria {
	Double taxaEmprestimo = 2.0;
	
	void emprestarLivro(Double valor);
	
	void venderLivro(Double valor);
}

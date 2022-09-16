package br.org.senai.model;

/**
 * @author breno
 *
 */
public class PolicialFederal extends Policial {
	private final String lotacao;

	public PolicialFederal(String nome, String matricula, String lotacao) {
		super(nome, matricula);
		this.lotacao = lotacao;
	}

	public String getLotacao() {
		return lotacao;
	}
	
	
	
}

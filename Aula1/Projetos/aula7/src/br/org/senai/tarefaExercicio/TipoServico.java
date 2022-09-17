package br.org.senai.tarefaExercicio;

public enum TipoServico {
	OLEO(100.0),LAVAGEM(50.0),REVISAO(200.0);
	
	private Double ValorPorServico;

	private TipoServico(Double valorPorServico) {
		ValorPorServico = valorPorServico;
	}

	public Double getValorPorServico() {
		return ValorPorServico;
	}
	
}

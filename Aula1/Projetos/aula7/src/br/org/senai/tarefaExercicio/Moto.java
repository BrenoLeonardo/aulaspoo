package br.org.senai.tarefaExercicio;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private Integer cilindradas;

	public Moto(String modelo, Double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			Integer cilindradas) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	public Double lavarVeiculo() {
		return TipoServico.LAVAGEM.getValorPorServico();
		
	}

	public Double trocarOleo() {
		return TipoServico.OLEO.getValorPorServico();
	}

	@Override
	public Double revisao() {
		return TipoServico.REVISAO.getValorPorServico();
		
	}

}

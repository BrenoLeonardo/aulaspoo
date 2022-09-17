package br.org.senai.tarefaExercicio;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Carro extends Veiculo {
	private String categoria;

	public Carro(String modelo, Double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			String categoria) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public Double lavarVeiculo(){
		return TipoServico.LAVAGEM.getValorPorServico();
	}
	
	//LocalDate agora = LocalDate.now();
	//sysTem.out.println(agora);
	//System.out.println(agora.getDayOfWeek());
	//System.out.println(agora.getDayOfWeek().equals(DayOfWeek.TUESDAY);

	public Double trocarOleo() {
		if(!dataConserto.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
			return TipoServico.OLEO.getValorPorServico();
		}else {
			return "Valor: "+ ValorPorServico - 50.0;
		}
			
	}

	public Double revisao() {
		return TipoServico.REVISAO.getValorPorServico();
	}
	
}

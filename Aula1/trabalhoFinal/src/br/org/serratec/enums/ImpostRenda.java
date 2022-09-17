package br.org.serratec.enums;

public enum ImpostRenda {
	
	DESCONTO1(1903.98, 0., 0.),
	DESCONTO2(2826.65, 0.075, 142.80),
	DESCONTO3(3751.05, 0.15, 354.80),
	DESCONTO4(4664.68, 0.225, 636.13),
	DESCONTO5(null, 0.275, 869.36);
	
	
	private Double salario;
	private Double aliquota;
	private Double deduzir;
	
	
	private ImpostRenda(Double salario, Double aliquota, Double deduzir) {
		this.salario = salario;
		this.aliquota = aliquota;
		this.deduzir = deduzir;
	}


	public Double getSalario() {
		return salario;
	}


	public Double getAliquota() {
		return aliquota;
	}


	public Double getDeduzir() {
		return deduzir;
	}
	
	
}
	


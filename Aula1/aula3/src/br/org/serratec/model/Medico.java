package br.org.serratec.model;

public class Medico {
	private Integer crm;
	private String nome;
	private Double salario;
	private Double valorConsulta;
	private static Integer contador;
	
	public Medico(Integer crm, String nome, Double salario, Double valorConsulta) {
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
		contador++;
	}

	public Integer getCrm() {
		return crm;
	}

	public String getNome() {
		return nome;
	}

	public Double getSalario() {
		return salario;
	}

	public Double getValorConsulta() {
		return valorConsulta;
	}
	
	public static int getContador() {
		return contador;
	}
	
	public static int setContador() {
		return contador;
	}

	public void setCrm(Integer crm) {
		this.crm = crm;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void setValorConsulta(Double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

	public static void setContador(Integer contador) {
		Medico.contador = contador;
	}

	public void PagamentoDinheiro() {
		salario += valorConsulta;
	}
	
	public void PagamentoPlanoDeSaude() {
		salario = salario + valorConsulta * 0.70;
	}
}

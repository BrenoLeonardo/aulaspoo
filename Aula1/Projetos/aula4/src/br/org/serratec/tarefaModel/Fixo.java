package br.org.serratec.tarefaModel;

public class Fixo extends Vendedor {
	private Double salarioBase;
	private Double comissao;
	private Double salarioBruto;
	
	public Fixo(String nome, String cpf, Double salarioBase, Double comissao) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
		
	}

	public String toString() {
		return "Nome: "+ nome+"\nsalário Bruto: " + salarioBruto+"\n";
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public void calcularSalario(Double valorVenda) {
		Double calculoComissao = valorVenda * comissao/100;
		salarioBruto += calculoComissao;
		
	}
	
}

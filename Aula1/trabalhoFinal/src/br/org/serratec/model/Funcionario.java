package br.org.serratec.model;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import br.org.serratec.enums.ImpostRenda;
import br.org.serratec.interfaces.Calculos;


public class Funcionario extends Pessoa implements Calculos {
	protected Double salarioBruto;
	protected Double descontoINSS;
	protected Double descontoIR;
	protected Set <Dependente> dependentes;
	protected Double salarioLiquido;
	protected Double descontoDependente = 0.;

	public Funcionario(String nomeFunc, String cpfFunc, LocalDate dataNascFunc, Double salarioBruto) {
		super(nomeFunc, cpfFunc, dataNascFunc);
		this.salarioBruto = salarioBruto;
		dependentes = new HashSet<Dependente>();
		}
	@Override
	public String toString() {
		return "Funcionario: Nome = " + nome + ", CPF: " + cpf + ", Data de Nascimento: " + dataNascimento + ", Salario Bruto = R$ " + salarioBruto;
	}

	
	public Set<Dependente> getDependentes() {
		return dependentes;
	}
	public void setDependentes(Set<Dependente> dependentes) {
		this.dependentes = dependentes;
	}
	public Double getSalarioBruto() {
		return salarioBruto;
	}
	public Double getDescontoINSS() {
		return descontoINSS;
	}
	public Double getDescontoIR() {
		return descontoIR;
	}
	public Double getSalarioLiquido() {
		return salarioLiquido;
	}
	public Double getDescontoDependente() {
		return descontoDependente;
	}
	
	public void calcularINSS() {
		if (salarioBruto <= 1212.00) {
			descontoINSS = salarioBruto * 0.075;
		} else if (salarioBruto > 1212.00 && salarioBruto <= 2427.35) {
			descontoINSS = salarioBruto * 0.09;
		} else if (salarioBruto > 2427.35 && salarioBruto <= 3641.03) {
			descontoINSS = salarioBruto * 0.12;
		} else if (salarioBruto > 3641.03 && salarioBruto <= 7087.22) {
			descontoINSS = salarioBruto * 0.14;
		} else {
			descontoINSS = 7087.22 * 0.14;

		}
	}

	@Override
	public void calcularSalarioLiquido() {
		salarioLiquido = salarioBruto - descontoINSS - descontoIR;
	}

	@Override
	public void calcularIDR() {
				if (salarioBruto < ImpostRenda.DESCONTO1.getSalario()) {
					descontoIR = (salarioBruto - descontoDependente - descontoINSS);
				} else if (salarioBruto >= ImpostRenda.DESCONTO1.getSalario() && salarioBruto <= ImpostRenda.DESCONTO2.getSalario()) {
					descontoIR = ((salarioBruto - descontoDependente - descontoINSS)* ImpostRenda.DESCONTO2.getAliquota()) - ImpostRenda.DESCONTO2.getDeduzir();
				} else if (salarioBruto >= ImpostRenda.DESCONTO2.getSalario() && salarioBruto <= ImpostRenda.DESCONTO3.getSalario()) {
					descontoIR = ((salarioBruto - descontoDependente - descontoINSS)* 0.15) - 354.80;
				} else if (salarioBruto > ImpostRenda.DESCONTO3.getSalario() && salarioBruto <= ImpostRenda.DESCONTO4.getSalario()) {
					descontoIR = ((salarioBruto - descontoDependente - descontoINSS)* 0.225) - 636.13;
				} else {
					descontoIR = ((salarioBruto - descontoDependente - descontoINSS)* 0.275) - 869.36;	
				}
	}

	//@Override
	//public void adicionarDependentes(Dependente dependente) {
	//dependentes.add(dependente);
	//}

}

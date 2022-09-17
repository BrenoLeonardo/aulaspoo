package br.edu.senai.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Set;

import br.edu.senai.exceptions.ExceptionIdade;
import br.org.serratec.Interface.ImplementaCalculos;
import br.org.serratec.pessoaAbstract.Pessoa;

public class Funcionario extends Pessoa implements ImplementaCalculos {
	private Double salarioBruto;
	private Double descontoINSS;
	private Double descontoIR;
	private Double salarioLiquido;
	private Double descontoDependente = 0.;
	private Set<Dependente> dependentes;

	public Funcionario(String nome, String cpf, LocalDate dataNascimento, Double salarioBruto,
			Set<Dependente> dependentes) {
		super(nome, cpf, dataNascimento);
		this.salarioBruto = salarioBruto;
		this.dependentes = dependentes;
		descontoDependente();
		calcularINSS();
		calcularIDR();
		calcularSalarioLiquido();
	}

	@Override
	public String toString() {
		return super.toString() + " salarioBruto:" + salarioBruto + ", dependentes: " + dependentes;
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

	public void calcularINSS() {

		if (salarioBruto <= 1212.00) {
			descontoINSS = salarioBruto * 0.075;
		} else if (salarioBruto > 1212.00 && salarioBruto <= 2427.35) {
			descontoINSS = (salarioBruto * 0.09) - 18.18;
		} else if (salarioBruto > 2427.35 && salarioBruto <= 3641.03) {
			descontoINSS = (salarioBruto * 0.12) - 91.00;
		} else if (salarioBruto > 3641.03 && salarioBruto <= 7087.22) {
			descontoINSS = (salarioBruto * 0.14) - 163.82;
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
		Double baseCalculo = (salarioBruto - descontoDependente - descontoINSS);
		
		if (baseCalculo < 1903.98) {
			descontoIR = 0.0;
		} else if (baseCalculo >= 1903.98 && baseCalculo <= 2826.65) {
			descontoIR = (baseCalculo * 0.075) - 142.80;
		} else if (baseCalculo >= 2826.66 && baseCalculo <= 3751.05) {
			descontoIR = (baseCalculo * 0.15) - 354.80;
		} else if (baseCalculo > 3751.06 && baseCalculo <= 4664.68) {
			descontoIR = (baseCalculo * 0.225) - 636.13;
		} else {
			descontoIR = (baseCalculo * 0.275) - 869.36;
		}
	}

	@Override
	public void descontoDependente() {
		for (Dependente dependente : dependentes) {
			LocalDate dataAtual = LocalDate.now();

			Period period = Period.between(dependente.getDataNascimento(), dataAtual);
			if (period.getYears() < 18 || period.getYears() > 0) {
				descontoDependente += 189.59;
			}

		}

	}

}


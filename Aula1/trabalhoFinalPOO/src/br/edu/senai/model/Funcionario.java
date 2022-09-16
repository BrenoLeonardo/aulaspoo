package br.edu.senai.model;

import java.time.LocalDate;

import br.org.serratec.Interface.ImplementaCalculos;
import br.org.serratec.pessoaAbstract.Pessoa;

public class Funcionario extends Pessoa implements ImplementaCalculos {
	private Double salarioBruto;
	private Double descontoINSS;
	private Double descontoIR;
	private Double salarioLiquido;
	private Double descontoDependente = 0.;

	public Funcionario(String nome, String cpf, LocalDate dataNascimento, Double salarioBruto) {
		super(nome, cpf, dataNascimento);
		this.salarioBruto = salarioBruto;
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
				if (salarioBruto < 1903.98) {
					descontoIR = ((salarioBruto - descontoDependente - descontoINSS));
				} else if (salarioBruto >= 1903.98 && salarioBruto <= 2826.65) {
					descontoIR = ((salarioBruto - descontoDependente - descontoINSS)* 0.075) - 142.80;
				} else if (salarioBruto >= 2826.66 && salarioBruto <= 3751.05) {
					descontoIR = ((salarioBruto - descontoDependente - descontoINSS)* 0.15) - 354.80;
				} else if (salarioBruto > 3751.06 && salarioBruto <= 4664.68) {
					descontoIR = ((salarioBruto - descontoDependente - descontoINSS)* 0.225) - 636.13;
				} else {
					descontoIR = ((salarioBruto - descontoDependente - descontoINSS)* 0.275) - 869.36;	
				}
	}

	@Override
	public void descontoDependente() {

	}

}

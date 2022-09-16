package br.org.serratec.model;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Funcionario extends Pessoa {
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

	public Set<Dependente> getDependente() {
		return dependentes;
	}
	
	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public Double getDescontoINSS() {
		 return descontoINSS;
	}

	public Double getDescontoIR() {
		return descontoIR;
	}

	public Double getSalarioLiquido() {
		return this.salarioBruto-this.descontoINSS-this.descontoIR;
	}
	public void setDependentes(ArrayList<Dependente> dependentes2) {
		// TODO Auto-generated method stub
		
	}

//	public void setDescontoINSS(double descontoINSS) {
//		// nao da para ver.
//	}
	
//	public void calcularINSS() {

//		if (salarioBruto <= 1212.00) {
//			descontoINSS = salarioBruto * 0.075;
//		} else if (salarioBruto > 1212.00 && salarioBruto <= 2427.35) {
//			descontoINSS = salarioBruto * 0.09;
//		} else if (salarioBruto > 2427.35 && salarioBruto <= 3641.03) {
//			descontoINSS = salarioBruto * 0.12;
//		} else if (salarioBruto > 3641.03 && salarioBruto <= 7087.22) {
//			descontoINSS = salarioBruto * 0.14;
//		} else {
//			descontoINSS = 7087.22 * 0.14;

//		}
//	}

//	@Override
//	public void calcularSalarioLiquido() {
//		salarioLiquido = salarioBruto - descontoINSS - descontoIR;
//	}

//	@Override
//	public void calcularIDR() {
//				if (salarioBruto < 1903.98) {
//					descontoIR = ((salarioBruto - descontoDependente - descontoINSS));
//				} else if (salarioBruto >= 1903.98 && salarioBruto <= 2826.65) {
//					descontoIR = ((salarioBruto - descontoDependente - descontoINSS)* 0.075) - 142.80;
//				} else if (salarioBruto >= 2826.66 && salarioBruto <= 3751.05) {
//					descontoIR = ((salarioBruto - descontoDependente - descontoINSS)* 0.15) - 354.80;
//				} else if (salarioBruto > 3751.06 && salarioBruto <= 4664.68) {
//					descontoIR = ((salarioBruto - descontoDependente - descontoINSS)* 0.225) - 636.13;
//				} else {
//					descontoIR = ((salarioBruto - descontoDependente - descontoINSS)* 0.275) - 869.36;	
//				}
//	}

//	@Override
//	public void descontoDependente() {

	}

//}

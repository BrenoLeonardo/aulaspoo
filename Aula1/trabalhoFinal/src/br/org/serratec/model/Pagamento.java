package br.org.serratec.model;

import java.util.Set;

import br.org.serratec.interfaces.Calculos;

public class Pagamento {
	private Set<Funcionario> funcionarios;

	public Pagamento(Set<Funcionario> funcionarios) {
		super();
		this.funcionarios = funcionarios;
	}

	public void setFuncionarios(Set<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	public void processarFolha() {
		for(Funcionario funcionario : funcionarios) {
			Calculos inss = new Inss(funcionario);
			funcionario.setdescontoINSS(inss.calcularINSS());
			
			Calculos ir = new ImpostoRenda(funcionario);
			funcionario.setDescontoIDR(ir.calcularIDR());
		}
	}
}

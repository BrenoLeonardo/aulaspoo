package br.org.serratec.ExerTeste;

import br.org.serratec.tarefas.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Lucas", 1800.);	
		
		System.out.println("Nome: "+ funcionario1.getNome());
		System.out.println("Salário: "+ funcionario1.getSalario());
		System.out.println("INSS: "+ funcionario1.calcularInss());
		System.out.println("Vale Transporte: "+ funcionario1.calcularValeTransporte());
		System.out.println("Salário Líquido: "+ (funcionario1.getSalario() - funcionario1.calcularInss() - funcionario1.calcularValeTransporte()));
	}
}

package br.org.serratec.model;

public class CalcularSalario {
	public void folhaPagamento(Empregado empregado) {
		empregado.getSalario();
		System.out.println(empregado.getSalario());
	}
}

package br.org.serratec.model;

//extends serve para o primeiro herdar atributos do segundo
public class Gerente extends Funcionario {
	private String tipo;

	public Gerente(String cpf, String nome, Double salario, String tipo) {
		super(cpf, nome, salario);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
	
}

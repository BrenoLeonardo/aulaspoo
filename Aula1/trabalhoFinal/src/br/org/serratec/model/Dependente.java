package br.org.serratec.model;

import java.time.LocalDate;

public class Dependente extends Pessoa {
	private String parentesco;
	public Dependente(String nome, String cpf,LocalDate dataNascimento , String parentesco) {
		super(nome, cpf, dataNascimento);
		this.parentesco =parentesco;
	}
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	
}

package br.edu.senai.model;

import java.time.LocalDate;

import br.org.serratec.pessoaAbstract.Pessoa;

public class Dependente extends Pessoa {
	private String parentesco;
	

	public Dependente(String nome, String cpf, LocalDate dataNascimento, String parentesco){
		super(nome, cpf, dataNascimento);
		this.parentesco = parentesco;
	}


	public String getParentesco() {
		return parentesco;
	}

}

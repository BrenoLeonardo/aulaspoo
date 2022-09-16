package br.org.serratec.model;

import java.time.LocalDate;
import java.util.Objects;

public class Pessoa {
	protected String nome;
	protected String cpf;
	protected LocalDate dataNascimento;
	
	public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + "]";
	}


	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public int hashCode() {
		return Objects.hash(cpf);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
	
	
}

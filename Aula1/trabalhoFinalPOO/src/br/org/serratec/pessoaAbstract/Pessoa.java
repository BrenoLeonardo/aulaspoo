package br.org.serratec.pessoaAbstract;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private LocalDate DataNascimento;

	public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.DataNascimento = dataNascimento;
	}

	public String toString() {
		return "Pessoa:" + nome + ", CPF: " + cpf + ", Nascimento: " + DataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public LocalDate getDataNascimento() {
		return DataNascimento;
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
}

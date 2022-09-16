package br.org.serratec.model;

import br.org.serratec.exception.ContaException;

public class Poupanca implements Conta{
	private String titular;
	private Integer saldo;
	
	public Poupanca(String titular, Integer saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	public String toString() {
		return "titular: " + titular + ", saldo: " + saldo;
	}
	
	public Boolean saque(Integer valor) {
		if(saldo >= valor) {
			    if(Math.log10(saldo) != 6) {
			    throw new ContaException("Digitos demais !");
			}
			    saldo -= valor;
				return true;
		}
		throw new ContaException("Saldo insuficiente!");
	}

	public Boolean deposito(Integer valor) {
		if(valor > 0) {
			saldo += valor;
			return true;
		}
		//throw new RuntimeException("Valor de depósito inválido !");
		throw new ContaException("Valor de depósito inválido !");
	}
		
}

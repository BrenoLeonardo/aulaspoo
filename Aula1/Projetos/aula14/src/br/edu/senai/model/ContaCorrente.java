package br.edu.senai.model;

import br.edu.senai.interfaces.Conta;

public class ContaCorrente implements Conta {

	public void transacao() {
		System.out.println("transaçao ok !");

	}
	
	public void investimento() {
		System.out.println("investimento ok !");
	}

}

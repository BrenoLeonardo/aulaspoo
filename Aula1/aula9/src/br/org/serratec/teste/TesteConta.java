package br.org.serratec.teste;

import br.org.serratec.exception.ContaException;
import br.org.serratec.model.Poupanca;

public class TesteConta {

	public static void main(String[] args) {
		Poupanca poupanca = new Poupanca("Joaquim",10000);
		try {
			poupanca.deposito(10000);
			poupanca.saque(2000);
			System.out.println(poupanca);
		}catch(ContaException e) {
			System.out.println(e.getMessage());
			System.out.println(poupanca);
		}
		

	}

}

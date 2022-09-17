package br.org.serratec.teste;

import br.org.serratec.model.ContaCorrente;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("Roni", 14550.);
		cc.deposito(1000.);
		cc.saque(500.);
		
		System.out.println("Nome: "+cc.toString());
	}

}

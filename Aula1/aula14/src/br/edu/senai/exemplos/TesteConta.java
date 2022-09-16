package br.edu.senai.exemplos;

import br.edu.senai.interfaces.Conta;

public class TesteConta {

	public static void main(String[] args) {
		//classe anônima baseada em uma interface
		Conta conta = () -> System.out.println("Transacao efetuada !");
		conta.transacao();
		
		//programacao funcional - a partir do 8
		Conta conta2 = ()-> System.out.println("Transacao efetuada conta2");
		conta2.transacao();
	}

}

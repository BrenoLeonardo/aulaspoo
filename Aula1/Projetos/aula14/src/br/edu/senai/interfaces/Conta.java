package br.edu.senai.interfaces;

import java.awt.event.ActionListener;

public interface Conta {
	public void transacao();
	
	
	//para interface ser funcional ela somente pode ter um método abstrato
	//metodo default - são métodos que contém implementacao dentro da interface
	
	default void investimento() {
		System.out.println("você aplicou em um investimento !");
	}
	
	
}

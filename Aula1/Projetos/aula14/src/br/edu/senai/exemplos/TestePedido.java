package br.edu.senai.exemplos;

import br.edu.senai.model.Pedido;

public class TestePedido {
	
	public static void main(String[] args) {
		Pedido pedido1 = new Pedido();
		pedido1.finalizarPedido();
		
		//classe anonima
		Pedido pedido2 = new Pedido() {
			public void finalizarPedido() {
				
				System.out.println("Pedido enviado com sucesso !");
			}
		};
		pedido2.finalizarPedido();
		Pedido pedido3 = new Pedido() {
			
		};
	}
	
	

}

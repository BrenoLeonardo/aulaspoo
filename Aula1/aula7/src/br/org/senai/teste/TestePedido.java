package br.org.senai.teste;

import java.time.LocalDate;

import br.org.senai.enums.Bebida;
import br.org.senai.enums.Sanduiche;
import br.org.senai.model.Pedido;

public class TestePedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(LocalDate.of(2022, 9, 2), Bebida.AGUA, Sanduiche.HOTDOG);
		pedido.imprimirCardapio();
		
		System.out.println("Dados os pedidos: ");
		System.out.println(pedido);
	}

}

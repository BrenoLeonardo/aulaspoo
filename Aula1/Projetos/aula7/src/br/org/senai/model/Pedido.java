package br.org.senai.model;

import java.time.LocalDate;

import br.org.senai.enums.Bebida;
import br.org.senai.enums.Sanduiche;

public class Pedido {
	private LocalDate dataPedido;
	private Bebida bebida;
	private Sanduiche sanduiche;
	
	public Pedido(LocalDate dataPedido, Bebida bebida, Sanduiche sanduiche) {
		super();
		this.dataPedido = dataPedido;
		this.bebida = bebida;
		this.sanduiche = sanduiche;
	}
	
	public String toString() {
		return "Data do Pedido: " + dataPedido + ", bebida: " + bebida + ", sanduiche: " + sanduiche + "]";
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public Sanduiche getSanduiche() {
		return sanduiche;
	}
	
	public void imprimirCardapio() {
		for(Bebida bebida: Bebida.values()) {
			System.out.println("******************");
			System.out.println(bebida);
		}
		for(Sanduiche sanduiche: Sanduiche.values()) {
				System.out.println("******************");
				System.out.println(sanduiche);
		}
	}
}

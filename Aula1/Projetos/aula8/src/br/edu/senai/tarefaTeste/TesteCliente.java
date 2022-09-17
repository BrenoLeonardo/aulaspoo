package br.edu.senai.tarefaTeste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.senai.tarefa.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		Integer id = 0;
		String nome = "";
		Integer idade = 0;
		String telefone = "";
		Scanner sc = new Scanner(System.in);
		
		List<Cliente> cliente = new ArrayList<>();
			
		while(true){
			System.out.println("Digite o ID: ");
			id = sc.nextInt();
			
			if (id < 0) {
				break;
			}
			
			System.out.println("Digite o nome: ");
			nome = sc.next();
			
			System.out.println("Digite a idade: ");
			idade = sc.nextInt();
			
			System.out.println("Digite o número do telefone: ");
			telefone = sc.next();
			
			cliente.add(new Cliente(id,nome,idade,telefone));
			
		}
		sc.close();
		for (Cliente clientes : cliente) {
			System.out.println(clientes+"\n");
		} 

	}

}

package br.org.serratec.teste;

import java.util.Scanner;

import br.org.serratec.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setCodigo(1);
		pessoa1.setNome("Ricardo");
		pessoa1.setAltura(1.62);
		pessoa1.setPeso(55.5);
		
		new Pessoa();
		Pessoa pessoa2 = new Pessoa(2, "Maria", 80.1,1.75);
		
		Pessoa pessoa3 = new Pessoa(null, null);
		
		System.out.println("Sua situação é: "+ pessoa1.resultadoIMC());
		System.out.println("Sua situação é: "+ pessoa2.resultadoIMC());
		
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= 1; i++) {
			
			System.out.println("Digite o código: ");
			Integer codigo = sc.nextInt();
			
			System.out.println("Digite o nome: ");
			String nome = sc.next();
			
			System.out.println("Digite o nome: ");
			Double peso = sc.nextDouble();
			
			System.out.println("Digite o nome: ");
			Double altura = sc.nextDouble();
			
			Pessoa pessoa = new Pessoa(codigo,nome,peso,altura);
			System.out.println("O resultado é:"+pessoa.resultadoIMC());
			
		}	
	}
}

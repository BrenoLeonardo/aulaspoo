package exercicio;

import java.util.Scanner;

public class Tarefa1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, soma;
		
		System.out.println("Entre com um número: ");
		num = sc.nextInt();
		
		System.out.println( "+--Resultado--+");
		for (int k = 1; k <= 10; k++) {
			soma = k * num;
			System.out.printf("| %d X %d = %d |\n", k, num, soma);
			
			}
		System.out.println( "+-------------+");
	}
}

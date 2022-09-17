package exercicio;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Entre com um número: ");
		num = sc.nextInt();
		sc.close();
		
		System.out.println("Antecessor: "+(num-1)+"\nSucessor: "+(num+1));
	}

}

package exercicio;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura, maiAlt = 0, somAlt = 0, medAlt = 0;
		float peso, maiPeso = 0, somPeso = 0, medPeso = 0;
		String nome;

		
		for (int k = 1; k <= 2; k++) {
			System.out.println("Digite o nome da pessoa "+k+": ");
			nome = sc.next();
			
			System.out.println("Digite o peso de "+nome+": ");
			peso = sc.nextFloat();
			
			System.out.println("Digite a altura de "+nome+": ");
			altura = sc.nextDouble();
			
			somAlt = somAlt + altura;
			somPeso = somPeso + peso;
			medPeso = (somPeso/k);
			medAlt = (somAlt/k);
			
			if(altura <= 0){
				System.out.println("\nDigite um número maior que 0.\n\n");
				k--;
			}else if(k == 1){
				maiAlt = altura;
			}else{
				if(altura > maiAlt){ //se numero atual for maior que o maior numero anterior, o maiAlt pega esse valor para si
					maiAlt = altura; 
				}
			}
			
			if(peso <= 0){
				System.out.println("\nDigite um número maior que 0.\n\n");
				k--;
			}else if(k == 1){
				maiPeso = peso;
			}else{
				if(peso > maiPeso){ //se numero atual for maior que o maior numero anterior, o maiAlt pega esse valor para si
					maiPeso = peso; 
				}
			}			
		}
		System.out.println("O nome da pessoa com maior altura é: "+maiAlt);
		System.out.println("O nome da pessoa com maior peso é: "+maiPeso);
		System.out.printf("A média de peso é %.3f ", medPeso);
		System.out.printf("\nA média de altura é %.2f ", medAlt);
	}

}

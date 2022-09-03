package br.org.serratec.tarefaTeste;

import java.util.Scanner;

import br.org.serratec.tarefaModel.Fixo;

public class VendedorTeste {

	public static void main(String[] args) {
		char let = 'N';
		Integer num;
		Double valorVenda;
		Double total = 0.0;
		
		Scanner sc = new Scanner(System.in);
		Fixo fixo1 = new Fixo("Bianca","123",2800.,0.02,null);
		Fixo fixo2 = new Fixo("Carlos","321",2600.,0.03,null);
		
		System.out.println("---------Sistema de Vendas----------\nVendedores:\n1-Bianca\n2-Carlos");
		while(let != 'S') {
			System.out.println("Escolha o vendedor? ");
			num = sc.nextInt();
			
			System.out.println("Digite o valor da venda? ");
			valorVenda = sc.nextDouble();
			total += valorVenda;
			
			if(num == 1) { 
				fixo1.calcularSalario(valorVenda);			
			}else if (num==2) {
				fixo2.calcularSalario(valorVenda);
			}
			
			System.out.println("Deseja encerrar o programa? (S/N)");
			let = sc.next().charAt(0);
			if(let == 'N') {
			}else if (let == 'S'){
				break;	
			}else {
				System.out.println("Digite S ou N!");
				System.out.println("Deseja encerrar o programa? (S/N)");
				let = sc.next().charAt(0);
			}
		}
		System.out.println("---------Salário dos vendedores:---------\nNome: "+fixo1.getNome());
		System.out.println("Salário bruto: "+fixo1.getSalarioBruto()+"\nNome: "+fixo2.getNome()+"\nSalário bruto: "+fixo2.getSalarioBruto());
		System.out.println("\n---------Total vendido:---------\nTotal: "+total);
	}

}

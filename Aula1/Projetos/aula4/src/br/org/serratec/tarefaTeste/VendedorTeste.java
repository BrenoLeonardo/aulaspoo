/* package br.org.serratec.tarefaTeste;

import java.util.Scanner;

import br.org.serratec.tarefaModel.Fixo;

public class VendedorTeste {

	public static void main(String[] args) {
		//String let = "N";
		char let = 'N';
		Double total = 0.0;
		
		Scanner sc = new Scanner(System.in);
		Fixo fixo1 = new Fixo("Bianca","123",2800.0,0.02, null);
		Fixo fixo2 = new Fixo("Carlos","321",2600.0,0.03, null);
	
		//FreeLancer freelancer = new FreeLancer("Maria","321",16,90,0);
		
		System.out.println("---------Sistema de Vendas----------\nVendedores:\n1-Bianca\n2-Carlos");
		while(let == 'N') {
			System.out.println("Escolha o vendedor? ");
			int opcao = sc.nextInt();
			
			System.out.println("Digite o valor da venda? ");
			double valorVenda = sc.nextDouble();
			total += valorVenda;
			
			if(opcao == 1) { 
				fixo1.calcularSalario(valorVenda);			
			}else if (opcao==2) {
				fixo2.calcularSalario(valorVenda);
			}
			
			System.out.println("\nDeseja encerrar o programa? (S/N) ");
			let = sc.next().charAt(0);
			sc.close();
		}
		System.out.println("---------Salário dos vendedores:---------\n");
		//System.out.println("Salário bruto: "+fixo1.getSalarioBruto()+"\nNome: "+fixo2.getNome()+"\nSalário bruto: "+fixo2.getSalarioBruto());
		//System.out.println("\n---------Total vendido:---------\nTotal: "+total);
		System.out.println(fixo1.toString()+fixo2.toString());
		System.out.println("\n---------Total vendido:---------\nTotal: "+total);
		System.out.println("Total:" + total);
	}
}
*/
package br.org.serratec.tarefaTeste;

import java.util.Scanner;

import br.org.serratec.tarefaModel.Fixo;

public class VendedorTeste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char opcao = 'N';
		double valorVenda;
		int opcaoVendedor;
		double totalVendido=0;
		System.out.println("----------Sistema de Vendas----------");

		Fixo fixo1 = new Fixo("Joana", "12345678900", 2000., 3.);
		Fixo fixo2 = new Fixo("Maria", "12345678901", 2000., 5.);
		fixo1.setSalarioBruto(fixo1.getSalarioBase());
		fixo2.setSalarioBruto(fixo2.getSalarioBase());

		System.out.println("Vendedores:");
		System.out.println("1-" + fixo1.getNome());
		System.out.println("2-" + fixo2.getNome());

		while (opcao == 'N') {
			System.out.println("Escolha o vendedor?");
			opcaoVendedor = sc.nextInt();

			System.out.println("Digite o valor da venda");
			valorVenda = sc.nextDouble();

			if (opcaoVendedor == 1) {
				fixo1.calcularSalario(valorVenda);
			} else {
				fixo2.calcularSalario(valorVenda);
			}
			
			totalVendido += valorVenda;
			System.out.println("\nDeseja encerrar o programa? (S/N) ");
			opcao = sc.next().charAt(0);
			sc.close();
		}

		System.out.println("---------Salário dos vendedores:--------");
		System.out.println(fixo1.toString());
		System.out.println(fixo2.toString());
		
		System.out.println("------------Total Vendido:--------------");
		System.out.println("Total:" + totalVendido);
	}

}

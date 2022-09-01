package br.org.serratec.ExerTeste;

import java.util.Scanner;

import br.org.serratec.tarefas.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		Produto produto1 = new Produto("batata", 10., 4);	
		
		Scanner sc = new Scanner(System.in);
		Character opt = 'N';
		
		while(opt == 'N') {
			
			switch(opt) {
				case 'S':
					break;
				case 'N':
					System.out.println("Descrição: "+ produto1.getDescricao());
					System.out.println("Salário: "+ produto1.getValor());
					System.out.println("Quantidade: "+ produto1.getQuantidade());
					System.out.println("Total: "+ (produto1.Total()));
					System.out.println("ICMS: "+ produto1.calcularIcms());
					
					System.out.println("Deseja encerrar o programa? (S/N)");
					opt = sc.next();
				default:
					System.out.println("Digito errado!");
					break;
				}
			}		
			
		
	}

}

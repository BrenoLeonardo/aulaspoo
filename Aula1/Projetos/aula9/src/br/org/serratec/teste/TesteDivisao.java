package br.org.serratec.teste;

import br.org.serratec.calculo.CalculoMedia;

public class TesteDivisao {

	public static void main(String[] args) { 
		
		/*
		try {
			System.out.println(CalculoMedia.calcular(10,2));
		}catch (Exception e) {
			System.out.println("Erro ! Divisão por zero ! Verifique seu código");
		}*/
		/*
			System.out.println(CalculoMedia.calcular(10,2));
		
			System.out.println("Erro ! Divisão por zero ! Verifique seu código");
		*/
			try {
				System.out.println(CalculoMedia.calcular(10,0));
			}catch (ArithmeticException e) {
				System.out.println("Erro ! Divisão por zero ! Verifique seu código");
				e.printStackTrace();
			}finally {
				System.out.println("Sempre é executado independentemente se cair ou não no catch");
			}
		

	}

}

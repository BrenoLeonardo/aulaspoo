package br.edu.senai.varargs;

public class ExemploVarArgs {

	public static void main(String[] args) {
		//String a ="qualquer coisa";
		//System.out.printf("%s %d", 9,"tete");
		//varargs 
		
		System.out.println(somarNumeros(100, 10,20,30,40,100,200));	
	}
	
	public static int somarNumeros(int a, int... numeros) {
		int soma = 0;
		for (int valor : numeros) {
			soma+= valor;
		}
		return soma;
	}

}

package br.org.serratec.teste;

public class TesteString {

	public static void main(String[] args) {
		String texto = "TESTE";
		try {
			texto = texto.toUpperCase();
			System.out.println(texto);
		} catch (NullPointerException e) {
			System.out.println("Valor nulo na String");
		}
		

	}

}

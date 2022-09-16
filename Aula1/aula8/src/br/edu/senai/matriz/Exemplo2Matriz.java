package br.edu.senai.matriz;

public class Exemplo2Matriz {

	public static void main(String[] args) {
		String pessoas[][] = new String[][] {{"Marcos","m@gmail.com"},
											{"Maria","maria@gmail.com"},
											{"Carlos","carlos@gmail.com"},
											{"Adriano","a@gmail.com"}};
		
		for (int linha = 0; linha < pessoas.length; linha++) {
			System.out.println("********************");
			for (int coluna = 0; coluna < pessoas[linha].length; coluna++) {
				System.out.println(pessoas[linha][coluna]);
			}
		}
	}

}

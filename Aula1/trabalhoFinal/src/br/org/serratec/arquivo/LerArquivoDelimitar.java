package br.org.serratec.arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoDelimitar {

	public static void main(String[] args) {
		
		try { File arquivo = new File("/exemplos/leitura.txt");
				Scanner sc = new Scanner(arquivo);
				while (sc.hasNext()) {
					System.out.println(sc.next());
					
				}
		
		}catch(FileNotFoundException e){
			System.out.println("Error! arquivo nao encontrado");
		}

	}

}

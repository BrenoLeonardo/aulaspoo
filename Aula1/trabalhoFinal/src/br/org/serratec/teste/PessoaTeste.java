package br.org.serratec.teste;

import java.io.File;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.org.serratec.model.Pessoa;

public class PessoaTeste {

	public static void main(String[] args) {
		
		
		File arquivo = new File("/exemplos/pessoainha.txt");
		try {
			Scanner sc = new Scanner(arquivo);
			Set<Pessoa> pessoas = new HashSet<>();
			while(sc.hasNextLine()) {
				String linha = sc.nextLine();
				if(!linha.isEmpty()) {
					Vetor vetor = linha.split(";");
					pessoas.add(new Pessoa(vetor[0], vetor[1], vetor[2]));
				}
			}
			sc.close();
			
			System.out.println(pessoa1.getCpf()+""+pessoa2.getCpf());
		}catch(  e) {
			System.out.println("CPF indenticos não são válidos !");
		}

	}

}

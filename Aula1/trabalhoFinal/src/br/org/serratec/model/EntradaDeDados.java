package br.org.serratec.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho do arquivo ou nome do diretorio: ");
		String caminho = sc.next();
		File file1 = new File(caminho);
        		 
    	 if (file1.exists()) {
			if (file1.isFile()) {
				System.out.printf("\n Arquivo (%s) existe - tamanho %d bytes.", file1.getName(), file1.length());
						} else {
				System.out.println("Conteudo do diretório:");
				String diretorio[] = file1.list();
				for (String s : diretorio) {
					System.out.printf("%s\n", s);
					
				}
					main(args);	
			}
						
		} else {
			System.out.println("Arquivo ou diretório não encontrado");
			main(args);
			
		}
        sc.close();
		
		File arquivo = new File(caminho);
		try {
			Scanner sca = new Scanner(arquivo);
			Set<Funcionario> funcionarios = new HashSet<>();

			while (sca.hasNextLine()) {
				String linha = sca.nextLine();
				if (!linha.isEmpty()) {
					String vet[] = linha.split(";");
					String nome = vet[0];
					String cpf = vet[1];
					LocalDate dataNascimento = LocalDate.parse(vet[2], DateTimeFormatter.BASIC_ISO_DATE);
					Double salarioBruto = Double.parseDouble(vet[3]);
					
					funcionarios.add(new Funcionario(nome, cpf, dataNascimento, salarioBruto));
				}
				
				
			}
						
			System.out.println("\n\n------Dados do arquivo------\n");
			for (Funcionario funcionario : funcionarios) {
				System.out.println(funcionario);
			}
			
			sca.close();	
									
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

}
} 


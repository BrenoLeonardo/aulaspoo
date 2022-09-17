package br.org.serratec.teste;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import br.org.serratec.arquivo.ProcessandoArquivo;
import br.org.serratec.model.Funcionario;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o nome do arquivo de entrada: ");
		String ArquivoEntrada = in.next();
		System.out.println("Digite o nome do seu arquivo de saída: ");
		String arquivoSaida = in.next();
		in.close();
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		try {
			funcionarios = ProcessandoArquivo.ArquivoEntrada(diretorioEntrada);
			Set<Funcionarios> funcs = new HashSet<>(funcionarios);
			FolhaPagamento folha = new FolhaPagamento(funcs);
			folha.processarFolha();
			ProcessandoArquivo.arquivoSaida(func,  diretorioSaida);
	
		} catch (IOException e) {
			System.out.println("Falha ao ler o arquivo");
		} catch (DependenteException el) {
			System.out.println("Dependente não inserido, pois tem mais de 10 anos!");
		}
		

	}

}

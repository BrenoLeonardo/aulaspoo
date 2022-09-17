package br.org.serratec.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.org.serratec.enums.Parentesco;
import br.org.serratec.exception.ExceptionCpf;
import br.org.serratec.exception.ExceptionIdade;
import br.org.serratec.model.Dependente;
import br.org.serratec.model.Funcionario;

public class PessoaTeste {

	public static void main(String[] args){
		Scanner url = new Scanner(System.in);
		System.out.println("olá, bem vindo! Lembre-se que seu arquivo.csv deve estar formatado de acordo com o modelo abaixo.");
		System.out.println("nome;CPF;Data de Nasciemnto;Salario - para funcionario.");
		System.out.println("nome;CPF;Data de Nasciemnto;Parentesco - para dependente.");
		System.out.println("Insira o diretóro doa rquivo CSV: ");
		String diretorio = url.next();
		File arquivo = new File(diretorio);
		Set<Funcionario> funcionarios = new HashSet<>();
		try {
			try(Scanner sc = new Scanner(arquivo)){
			Funcionario funcionario = null;
			while(sc.hasNextLine()) {
				String linha = sc.nextLine();
				if(!linha.isEmpty()) {
					String vetor[] = linha.split(";");
					if(funcionario != null) {
						String nome = vetor[0];
						
						String cpf = vetor[1];
						Integer cpfVal = Integer.parseInt(cpf);
						
							if(String.valueOf(cpfVal).length() != 11){
								throw new ExceptionCpf("Cpf inválido! Precisa ser 11 números !");
							}
							
					String dataNascimento = vetor[2];
					LocalDate testeIdade = LocalDate.parse(dataNascimento);
					Period diferencaIdade = Period.between(testeIdade, LocalDate.now());
					if (diferencaIdade.getYears() > 18  && diferencaIdade.getYears() < 0)  {
						throw new ExceptionIdade("Superior a 18 anos não recebe o bônus por dependente/ ou data de nasimento inválida !");
					}
					
					String parentesco = vetor[3];
					try {
						Dependente dependentes = new Dependente(nome, cpf, LocalDate.parse(dataNascimento), Parentesco.valueOf(parentesco));
						funcionario.getDependentes().add(dependentes);
					} catch (Exception e) {
						
					}

					continue;
				}
					String nome = vetor[0];
					String cpf = vetor[1];
					String dataNascimento = vetor[2];
					String salario = vetor[3];

					funcionario = new Funcionario(nome, cpf, LocalDate.parse(dataNascimento),Double.parseDouble(salario));
					funcionarios.add(funcionario);
				} else {
					funcionarios.add(funcionario);
					funcionario = null;
				}

			}
			funcionarios.add(funcionario);

			sc.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("-----Informações do Arquivo-----");
		for (Funcionario f : funcionarios) {
			f.calcularINSS();
			f.calcularIDR();
			f.calcularSalarioLiquido();
			System.out.println(f);
			System.out.println("----------------------");
			System.out.println(f.getDependentes().size());

		}

		System.out.println("-----Gravação Arquivo-----");
		FileWriter arquivoGravar = new FileWriter("/exemplos/dadosGravados.txt");
		PrintWriter gravacaoArquivo = new PrintWriter(arquivoGravar);
		for (Funcionario f : funcionarios) {
			String linha = f.getNome() + ";" + f.getCpf() + ";" + String.format("%.2f", f.getDescontoINSS()) 
			+ ";" + String.format("%.2f", f.getDescontoIR()) + ";" + String.format("%.2f", f.getSalarioLiquido()) + "\n";
			gravacaoArquivo.print(linha);
		}
		System.out.println("Arquivo gravado com sucesso!");
		gravacaoArquivo.close();

	} catch (IOException e) {
		System.out.println("Não funcionou!");
	}
	}
}

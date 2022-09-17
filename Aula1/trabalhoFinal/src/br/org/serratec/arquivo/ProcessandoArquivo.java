package br.org.serratec.arquivo;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import br.org.serratec.enums.Parentesco;
import br.org.serratec.model.Dependente;
import br.org.serratec.model.Funcionario;

public class ProcessandoArquivo {
	public static List<Funcionario> arquivoEntrada(String diretorio){
		throws UnsupportedEncodingException, FileNotFoundException, DependenteException{
			Scanner in = new Scanner(new InputStreamReader(new FileInputStream(diretorio), "UTF-8"));
			List<Funcionario> funcionarios = new Arraylist<>();
			Funcionario funcionario = null;
			while(in.hasNextLine()) {
				if(!line.isEmpty()) {
					String[] dadosLinha = line.split(";");
					if (funcionario != null) {
						String nome = dadosLinha [0];
						String cpf = dadosLinha[1];
						String dataNascimento = dadosLinha[2];
						String parentesco = dadosLinha[3];
						
						try {
							Dependente dependente = new Dependente(nome, cpf, LocalDate.parse(dataNascimento, DateTimeFormatter.BASIC_ISO_DATE),
									Enum.valueOf(Parentesco.class, parentesco));
							funcionario.getDependentes().add(dependente);
						} catch (DependenteException e) {
							System.out.println(e.getMessage());
						}
						continue;
					}
					String nomeFunc = dadosLinha[0];
					String cpfFunc = dadosLinha [1];
					String dataNascimentoFunc = dadosLinha[2];
					String salarioFunc = dadosLinha [3];
					funcionario = new Funcionario(nomeFunc, cpfFunc, LocalDate.parse(dataNascimentoFunc, DateTimeFormatter.BASIC_ISO_DATE), Double.parseDouble(salarioFunc));
					
				}else {
					funcionarios.add(funcionario);
					funcionario = null;
				}
			}
			funcionarios.add(funcionario);
			in.close();
			return funcionarios;
		}
		
		public static void arquivoSaida(Set<Funcionario> funcionarios, String DiretorioSaida) throws IOException{
			FileWriter arq = new FileWriter(nomeArSaida);
			PrintWriter gravarArq = new PrintWriter(arq);
			
			for(Funcionario funcionario : funcioanrios) {
				String linhaArq = funcionario.getNome()+ ";"+funcionario.getCpf() + ";" + String.format("%.2f", funcionario.getDescontoINSS())+ ";"
						+ String.format("%.2f", funcionario.getDescontoIDR())+ ";"+String.format("%.2f", funcionario.getSalarioLiquido())+ "\n";
				gravarArq.printf(linhaArq);
			}
			arqu.close();
		}
	}
}

package br.org.serratec.model;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ImportarArquivo {
	private String caminhoArquivo;

	public ImportarArquivo(String caminhoArquivo) {
		super();
		this.caminhoArquivo = caminhoArquivo;
	}

	public Set<Funcionario> LerArquivo() throws Exception {
		try {

			// Esta instaciando o file a partir do caminho que foi passado no construtor
			File arquivo = new File(this.caminhoArquivo);
			Scanner sc = new Scanner(arquivo);
			Set<Funcionario> funcionarios = new HashSet<>();
			// Criando um funcionario nulo pois ele vai instaciado apartir dados que ele vai
			// ler
			Funcionario funcionario = null;
			ArrayList<Dependente> dependentes = new ArrayList<Dependente>();
			// Mesmo motivo da linha 25
			// esta usando hashset pq cada cpf tem ser unico
			Boolean eDependente = false;
			// Colocando uma variavel booleana, atribuindo valor falso ao primeiro registro
			// do bloco.
			// Pois sabase que 1 registro do bloco é um funcionario
			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
				// formatcao de data
				if (!linha.isEmpty()) {
					String vet[] = linha.split(",");
					// o split tem a funcao de separar por virgula e tranformar as informacoes em um
					// vetor
					String nome = vet[0];
					String cpf = vet[1];
					LocalDate dataNascimento = LocalDate.parse(vet[2], DATEFORMATTER);
					if (!eDependente) {
						Double salarioBruto = Double.parseDouble(vet[3]);
						// foi usado o vetor para seprara elas , se quiser pegar alguma informacao
						// especifica
						funcionario = (new Funcionario(nome, cpf, dataNascimento, salarioBruto));
						eDependente = true;
						// quando o primerio resgisto for um funcionario e vai cair aqui dentro
						// depois que registrar o funcionario o proxima informacao vai ser do dependente
						// ,
						// e por isso que esta true pois proximos que vieram depois de funcionario é
						// dependentes.
					} else {
						// ele vai fazer a leitura das linhas se a a linha nao estiver vazia ela vai pra
						// proxima linha , vai fazer criacao de dependntes
						// e add na lista de dependentes
						String parentesco = vet[3];
						Dependente dependente = new Dependente(nome, cpf, dataNascimento, parentesco);
						dependentes.add(dependente);
					}
				} else {
					// se a linha estiver vazia ela vai sair nesse else.Ele vai setar as
					// informacoes,
					// vai add dependentes a lista de funcionario e vai add funcionarios na lista de
					// funcionario
					// depois ele ira resetar e partir para o proximo bloco
					funcionario.setDependentes(dependentes);
					funcionarios.add(funcionario);
					funcionario = null;
					eDependente = false;
				}

			}
			sc.close();
			return funcionarios;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
// se der ruim serev isso!
		}
	}

}
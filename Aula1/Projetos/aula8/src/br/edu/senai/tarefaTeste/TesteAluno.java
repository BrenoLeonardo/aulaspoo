package br.edu.senai.tarefaTeste;

import java.util.ArrayList;
import java.util.List;

import br.edu.senai.tarefa.Aluno;


public class TesteAluno {

	public static void main(String[] args) {
		List<Aluno> aluno = new ArrayList<>();
		
		aluno.add(new Aluno("Breno",8.0, 9.0));
		aluno.add(new Aluno("Potato Head",2.0, 4.0));
		aluno.add(new Aluno("Cabeça doida",10.0, 10.0));
		aluno.add(new Aluno("Pedra",0.0, 0.0));
		
		for (Aluno alunos : aluno) {
			System.out.println(alunos);
			System.out.println("Média das notas: "+alunos.calcularMedia());
		}
	}

}

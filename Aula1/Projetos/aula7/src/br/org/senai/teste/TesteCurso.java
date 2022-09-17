package br.org.senai.teste;

import br.org.senai.enums.PeriodoCurso;
import br.org.senai.model.Curso;

public class TesteCurso {

	public static void main(String[] args) {
		Curso curso = new Curso("Java", PeriodoCurso.INTEGRAL);

		System.out.println("Nome do curso: " + curso.getNome());
		System.out.println("Dia da semana: " + PeriodoCurso.INTEGRAL.getDiasDaSemana());
	}

}

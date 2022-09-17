package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.Empregado;

public class ExemploEmpregado {

	public static void main(String[] args) {
		List<Empregado> empregados = new ArrayList<>();
		
		empregados.add(new Empregado("Lucas", "123456"));
		empregados.add(new Empregado("Goku Careca", "126758"));
		empregados.add(new Empregado("Paulo Batera", "0234567"));
			
			for (Empregado empregado : empregados) {
				System.out.println(empregado);
			}
	}

}

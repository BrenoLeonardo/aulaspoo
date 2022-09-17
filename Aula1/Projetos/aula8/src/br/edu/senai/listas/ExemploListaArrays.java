package br.edu.senai.listas;

import java.util.Arrays;
import java.util.List;

public class ExemploListaArrays {

	public static void main(String[] args) {
		//não pode ser alterada a lista por ser constante
		List<String> cores = Arrays.asList("Amarelo","Verde","Azul");
		
		//cores.add("Branco");
		cores.set(0, "Laranja");
		System.out.println(cores);
		if(cores.isEmpty()) {
			System.out.println("A lista está vazia !");
		}else {
			System.out.println(cores);
		}
		System.out.println("A lista contém a cor verde? "+(cores.contains("Verde")?"SIM":"NÃO"));
		
		/*for (int i = 0; i < cores.size(); i++) {
			if(cores.get(i).equalsIgnoreCase("Verde"));
		}*/
		
		List<String>meses = List.of("Jan","Fev","Mar");
		//meses.set(0, "Janeiro");
		System.out.println(meses);
	}

}

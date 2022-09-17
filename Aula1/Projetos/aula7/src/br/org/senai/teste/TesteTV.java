package br.org.senai.teste;

import br.org.senai.enums.MarcaTV;
import br.org.senai.model.TV;

public class TesteTV {

	public static void main(String[] args) {
		TV tv = new TV("SN/2343", 42., MarcaTV.PHILCO);
		System.out.println(tv);

	}

}

package br.org.serratec.teste;

import br.org.serratec.generico.MeuGenerico;
import br.org.serratec.model.Diretor;
import br.org.serratec.model.Funcionario;

public class TesteGenerico {

	public static void main(String[] args) {
		MeuGenerico<String> mg1 = new MeuGenerico<String>("Hello !");
		MeuGenerico<Integer> mg2 = new MeuGenerico<Integer>(10000);
		MeuGenerico<Funcionario> mg3 = new MeuGenerico<Funcionario>(new Funcionario("José","j@gmail.com",10000.));
		System.out.println(mg3);
		
		//qualquer coisa que tenha como super a classe funcionario
		MeuGenerico<? super Funcionario> mg4 = new MeuGenerico<Funcionario>(new Diretor("Marcos","m@gmail.com",18000., "CIO"));
			
		System.out.println(mg4);
	}
}

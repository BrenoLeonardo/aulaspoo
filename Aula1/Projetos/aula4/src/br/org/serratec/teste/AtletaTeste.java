package br.org.serratec.teste;

import br.org.serratec.model.AtletaAmador;

public class AtletaTeste {

	public static void main(String[] args) {
		AtletaAmador amador = new AtletaAmador("Leandro","Masculino",27,1.80,true);
		if (amador.podeCompetir()){
			System.out.println(amador.toString()+"\nPode competir");
		}else {
			System.out.println(amador.toString()+"\nNão pode competir");
		}
		
		
	}

}

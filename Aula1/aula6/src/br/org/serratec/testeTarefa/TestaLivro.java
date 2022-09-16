package br.org.serratec.testeTarefa;

import br.org.serratec.modelTarefa.Livro;
import br.org.serratec.modelTarefa.Operacao;

public class TestaLivro {

	public static void main(String[] args) {
		Livro livro1 = new Livro("marco Antonio", "Cisco CCNA", 90.0);
		Livro livro2 = new Livro("Katty Sierra", "use a cabeça Java", 4.0);
		
		Operacao operacao1 = new Operacao("venda", livro1);
		Operacao operacao2 = new Operacao("venda", livro2);
		
		livro1.reajusste(6.);
		operacao1.venderLivro();
		operacao2.emprestarLivro();

		System.out.println(operacao1.toString() + livro1.toString());
		System.out.println(operacao2.toString() + livro2.toString());

	}

}

package teste;

import model.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		System.out.println("---------------");
		//instancia de um objeto
		Aluno aluno1 = new Aluno();
		aluno1.matricula = 123;
		aluno1.nome = "Carlos";
		//aluno1.email ="carlos@gmail.com";
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = aluno2;
		
		System.out.println(aluno1.matricula+"-"+aluno1.nome+"-"+aluno1.email);
		
		System.out.println("Aluno1: "+aluno1);
		System.out.println("Aluno2: "+aluno2);
		if(aluno3==aluno2) {
			System.out.println("Objetos iguais !");
		}else {
			System.out.println("Objetos diferentes !");
		}
	}

}

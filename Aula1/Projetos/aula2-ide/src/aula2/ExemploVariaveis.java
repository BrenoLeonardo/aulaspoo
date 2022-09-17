package aula2;

public class ExemploVariaveis {

	public static void main(String[] args) {
		String nome = new String("Ana");
		Integer idade = new Integer(20);
		//int idade = 20;
		float altura = 1.85f;
		double peso = 89.90;
		System.out.println("Dados:"+idade+"\n"+altura+"\n"+peso);
		System.out.println(nome.toUpperCase());
		double a = 10.5;
		int b = (int)a;
		System.out.println(b);
	}

}

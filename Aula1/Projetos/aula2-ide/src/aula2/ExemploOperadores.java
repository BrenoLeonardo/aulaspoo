package aula2;

public class ExemploOperadores {

	public static void main(String[] args) {
		//atleta só podera participar se tiver idade e altura minima
		int idade = 19;
		double altura = 1.65;
		
		if(idade > 18 || altura >= 1.80) { //&& para e || para ou
			System.out.println("Compete!");
		}else {
			System.out.println("Não compete!");
		}
		
		//ternário
		String resposta = idade > 18 || altura >= 1.80 ? "Compentirá":"Não compete!";//?divide a parte condicional da conseguencia da condição
		System.out.println(resposta);
		
		int a = 2;
		int b = 3;
		String maior = a > b ? "Maior valor é: "+a:"Maior valor é: "+ b;
		System.out.println(maior);
		
		

	}

}

package br.org.serratec.calculo;

public class CalculoMedia {
	/*public static int calcular(int num1, int num2) {
		if(num2 == 0) {
			//throw - lancar uma exception
			throw new ArithmeticException("Você digitalizou zero no segundo parâmetro !");
		}
		return num1/num2;
	}*/
	//throws - o erro não será tratado no método e sim na classe que chamar esse método
	/*public static int calcular(int num1, int num2) throws Exception {
		return num1/num2;
	}*/
	public static int calcular(int num1, int num2) throws ArithmeticException {
		return num1/num2;
	}
}

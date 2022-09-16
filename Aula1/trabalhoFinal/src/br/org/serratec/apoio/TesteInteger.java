package br.org.serratec.apoio;

public class TesteInteger {

	public static void main(String[] args) {
		
		System.out.println(checkLength());
		public boolean checkLength(int id, int length) {
		    return 0 == (int)(id / Math.pow(10, length));
		}
	}

}

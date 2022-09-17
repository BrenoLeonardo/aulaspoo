package br.org.serratec.ExerTeste;

import javax.swing.JOptionPane;

import br.org.serratec.tarefas.Calculadora;

public class TesteCalculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int opcao;
		double resultado;
		String menu = "Calculadora\n\n"+"1-Somar\n"+"2-Subtrair\n"+"3-Multiplicar\n"+"4-Dividir\n"+"5-Finalizar\n\n";
		opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Calculadora - JAVA", JOptionPane.QUESTION_MESSAGE));
		
		while(opcao !=5) {
			String numero1 = JOptionPane.showInputDialog("Valor 1:");
			String numero2 = JOptionPane.showInputDialog("Valor 2:");
			resultado = calc.calcular(Double.parseDouble(numero1), Double.parseDouble(numero2), opcao);
			JOptionPane.showMessageDialog(null, resultado);
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "calculadora - JAVA", JOptionPane.QUESTION_MESSAGE));
		}

	}

}

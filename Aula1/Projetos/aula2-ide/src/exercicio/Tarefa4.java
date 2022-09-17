package exercicio;

import javax.swing.JOptionPane;

public class Tarefa4 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Entre com o nome:");
		String telefon = JOptionPane.showInputDialog("Entre com o telefone:");
		String email = JOptionPane.showInputDialog("Entre com o email:");
		String salari = JOptionPane.showInputDialog("Entre com o salário:");
		
		
		Integer telefone = Integer.parseInt(telefon);
		Double salario = Double.parseDouble(salari);
		
		JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nTelefone: "+telefone+"\nEmail: "+email+"\nSalário: "+(salario = salario + salario*0.1));
	}

}

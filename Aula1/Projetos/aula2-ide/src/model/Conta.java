package model;

public class Conta {
	public int numeroConta;
	public String titular;
	public double saldo;
	
	//metodo sempre e publico
	//não tem retorno
	public void deposito(double valor) {
		//saldo = saldo + valor;
		saldo += valor;
	}
	
	//metodo com retorno
	public boolean saque(double valor) {
		if(saldo < valor) {
			return false;
		}else {
			saldo -= valor;
			return true;
		}
	}
}

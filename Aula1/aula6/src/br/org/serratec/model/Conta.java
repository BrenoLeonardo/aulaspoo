package br.org.serratec.model;
//uma interface não pode ter instãncias
//Não posso fazer - Conta conta = new Conta()
//Forma de substituir a herenca em certos casos
//Interface é criada apenas pra ter assinaturas
//Interfaces não tem implementacao
public interface Conta {
	Double taxaBancaria = 2.50;
	//não é necessario colocar o abstract porque fica implicito
	
	public Boolean saque(Double valor);
	public Boolean deposito(Double valor);
	
}

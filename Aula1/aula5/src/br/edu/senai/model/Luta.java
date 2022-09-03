package br.edu.senai.model;

public class Luta {
	private Lutador desafiante;
	private Lutador desafiado;
	private Boolean confirmacao = false;
	
	public Luta(Lutador desafiante, Lutador desafiado, Boolean confirmacao) {
		this.desafiante = desafiante;
		this.desafiado = desafiado;
		this.confirmacao = confirmacao;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public Boolean getConfirmacao() {
		return confirmacao;
	}
	
	public Boolean confirmacaoLuta() {
		//para luta ser confirmada e preciso chegar se o 
		//desafiante e diferente do desafiado e tambem se as categorias são iguais
		
		if(!desafiante.equals(desafiado) && desafiante.getCategoria().equals(desafiado.getCategoria())) {
			return true;	
		}
		return false;
		
	}
	
}

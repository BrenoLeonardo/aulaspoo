package br.org.serratec.exception;

import java.util.InputMismatchException;

public class ExceptionCpf extends InputMismatchException{
	//ExceptionIdade("Superior a 18 anos não recebe o bônus por dependente/ ou data de nasimento inválida !");
	public ExceptionCpf(String message) {
		super(message);
	}

}

package br.org.serratec.datas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ExemploLocalDate {

	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataDeEntrada = LocalDate.of(2022,9,12);
		System.out.println(dataAtual);
		System.out.println(dataDeEntrada);
		LocalDate dataConvertida = LocalDate.parse("2022-09-12");
		
		
		System.out.println("após trés dias: "+ dataAtual.plusDays(3));
		System.out.println("menos vinte dias: "+ dataAtual.minusDays(20));
		System.out.println("Três meses atrás: "+ dataAtual.minus(3,ChronoUnit.MONTHS));
	}

}

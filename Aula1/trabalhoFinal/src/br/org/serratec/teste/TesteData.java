package br.org.serratec.teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteData {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String data = in.next();
		in.close();
		DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorSaida = DateTimeFormatter.ofPattern("yyyyMMdd");
		
		LocalDate dataLd = LocalDate.parse(data,formatadorBarra);
		System.out.println(dataLd.format(formatadorSaida));
	}

}

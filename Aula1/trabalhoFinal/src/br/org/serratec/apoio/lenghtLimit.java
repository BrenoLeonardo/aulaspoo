package br.org.serratec.apoio;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class lenghtLimit {

	public static void main(String[] args) {
		
		String a = "batatão";
		Integer b = 6000;
		Double c = 674.6789;
		char g;
		LocalDate d = LocalDate.of(1999,12,28);
	    DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("yyyyMMdd");
	    String e = d.format(formato2);
	    LocalDate dataLd = LocalDate.parse(e, formato2);
	    
		if(a.length() == 7) {
			System.out.println(a);
		}else {
			System.out.println("erro!");
		}
	
		
		if(String.valueOf(b).length() == 3){
			System.out.println(b);
		}else {
			System.out.println("erro!");
		}
		
		if(String.valueOf(c).length() == 4){
			System.out.println(c);
		}else {
			System.out.println("erro!");
		}
		
		if(String.valueOf(e).length() == 8){
			System.out.println(e);
		}else {
			System.out.println("erro!");
		}
		
		LocalDate f = LocalDate.parse(e, formato2);
		System.out.println(f);
		
	   
	    //new DecimalFormat("#,##0.00").format(c);
	    
	    //DecimalFormat c =  new DecimalFormat("#,##0.00;(#,##0.00)", new DecimalFormatSymbols(new Locale("pt", "BR")));
	    
		Locale.setDefault(new Locale("en", "US"));
	    new DecimalFormat("#,##0.00").format(c);
	    System.out.printf("%.2f",c);

	}

}

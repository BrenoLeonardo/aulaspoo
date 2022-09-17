package br.org.serratec.teste;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class PTeste {
    public static void main(String[] args) {
       String file = "/exemplos/pessoas.csv";
       String delimiter = ",";
       String line;
       List<List<String>> lines = new ArrayList();
        try (Scanner s = new Scanner(new File(file))) {
            while(s.hasNext()){
                line = s.next();
                List values = Arrays.asList(line.split(delimiter));
                lines.add(values);
            }
           
        } catch (Exception e){
            System.out.println(e);
        }
    }

}

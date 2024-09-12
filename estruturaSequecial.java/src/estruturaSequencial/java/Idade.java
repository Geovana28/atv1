package estruturaSequencial.java;

import java.util.*;

public class Idade {

	     public static void main(String[]args){
	         int anoAtual, anoDeNascimento, anoFuturo;
	         try (Scanner entrada = new Scanner(System.in)) {
				System.out.println ("Digite sua data de nascimento: ");
				 anoDeNascimento = entrada.nextInt();
				 System.out.println("Digite o ano atual: ");
				  anoAtual= entrada.nextInt();
				  System.out.println("Sua idade é: "+ (anoAtual - anoDeNascimento));
				  System.out.println("Digite o ano futuro: ");
				  anoFuturo = entrada.nextInt();
	     System.out.println("Sua idade neste ano será de: " + (anoFuturo - anoDeNascimento) );
	        
	         }
	     }
	 }



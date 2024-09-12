package estruturaSequancialPratica;

import java.util.*;

public class Tabuada {
   public static void main(String[] args) {
	   int numeroTabuada;
	   try (Scanner entrada = new Scanner(System.in)){
		   System.out.println("Digite um número para conferir sua tabuada de multiplicação: ");
		   numeroTabuada = entrada.nextInt();
		   System.out.println("A tabuada de multiplicação do" + " " + numeroTabuada + " " + "é: ");
		   for (int i = 1; i <= 10; i++) {
	            System.out.println(numeroTabuada + " X " + i + " = " + (numeroTabuada * i));
		   }
	   }
   }
	
}
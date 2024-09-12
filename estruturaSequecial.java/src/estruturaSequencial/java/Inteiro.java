package estruturaSequencial.java;

import java.util.*;

public class Inteiro {
	
	public static void main(String []args) {
		try(Scanner entrada = new Scanner(System.in)){
			int numeroInteiro, sucessor, antecessor, dobro;
				Double metade;
			System.out.println("Digite um número inteiro: ");
			numeroInteiro = entrada.nextInt();
			sucessor = numeroInteiro + 1;
			antecessor = numeroInteiro - 1;
			dobro = numeroInteiro * 2;
			metade = numeroInteiro/2.0;
			System.out.println("O sucessor do número é: " + sucessor);
			System.out.println("O antecessor do número é: "+ antecessor);
			System.out.println("O dobro do número é: " + dobro);
			System.out.println("A metade do número é: "+ metade);
			
		}
	}

}

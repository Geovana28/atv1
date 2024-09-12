package meuPremeiroProjetoJavaNoEclipse;

import java.util.Scanner;
public class Soma {
	
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		
		int numero1, numero2, soma;
		
		System.out.print("Informe o primeiro número: ");
		numero1 = input.nextInt();
		
		System.out.print("Informe o segundo número: ");
		numero2 = input.nextInt();
		
		soma = numero1 + numero2;
		System.out.println("A soma é: " + soma);
		
		input.close();
		System.exit(0);
	}	
}

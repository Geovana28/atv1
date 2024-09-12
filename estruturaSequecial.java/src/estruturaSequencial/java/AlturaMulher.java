package estruturaSequencial.java;

import java.util.*;

public class AlturaMulher {

	public static void main (String[]args) {
		try (Scanner entrada = new Scanner(System.in)){
			Double altura, pesoIdeal;
			System.out.println("Digite a sua altura em metros: ");
			altura = entrada.nextDouble();
			pesoIdeal = altura * 62.1 - 44.7;
			System.out.println("Seu peso ideal é de: "+ pesoIdeal + " "+ "quilos");
		}
		
	}
	
}


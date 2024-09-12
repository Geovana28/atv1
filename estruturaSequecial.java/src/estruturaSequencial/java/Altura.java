package estruturaSequencial.java;

import java.util.*;

public class Altura {

	public static void main (String[]args) {
		try (Scanner entrada = new Scanner(System.in)){
			Double altura, pesoIdeal;
			System.out.println("Digite a sua altura em metros: ");
			altura = entrada.nextDouble();
			pesoIdeal = altura * 72.7 - 58;
			System.out.println("Seu peso ideal é de: "+ pesoIdeal + " "+ "quilos");
		}
		
	}
	
}

package estruturaSequencial.java;

import java.util.*;

public class Invertido {

	public static void main(String []args) {
		Double numero1, numero2, temp;
		try(Scanner entrada = new Scanner(System.in)){
			System.out.println("Digite um valor para A: ");
			numero1 = entrada.nextDouble();
			System.out.println("Digite um valor para B: ");
			numero2 = entrada.nextDouble();
			temp = numero1;
			numero1 = numero2;
			numero2 = temp;
			System.out.println("Após a inversão o valor de A é: "+ numero1 );
			System.out.println("Após a inversão o valor de B é: "+ numero2);
			
		}
	}
}

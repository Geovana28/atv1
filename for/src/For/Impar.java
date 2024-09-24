package For;

import java.util.*;

public class Impar {
	public static void main(String[]args) {
		try (Scanner entrada = new Scanner(System.in)){
			System.out.print("Digite um número: ");
            int numero = entrada.nextInt();

            System.out.println(" Os números ímpares de 1 até " + numero + ":");
            for (int i = 1; i <= numero; i++) {
                if (i % 2 != 0) { 
                    System.out.println(i);
                }
            }
		}
	}
}

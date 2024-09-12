package estruturaSequencial.java;

import java.util.*;

public class Gorjeta {
 
	public static void main(String []args) {
		Double conta, gorjeta;
	try (Scanner entrada = new Scanner(System.in)){	
		System.out.println("Digite o valor da sua conta: ");
		conta = entrada.nextDouble();
		gorjeta = conta * 0.10;
		System.out.println("O valor da gorjeta é: " + gorjeta);
	
	}
	}
}

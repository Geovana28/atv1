package estruturaSequencial.java;

import java.util.*;

public class Equacao {

	public static void main(String []args) {
		Double coeficienteA, coeficienteB, coeficienteC, valorDelta, raiz1, raiz2;
		try (Scanner entrada= new Scanner(System.in)){
			System.out.println("Digite os coeficientes a,b e c:" );
			coeficienteA = entrada.nextDouble();
			coeficienteB = entrada.nextDouble();
			coeficienteC = entrada.nextDouble();
			valorDelta = coeficienteB * coeficienteB - 4 * coeficienteA * coeficienteC;
			if (valorDelta < 0) {
	            System.out.println("O delta é negativo, portanto não existem raízes reais.");
	        } else {
			raiz1 = (-coeficienteB + Math.sqrt(valorDelta)) / (2 * coeficienteA);
			raiz2 = (-coeficienteB - Math.sqrt(valorDelta))/(2 * coeficienteA);
			
			System.out.println("O valor da primeira raiz é: " + raiz1);
			System.out.println("O valor da segunda raiz é: " + raiz2);
	        }
		}
	}
}
	

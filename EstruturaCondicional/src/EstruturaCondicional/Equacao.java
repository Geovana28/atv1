package EstruturaCondicional;

import java.util.*;

public class Equacao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			double valorA, valorB, valorC, x1, x2, delta;
			System.out.println("Digite um valor para A, B e C: ");
			valorA = entrada.nextDouble();
			valorB = entrada.nextDouble();
			valorC = entrada.nextDouble();
			if (valorA == 0 && valorB == 0 && valorC == 0) 
				System.out.println("Igualdade confirmada: 0 = 0");
				
			 else if (valorA == 0 && valorB == 0 && valorC != 0 ) 
				System.out.println("Coeficientes informados incorretamente.");
			
			 else if (valorA == 0 && valorB != 0) 
				System.out.println("Essa é uma equação de primeiro grau e seu resultado é: " + (-valorC / valorB));
			
			 else 
				System.out.println("Essa é uma equação de segundo grau:");
				delta = Math.pow(valorB, 2) - 4 * valorA * valorC;

				if (delta < 0) {
					System.out.println("Delta:" + delta);
					System.out.println("Essa equação não possui raízes reais.");
					
				} else if (delta == 0) {
					System.out.println("Delta:" + delta);
					System.out.println("Essa equação possui uma raiz real: " + (-valorB / (2 * valorA)));
					
				} else {
					x1 = (-valorB + Math.sqrt(delta)) / (2 * valorA);
					x2 = (-valorB - Math.sqrt(delta)) / (2 * valorA);
					System.out.println("Essa equação possui duas raízes reais diferentes:");
					System.out.println("Delta:" + delta);
					System.out.println("X1 = " + x1);
					System.out.println("X2 = " + x2);
				
					entrada.close();
		}
	}
}

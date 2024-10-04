package EstruturaCondicional;

import java.util.*;

public class Triangulo {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			double lado1, lado2, lado3;
			System.out.println("Digite os três lado do triângulo: ");
			lado1 = entrada.nextDouble();
			lado2 = entrada.nextDouble();
			lado3 = entrada.nextDouble();
			if (lado1 == lado2 && lado2 == lado3)
				System.out.println("Esse é um triângulo Equilátero:");
			else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
				System.out.println("Esse é um triângulo Isósceles:");
			else
				System.out.println("Esse é um triângulo Escaleno:");

		}
	}
}

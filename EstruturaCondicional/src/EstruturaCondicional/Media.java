package EstruturaCondicional;

import java.util.*;

public class Media {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			double nota1, nota2, media;
			System.out.println("Digite as suas duas notas: ");
			nota1 = entrada.nextDouble();
			nota2 = entrada.nextDouble();
			media = (nota1 + nota2) / 2;
			if (media >= 7)
				System.out.println("Você está aprovado!");
			else
				System.out.println("Você está reprovado!");
		}
	}
}

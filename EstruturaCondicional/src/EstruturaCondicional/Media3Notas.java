package EstruturaCondicional;

import java.util.Scanner;

public class Media3Notas {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			double nota1, nota2, nota3, media;

			System.out.println("Digite suas três notas: ");
			nota1 = entrada.nextDouble();
			nota2 = entrada.nextDouble();
			nota3 = entrada.nextDouble();

			media = (nota1 + nota2 + nota3) / 3;

			if (media >= 0 && media < 3) {
				System.out.println("Você está reprovado!");
			} else if (media >= 3 && media < 7) {
				System.out.println("Você está apto para realizar o exame de recuperação!");
			} else if (media >= 7 && media <= 10) {
				System.out.println("Você está aprovado!");

			}
		}
	}
}

package EstruturaCondicional;

import java.util.*;

public class Numeros2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			double numero1, numero2, resultado;
			int opcao;
			System.out.println("Digite dois números:");
			
			numero1 = entrada.nextDouble();
			numero2 = entrada.nextDouble();
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Somar os dois números.");
			System.out.println("2 - Multiplicar os dois números.");
			System.out.println("3 - Subtrair o número maior pelo menor.");
			System.out.println("4 - Dividir o primeiro número pelo segundo.");

			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				resultado = numero1 + numero2;
				System.out.println("A soma dos números é: " + resultado);
				break;
			case 2:
				resultado = numero1 * numero2;
				System.out.println("A multiplicação dos números é: " + resultado);
				break;
			case 3:
				if (numero1 > numero2) {
					resultado = numero1 - numero2;
				} else if (numero2 > numero1) {
					resultado = numero2 - numero1;
				} else {
					resultado = 0;
				}
				System.out.println("A subtração do maior pelo menor é: " + resultado);
				break;
			case 4:
				if (numero2 != 0) {
					resultado = numero1 / numero2;
					System.out.println("A divisão do primeiro número pelo segundo é: " + resultado);
				} else {
					System.out.println("Não é possível dividir por zero.");
				}
				break;
			default:
				System.out.println("Opção inválida. Escolha uma opção de 1 a 4.");
			}
			entrada.close();
	}
}

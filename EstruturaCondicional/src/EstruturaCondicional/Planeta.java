package EstruturaCondicional;

import java.util.*;

public class Planeta {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			double v0, instante, velocidade, altura;
			
			System.out.println("Escolha um dos planetas abaixo: ");
			System.out.println("1 - Mercúrio");
			System.out.println("2 - Vênus");
			System.out.println("3 - Terra");
			System.out.println("4 - Marte");
			System.out.println("5 - Júpiter");
			System.out.println("6 - Saturno");
			System.out.println("7 - Urano");
			System.out.println("8 - Netuno");
			System.out.println("9 - Plutão");
			
			System.out.print("Digite o número do planeta escolhido: ");
			int planeta = entrada.nextInt();
			
			System.out.print("Digite a velocidade inicial (v0) em m/s: ");
			v0 = entrada.nextDouble();
			
			System.out.print("Digite o instante (t) em segundos: ");
			instante = entrada.nextDouble();
			
			double gravidade;
			switch (planeta) {
			case 1:
				gravidade = 3.7;
				break;
			case 2:
				gravidade = 8.8;
				break;
			case 3:
				gravidade = 9.8;
				break;
			case 4:
				gravidade = 3.8;
				break;
			case 5:
				gravidade = 26.4;
				break;
			case 6:
				gravidade = 11.5;
				break;
			case 7:
				gravidade = 9.3;
				break;
			case 8:
				gravidade = 12.2;
				break;
			case 9:
				gravidade = 0.6;
				break;
			default:
				System.out.println("Planeta inválido.");
				return;
			}
			velocidade = v0 - gravidade * instante;
			altura = v0 * instante - 0.5 * gravidade * instante * instante;

			System.out.println("No planeta " + planeta + ": A velocidade no instante t é de: " + velocidade + " m/s e a altura no instante t é de: " + altura + " m");

			entrada.close();
	}
}

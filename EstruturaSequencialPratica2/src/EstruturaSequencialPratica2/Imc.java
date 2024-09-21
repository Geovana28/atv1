package EstruturaSequencialPratica2;

import java.util.*;

public class Imc {
	public static void main(String[]args) {
		try (Scanner entrada = new Scanner(System.in)){
				double peso, altura, imc;
				System.out.println("Digite o seu peso: ");
				peso = entrada.nextDouble();
				System.out.println("Digite a sua altura: ");
				altura = entrada.nextDouble();
				imc = peso / Math.pow(altura, 2);
				if (imc < 20)
					System.out.println("Você está abaixo do peso: ");
				else if (imc >= 20 && imc <= 25)
					System.out.println("Você está com um peso considerado normal: ");
				else if (imc > 25 && imc<= 30 )
					System.out.println("Você está com sobrepeso: ");
				else if (imc > 30 && imc<= 40)
					System.out.println("Você está com obesidade: ");
				else if (imc > 40)
					System.out.println("Você está com obesidade mórbida: ");
				
		}
	}

}

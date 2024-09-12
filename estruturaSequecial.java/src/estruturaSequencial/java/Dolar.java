package estruturaSequencial.java;

import java.util.*;

public class Dolar {

	public static void main(String [] args) {
		double cotacaoDolar, quantidadeDolar, valorReal;
		try (Scanner entrada = new Scanner(System.in)){
			System.out.println("Digite a cotação do dolar hoje: ");
			cotacaoDolar = entrada.nextDouble();
			System.out.println("Digite a quantidade que você tem em dolar: ");
			quantidadeDolar = entrada.nextDouble();
			valorReal = cotacaoDolar * quantidadeDolar;
			System.out.println("O valor em real é: R$" + valorReal);
			
		}
	}
}

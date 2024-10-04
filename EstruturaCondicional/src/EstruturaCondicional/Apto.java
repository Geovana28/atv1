package EstruturaCondicional;

import java.util.Scanner;

public class Apto {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int dias;
			String tipoApartamento;
			double valorDiaria = 0.0, totalAPagar;
			
			System.out.print("Digite o tipo de apartamento (Simples ou Duplo): ");
			tipoApartamento = entrada.nextLine().toLowerCase();
			
			System.out.print("Digite a quantidade de diárias: ");
			dias = entrada.nextInt();
			
			if (tipoApartamento.equals("simples")) {
				if (dias < 10) {
					valorDiaria = 100.00;
				} else if (dias >= 10 && dias <= 15) {
					valorDiaria = 90.00;
				} else if (dias > 15) {
					valorDiaria = 80.00;
				}
			} else if (tipoApartamento.equals("duplo")) {
				if (dias < 10) {
					valorDiaria = 140.00;
				} else if (dias >= 10 && dias <= 15) {
					valorDiaria = 120.00;
				} else if (dias > 15) {
					valorDiaria = 100.00;
				}
			} else {
				System.out.println("Tipo de apartamento inválido. Digite 'Simples' ou 'Duplo'.");
				return;
			}

			totalAPagar = dias * valorDiaria;

			System.out.println("O total a ser pago é: R$ " + totalAPagar);
		}
	}
}

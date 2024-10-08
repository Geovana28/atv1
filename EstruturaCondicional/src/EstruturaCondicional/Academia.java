package EstruturaCondicional;

import java.util.*;

public class Academia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			int idade;
			String sexo;
			double mensalidade = 0.0;

			System.out.print("Digite a idade do cliente: ");
			idade = entrada.nextInt();
			entrada.nextLine();

			System.out.print("Digite o sexo do cliente (Masculino ou Feminino): ");
			sexo = entrada.nextLine().toLowerCase();
			if (sexo.equals("masculino")) {
				if (idade <= 15) {
					mensalidade = 60.00;
				} else if (idade >= 16 && idade <= 18) {
					mensalidade = 75.00;
				} else if (idade >= 19 && idade <= 30) {
					mensalidade = 90.00;
				} else if (idade >= 31 && idade <= 40) {
					mensalidade = 85.00;
				} else if (idade > 40) {
					mensalidade = 80.00;
				}
			} else if (sexo.equals("feminino")) {
				if (idade <= 18) {
					mensalidade = 60.00;
				} else if (idade >= 19 && idade <= 25) {
					mensalidade = 90.00;
				} else if (idade >= 26 && idade <= 40) {
					mensalidade = 85.00;
				} else if (idade > 40) {
					mensalidade = 80.00;
				}
			} else {
				System.out.println("Sexo inválido. Por favor, digite Masculino ou Feminino.");
				return;
			}

			System.out.println("O valor da mensalidade é: R$ " + mensalidade);
			entrada.close();
		
	}
}

package estruturaSequencial.java;

import java.util.*;

public class Salarios {
	public static void main(String []args) {
		double valorSalarioMinimo, valorSalarioRecebido, quantidadeSalarios;
		try (Scanner entrada = new Scanner(System.in)){
			
			System.out.println("Digite o valor do salário minímo: R$");
			valorSalarioMinimo = entrada.nextDouble();
			
			System.out.println("Digite o valor do seu salário: R$");
			valorSalarioRecebido = entrada.nextDouble();
			
			quantidadeSalarios = valorSalarioRecebido/valorSalarioMinimo;
			
			System.out.println("A quantidade de salários minímos que você recebe é de: " + quantidadeSalarios);
		}
	}
}

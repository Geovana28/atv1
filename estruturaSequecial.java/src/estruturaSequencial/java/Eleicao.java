package estruturaSequencial.java;

import java.util.*;

public class Eleicao {

	public static void main(String[]args) {
		try (Scanner entrada = new Scanner(System.in)){
			Double votosTotal, votosA, votosB, percentualCandidatoA, percentualCandidatoB,votosNulos, percentualNulo;
			System.out.print("Digite o total de votos: ");
			votosTotal = entrada.nextDouble();
			System.out.println("Digite o número de votos do candidadto A: ");
			votosA = entrada.nextDouble();
			System.out.println("Digite o número de votos do candidato B: ");
			votosB = entrada.nextDouble();
			votosNulos = votosTotal - (votosA + votosB);
			percentualCandidatoA = (votosA * 100.00) / votosTotal;
			percentualCandidatoB = (votosB * 100.00)/ votosTotal;
			percentualNulo = (votosNulos * 100.00)/votosTotal;
			System.out.println("O percentual do candidato A é: "+ percentualCandidatoA );
			System.out.println("O percentual do candidato B é: " + percentualCandidatoB);
			System.out.println("O percentual de votos nulos é: " + percentualNulo);
			
		}
	}
	
}

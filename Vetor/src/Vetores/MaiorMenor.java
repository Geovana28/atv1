package Vetores;

import java.util.*;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            double[] vetor = new double[10]; 
            double maior = Double.MIN_VALUE; 
            double menor = Double.MAX_VALUE;

            for (int i = 0; i < vetor.length; i++) {
                System.out.print("Informe o número " + (i + 1) + ": ");
                vetor[i] = entrada.nextDouble();

                if (vetor[i] > maior) {
                    maior = vetor[i];
                }
                if (vetor[i] < menor) {
                    menor = vetor[i];
                }
            }

            System.out.println("\nVetor informado:");
            for (int i = 0; i < vetor.length; i++) {
                System.out.printf("v[%d] = %.2f\n", i, vetor[i]);
            }

            System.out.printf("\nO menor número informado é: %.2f\n", menor);
            System.out.printf("O maior número informado é: %.2f\n", maior);
        
    entrada.close();
    }
}

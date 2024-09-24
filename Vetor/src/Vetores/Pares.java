package Vetores;

import java.util.*;

public class Pares{
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            double[] vetor = new double[10]; 

            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Informe um número real: ");
                vetor[i] = entrada.nextDouble(); 
            }

            System.out.println("Vetor informado:");
            for (int i = 0; i < vetor.length; i++) {
                System.out.printf("v[%d] = %.2f\n", i, vetor[i]); 
            }

            System.out.println("Posições dos números negativos:");
            for (int i = 0; i < vetor.length; i++) {
                if (i % 2 == 0) {
                    System.out.println("A posição " + i + " é um número par ");
                }
            }
        }
    }
}

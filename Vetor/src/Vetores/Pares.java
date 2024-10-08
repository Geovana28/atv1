package Vetores;

import java.util.*;

public class Pares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] vetor = new double[10]; 

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o número " + (i + 1) + ": ");
            vetor[i] = entrada.nextDouble();
        }

        System.out.println("\nElementos nas posições pares do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) { 
                System.out.printf("v[%d] = %.2f\n", i, vetor[i]);
            }
        }
        
        entrada.close();
    }
}

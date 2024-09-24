package Vetores;

import java.util.*;

public class Soma {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int[] vetor = new int[10]; 
            int somaPares = 0; 

            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Informe um número: ");
                vetor[i] = entrada.nextInt();

                if (vetor[i] % 2 == 0) {
                    somaPares = somaPares + vetor[i];
                }
            }

            System.out.println("Vetor informado:");
            for (int i = 0; i < vetor.length; i++) {
                System.out.printf("v[%d] = %2d\n", i, vetor[i]);
            }

            System.out.println("A soma dos números pares é: " + somaPares);
        }
    }
}

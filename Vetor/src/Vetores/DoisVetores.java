package Vetores;

import java.util.Scanner;

public class DoisVetores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            int[] vetor1 = new int[10]; 
            int[] vetor2 = new int[10]; 
            int[] vetorSoma = new int[10];

            System.out.println("Preencha o primeiro vetor:");
            for (int i = 0; i < vetor1.length; i++) {
                System.out.print("Digite o número para a posição " + i + " do primeiro vetor: ");
                vetor1[i] = entrada.nextInt();
            }

            System.out.println("Preencha o segundo vetor:");
            for (int i = 0; i < vetor2.length; i++) {
                System.out.print("Digite o número para a posição " + i + " do segundo vetor: ");
                vetor2[i] = entrada.nextInt();
            }

            for (int i = 0; i < vetorSoma.length; i++) {
                vetorSoma[i] = vetor1[i] + vetor2[i];
            }

            System.out.println("Primeiro vetor:");
            for (int i = 0; i < vetor1.length; i++) {
                System.out.printf("v1[%d] = %d\n", i, vetor1[i]);
            }

            System.out.println("Segundo vetor:");
            for (int i = 0; i < vetor2.length; i++) {
                System.out.printf("v2[%d] = %d\n", i, vetor2[i]);
            }

            System.out.println("Vetor Soma:");
            for (int i = 0; i < vetorSoma.length; i++) {
                System.out.printf("vSoma[%d] = %d\n", i, vetorSoma[i]);
            }
            
        entrada.close();
    }
}

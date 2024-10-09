package pesquisaSequencialEBinaria;

import java.util.*;

public class Questao1Booleana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = entrada.nextInt();
        }

        while (true) {
            System.out.println("Escolha a busca (1: Sequencial, 2: Sequencial com Sentinela) ou 0 para sair:");
            int escolha = entrada.nextInt();

            if (escolha == 0) {
                break;
            }

            System.out.println("Digite o número a ser pesquisado:");
            int numero = entrada.nextInt();

            int comparacoes = 0; 
            boolean encontrado = false;  

            if (escolha == 1) {
                for (int i = 0; i < vetor.length; i++) {
                    comparacoes++;
                    if (vetor[i] == numero) {
                        System.out.println("Número encontrado na posição " + i);
                        System.out.println("Número de comparações: " + comparacoes); 
                        encontrado = true; 
                        break; 
                    }
                }
                if (!encontrado) {  
                    System.out.println("Número não encontrado.");
                }
            } else if (escolha == 2) { 
                int[] vetorComSentinela = new int[vetor.length + 1];
                for (int i = 0; i < vetor.length; i++) {
                    vetorComSentinela[i] = vetor[i];
                }
                vetorComSentinela[vetor.length] = numero;

                int i = 0;
                while (i < vetorComSentinela.length) { 
                    comparacoes++;
                    if (vetorComSentinela[i] == numero) {
                        System.out.println("Número encontrado na posição " + i);
                        encontrado = true;
                        break; 
                    }
                    i++;
                }

                if (!encontrado) { 
                    System.out.println("Número não encontrado.");
                }

                System.out.println("Número de comparações: " + comparacoes);
            } else {
                System.out.println("Opção inválida."); 
            }
        }

        entrada.close(); 
    }
}

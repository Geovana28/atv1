package pesquisaSequencialEBinaria;

import java.util.*;

public class Questao1While {
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

            if (escolha == 1) {
                int i = 0; // Inicializa o índice
                while (true) { // Loop para busca sequencial
                    if (i >= vetor.length) { // Se chegar ao final do vetor
                        System.out.println("Número não encontrado.");
                        break; // Sai do loop
                    }

                    comparacoes++; // Incrementa comparações
                    if (vetor[i] == numero) {
                        System.out.println("Número encontrado na posição " + i);
                        System.out.println("Número de comparações: " + comparacoes);
                        break; // Sai do loop se encontrado
                    }
                    i++; // Incrementa o índice
                }
            } else if (escolha == 2) {
                int[] vetorComSentinela = new int[vetor.length + 1];
                for (int i = 0; i < vetor.length; i++) {
                    vetorComSentinela[i] = vetor[i];
                }
                vetorComSentinela[vetor.length] = numero; // Adiciona o número na última posição

                int i = 0;
                while (true) { // Loop para busca sequencial com sentinela
                    comparacoes++; // Incrementa comparações
                    if (vetorComSentinela[i] == numero) {
                        System.out.println("Número encontrado na posição " + i);
                        break; // Sai do loop se encontrado
                    }
                    if (i >= vetorComSentinela.length - 1) { // Se chegar ao final do vetor (sem contar o sentinela)
                        System.out.println("Número não encontrado.");
                        break; // Sai do loop
                    }
                    i++; // Incrementa o índice
                }

                System.out.println("Número de comparações: " + comparacoes);
            } else {
                System.out.println("Opção inválida."); 
            }
        }

        entrada.close(); 
    }
}
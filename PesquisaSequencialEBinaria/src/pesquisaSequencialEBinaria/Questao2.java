package pesquisaSequencialEBinaria;

import java.util.*;

public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];
        System.out.println("Digite 10 números de forma ordenada (Crescente ou Decrescente): ");
        for (int i = 0; i < 10; i++) {
            vetor[i] = entrada.nextInt(); 
        }

        while (true) {
            System.out.println("Escolha a busca (1: Binária ou 0 para sair): ");
            int escolha = entrada.nextInt();
            
            if (escolha == 0) {
                break;     
            }
            
            System.out.println("Digite o número a ser pesquisado: ");
            int numero = entrada.nextInt();
            
            int comparacoes = 0;
            
            if (escolha == 1) {
               
                int inicio = 0;
                int fim = vetor.length - 1;
                boolean crescente = vetor[0] < vetor[vetor.length - 1]; 

                while (inicio <= fim) {
                    comparacoes++;
                    int meio = (inicio + fim) / 2;

                    if (vetor[meio] == numero) {
                        System.out.println("Número encontrado na posição " + meio);
                        break; 
                    }

                    if (crescente) {
                        if (vetor[meio] < numero) {
                            inicio = meio + 1; 
                        } else {
                            fim = meio - 1; 
                        }
                    } else  {  
                        if (vetor[meio] > numero) {
                            inicio = meio + 1; 
                        } else {
                            fim = meio - 1; 
                        }
                    }
                }

                if (comparacoes == -1) {
                    System.out.println("Número não encontrado.");
                }
            } else {
                System.out.println("Opção Inválida: ");
                continue;
            }
            System.out.println("Número de comparações: " + comparacoes);
        }
        entrada.close();
    }
}

package pesquisaSequencialEBinaria;

import java.util.*;

public class Questao3 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o tamanho da primeira sequência: ");
        int tamanhoA = entrada.nextInt();
        int[] vetorA = new int[tamanhoA];
        System.out.println("Digite os números da primeira sequência:");
        for (int i = 0; i < tamanhoA; i++) {
            vetorA[i] = entrada.nextInt();
        }

        System.out.print("Informe o tamanho da segunda sequência: ");
        int tamanhoB = entrada.nextInt();
        int[] vetorB = new int[tamanhoB];
        System.out.println("Digite os números da segunda sequência:");
        for (int i = 0; i < tamanhoB; i++) {
            vetorB[i] = entrada.nextInt();
        }

        int[] conjuntoA = removerDuplicados(vetorA);
        int[] conjuntoB = removerDuplicados(vetorB);

        System.out.println("Sequência A: " + Arrays.toString(vetorA));
        System.out.println("Sequência B: " + Arrays.toString(vetorB));

        System.out.println("Conjunto A: " + Arrays.toString(conjuntoA));
        System.out.println("Conjunto B: " + Arrays.toString(conjuntoB));

        int[] conjuntoC = uniao(conjuntoA, conjuntoB);

        System.out.println("Conjunto C (União A U B): " + Arrays.toString(conjuntoC));

        entrada.close();
    }

  
    public static int[] removerDuplicados(int[] vetor) {
        Arrays.sort(vetor); 
        List<Integer> listaSemDuplicados = new ArrayList<>();

        for (int i = 0; i < vetor.length; i++) {
            if (i == 0 || vetor[i] != vetor[i - 1]) { 
                listaSemDuplicados.add(vetor[i]);
            }
        }

        int[] resultado = new int[listaSemDuplicados.size()];
        for (int i = 0; i < listaSemDuplicados.size(); i++) {
            resultado[i] = listaSemDuplicados.get(i);
        }

        return resultado;
    }

    public static int[] uniao(int[] conjuntoA, int[] conjuntoB) {
        Set<Integer> conjuntoC = new HashSet<>();

        for (int elemento : conjuntoA) {
            conjuntoC.add(elemento);
        }

        for (int elemento : conjuntoB) {
            conjuntoC.add(elemento);
        }

        int[] resultado = new int[conjuntoC.size()];
        int i = 0;
        for (int elemento : conjuntoC) {
            resultado[i++] = elemento;
        }

        return resultado;
    }
}



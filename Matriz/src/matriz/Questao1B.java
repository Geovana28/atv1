package matriz;

import java.util.*;

public class Questao1B {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int i, j;
            int[][] matriz = new int[5][5];

            for (i = 0; i < matriz.length; i++) {
                for (j = 0; j < matriz[i].length; j++) {
                    System.out.println("Informe um número para a posição [" + i + "][" + j + "]: ");
                    matriz[i][j] = entrada.nextInt();
                }
            }

            System.out.println("\nMatriz informada:");
            for (i = 0; i < matriz.length; i++) {
                for (j = 0; j < matriz[i].length; j++) {
                    System.out.printf("%2d ", matriz[i][j]);
                }
                System.out.println();
            }

            System.out.println("\nElementos em que o índice da linha é par e o índice da coluna é ímpar:");
            for (i = 0; i < matriz.length; i++) {
                if (i % 2 == 0) { 
                    for (j = 0; j < matriz[i].length; j++) {
                        if (j % 2 != 0) { 
                            System.out.printf("Elemento na posição [%d][%d] = %d\n", i, j, matriz[i][j]);
                        }
                    }
                }
            }
        }
    }
}

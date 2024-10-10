package matriz;

import java.util.*;

public class Questao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] matrizResultado = new int[2][2];

        System.out.println("Digite os elementos da primeira matriz (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("Digite os elementos da segunda matriz (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) { 
                matrizResultado[i][j] = matriz1[i][0] * matriz2[0][j] + matriz1[i][1] * matriz2[1][j];

                System.out.println("\nMultiplicando: " + matriz1[i][0] + " * " + matriz2[0][j] + " + " +
                                   matriz1[i][1] + " * " + matriz2[1][j]);
                System.out.println("Resultado parcial para posição [" + i + "][" + j + "]: " + matrizResultado[i][j] + "\n");
            }
        }

        System.out.println("Matriz resultante da multiplicação das duas matrizes:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%2d ", matrizResultado[i][j]);
            }
            System.out.println();
        }

        entrada.close();
    }
}

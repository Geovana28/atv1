package matriz;

import java.util.*;

public class Questao2 {
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
                    matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }
            
            System.out.println("Matriz resultante da soma:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.printf("%2d ", matrizResultado[i][j]);
                }
                System.out.println();
            }
        entrada.close();
    }
}

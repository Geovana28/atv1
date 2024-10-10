package matriz;

import java.util.*;

public class Questao1C {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            int i, j;
            int[][] matriz = new int[5][5];

            for (i = 0; i < matriz.length; i++) {
                for (j = 0; j < matriz[i].length; j++) {
                    System.out.println("Informe o elemento da posição [" + i + "][" + j + "]: ");
                    matriz[i][j] = entrada.nextInt();
                }
            }

            System.out.println("Matriz original:");
            for (i = 0; i < matriz.length; i++) {
                for (j = 0; j < matriz[i].length; j++) {
                    System.out.printf("%2d ", matriz[i][j]);
                }
                System.out.println();
            }

            System.out.println("Matriz transposta:");
            for (j = 0; j < matriz[0].length; j++) {
                for (i = 0; i < matriz.length; i++) {
                    System.out.printf("%2d ", matriz[i][j]);
                }
                System.out.println();
            }
        entrada.close();
        }
}

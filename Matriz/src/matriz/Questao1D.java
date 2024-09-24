package matriz;

import java.util.*;

public class Questao1D {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
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

            for (i = 0; i < matriz.length; i++) {
            	 j = matriz.length - 1 - i;
                int temp = matriz[i][i]; 
                matriz[i][i] = matriz[i][j]; 
                matriz[i][j] = temp; 
            }

            System.out.println("Matriz resultante após a troca das diagonais:");
            for (i = 0; i < matriz.length; i++) {
                for (j = 0; j < matriz[i].length; j++) {
                    System.out.printf("%2d ", matriz[i][j]);
                }
                System.out.println();
            }
        }
    }
}

package matriz;

import java.util.*;

public class Questao1D {
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

        for (int linha = 0; linha < matriz.length; linha++) {
            int coluna = matriz.length - 1 - linha;
            matriz[linha][linha] = matriz[linha][linha] + matriz[linha][coluna];
            matriz[linha][coluna] = matriz[linha][linha] - matriz[linha][coluna]; 
            matriz[linha][linha] = matriz[linha][linha] - matriz[linha][coluna]; 
        }

        System.out.println("Matriz resultante após a troca das diagonais:");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.printf("%2d ", matriz[linha][coluna]);
            }
            System.out.println();
        }

        entrada.close();
    }
}


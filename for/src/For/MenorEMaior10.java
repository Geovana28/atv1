package For;

import java.util.*;

public class MenorEMaior10 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int maior = Integer.MIN_VALUE; 
            int menor = Integer.MAX_VALUE; 
            int numero;
            int quantidadeNumeros = 10;

            
            for (int i = 0 ;i < quantidadeNumeros ;i++) { 
                System.out.println("Digite um número (ou 0 para terminar): ");
                numero = entrada.nextInt();

                if (numero == 0) {
                    break; 
                }

                if (numero > maior) {
                    maior = numero; 
                }
                if (numero < menor) {
                    menor = numero; 
                }
            }

            if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
                System.out.println("O maior número informado é: " + maior);
                System.out.println("O menor número informado é: " + menor);
            } else {
                System.out.println("Nenhum número válido foi informado.");
            }
        }
    }
}

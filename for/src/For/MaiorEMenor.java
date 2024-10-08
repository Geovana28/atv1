package For;

import java.util.*;

public class MaiorEMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            int maior = Integer.MIN_VALUE; 
            int menor = Integer.MAX_VALUE; 
            int numero;

            for (;;) { 
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
            
         entrada.close();
            }
    }
}

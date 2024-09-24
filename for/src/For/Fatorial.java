package For;

import java.util.*;

public class Fatorial {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite um número para calcular o fatorial: ");
            int n = entrada.nextInt();

            if (n < 0) {
                System.out.println("O fatorial não é definido para números negativos.");
            } else {
                long fatorial = 1; 
                for (int i = n; i > 0; i--) {
                    fatorial = fatorial * i; 
                }
                System.out.println("O fatorial de " + n + " é: " + fatorial);
            }
        }
    }
}

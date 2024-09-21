package For;

import java.util.*;

public class Soma {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int soma = 0;
            for (int i = 1; i <= 20; i++) {
                soma = soma + i; 
            }
            System.out.println("Soma dos números de 1 a 20 é: " + soma);
        }
    }
}

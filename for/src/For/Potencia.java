package For;

import java.util.*;

public class Potencia {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            int numero1 = entrada.nextInt(); 
            System.out.println("Digite outro número: ");
            int numero2 = entrada.nextInt(); 
            
            double potencia = 1; 
            
            for (int i = 0; i < numero2; i++) {
                potencia = potencia * numero1; 
            }

            System.out.println("O resultado de " + numero1 + " elevado a " + numero2 + " é: " + potencia);
        }
    }
}

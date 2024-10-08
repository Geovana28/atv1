package For;

import java.util.*;

public class Soma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            int soma = 0;
            for (int i = 7 ; i <= 20; i++) {
                soma = soma + i; 
            }
            System.out.println("Soma dos números de 7 a 20 é: " + soma);
            entrada.close();
    }
}

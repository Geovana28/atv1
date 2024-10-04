package estruturaSequancialPratica;

import java.util.*;

public class Peso2 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            Double peso, ganhoPeso, perdaPeso;
            System.out.println("Digite o seu peso: ");
            peso = entrada.nextDouble();
            ganhoPeso = peso + (peso * 0.15);
            perdaPeso = peso - (peso * 0.20);
            System.out.println("Se você engordar 15%, seu novo peso será: " + ganhoPeso + " kg");
            System.out.println("Se você emagrecer 20%, seu novo peso será: " + perdaPeso + " kg");
        }
    }
}

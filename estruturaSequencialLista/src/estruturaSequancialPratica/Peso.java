package estruturaSequancialPratica;

import java.util.Scanner;

public class Peso {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            Double peso, porcentagemEngordar, porcentagemEmagrecer, ganhoPeso, perdaPeso;

            System.out.println("Digite o seu peso: ");
            peso = entrada.nextDouble();

            System.out.println("Digite a porcentagem que deseja engordar: ");
            porcentagemEngordar = entrada.nextDouble();

            System.out.println("Digite a porcentagem que deseja emagrecer: ");
            porcentagemEmagrecer = entrada.nextDouble();

            ganhoPeso = peso + (peso * (porcentagemEngordar/100));

            perdaPeso = peso - (peso * (porcentagemEmagrecer/100));

            System.out.println("Se você engordar " + porcentagemEngordar + "%, seu novo peso será: " + ganhoPeso + " kg");
            System.out.println("Se você emagrecer " + porcentagemEmagrecer + "%, seu novo peso será: " + perdaPeso + " kg");
        }
    }
}
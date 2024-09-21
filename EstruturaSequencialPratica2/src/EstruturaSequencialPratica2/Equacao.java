package EstruturaSequencialPratica2;

import java.util.Scanner;

public class Equacao {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            double valora, valorb, valorc, x1, x2, delta;
            System.out.println("Digite um valor para A, B e C: ");
            valora = entrada.nextDouble();
            valorb = entrada.nextDouble();
            valorc = entrada.nextDouble(); 
            if (valora == 0 && valorb == 0 && valorc == 0) {
                System.out.println("Igualdade confirmada: 0 = 0");
            } else if (valora == 0 && valorb == 0) {
                System.out.println("Coeficientes informados incorretamente.");
            } else if (valora == 0) {
                System.out.println("Essa é uma equação de primeiro grau e seu resultado é: " + (-valorc / valorb));
            } else {
                System.out.println("Essa é uma equação de segundo grau:");
                delta = Math.pow(valorb, 2) - 4 * valora * valorc;
              
                if (delta < 0) {
                	 System.out.println("Delta:" + delta);
                    System.out.println("Essa equação não possui raízes reais.");
                } else if (delta == 0) {
                	 System.out.println("Delta:" + delta);
                    System.out.println("Essa equação possui uma raiz real: " + (-valorb / (2 * valora)));
                } else {
                    x1 = (-valorb + Math.sqrt(delta)) / (2 * valora);
                    x2 = (-valorb - Math.sqrt(delta)) / (2 * valora);
                    System.out.println("Essa equação possui duas raízes reais diferentes:");
                    System.out.println("Delta:" + delta);
                    System.out.println("X1 = " + x1);
                    System.out.println("X2 = " + x2);
                }
            }
        }
    }
}

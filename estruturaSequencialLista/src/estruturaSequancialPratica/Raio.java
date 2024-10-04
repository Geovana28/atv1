package estruturaSequancialPratica;

import java.util.Scanner;

public class Raio {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            Double raio, comprimentoEsfera, volumeEsfera, areaEsfera;
            final double PI = Math.PI; 
            System.out.println("Digite o valor do raio: ");
            raio = entrada.nextDouble();
            comprimentoEsfera = 2 * PI * raio;
            volumeEsfera = (4.0 / 3.0) * PI * Math.pow(raio, 3);
            areaEsfera = 4 * PI * Math.pow(raio, 2);
            System.out.println("O comprimento da esfera (circunferência) é: " + comprimentoEsfera);
            System.out.println("O volume da esfera é: " + volumeEsfera);
            System.out.println("A área da superfície da esfera é: " + areaEsfera);
        }
    }
}


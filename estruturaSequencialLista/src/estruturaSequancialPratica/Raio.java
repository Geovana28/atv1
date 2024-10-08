package estruturaSequancialPratica;

import java.util.*;

public class Raio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            double raio, comprimentoEsfera, volumeEsfera, areaEsfera;
            
            double PI = 3.14159; 
            System.out.println("Digite o valor do raio: ");
            raio = entrada.nextDouble();
            
            comprimentoEsfera = 2 * PI * raio;
            
            volumeEsfera = (4.0 / 3.0) * PI * (raio * raio * raio);
            
            areaEsfera = 4 * PI * (raio * raio);
            
            System.out.println("O comprimento da esfera (circunferência) é: " + comprimentoEsfera);
            System.out.println("O volume da esfera é: " + volumeEsfera);
            System.out.println("A área da superfície da esfera é: " + areaEsfera);
            entrada.close();
    }
}

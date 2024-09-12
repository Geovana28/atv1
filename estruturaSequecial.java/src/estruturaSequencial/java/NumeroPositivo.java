package estruturaSequencial.java;

import java.util.*;

public class NumeroPositivo {

    public static void main(String[] args) {
  
        double numero, quadrado, cubo, raizQuadrada, raizCubica;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite um número positivo: ");
            numero = entrada.nextDouble();
            quadrado = numero * numero;
            
            System.out.println("O valor do número ao quadrado é: " + quadrado);
            
            cubo = numero * numero * numero;
            
            System.out.println("O valor do número ao cubo é: " + cubo);
            raizQuadrada = Math.sqrt(numero);
            
            System.out.println("A raiz quadrada do número é: " + raizQuadrada);
            raizCubica = Math.cbrt(numero);
            System.out.println("O valor da raiz cúbica é: " + raizCubica);
        }
    }
}
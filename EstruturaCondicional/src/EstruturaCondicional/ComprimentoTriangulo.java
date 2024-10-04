package EstruturaCondicional;

import java.util.Scanner;

public class ComprimentoTriangulo {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            double ladoX, ladoY, ladoZ;

            System.out.println("Digite os três valores: ");
            ladoX = entrada.nextDouble();
            ladoY = entrada.nextDouble();
            ladoZ = entrada.nextDouble();

            if (verificarTriangulo(ladoX, ladoY, ladoZ)) {
                System.out.println("Os valores informados podem ser os comprimentos dos lados de um triângulo.");
            } else {
                System.out.println("Os valores informados não podem ser os comprimentos dos lados de um triângulo.");
            }
        }
    }

    public static boolean verificarTriangulo(double a, double b, double c) {
        
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}

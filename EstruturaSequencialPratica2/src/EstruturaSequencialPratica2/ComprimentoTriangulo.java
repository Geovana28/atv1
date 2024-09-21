package EstruturaSequencialPratica2;

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
                System.out.println("Osvalores informados podem ser os comprimentos dos lados de um triângulo.");
            } else {
                System.out.println("Os valores informados não podem ser os comprimentos dos lados de um triângulo.");
            }
        }
    }

    public static boolean verificarTriangulo(double a, double b, double c) {
        return (Math.abs(b - c) < a && a < b + c) &&
               (Math.abs(a - c) < b && b < a + c) &&
               (Math.abs(a - b) < c && c < a + b);
    }
}

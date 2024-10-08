package EstruturaCondicional;

import java.util.*;

public class ComprimentoTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            double ladoA, ladoB, ladoC;

            System.out.println("Informe o primeiro lado do triângulo em cm: ");
            ladoA = entrada.nextDouble();
            System.out.println("Informe o segundo lado do triângulo em cm: ");
            ladoB = entrada.nextDouble();
            System.out.println("Informe o terceiro lado do triângulo em cm: ");
            ladoC = entrada.nextDouble();

            boolean trianguloValido = true;

            if (!(ladoB - ladoC < ladoA && ladoA < ladoB + ladoC)) {
                System.out.println("A condição |" + ladoB + " - " + ladoC + "| < " + ladoA + " < " + ladoB + " + " + ladoC + " não é válida.");
                trianguloValido = false; 
            }
            if (!(ladoA - ladoC < ladoB && ladoB < ladoA + ladoC)) {
                System.out.println("A condição |" + ladoA + " - " + ladoC + "| < " + ladoB + " < " + ladoA + " + " + ladoC + " não é válida.");
                trianguloValido = false; 
            }
            if (!(ladoA - ladoB < ladoC && ladoC < ladoA + ladoB)) {
                System.out.println("A condição |" + ladoA + " - " + ladoB + "| < " + ladoC + " < " + ladoA + " + " + ladoB + " não é válida.");
                trianguloValido = false; 
            }

            if (trianguloValido) {
                System.out.println("Os três valores informados podem ser os comprimentos dos lados de um triângulo.");
            } else {
                System.out.println("Os três valores informados não podem ser os comprimentos dos lados de um triângulo.");
                entrada.close();
        }
    }
}


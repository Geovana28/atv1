package While;

import java.util.Scanner;

public class Matricula {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            while (true) {
               
                System.out.println("Digite a matrícula do aluno (digite uma matrícula negativa para terminar): ");
                int numeroMatricula = entrada.nextInt();

                if (numeroMatricula < 0) {
                    break;
                }

                System.out.println("Digite as três notas do aluno: ");
                double nota1 = entrada.nextDouble();
                double nota2 = entrada.nextDouble();
                double nota3 = entrada.nextDouble();

                double media = (nota1 + nota2 + nota3) / 3;

                if (media >= 70) {
                    System.out.println("O aluno foi aprovado!");
                } else if (media >= 60) {
                    System.out.println("O aluno está em recuperação!");
                } else {
                    System.out.println("O aluno foi reprovado!");
                }
            }
        }
    }
}

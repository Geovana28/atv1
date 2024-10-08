package While;

import java.util.*;

public class Salario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            double somaSalarios = 0; 
            double somaFilhos = 0; 
            int totalPessoas = 0; 

            while (true) {
                System.out.println("Digite o seu salário (ou um valor negativo para terminar): ");
                double salario = entrada.nextDouble();
                
                if (salario < 0) {
                    break;
                }
                
                System.out.println("Digite a quantidade de filhos: ");
                double filhos = entrada.nextDouble();

                somaSalarios = somaSalarios + salario;
                somaFilhos = somaFilhos + filhos;
                totalPessoas++; 
            }
            if (totalPessoas > 0) {
                double mediaSalarial = somaSalarios / totalPessoas;
                double mediaFilhos = somaFilhos / totalPessoas;

                System.out.printf("Média salarial da população: %.2f\n", mediaSalarial);
                System.out.printf("Média do número de filhos: %.2f\n", mediaFilhos);
            } else {
                System.out.println("Nenhum dado foi inserido.");
            }
        entrada.close();
    }
}

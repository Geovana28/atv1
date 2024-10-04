package estruturaSequancialPratica;

import java.util.Scanner;

public class AumentoSalario {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            Double salario, novoSalario;
            System.out.println("Digite o seu salário: ");
            salario = entrada.nextDouble();
            novoSalario = salario + (salario * 0.25); 
            System.out.println("O seu salário após o aumento de 25% é: R$ " + novoSalario);
        }
    }
}

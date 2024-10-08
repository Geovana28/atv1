package estruturaSequancialPratica;

import java.util.*;

public class AumentoSalario2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            Double salario, aumento, novoSalario;
            System.out.println("Digite o seu salário: ");
            salario = entrada.nextDouble();
            System.out.println("Digite a porcentagem do aumento: ");
            aumento = entrada.nextDouble();
            novoSalario = salario + (salario * (aumento / 100));
            System.out.println("O seu salário após o aumento é: R$ " + novoSalario);
            
            entrada.close();
    }
}

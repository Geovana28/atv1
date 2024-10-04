package For;

import java.util.*;

public class MediaIdades {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Quantas idades você deseja informar? ");
            int n = entrada.nextInt(); 

            int somaIdades = 0; 

            for (int i = 0; i < n; i++) {
                System.out.print("Digite a idade " + (i + 1) + ": ");
                int idade = entrada.nextInt();

                
                if (idade < 0) {
                    System.out.println("Idade inválida. Tente novamente.");
                    i--; 
                    continue; 
                }

                somaIdades = somaIdades + idade; 
            }

            double media = (double) somaIdades / n;
            System.out.printf("A média das idades informadas é: %.2f\n", media);
        }
    }
}

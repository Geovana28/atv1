package For;

import java.util.*;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int somaIdades = 0; 
        int contador = 0; 

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.print("Digite uma idade (ou -1 para encerrar): ");
            int idade = entrada.nextInt();

            if (idade == -1) { 
                break; 
            }

            if (idade < 0) {
                System.out.println("Idade inválida. Tente novamente.");
                continue; 
            }

            somaIdades =somaIdades+  idade; 
            contador++; 
        }

        if (contador > 0) { 
            double media = (double) somaIdades / contador;
            System.out.printf("A média das idades informadas é: %.2f\n", media);
        } else {
            System.out.println("Nenhuma idade válida foi informada.");
        }
        
        entrada.close();
    }
}


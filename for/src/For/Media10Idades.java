package For;

import java.util.*;

public class Media10Idades {
	public static void main(String []args) {
		try (Scanner entrada =new Scanner (System.in)){
          
          int quantidadeIdade = 10;
            int somaIdades = 0; 

            for (int i = 0; i < quantidadeIdade; i++) {
                System.out.print("Digite a idade " + (i + 1) + ": ");
                int idade = entrada.nextInt();

                
                if (idade < 0) {
                    System.out.println("Idade inválida. Tente novamente.");
                    i--; 
                    continue; 
                }

                somaIdades += idade; 
            }

            double media = (double) somaIdades / quantidadeIdade;
            System.out.printf("A média das idades informadas é: %.2f\n", media);
        }
    }
}



package For;

import java.util.*;

public class SexoFeminino {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            int quantidadeFeminino = 0; 
   
            for (int i = 0; i < 10; i++) {
                System.out.println("Digite o sexo da pessoa (m para masculino, f para feminino): ");
                String sexo = entrada.next(); 

                System.out.println("Digite a idade da pessoa: ");
                int idade = entrada.nextInt(); 

                if (sexo.equalsIgnoreCase("f") && idade >= 20 && idade <= 40) {
                    quantidadeFeminino++; 
                }
            }

            System.out.println("Número de mulheres entre 20 e 40 anos: " + quantidadeFeminino);
        entrada.close();
    }
}


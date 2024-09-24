package For;

import java.util.*;

public class Peso {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int quantidadeHomens = 0; 
            int quantidadeMulheres = 0; 
            
            for (int i = 0; i < 10; i++) {
                System.out.println("Digite o sexo da pessoa (m para masculino, f para feminino): ");
                String sexo = entrada.next(); 
                
                System.out.println("Digite o peso da pessoa: ");
                double peso = entrada.nextDouble(); 
                
                if (sexo.equalsIgnoreCase("f") && peso >= 50 && peso <= 70) {
                    quantidadeMulheres++; 
                } 
                else if (sexo.equalsIgnoreCase("m") && peso >= 60 && peso <= 80) {
                    quantidadeHomens++; 
                }
            }
            
            System.out.println("O número de mulheres com peso entre 50 e 70 kg: " + quantidadeMulheres);
            System.out.println("O número de homens com peso entre 60 e 80 kg: " + quantidadeHomens);
        }
    }
}

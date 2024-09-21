package EstruturaSequencialPratica2;

import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
        	System.out.println("1 - Sapato: ");
            System.out.println("2 - Bolsa: ");
            System.out.println("3 - Camisa: ");
            System.out.println("4 - Calça: ");
            System.out.println("5 - Blusa: ");
            System.out.print("Digite o código do produto para ver seu preço: ");
            int codigo = entrada.nextInt();
            switch (codigo) {
                case 1:
                    System.out.println("Sapato - R$ 99,99"); break;
                case 2:
                    System.out.println("Bolsa - R$ 103,89"); break;
                case 3:
                    System.out.println("Camisa - R$ 49,98"); break;
                case 4:
                    System.out.println("Calça - R$ 89,72"); break;
                case 5:
                    System.out.println("Blusa - R$ 97,35"); break;
                default:
                    System.out.println("Código inválido. Por favor, digite um código de produto válido."); break;
            }
        }
    }
}

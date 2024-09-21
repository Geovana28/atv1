package EstruturaSequencialPratica2;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int diarias;
            double valorDiaria = 500.0, taxaServico, valorTotal;
            System.out.print("Digite quantas diárias você passou no hotel: ");
            diarias = entrada.nextInt();
            if (diarias < 15) {
                taxaServico = 15.0;
            } else if (diarias == 15) {
                taxaServico = 10.0;
            } else {
                taxaServico = 5.0;
            }
            valorTotal = diarias * (valorDiaria + taxaServico);
            System.out.println("O valor total da sua estadia é de: R$ " + valorTotal);
        }
    }
}

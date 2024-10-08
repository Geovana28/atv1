package While;

import java.util.*;

public class Televisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            
            double canal2 = 0;
            double canal4 = 0;
            double canal5 = 0;
            double canal7 = 0;
            double canal12 = 0;
            double totalPessoas = 0;

            while (true) {
              
                System.out.println("Digite o número do canal (2, 4, 5, 7, 12) ou 0 para terminar: ");
                int canal = entrada.nextInt();

                if (canal == 0) {
                    break;
                }

                if (canal == 2 || canal == 4 || canal == 5 || canal == 7 || canal == 12) {
                    System.out.println("Digite o número de pessoas assistindo ao canal: ");
                    double pessoas = entrada.nextDouble();

                    switch (canal) {
                        case 2:
                            canal2 = canal2 + pessoas;  
                            break;
                        case 4:
                            canal4 = canal4 + pessoas;  
                            break;
                        case 5:
                            canal5 = canal5 + pessoas;  
                            break;
                        case 7:
                            canal7 = canal7 + pessoas;  
                            break;
                        case 12:
                            canal12 = canal12 + pessoas; 
                            break;
                    }
                    totalPessoas = totalPessoas + pessoas; 
                } else {
                    System.out.println("Número de canal inválido. Tente novamente.");
                }
            }

            if (totalPessoas > 0) {
                System.out.printf("Percentual de audiência do canal 2: %.2f%%\n", (canal2 / totalPessoas) * 100);
                System.out.printf("Percentual de audiência do canal 4: %.2f%%\n", (canal4 / totalPessoas) * 100);
                System.out.printf("Percentual de audiência do canal 5: %.2f%%\n", (canal5 / totalPessoas) * 100);
                System.out.printf("Percentual de audiência do canal 7: %.2f%%\n", (canal7 / totalPessoas) * 100);
                System.out.printf("Percentual de audiência do canal 12: %.2f%%\n", (canal12 / totalPessoas) * 100);
            } else {
                System.out.println("Nenhum dado foi inserido.");
            }
            entrada.close();
    }
}

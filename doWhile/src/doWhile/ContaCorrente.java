package doWhile;

import javax.swing.JOptionPane;

public class ContaCorrente {

    public static void main(String[] args) {
        String continuar = ""; 

        do {
            String conta = JOptionPane.showInputDialog("Digite o número da conta (3 dígitos): ");

            if (conta == null || conta.length() != 3) {
                JOptionPane.showMessageDialog(null, "A conta deve ter exatamente 3 dígitos!");
                continue;
            }

            int contaNumerica = Integer.parseInt(conta);

            int centena = contaNumerica / 100;
            int dezena = (contaNumerica / 10) % 10;
            int unidade = contaNumerica % 10;
            int contaInversa = unidade * 100 + dezena * 10 + centena;
            int soma = contaNumerica + contaInversa;
            int unidadeMilhar = soma / 1000;
            int centenaSoma = (soma / 100) % 10;
            int dezenaSoma = (soma / 10) % 10;
            int unidadeSoma = soma % 10;
            int resultado = unidadeMilhar * 0 + centenaSoma * 1 + dezenaSoma * 2 + unidadeSoma * 3;
            int digitoVerificador = resultado % 10;

            JOptionPane.showMessageDialog(null, "O dígito verificador da conta " + conta + " é: " + digitoVerificador);

            continuar = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");

            if (continuar == null || continuar.equalsIgnoreCase("n") || continuar.equalsIgnoreCase("não")) {
                break; 
            }

        } while (continuar.equalsIgnoreCase("s") || continuar.equalsIgnoreCase("sim"));

        System.exit(0);
    }
}

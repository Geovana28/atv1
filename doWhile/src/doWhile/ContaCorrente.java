package doWhile;

import javax.swing.JOptionPane;

public class ContaCorrente {

    public static void main(String[] args) {
        String conta = ""; 

        do {
            conta = JOptionPane.showInputDialog("Digite o número da conta (3 dígitos): ");

            // Verifica se a conta é nula ou não tem 3 dígitos
            if (conta == null || conta.length() != 3) {
                JOptionPane.showMessageDialog(null, "A conta deve ter exatamente 3 dígitos!");
                System.exit(0);  // Encerra o programa se a conta for inválida
            }

            // Converte a conta para número sem o try-catch
            int contaNumerica = Integer.parseInt(conta);

            // Calcula o dígito verificador
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

            // O programa se encerra aqui sem repetir o loop
            break; // Encerra o loop após uma execução

        } while (true);  // O loop será executado uma vez e depois quebrado

        System.exit(0);  // Encerra o programa após o cálculo
    }
}

package doWhile;

import javax.swing.JOptionPane;

public class ValidacaoDados {

    public static void main(String[] args) {
        do {
            // Validação da nota
            double nota = -1;
            while (nota < 0 || nota > 10) {
                String entradaNota = JOptionPane.showInputDialog("Digite uma nota entre 0 e 10: ");
                if (entradaNota != null && entradaNota.matches("\\d+(\\.\\d+)?")) {  // Verifica se a entrada é numérica
                    nota = Double.parseDouble(entradaNota);
                    if (nota < 0 || nota > 10) {
                        JOptionPane.showMessageDialog(null, "Nota inválida. Tente novamente.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número.");
                }
            }

            // Validação do salário
            double salario = 0;
            while (salario <= 0) {
                String entradaSalario = JOptionPane.showInputDialog("Digite um salário maior que 0: ");
                if (entradaSalario != null && entradaSalario.matches("\\d+(\\.\\d+)?")) {  // Verifica se a entrada é numérica
                    salario = Double.parseDouble(entradaSalario);
                    if (salario <= 0) {
                        JOptionPane.showMessageDialog(null, "Salário inválido. Tente novamente.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número.");
                }
            }

            // Validação do sexo
            String sexo = "";
            while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
                sexo = JOptionPane.showInputDialog("Digite o sexo (m ou f): ");
                if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
                    JOptionPane.showMessageDialog(null, "Sexo inválido. Tente novamente.");
                }
            }

            // Validação da idade
            int idade = -1;
            while (idade < 0 || idade > 120) {
                String entradaIdade = JOptionPane.showInputDialog("Digite a idade (entre 0 e 120): ");
                if (entradaIdade != null && entradaIdade.matches("\\d+")) {  // Verifica se a entrada é um número inteiro
                    idade = Integer.parseInt(entradaIdade);
                    if (idade < 0 || idade > 120) {
                        JOptionPane.showMessageDialog(null, "Idade inválida. Tente novamente.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número.");
                }
            }

            // Mensagem de sucesso após validar todos os dados
            JOptionPane.showMessageDialog(null, "Todos os dados foram validados com sucesso!");

            // O loop será encerrado aqui após a primeira execução
            break;

        } while (true);  // O loop do-while será executado apenas uma vez

        System.exit(0);  // Encerra o programa após a validação
    }
}
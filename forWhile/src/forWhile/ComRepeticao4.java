package forWhile;

import javax.swing.JOptionPane;

public class ComRepeticao4 {

    public static void main(String[] args) {
        String continuar;
        do {
            double nota = -1;
            while (nota < 0 || nota > 10) {
                String entradaNota = JOptionPane.showInputDialog("Digite uma nota entre 0 e 10: ");
                nota = Double.parseDouble(entradaNota);
                if (nota < 0 || nota > 10) {
                    JOptionPane.showMessageDialog(null, "Nota inválida. Tente novamente.");
                }
            }

            double salario = 0;
            while (salario <= 0) {
                String entradaSalario = JOptionPane.showInputDialog("Digite um salário maior que 0: ");
                salario = Double.parseDouble(entradaSalario);
                if (salario <= 0) {
                    JOptionPane.showMessageDialog(null, "Salário inválido. Tente novamente.");
                }
            }

            String sexo = "";
            while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
                sexo = JOptionPane.showInputDialog("Digite o sexo (m ou f): ");
                if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
                    JOptionPane.showMessageDialog(null, "Sexo inválido. Tente novamente.");
                }
            }

            int idade = -1;
            while (idade < 0 || idade > 120) {
                String entradaIdade = JOptionPane.showInputDialog("Digite a idade (entre 0 e 120): ");
                idade = Integer.parseInt(entradaIdade);
                if (idade < 0 || idade > 120) {
                    JOptionPane.showMessageDialog(null, "Idade inválida. Tente novamente.");
                }
            }

            JOptionPane.showMessageDialog(null, "Todos os dados foram validados com sucesso!");

            continuar = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
        } while (continuar.equalsIgnoreCase("s") || continuar.equalsIgnoreCase("sim"));

        JOptionPane.showMessageDialog(null, "Programa finalizado.");
        System.exit(0);
    }
}

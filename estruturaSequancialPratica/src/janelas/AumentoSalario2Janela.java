package janelas;

import javax.swing.JOptionPane;

public class AumentoSalario2Janela {

    public static void main(String[] args) {
        try {
            String salarioStr = JOptionPane.showInputDialog("Digite o seu salário:");
            double salario = Double.parseDouble(salarioStr);
            
            String aumentoStr = JOptionPane.showInputDialog("Digite a porcentagem de aumento:");
            double aumento = Double.parseDouble(aumentoStr);
            
            double novoSalario = salario + (salario * (aumento / 100));
            JOptionPane.showMessageDialog(null, "O seu salário após o aumento é: R$ " + novoSalario);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

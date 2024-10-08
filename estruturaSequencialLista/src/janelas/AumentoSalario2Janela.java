package janelas;

import javax.swing.JOptionPane;

public class AumentoSalario2Janela {

    public static void main(String[] args) {
     
            String salarioString = JOptionPane.showInputDialog("Digite o seu salário:");
            double salario = Double.parseDouble(salarioString);
            
            String aumentoString = JOptionPane.showInputDialog("Digite a porcentagem de aumento:");
            double aumento = Double.parseDouble(aumentoString);
            
            double novoSalario = salario + (salario * (aumento / 100));
            JOptionPane.showMessageDialog(null, "O seu salário após o aumento é: R$ " + novoSalario);

        }
    }


package janelas;

import javax.swing.JOptionPane;

public class AumentoSalarioJanela {
    public static void main(String[] args) {

            String salarioStr = JOptionPane.showInputDialog("Digite o seu salário: ");
           
            double salario = Double.parseDouble(salarioStr);
            
            double novoSalario = salario + (salario * 0.25);
            
            JOptionPane.showMessageDialog(null, "Seu salário após o aumento é: R$ " + novoSalario);
 
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

package janelas;

import javax.swing.JOptionPane;

public class AumentoSalarioJanela {
    public static void main(String[] args) {

            String salarioString = JOptionPane.showInputDialog("Digite o seu salário: ");
           
            double salario = Double.parseDouble(salarioString);
            
            double novoSalario = salario + (salario * 0.25);
            
            JOptionPane.showMessageDialog(null, "Seu salário após o aumento é: R$ " + novoSalario);

        }
    }

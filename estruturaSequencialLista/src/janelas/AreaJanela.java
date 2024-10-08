package janelas;

import javax.swing.*;

public class AreaJanela {

    public static void main(String[] args) {
       
            String ladoMaiorStr = JOptionPane.showInputDialog("Digite o lado maior do losango:");
            double ladoMaior = Double.parseDouble(ladoMaiorStr);
            
            String ladoMenorStr = JOptionPane.showInputDialog("Digite o lado menor do losango:");
            double ladoMenor = Double.parseDouble(ladoMenorStr);
            
            double resultado = (ladoMaior * ladoMenor) / 2;
            JOptionPane.showMessageDialog(null, "A área do losango é: " + resultado);      
        }
    }


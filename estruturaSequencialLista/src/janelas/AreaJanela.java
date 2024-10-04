package janelas;

import javax.swing.*;

public class AreaJanela {

    public static void main(String[] args) {
       
            String ladoMaiorStr = JOptionPane.showInputDialog("Digite o lado maior do losango:");
            Double ladoMaior = Double.parseDouble(ladoMaiorStr);
            String ladoMenorStr = JOptionPane.showInputDialog("Digite o lado menor do losango:");
            Double ladoMenor = Double.parseDouble(ladoMenorStr);
            Double resultado = (ladoMaior * ladoMenor) / 2;
            JOptionPane.showMessageDialog(null, "A área do losango é: " + resultado);      
      
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }


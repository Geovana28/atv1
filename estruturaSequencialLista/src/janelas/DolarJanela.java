package janelas;

import javax.swing.JOptionPane;

public class DolarJanela {
    public static void main(String[] args) {

            String dolarString = JOptionPane.showInputDialog("Digite a cotação do Dólar hoje: ");
           
            dolarString = dolarString.replace(",", ".");
            double dolar = Double.parseDouble(dolarString);
            String quantidadeString = JOptionPane.showInputDialog("Digite a quantidade de dólares que você possui: ");
            quantidadeString = quantidadeString.replace(",", ".");
            double quantidade = Double.parseDouble(quantidadeString);
            double real = dolar * quantidade;
            JOptionPane.showMessageDialog(null, "O valor em reais que você possui é: R$ " + real);
          
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }


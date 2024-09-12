package janelas;

import javax.swing.JOptionPane;

public class TabuadaJanelas {
    public static void main(String[] args) {
        try {
            String numeroTabuada = JOptionPane.showInputDialog("Digite um número para conferir sua tabuada de multiplicação:");
            int numero = Integer.parseInt(numeroTabuada);
            StringBuilder tabuada = new StringBuilder();
            tabuada.append("A tabuada de multiplicação do ").append(numero).append(" é:\n");
            for (int i = 1; i <= 10; i++) {
                tabuada.append(numero).append(" X ").append(i).append(" = ").append(numero * i).append("\n");
            }
            JOptionPane.showMessageDialog(null, tabuada.toString(), "Tabuada", JOptionPane.INFORMATION_MESSAGE);
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
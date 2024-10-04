package janelas;

import javax.swing.JOptionPane;

public class TabuadaJanelas {
    public static void main(String[] args) {
        String numeroTabuada = JOptionPane.showInputDialog("Digite um número para conferir sua tabuada de multiplicação:");
        int numero = Integer.parseInt(numeroTabuada);

        String tabuada = "A tabuada de multiplicação do " + numero + " é:\n";
        tabuada = tabuada + numero + " X 1 = " + (numero * 1) + "\n";
        tabuada = tabuada + numero + " X 2 = " + (numero * 2) + "\n";
        tabuada = tabuada + numero + " X 3 = " + (numero * 3) + "\n";
        tabuada = tabuada + numero + " X 4 = " + (numero * 4) + "\n";
        tabuada = tabuada + numero + " X 5 = " + (numero * 5) + "\n";
        tabuada = tabuada + numero + " X 6 = " + (numero * 6) + "\n";
        tabuada = tabuada + numero + " X 7 = " + (numero * 7) + "\n";
        tabuada = tabuada + numero + " X 8 = " + (numero * 8) + "\n";
        tabuada = tabuada + numero + " X 9 = " + (numero * 9) + "\n";
        tabuada = tabuada + numero + " X 10 = " + (numero * 10) + "\n";

        JOptionPane.showMessageDialog(null, tabuada, "Tabuada", JOptionPane.INFORMATION_MESSAGE);
    }
}

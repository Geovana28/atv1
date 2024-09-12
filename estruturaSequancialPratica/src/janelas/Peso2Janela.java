package janelas;

import javax.swing.JOptionPane;

public class Peso2Janela {

    public static void main(String[] args) {
        try {
            String pesoStr = JOptionPane.showInputDialog("Digite o seu peso (em kg):");
            double peso = Double.parseDouble(pesoStr);

            String porcentagemEngordarStr = JOptionPane.showInputDialog("Digite a porcentagem que deseja engordar:");
            double porcentagemEngordar = Double.parseDouble(porcentagemEngordarStr);

            String porcentagemEmagrecerStr = JOptionPane.showInputDialog("Digite a porcentagem que deseja emagrecer:");
            double porcentagemEmagrecer = Double.parseDouble(porcentagemEmagrecerStr);

            double ganhoPeso = peso + (peso * (porcentagemEngordar / 100));

            double perdaPeso = peso - (peso * (porcentagemEmagrecer / 100));

            JOptionPane.showMessageDialog(null, 
                "Se você engordar " + porcentagemEngordar + "%, seu novo peso será: " + ganhoPeso + " kg\n" +
                "Se você emagrecer " + porcentagemEmagrecer + "%, seu novo peso será: " + perdaPeso + " kg"
            );
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

package janelas;

import javax.swing.JOptionPane;

public class IdadeJanela {

    public static void main(String[] args) {

            String anoDeNascimentoStr = JOptionPane.showInputDialog("Digite seu ano de nascimento:");
            int anoDeNascimento = Integer.parseInt(anoDeNascimentoStr);

            String anoAtualStr = JOptionPane.showInputDialog("Digite o ano atual:");
            int anoAtual = Integer.parseInt(anoAtualStr);

            int idadeAtual = anoAtual - anoDeNascimento;
            JOptionPane.showMessageDialog(null, "Sua idade é: " + idadeAtual);

            String anoFuturoStr = JOptionPane.showInputDialog("Digite o ano futuro:");
            int anoFuturo = Integer.parseInt(anoFuturoStr);

            int idadeFutura = anoFuturo - anoDeNascimento;
            JOptionPane.showMessageDialog(null, "Sua idade no ano " + anoFuturo + " será: " + idadeFutura);
        }
    }

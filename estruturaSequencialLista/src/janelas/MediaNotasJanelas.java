package janelas;

import javax.swing.JOptionPane;

public class MediaNotasJanelas {
    public static void main(String[] args) {
            String nota1String = JOptionPane.showInputDialog("Digite a primeira nota: ");
            double numero1 = Double.parseDouble(nota1String);
            
            String nota2String = JOptionPane.showInputDialog("Digite a segunda nota: ");
            double numero2 = Double.parseDouble(nota2String);
            
            String nota3String = JOptionPane.showInputDialog("Digite a terceira nota: ");
            double numero3 = Double.parseDouble(nota3String);
            
            double media = (numero1 + numero2 + numero3) / 3;
            
            JOptionPane.showMessageDialog(null, "A média das suas notas é: " + media);

            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }


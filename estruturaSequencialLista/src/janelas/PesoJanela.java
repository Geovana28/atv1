package janelas;

import javax.swing.JOptionPane;

public class PesoJanela {
	public static void main(String[]args) {

			String pesoString = JOptionPane.showInputDialog("Digite o seu peso: ");
			double peso = Double.parseDouble(pesoString);
			double ganhoPeso = peso + (peso * 0.15);
			double perdaPeso = peso - (peso * 0.20);
			JOptionPane.showMessageDialog(null, "Seu peso após o ganho de peso será de: "+ ganhoPeso);
			JOptionPane.showMessageDialog(null, "Seu peso após a perda de peso será de: " + perdaPeso);
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}



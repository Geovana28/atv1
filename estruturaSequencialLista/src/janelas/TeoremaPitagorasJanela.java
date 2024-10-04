package janelas;

import javax.swing.JOptionPane;

public class TeoremaPitagorasJanela {
	public static void main(String[]args) {
			String coeficienteA =JOptionPane.showInputDialog("Digite um valor para o cateto A: ");
			Double valorA = Double.parseDouble(coeficienteA);
			String coeficienteB =JOptionPane.showInputDialog("Digite um valor para o cateto B: ");
			Double valorB = Double.parseDouble(coeficienteB);
			double hipotenusa = Math.sqrt(valorA * valorA + valorB * valorB);
			JOptionPane.showMessageDialog(null , "O valor da Hipotenusa é: " + hipotenusa);
			
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);	
		}
	}


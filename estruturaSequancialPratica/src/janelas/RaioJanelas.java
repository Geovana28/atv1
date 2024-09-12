package janelas;

import javax.swing.JOptionPane;

public class RaioJanelas {
	public static void main(String[]args) {
		try {
			String raioString = JOptionPane.showInputDialog("Digite o raio da circunferência:");
			double raio = Double.parseDouble(raioString);
			final double PI = Math.PI; 
           double comprimento = 2 * PI * raio;
            double volume= (4.0 / 3.0) * PI * Math.pow(raio, 3);
            double area = 4 * PI * Math.pow(raio, 2);
			JOptionPane.showMessageDialog(null, "O comprimento da circunferência é: "+ comprimento);
			JOptionPane.showMessageDialog(null, "O volume da circunferência é: "+ volume);
			JOptionPane.showMessageDialog(null, "A área da circunferência é: "+ area);
		} catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}

}

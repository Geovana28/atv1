package janelas;

import javax.swing.JOptionPane;

public class RaioJanelas {
	public static void main(String[]args) {

			String raioString = JOptionPane.showInputDialog("Digite o raio da circunferência:");
			double raio = Double.parseDouble(raioString);
			
			double PI = 3.14159; 
           double comprimento = 2 * PI * raio;
            double volume= (4.0 / 3.0) * PI * (raio * raio *raio);
            double area = 4 * PI * (raio * raio);
            
			JOptionPane.showMessageDialog(null, "O comprimento da circunferência é: "+ comprimento);
			
			JOptionPane.showMessageDialog(null, "O volume da circunferência é: "+ volume);
			
			JOptionPane.showMessageDialog(null, "A área da circunferência é: "+ area);
		}
	}



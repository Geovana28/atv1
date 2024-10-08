package janelas;

import javax.swing.JOptionPane;

public class CelsiusJanela {
	public static void main(String[]args) {

			String celsiusString = JOptionPane.showInputDialog("Digite a temperatura em celsius: ");
			double celsius = Double.parseDouble(celsiusString);
			double farenheit = celsius * 1.8 +32;
			JOptionPane.showMessageDialog(null, "A temperatura em farenheits é: " + farenheit);

		}
	}


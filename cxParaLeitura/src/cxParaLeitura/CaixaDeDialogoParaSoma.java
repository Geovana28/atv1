package cxParaLeitura;

import javax.swing.JOptionPane;

public class CaixaDeDialogoParaSoma {
	
	public static void main(String[] args) {
		String entrada;
		int numero1, numero2, soma;
		
		entrada = JOptionPane.showInputDialog("Digite um número: ");
		numero1 = Integer.parseInt(entrada);
		
		entrada = JOptionPane.showInputDialog("Digite outro número: ");
		numero2 = Integer.parseInt(entrada);
		
		soma = numero1 + numero2;
		JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma);
		System.exit(0);
	}
}

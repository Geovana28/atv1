package janelas;

import javax.swing.JOptionPane;

 public class SalariosJanelas {
	public static void main(String[]args) {

	    String salarioString = JOptionPane.showInputDialog("Digite o seu salário: ");
	   double salario = Double.parseDouble(salarioString);
	    String salarioMinimoString = JOptionPane.showInputDialog("Digite o salário minímo: ");
	  double salarioMinimo = Double.parseDouble(salarioMinimoString);
     	double quantidadeSalarios = salario / salarioMinimo;
	     JOptionPane.showMessageDialog(null, "A quantidade de sálarios minímos que você recebe é: " + quantidadeSalarios);
	
           JOptionPane.showMessageDialog(null, "Por favor, insira um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
       }
    }  

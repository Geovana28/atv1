package doWhile;
import javax.swing.JOptionPane;

public class ComRepeticao2 {
    public static void main(String args[]) {
        String continuar;
        do {
            String entrada;
            int numero1, numero2, soma;
            
            entrada = JOptionPane.showInputDialog("Informe o primeiro número: ");
            numero1 = Integer.parseInt(entrada); 
            entrada = JOptionPane.showInputDialog("Informe o segundo número: ");
            numero2 = Integer.parseInt(entrada); 
            soma = numero1 + numero2;

            JOptionPane.showMessageDialog(null, "A soma é: " + soma);

            
            int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (resp == JOptionPane.YES_OPTION) {
                continuar = "sim";
            } else {
                continuar = "não";
            }

        } while (continuar.equalsIgnoreCase("s") || continuar.equalsIgnoreCase("sim"));  
        
        System.exit(0); 
    }
}

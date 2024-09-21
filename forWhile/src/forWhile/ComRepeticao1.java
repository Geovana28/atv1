package forWhile;
import javax.swing.JOptionPane;

public class ComRepeticao1 {
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

            continuar = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");

        } while (continuar.equalsIgnoreCase("s") || continuar.equalsIgnoreCase("sim")); 
        
        System.exit(0); 
    }
}

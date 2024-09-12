 package estruturaSequencial.java;
 
import java.util.*;

 public class Media{

    public static void main(String[]args){
        double numero1, numero2, numero3, soma, resultado;
        try (Scanner entrada = new Scanner(System.in)) {
			System.out.println ("Digite três números: ");
			numero1 = entrada.nextDouble();
			numero2 = entrada.nextDouble();
			numero3 = entrada.nextDouble();
		}
        soma = numero1 + numero2 + numero3;
        resultado = soma/3;
        System.out.println("A média dos três números é: " + resultado);

    }
}

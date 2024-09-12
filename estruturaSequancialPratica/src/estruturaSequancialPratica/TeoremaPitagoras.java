package estruturaSequancialPratica;

import java.util.*;

public class TeoremaPitagoras {
 public static void main(String[]args) {
	 try (Scanner entrada = new Scanner(System.in)){
		 Double catetoA, catetoB, hipotenusa;
		 System.out.println("Digite o valor do primeiro cateto: ");
		 catetoA = entrada.nextDouble();
		 System.out.println("Digite o valor do segundo cateto: ");
		 catetoB = entrada.nextDouble();
		 hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);
		 System.out.println("O valor da hipotenusa é: "+ hipotenusa);
		 
		 
	 }
 }

}

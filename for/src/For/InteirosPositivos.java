package For;

import java.util.*;

public class InteirosPositivos {
	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	    int n1, n2;
		    System.out.print("Digite um número: ");
		    n1 = entrada.nextInt();
		    System.out.print("Digite um número: ");
		    n2 = entrada.nextInt();
	     	for(int i = n1; i <= n2; i++)
		    System.out.println( i);
	     	
	     	entrada.close();
	}
}

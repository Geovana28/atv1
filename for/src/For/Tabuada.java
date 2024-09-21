package For;

import java.util.*;

public class Tabuada {
	public static void main(String[] args) {
		int n;
	try(Scanner entrada = new Scanner(System.in)){
		System.out.print("Digite um número: ");
		n = entrada.nextInt();
		for(int i = 1; i <= 10; i++)
		System.out.println(n + " x " + i + " = " + (n * i));
		
		}
	}
}

package EstruturaSequencialPratica2;

import java.util.*;

public class Funcao {
	  public static double f(double x) {
	        if (x < -2) {
	            return 2 * x + 2;
	        } else if (-2 <= x && x <= 3) {
	            return 3;
	        } else { // x > 3
	            return -x;
	        }
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um valor para x: ");
	        double entrada = scanner.nextDouble();

	        double resultado = f(entrada);
	        System.out.printf("O valor da função f(x) para x = %.2f é %.2f.%n", entrada, resultado);

	        scanner.close();
	    }
	}


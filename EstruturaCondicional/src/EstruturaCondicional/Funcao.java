package EstruturaCondicional;

import java.util.Scanner;

public class Funcao {
	public static double f(double x) {
	    int caso;

	    if (x < -2) {
	        caso = 1;
	    } else if (x <= 3) {
	        caso = 2;
	    } else {
	        caso = 3;
	    }

	    switch (caso) {
	        case 1:
	            return 2 * x + 2;
	        case 2:
	            return 3;
	        case 3:
	            return -x;
	        default:
	            return 0;
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

package estruturaSequencial.java;

import java.util.*;

public class Celsius {

	public static void main(String []args) {
		Double valorCelsius, valorFahrenheit;
		try (Scanner entrada = new Scanner(System.in)){
			System.out.println("Digite a temperatura em Celsius: ");
			valorCelsius = entrada.nextDouble();
			valorFahrenheit = valorCelsius * 1.8 +32;
			System.out.println("O valor em Fahrenheit é de: " + valorFahrenheit);
			
		}
	}
}

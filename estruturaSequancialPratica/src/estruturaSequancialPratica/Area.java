package estruturaSequancialPratica;
import java.util.*;

public class Area {

	public static void main(String []args) {
		Double ladoMaior, ladoMenor,resultado;
		try (Scanner entrada = new Scanner(System.in)){
			System.out.println("Digite o lado maior do losango: ");
			ladoMaior = entrada.nextDouble();
			System.out.println("Digite o lado menor do losango: ");
			ladoMenor = entrada.nextDouble();
			resultado = (ladoMaior * ladoMenor)/2;
			System.out.println("A área do losango é: " + resultado);
			
			
		}
	}
}

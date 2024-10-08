package estruturaSequancialPratica;

import java.util.*;

public class MediaNotas {

   public static void main(String[]args){
       double nota1, nota2, nota3, soma, resultado;
       Scanner entrada = new Scanner(System.in);
			System.out.println ("Digite as três notas do aluno : ");
			nota1 = entrada.nextDouble();
			nota2 = entrada.nextDouble();
			nota3 = entrada.nextDouble();
       soma = nota1 + nota2 + nota3;
       resultado = soma/3;
       System.out.println("A média das três notas é: " + resultado);
       entrada.close();
   }
}

package While;

import java.util.*;

public class NotaFinal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            int totalAlunos90ouMais = 0;  
            int totalReprovados = 0;     
            double maiorNota = 0;
            double menorNota =  0;
            double somaNotas = 0;          
            int totalAlunos = 0;           

            while (true) {
                System.out.println("Digite a nota do aluno (digite uma nota negativa para terminar): ");
                double nota = entrada.nextDouble();

                if (nota < 0) 
                    break;  
                
                System.out.println("Digite o total de faltas do aluno: ");
                int faltas = entrada.nextInt();

                
                if (nota >= 90) 
                    totalAlunos90ouMais++;
                

                if (nota < 70 || faltas >= 20) 
                    totalReprovados++;
                

                if (nota > maiorNota) 
                    maiorNota = nota;
                
                
                if (nota < menorNota) 
                    menorNota = nota;
                
                somaNotas = somaNotas + nota;
                totalAlunos++;

            if (totalAlunos > 0) {
                double mediaNotas = somaNotas / totalAlunos;

                System.out.println("Quantidade de alunos com nota >= 90: " + totalAlunos90ouMais);
                System.out.println("Quantidade de alunos reprovados por nota ou faltas: " + totalReprovados);
                System.out.println("Maior nota: " + maiorNota);
                System.out.println("Menor nota: " + menorNota);
                System.out.println("Média de notas da turma: " + mediaNotas);
            } else {
                System.out.println("Nenhum dado foi inserido.");
            }
            entrada.close();
            }
    }
}
          
            
            
            
   
           


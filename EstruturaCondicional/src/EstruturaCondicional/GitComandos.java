package EstruturaCondicional;

import java.util.*;

public class GitComandos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um comando Git (git clone, git fetch, git pull): ");
        String comando = scanner.nextLine().toLowerCase(); 

        switch (comando) {
            case "git clone":
                System.out.println("Explicação: O comando 'git clone' é usado para criar uma cópia local de um repositório remoto.");
                System.out.println("Exemplo: git clone https://github.com/usuario/repo.git");
                break;

            case "git fetch":
                System.out.println("Explicação: O comando 'git fetch' é usado para baixar mudanças de um repositório remoto, mas não junta essas mudanças na sua cópia local.");
                System.out.println("Exemplo: git fetch origin");
                break;

            case "git pull":
                System.out.println("Explicação: O comando 'git pull' é usado para baixar e juntar mudanças de um repositório remoto na sua cópia local.");
                System.out.println("Exemplo: git pull origin main");
                break;

            default:
                System.out.println("Comando inválido. Por favor, insira 'git clone', 'git fetch' ou 'git pull'.");
                break;
        }

        scanner.close();
    }
}

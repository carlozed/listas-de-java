import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite o ano de nascimento");
        int anoNascimento = scanner.nextInt();

        System.out.println("Olá " + nome + " você tem " + (2026 - anoNascimento) + " anos");
        scanner.close();
    }
}
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);

        String nome1, nome2;
        System.out.println("Digite o primeiro nome:");
        nome1 = leitor.nextLine();
        System.out.println("Digite o segundo nome:");
        nome2 = leitor.nextLine();

        int idade1, idade2, diferenca;
        System.out.println("Digite a idade de " + nome1);
        idade1 = leitor.nextInt();
        System.out.println("Digite a idade de " + nome2);
        idade2 = leitor.nextInt();

        diferenca = (Math.abs(idade1 - idade2));
        System.out.println("A diferença de idade é de: " + diferenca);
        leitor.close();
    }
}

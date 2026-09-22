import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);

        float base, altura, area;

        System.out.println("Digite a base:");
        base = leitor.nextFloat();
        System.out.println("Digite a altura:");
        altura = leitor.nextFloat();
        area = base * altura;
        System.out.println("Área: " + area);
        leitor.close();
    }
}

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float area;
        System.out.println("Digite o lado do quadrado:");
        float lado = leitor.nextFloat();
        area = lado * lado;

        System.out.println("Área= " + area);
        leitor.close();
    }
}
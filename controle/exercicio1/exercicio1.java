package controle.exercicio1;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, resultado;

        System.out.println("Digite um número:");
        numero = scanner.nextInt();

        for (int i = 1;i <= 10;i++){
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}
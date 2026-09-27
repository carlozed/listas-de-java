package controle.exercicio3;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero1, numero2, opcao;
    System.out.println("Digite o primeiro numero:");
    numero1 = scanner.nextInt();
    System.out.println("Digite o segundo numero:");
    numero2 = scanner.nextInt();
    System.out.println("Escolha a opção 1- par | 2 - impar?");
    opcao = scanner.nextInt();
    System.out.println("---RESULTADO---");
    if (opcao == 1) {
        for (int i = numero2; i >= numero1; i--){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    } else if (opcao == 2){
        for (int i = numero2; i >= numero1; i--){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    scanner.close();
    }
    
}
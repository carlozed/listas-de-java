package controle.exercicio4;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroNumero, numeroN;

        System.out.println("Digite um número: ");
        primeiroNumero = scanner.nextInt();
        System.out.println("Digite o próximo número: ");
        
        while (true) {
            numeroN = scanner.nextInt();
            
            if (numeroN < primeiroNumero){
                System.out.println("Digite o próximo número: ");
                continue;
            } else if(numeroN % primeiroNumero == 0){
                System.out.println("Esta divisão é exata. Digite o próximo número:");
            }
            else if(numeroN % primeiroNumero != 0){
                System.out.println("Esta divisão não é exata.");
                break;
            }
        }
        scanner.close();
    }
}

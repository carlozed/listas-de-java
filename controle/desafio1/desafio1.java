package controle.desafio1;
import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a operação que deseja realizar: \nDEPOSITO | TRANSFERENCIA | SAQUE");

        String operacao = scanner.nextLine();

        // A validacao deve ser exata, respeitando maiusculas e minusculas.
        // Compare a entrada com os tres codigos permitidos.
        //boolean operacaoValida = false;
        
        //TO DO: atualize a variavel operacaoValida para true se a operacao for DEPOSITO, SAQUE ou TRANSFERENCIA.
        
        switch (operacao) {
            case "SAQUE":
                System.out.println("VALID");
                break;
            case "DEPOSITO":
                System.out.println("VALID");
            break;
            
            case "TRANSFERENCIA":
                System.out.println("VALID");
            break;
            default:
                System.out.println("INVALID");
                break;
        }
        //System.out.println(operacaoValida ? "VALID" : "INVALID");

        scanner.close();
    }
}

package controle.desafio2;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String codigoInformado = scanner.nextLine();
        String codigoEsperado = scanner.nextLine();

        // Compare os dois textos exatamente como foram lidos.
        // Se forem identicos, exiba "ACESSO LIBERADO"; caso contrario, "ACESSO NEGADO".
        // TO DO: imprima o resultado da validacao em uma unica linha.
        if (codigoInformado.equals(codigoEsperado)){
            System.out.println("ACESSO LIBERADO");
        } else{
            System.out.println("ACESSO NEGADO");
        }
        scanner.close();
    }
}

package controle.exercicio2;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura, peso, imc;
        
        System.out.println("Digite seu peso: ");
        peso = scanner.nextDouble();

        System.out.println("Digite sua altura");
        altura = scanner.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("IMC = %.2f\n", imc);

        if (imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc < 18.6 && imc <= 24.9){
            System.out.println("Peso ideal");
        } else if(imc >= 25 && imc <= 29.9){
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9){
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35.0 && imc <= 39.9){
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade III (Mórbida");
        }
        scanner.close();
    }
}

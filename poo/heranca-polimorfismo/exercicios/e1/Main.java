package e1;

public class Main{
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente("Ana", "99999999999",2000.0, 1500.0);
        System.out.println("Dados: " + funcionario.calcularSalario());
    }
}

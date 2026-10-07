package poo;
import java.util.Scanner;

class contaBancaria{
    String titular;
    double saldo, cheque_especial, valor, cheque_usado, taxa;
    //construtor
    contaBancaria(String titular, double depositoInicial){
        this.titular = titular;
        this.saldo = depositoInicial;

        if (depositoInicial <= 500.0){
            this.cheque_especial = 50.0;
        } else {
            this.cheque_especial = depositoInicial * 0.50;
        }
    }

    void sacarDinheiro(double valor){
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado\nRestam R$" + saldo + " na conta.");
        } else if (saldo < valor && cheque_especial+saldo >= valor) {
            cheque_usado += valor - saldo;
            saldo = 0.0;
            cheque_especial = cheque_especial-cheque_usado;
            System.out.println("Saque de R$" + valor + " realizado com cheque especial\nRestam R$" + saldo + " na conta.");
            System.out.println("Restam R$" + cheque_especial + " no cheque especial.");
        } else{
            System.out.println("Saldo insuficiente.");
        }
    }
    void depositarDinheiro(double valor){
        saldo += valor;
        taxa = cheque_usado * 0.20;
        if (cheque_usado > 0 && saldo > cheque_usado + taxa){
            saldo -= (cheque_usado + taxa);
            cheque_especial += cheque_usado;
            cheque_usado = 0;
            System.out.println("Taxa de 20% do cheque especial usado deduzida!");
        } else{
            System.out.println("Depósito de R$ " + valor + " realizado para " + titular);
        }
    }
    void pagarBoleto(double valor){
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("Boleto de R$" + valor + " foi pago!");
        } else {
            System.out.println("Não foi possível realizar o pagamento do boleto por falta de saldo.");
        }
    }
    void consulta_cheque(){
        System.out.println("Limite do cheque especial: R$ " + cheque_especial);
    }

    void verificarUsoChequeEspecial() {
    if (cheque_usado > 0) {
        System.out.println("A conta está usando R$ " + cheque_usado + " do cheque especial.");
    } else {
        System.out.println("A conta não está usando cheque especial no momento.");
    }
}

    void consultarSaldo(){
        System.out.println("Seu saldo é: R$ " + saldo);
    }
};

public class exercicio1 {
    public static void main(String[] args) {
        // Inicializa conta
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do titular: ");
        String titular = scanner.nextLine();

        System.out.print("Informe o valor do depósito inicial: R$ ");
        double depositoInicial = scanner.nextDouble();

        contaBancaria conta = new contaBancaria(titular, depositoInicial);

        System.out.println("\nConta criada com sucesso para " + titular + "!");


        int opcao = -1;

        //loop
        while (opcao != 0) {
            System.out.println("\n========= MENU OPERAÇÕES =========");

            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;

                case 2:
                    conta.consulta_cheque();
                    break;

                case 3:
                    System.out.println("Valor a depositar: R$ ");
                    double valorDeposito = scanner.nextDouble();

                    conta.depositarDinheiro(valorDeposito);
                    break;

                case 4:
                    System.out.println("Valor a sacar: R$ ");
                    double valorSaque = scanner.nextDouble();

                    conta.sacarDinheiro(valorSaque);
                    break;

                case 5:
                    System.out.println("Valor do boleto: R$ ");
                    double valorBoleto = scanner.nextDouble();
                    conta.pagarBoleto(valorBoleto);
                    break;

                case 6:
                    conta.verificarUsoChequeEspecial();
                    break;

                case 0:
                    System.out.println("Finalizando a execução...");
                    break;
            
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        }
        scanner.close();
    }
}
package nivel1_fundamentos;

import java.util.List;

/**
 * EXERCÍCIO 1: Gateway de Pagamentos (Contrato Básico e Polimorfismo)
 *
 * Como compilar e rodar a partir da pasta exercicios-java:
 * javac nivel1_fundamentos/Ex01GatewayPagamento.java
 * java nivel1_fundamentos.Ex01GatewayPagamento
 */
public class Ex01GatewayPagamento {

    // 1. Contrato (Interface)
    public interface ProcessadorPagamento {
        boolean processar(double valor);
    }

    // TODO: 2. Implemente a classe PagamentoPix
    // Regra: aprova qualquer valor > 0 e imprime "PIX de R$ X aprovado!"
    public static class PagamentoPix implements ProcessadorPagamento {
        @Override
        public boolean processar(double valor) {
            if (valor > 0){
                System.out.println("PIX de R$" + valor + " aprovado!");
                return true;
            } else{
                return false;
            }
            
        }
    }

    // TODO: 3. Implemente a classe PagamentoCartaoCredito
    // Regra: aprova apenas se valor > 0 e valor <= 5000.0
    public static class PagamentoCartaoCredito implements ProcessadorPagamento {
        @Override
        public boolean processar(double valor) {
            if (valor > 0 && valor <= 5000.0){
                System.out.println("Pagamento de R$" + valor + " aprovado no cartão de crédito!");
                return true;
            } else{
                return false;
            }
        }
    }

    // TODO: 4. Implemente a classe PagamentoBoleto
    // Regra: aprova apenas se valor >= 10.0 (valor mínimo para emitir boleto)
    public static class PagamentoBoleto implements ProcessadorPagamento {
        @Override
        public boolean processar(double valor) {
            if (valor >= 10){
                System.out.println("Boleto no valor de R$" + valor + " pago!");
                return true;
            } else{
                return false;
            }
        }
    }

    public static void finalizarCompra(ProcessadorPagamento meio, double valor) {
        System.out.println("Tentando processar R$ " + valor + " com " + meio.getClass().getSimpleName() + "...");
        boolean sucesso = meio.processar(valor);
        System.out.println("Resultado: " + (sucesso ? "APROVADO ✅" : "RECUSADO ❌"));
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        List<ProcessadorPagamento> meios = List.of(
            new PagamentoPix(),
            new PagamentoCartaoCredito(),
            new PagamentoBoleto()
        );

        for (ProcessadorPagamento meio : meios) {
            finalizarCompra(meio, 5.0);
            finalizarCompra(meio, 250.0);
            finalizarCompra(meio, 6000.0);
        }
    }
}

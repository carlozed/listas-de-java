package e4;

public class PagamentoBoleto implements Pagamento{

    @Override
    public void processarPagamento(double valor){
        System.out.println("Valor boleto: " + valor);
    }

}

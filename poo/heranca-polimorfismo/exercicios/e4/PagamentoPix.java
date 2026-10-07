package e4;

public class PagamentoPix implements Pagamento{
    double desconto = 0.90;

    public PagamentoPix(double desconto){
        this.desconto = desconto;
    }

    @Override
    public void processarPagamento(double valor){
        double valorFinal = valor * desconto;
        System.out.println("Valor no pix: " + valorFinal);
    }

}

package e4;

public class PagamentoCartao implements Pagamento{
	double taxa = 1.05;

	public PagamentoCartao(double taxa){
	    this.taxa = taxa;
	}

	@Override
	public void processarPagamento(double valor){
	    double valorFinal = valor * taxa;
		System.out.println("Valor pago: " + valorFinal);
	}
}

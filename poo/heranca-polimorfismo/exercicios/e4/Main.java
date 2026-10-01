package e4;

public class Main {

    public static void main(String[] args) {

	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

	carrinho.adicionarPagamento(new PagamentoCartao(1.05));
	carrinho.adicionarPagamento(new PagamentoBoleto());
	carrinho.adicionarPagamento(new PagamentoPix(0.90));

	double valorCompra = 100;
	System.out.println("Processando valor de compra: " + valorCompra);
	carrinho.processarTodos(valorCompra);
    }
}

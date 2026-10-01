package e4;

import java.util.ArrayList;

public class CarrinhoDeCompras {

	private ArrayList<Pagamento> listaDePagamentos = new ArrayList<>();
	private Pagamento formaPreferencial;

	public void adicionarPagamento(Pagamento p){
	listaDePagamentos.add(p);
	}

	public void setFormaPreferencial(Pagamento p){
	    this.formaPreferencial = p;
	}

	public void processarTodos(double valor){

	    if (formaPreferencial != null){
					System.out.println("Processando forma preferencial:");
					formaPreferencial.processarPagamento(valor);
					}
		System.out.println("Processando demais pagamentos:");
    	for (Pagamento p : listaDePagamentos) {
            if (p != formaPreferencial){
                // Polimorfismo: cada objeto processa à sua própria maneira
                p.processarPagamento(valor);
            }

    	}
	}
}

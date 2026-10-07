public class Gerente extends Funcionario {

    public Gerente(String nome, String email, int senha, boolean logado){
        super(email, senha, true, logado);
        this.nome = nome;
    }

    public void gerarRelatorio(){
        System.out.println("Relatório gerado pelo gerente.");
    }

    public void consultarVendas(){
        System.out.println("Consultando vendas...");
    }
}

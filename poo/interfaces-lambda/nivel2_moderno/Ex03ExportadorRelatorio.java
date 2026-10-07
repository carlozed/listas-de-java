package nivel2_moderno;


/**
 * EXERCÍCIO 3: Sistema de Exportação (default, static e private em Interfaces)
 *
 * Como rodar:
 * javac nivel2_moderno/Ex03ExportadorRelatorio.java
 * java nivel2_moderno.Ex03ExportadorRelatorio
 */
public class Ex03ExportadorRelatorio {

    public interface ExportadorRelatorio {
        // Constante implícita (public static final)
        String FORMATO_DATA = "dd/MM/yyyy";

        // Método abstrato (as classes devem implementar)
        String gerarConteudo(String dadosBrutos);

        // TODO 1: Crie um método private (Java 9+) chamado montarCabecalho(String tipo)
        // que retorna "=== RELATÓRIO [" + tipo + "] ==="
        private String montarCabecalho(String tipo){
            return "=== RELATÓRIO [" + tipo + "] ===";
        }

        // TODO 2: Crie um método default (Java 8+) chamado exportar(String tipo, String dadosBrutos)
        // que valida os dados usando dadosValidos(dadosBrutos) e imprime o cabeçalho + gerarConteudo(dadosBrutos)
        default void exportar(String tipo, String dadosBrutos){
            if (!dadosValidos(dadosBrutos)){
                System.out.println("Dados inválidos!");
                return;
            }
            System.out.println(montarCabecalho(tipo));
            System.out.println(gerarConteudo(dadosBrutos));
        }

        // TODO 3: Crie um método static (Java 8+) chamado dadosValidos(String dados)
        // que retorna true se dados != null && !dados.isBlank()
        static boolean dadosValidos(String dados){
            if (dados != null && !dados.isBlank()){
                return true;
            }
            return false;
        }
    }

    // TODO 4: Implemente ExportadorCSV e ExportadorJSON sobrescrevendo apenas gerarConteudo()
    public static class ExportadorCSV implements ExportadorRelatorio {
        @Override
        public String gerarConteudo(String dadosBrutos) {
            return "col1,col2\n" + dadosBrutos;
        }
    }

    public static class ExportadorJSON implements ExportadorRelatorio{
        @Override
        public String gerarConteudo(String dadosBrutos){
            return "{\"dados\":\"" + dadosBrutos + "\"}";
        }
    }

    public static void main(String[] args) {
        ExportadorRelatorio csv = new ExportadorCSV();
        System.out.println("Conteúdo gerado:\n" + csv.gerarConteudo("mouse,100.0"));
        // TODO 5: Chame csv.exportar("CSV", "mouse,100.0") após implementar os TODOs!
        ExportadorRelatorio json = new ExportadorJSON();
        System.out.println("Conteúdo gerado:\n" + json.gerarConteudo("mouse,100.0"));

        csv.exportar("CSV", "mouse,100.0");
        json.exportar("JSON", "mouse,105.0");
    }
}

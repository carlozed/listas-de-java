package poo.interfaceslambda.nivel2_moderno;

/**
 * EXERCÍCIO 4: O Problema do Diamante e Sealed Interfaces (Java 17+)
 *
 * Como rodar:
 * javac poo/interfaceslambda/nivel2_moderno/Ex04ConflitoESealed.java
 * java poo.interfaceslambda.nivel2_moderno.Ex04ConflitoESealed
 */
public class Ex04ConflitoESealed {

    // --- PARTE A: Conflito de Métodos Default (Diamond Problem) ---

    public interface AutenticadorLocal {
        default void autenticar() {
            System.out.println("[Local] Autenticando via Banco de Dados Local...");
        }
    }

    public interface AutenticadorOAuth {
        default void autenticar() {
            System.out.println("[OAuth] Autenticando via Token OAuth2...");
        }
    }

    // TODO 1: Descomente "implements AutenticadorLocal, AutenticadorOAuth"
    // e resolva o conflito sobrescrevendo autenticar() usando Interface.super.autenticar()
    public static class SistemaHibrido  implements AutenticadorLocal, AutenticadorOAuth {
        @Override
        public void autenticar(){
            AutenticadorLocal.super.autenticar();
        }
    }

    // --- PARTE B: Sealed Interfaces (Java 17+) ---

    public sealed interface ResultadoOperacao permits Sucesso, ErroValidacao, ErroServidor {}

    public record Sucesso(String payload) implements ResultadoOperacao {}
    public record ErroValidacao(String campo, String mensagem) implements ResultadoOperacao {}
    public record ErroServidor(int statusCode) implements ResultadoOperacao {}

    public static void tratarResultado(ResultadoOperacao res) {
        // TODO 2: Trate os 3 tipos possíveis de ResultadoOperacao (usando if/instanceof ou switch)
        if (res instanceof Sucesso s) {
            System.out.println("Sucesso! Dados: " + s.payload());
        } else if (res instanceof ErroValidacao e){
            System.out.println("Erro de validação: " + e.campo() + e.mensagem());
        } else if (res instanceof ErroServidor s){
            System.out.println("Erro no servidor: " + s.statusCode());
        }
    }

    public static void main(String[] args) {
        tratarResultado(new Sucesso("{ \"id\": 123 }"));
        tratarResultado(new ErroValidacao("email", "Formato inválido"));
        tratarResultado(new ErroServidor(503));
    }
}

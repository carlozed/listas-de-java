package nivel3_funcional;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * EXERCÍCIO 5: Interfaces Funcionais Customizadas e Composição (Predicate / Function)
 *
 * Como rodar:
 * javac nivel3_funcional/Ex05LambdasEComposicao.java
 * java nivel3_funcional.Ex05LambdasEComposicao
 */
public class Ex05LambdasEComposicao {

    // 1. Nossa própria @FunctionalInterface
    @FunctionalInterface
    public interface RegraDesconto {
        double aplicar(double valorOriginal);

        // TODO 1: Implemente o método default abaixo que aplica este desconto
        // e em seguida aplica a 'outra' regra sobre o resultado:
        default RegraDesconto combinarCom(RegraDesconto outra) {
            return valor -> valor; // Substitua pela combinação correta!
        }
    }

    public record Usuario(String nome, String email, int idade, boolean ativo) {}

    public static void main(String[] args) {
        // --- PARTE A: Lambdas com RegraDesconto ---
        // TODO 2: Crie 3 lambdas para RegraDesconto:
        // - blackFriday (30% de desconto -> valor * 0.70)
        // - cupomFixo (subtrai 25.0, mínimo 0)
        // - combinada (blackFriday.combinarCom(cupomFixo))
        RegraDesconto blackFriday = valor -> valor; // altere aqui
        System.out.println("Preço final: R$ " + blackFriday.aplicar(200.0));

        // --- PARTE B: Composição de Predicate<Usuario> ---
        Usuario u1 = new Usuario("Ana", "ana@empresa.com", 25, true);
        Usuario u2 = new Usuario("Beto", "beto@gmail.com", 19, true);

        Predicate<Usuario> isAtivo = Usuario::ativo;
        // TODO 3: Crie os predicados isMaiorDeIdade (idade >= 18) e temEmailCorp (termina com "@empresa.com")
        // e combine-os com .and() e .negate() para testar u1 e u2.

        // --- PARTE C: Composição de Function<T, R> ---
        Function<Usuario, String> extrairEmail = Usuario::email;
        // TODO 4: Crie uma Function<String, String> extrairDominio que pega tudo após o '@'
        // e use extrairEmail.andThen(extrairDominio) para imprimir o domínio de u1 e u2.
    }
}

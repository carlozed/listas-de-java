package poo.interfaceslambda.nivel4_streams;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
 * EXERCÍCIO 6 (DESAFIO INTEGRADOR): Pipeline Completo de E-Commerce com Streams
 *
 * Como rodar:
 * javac poo/interfaceslambda/nivel4_streams/Ex06DesafioStreams.java
 * java poo.interfaceslambda.nivel4_streams.Ex06DesafioStreams
 */
public class Ex06DesafioStreams {

    public record Produto(String nome, String categoria, double preco, int estoque) {}

    public static void main(String[] args) {
        List<Produto> catalogo = List.of(
            new Produto("Notebook Pro", "Eletrônicos", 4500.0, 5),
            new Produto("Mouse Sem Fio", "Periféricos", 120.0, 0),
            new Produto("Teclado Mecânico", "Periféricos", 350.0, 12),
            new Produto("Monitor 4K", "Eletrônicos", 2200.0, 3),
            new Produto("Cabo USB-C", "Acessórios", 45.0, 30),
            new Produto("Headset Gamer", "Periféricos", 480.0, 0)
        );

        System.out.println("=== 1. Produtos disponíveis (Nomes em MAIÚSCULO, do mais caro ao mais barato) ===");
        // TODO 1: Use .filter(Predicate), .sorted(Comparator), .map(Function) e .toList()
        List<String> disponiveis = List.of();
        System.out.println(disponiveis);

        System.out.println("\n=== 2. Valor financeiro total do estoque (soma de preco * estoque) ===");
        // TODO 2: Use .mapToDouble(ToDoubleFunction) e .sum()
        double patrimonioTotal = 0.0;
        System.out.println("R$ " + patrimonioTotal);

        System.out.println("\n=== 3. Produtos agrupados por Categoria ===");
        // TODO 3: Use .collect(Collectors.groupingBy(...))
        Map<String, List<Produto>> porCategoria = Map.of();
        porCategoria.forEach((cat, itens) -> System.out.println(cat + " -> " + itens.size() + " itens"));

        System.out.println("\n=== 4. Produto mais caro de 'Periféricos' (com fallback via Supplier) ===");
        // TODO 4: Filtre por "Periféricos", use .reduce(BinaryOperator.maxBy(...)) e .orElseGet(Supplier)
        Produto maisCaro = null;
        System.out.println("Mais caro: " + maisCaro);

        System.out.println("\n=== 5. Aplicar 10% de desconto nos 'Eletrônicos' com UnaryOperator ===");
        // TODO 5: Crie um UnaryOperator<Produto> que retorna novo Produto com preco * 0.90 e use no .map()
        List<Produto> eletronicosComDesconto = List.of();
        System.out.println(eletronicosComDesconto);

        System.out.println("\n=== 6. Alerta de Reposição para estoque == 0 com Consumer ===");
        // TODO 6: Filtre produtos com estoque == 0 e passe um Consumer<Produto> para o .forEach()
    }
}

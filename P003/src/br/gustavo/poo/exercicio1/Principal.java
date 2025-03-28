package br.gustavo.poo.exercicio1;

public class Principal {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Camiseta";
        p1.preco = 50.0;
        p1.quantidade = 10;

        Produto p2 = new Produto("Tênis", 200.0, 5);

        p1.exibirDetalhes();
        System.out.println();
        p2.exibirDetalhes();
    }
}



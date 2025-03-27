package br.com.gustavo.poo.exercicio3;

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Camiseta");
        p1.setPreco(50.0);
        p1.setQuantidadeEmEstoque(10);

        p1.exibirDetalhes();

        p1.vender(5);
        p1.exibirDetalhes();

        p1.vender(10);
        p1.exibirDetalhes();

        p1.reporEstoque(5);
        p1.exibirDetalhes();
    }
}

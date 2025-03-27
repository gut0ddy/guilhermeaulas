package br.com.gustavo.poo.exercicio3;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // reduz a quantidade em estoque se houver quantidade suficiente
    public void vender(int quantidade) {
        if (quantidadeEmEstoque >= quantidade) {
            quantidadeEmEstoque -= quantidade;
            System.out.println("Venda de " + quantidade + " unidades realizada com sucesso.");
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    // aumenta a quantidade em estoque
    public void reporEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
        System.out.println("Reposição de " + quantidade + " unidades realizada com sucesso.");
    }

    // exibe informações do produto
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}

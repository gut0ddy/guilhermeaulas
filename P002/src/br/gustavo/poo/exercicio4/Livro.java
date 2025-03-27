package br.gustavo.poo.exercicio4;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }
}

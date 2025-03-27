package br.gustavo.poo.exercicio4;

public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.anoPublicacao = 1899;

        Livro livro2 = new Livro();
        livro2.titulo = "O Pequeno Príncipe";
        livro2.autor = "Antoine";
        livro2.anoPublicacao = 1943;

        Livro livro3 = new Livro();
        livro3.titulo = "Harry Potter e a Pedra Filosofal";
        livro3.autor = "J.K. Rowling";
        livro3.anoPublicacao = 1997;

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
        livro3.exibirInformacoes();
    }
}

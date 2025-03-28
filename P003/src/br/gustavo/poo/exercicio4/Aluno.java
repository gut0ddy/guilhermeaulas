package br.gustavo.poo.exercicio4;

public class Aluno {
    String nome;
    double nota;

    Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Nota: " + nota);
    }
}

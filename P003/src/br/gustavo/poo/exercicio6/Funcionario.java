package br.gustavo.poo.exercicio6;

public class Funcionario {
    String nome;
    static int totalFuncionarios = 0;

    Funcionario(String nome) {
        this.nome = nome;
        totalFuncionarios++;
    }
}


package br.gustavo.poo.exercicio4;

public class Principal {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Lucas", 8.5);
        Aluno a2 = new Aluno("Maria", 9.0);

        a1.exibirInfo();
        System.out.println();
        a2.exibirInfo();
    }
}


package br.gustavo.poo.exercicio6;

public class Principal {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ana");
        Funcionario f2 = new Funcionario("Carlos");
        Funcionario f3 = new Funcionario("Fernanda");

        System.out.println("Total de funcionários: " + Funcionario.totalFuncionarios);
    }
}

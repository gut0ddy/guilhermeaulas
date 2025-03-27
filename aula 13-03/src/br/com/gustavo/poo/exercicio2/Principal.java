package br.com.gustavo.poo.exercicio2;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Gustavo");
        conta.depositar(1000);
        conta.depositar(500);
        conta.sacar(200);
        conta.exibirSaldo();
    }
}

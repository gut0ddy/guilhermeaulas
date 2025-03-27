package br.com.gustavo.poo.exercicio2;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}

package br.gustavo.poo.exercicio2;


public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroDaConta("12345-6");
        conta.setTitular("Maria Silva");
        conta.setSaldo(1500.50);

        System.out.println("Número da Conta: " + conta.getNumeroDaConta());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());
    }
}

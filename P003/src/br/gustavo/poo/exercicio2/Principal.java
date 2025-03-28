package br.gustavo.poo.exercicio2;

public class Principal {

    public static void main(String[] args) {
        LojaVeiculos loja = new LojaVeiculos("Super Motors");
        loja.venderVeiculo(50000);
        loja.venderVeiculo(30000);
        loja.venderVeiculo(20000);
        loja.darDesconto(10000);
        loja.darDesconto(15000);

        System.out.println("Faturamento final: " + loja.getFaturamento());
    }
}

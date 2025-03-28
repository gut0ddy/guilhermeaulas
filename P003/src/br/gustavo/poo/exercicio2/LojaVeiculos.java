package br.gustavo.poo.exercicio2;

public class LojaVeiculos {
    private String nomeLoja;
    private double faturamento;

    LojaVeiculos(String nomeLoja) {
        this.nomeLoja = nomeLoja;
        this.faturamento = 0;
    }

    void venderVeiculo(double valor) {
        faturamento += valor;
    }

    void darDesconto(double valor) {
        faturamento -= valor;
        if (faturamento < 0) faturamento = 0;
    }

    double getFaturamento() {
        return faturamento;
    }
}

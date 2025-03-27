package br.com.gustavo.poo.exercicio4;

public class Retangulo {
    private double largura;
    private double altura;


    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    // getters e setters
    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }
}

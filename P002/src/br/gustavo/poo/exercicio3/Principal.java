package br.gustavo.poo.exercicio3;

public class Principal {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.largura = 5;
        retangulo.altura = 3;

        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
    }
}

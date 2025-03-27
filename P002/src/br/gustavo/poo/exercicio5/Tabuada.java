package br.gustavo.poo.exercicio5;

public class Tabuada {
    int numero;

    public void calcularTabuada() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
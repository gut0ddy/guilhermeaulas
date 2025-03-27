package br.gustavo.poo.exercicio5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {System.out.print("Digite um número inteiro positivo: ");
            numero = scanner.nextInt();
        }
        while (numero <= 0);

        Tabuada tabuada = new Tabuada();
        tabuada.calcularTabuada();
    }
}

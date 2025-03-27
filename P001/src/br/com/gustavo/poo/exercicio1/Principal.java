package br.com.gustavo.poo.exercicio1;

public class Principal {

    public static void main(String[] args) {

        Carro meuCarro = new Carro();


        meuCarro.setMarca("Toyota");
        meuCarro.setModelo("Corolla");
        meuCarro.setAno(2022);


        meuCarro.exibirInformacoes();
    }
}

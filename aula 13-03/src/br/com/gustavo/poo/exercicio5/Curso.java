package br.com.gustavo.poo.exercicio5;

public class Curso {

    private String nomeCurso;
    private int codigoCurso;

    public void exibirCurso() {
        System.out.println("Nome do curso: " + nomeCurso);
        System.out.println("Código do curso: " + codigoCurso);
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
}

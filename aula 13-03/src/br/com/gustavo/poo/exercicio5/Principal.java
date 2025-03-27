package br.com.gustavo.poo.exercicio5;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cadastro do aluno
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();

        System.out.print("Digite a idade do aluno: ");
        int idadeAluno = sc.nextInt();

        System.out.print("Digite o número de matrícula: ");
        int matriculaAluno = sc.nextInt();
        sc.nextLine(); // limpar buffer

        // Cadastro do curso
        System.out.print("Digite o nome do curso: ");
        String nomeCurso = sc.nextLine();

        System.out.print("Digite o código do curso: ");
        int codigoCurso = sc.nextInt();

        // Instanciando e atribuindo os dados
        Aluno aluno = new Aluno();
        aluno.setNome(nomeAluno);
        aluno.setIdade(idadeAluno);
        aluno.setMatricula(matriculaAluno);

        Curso curso = new Curso();
        curso.setNomeCurso(nomeCurso);
        curso.setCodigoCurso(codigoCurso);

        // Exibindo informações
        System.out.println("Dados do Aluno");
        aluno.exibirInformacoes();

        System.out.println("Dados do Curso");
        curso.exibirCurso();

        sc.close();
    }
}

package br.com.letscode.aovivo;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int quantidadeTurmas;
        int quantidadeAlunos;
        double [][] notas;
        double mediaTotal = 0;
        double mediaTurma;

        System.out.println("Digite a quantidade total de turmas: ");
        quantidadeTurmas = input.nextInt();

        System.out.println("Digite a quantidade total de alunos: ");
        quantidadeAlunos = input.nextInt();

        notas = new double[quantidadeAlunos][quantidadeTurmas];

        for (int i = 0; i < quantidadeTurmas ; i++) {
            System.out.println("Digite as notas da tumas " + i);
            for (int j = 0; j < quantidadeAlunos; j++) {
                System.out.printf("Digite as notas do aluno %d da turma %d ",i , j);
                notas[i][j] = input.nextDouble();
            }
        }

        for (double [] turma : notas) {
            

        }





    }
}

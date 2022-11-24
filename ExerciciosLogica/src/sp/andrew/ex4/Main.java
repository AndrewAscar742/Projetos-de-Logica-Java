package sp.andrew.ex4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scText = new Scanner(System.in);
        int qtdAlunos;

        System.out.println("São quantos alunos?");
        qtdAlunos = scInt.nextInt();
        String[][] alunos = new String[qtdAlunos][5];

        for (int i = 0; i < alunos.length; i++) {
            float[] notas = new float[3];

            System.out.println("Nome do Aluno");
            String nome = scText.nextLine();
            alunos[i][0] = nome;
            System.out.println("Sexo do Aluno");
            String sexo = scText.nextLine();
            alunos[i][1] = sexo;
            System.out.println("Primeira nota do Aluno");
            String nota1 = scText.nextLine();
            alunos[i][2] = nota1;
            System.out.println("Segunda nota do Aluno");
            String nota2 = scText.nextLine();
            alunos[i][3] = nota2;
            System.out.println("Terceira nota do Aluno");
            String nota3 = scText.nextLine();
            alunos[i][4] = nota3;

            System.out.println("[ Nome:" + alunos[i][0] +  " Sexo: " + alunos[i][1] + " Nota 1:"+  alunos[i][2] +
                    " Nota 2: " + alunos[i][3] + " Nota 3:" + alunos[i][4] + "]");

            notas[0] = Integer.parseInt(nota1);
            notas[1] = Integer.parseInt(nota2);
            notas[2] = Integer.parseInt(nota3);
            float media_aluno = (notas[0] + notas[1] + notas[2]) / notas.length;

            if (media_aluno > 6) System.out.println("Aprovado");
            else System.out.println("Reprovado");

            System.out.println("A média do aluno " + alunos[i][0] + " é " + media_aluno);
        }
    }
}

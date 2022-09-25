package senac.recursividade.exercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scNum = new Scanner(System.in);
        int[] vetor = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Digite o número que você deseja buscar!");
        int num = scNum.nextInt();

        System.out.println("O número que você deseja está na posição: " + buscaLinear(num, vetor, 0));
        System.out.println("O menor valor do vetor: " + menorValorVetor(Integer.MAX_VALUE, vetor, 0));
        System.out.println("Soma de todos os valores: " + somarElementosVet(vetor, 0, 0));
        System.out.println("Media arimética dos elementos dentro do vetor: " + mediaAritmetica(vetor, 0, 0));
    }

    public static int buscaLinear(int numDesejado, int[] vet, int pos){
        if (numDesejado == vet[pos]) return pos;
        if (vet.length - 1 < pos) return -1;

        return buscaLinear(numDesejado, vet, pos + 1);
    }

    public static int menorValorVetor(Integer menorNum, int[] vet, int pos){
        if (vet[pos] < menorNum) menorNum = vet[pos];

        if (pos == vet.length - 1) return menorNum;

        return menorValorVetor(menorNum, vet, pos + 1);
    }

    public static int somarElementosVet(int[] vetor, int soma, int pos){
        if (vetor.length == pos) return soma;

        return somarElementosVet(vetor, soma += vetor[pos], pos + 1);
    }

    public static float mediaAritmetica(int vet[], int media, int pos){
        if (pos == vet.length) return (float) media / pos;

        return mediaAritmetica(vet, media += vet[pos], pos + 1);
    }

}

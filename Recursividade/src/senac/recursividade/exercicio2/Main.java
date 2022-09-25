package senac.recursividade.exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Digite o número que você deseja buscar");
        int num = sc.nextInt();
        System.out.println(buscaBinariaVetor(num, vet, 0, vet.length - 1));

    }

    public static int buscaBinariaVetor(int numeroDesejado, int vet[], int inicio, int fim){
        int vetorDividido = (inicio + fim) / 2;

        if (inicio > fim) return -1;

        if (vet[vetorDividido] == numeroDesejado)
            return vetorDividido;
        else if (vet[vetorDividido] > numeroDesejado)
            return buscaBinariaVetor(numeroDesejado, vet, inicio, vetorDividido - 1);
        else
            return buscaBinariaVetor(numeroDesejado, vet, vetorDividido + 1, fim);
    }

}

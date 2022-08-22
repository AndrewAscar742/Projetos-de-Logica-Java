package buscaBinaria;

import java.util.Scanner;

public class Main {
    /*
    Busca Binaria é necessário o vetor estar ordenado para ocorrer com precisão

     */
    public static int buscaBinaria(int[] vet, int numDesejado){
        int inicio = 0;
        int vetDividido = vet.length - 1;
        int meio = 0;

        while (inicio <= vetDividido){
            meio = (inicio + vetDividido) / 2;

            if (vet[meio] == numDesejado)
                return meio;
            else if (vet[meio] < numDesejado)   //esquerda
                inicio = meio + 1;
            else
                vetDividido = meio - 1;              //direita
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] vet = {3,4,5,6,7,8,9,10};

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número a ser procurado");
        int num = scan.nextInt();
        System.out.println(buscaBinaria(vet, num));
    }
}

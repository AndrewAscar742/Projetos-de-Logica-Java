package sp.andrew.QuickSort;

import java.util.Arrays;

public class Main {

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
        QuickSort quickSort = new QuickSort();
        int vet[] = {1, 4, 2, 8, 5, 10, 15, 35, 3};
        System.out.println(Arrays.toString(vet));

        int vet2[] = quickSort.ordenarVetorDeInteiros(vet);
        System.out.println(Arrays.toString(vet2));
        System.out.println(buscaBinaria(vet2, 4));
    }
}

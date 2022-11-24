package sp.andrew.Insertion;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int vet[] = {10, 4, 7, 2, 1, 5, 15, 35, 25, 20, 32};
        int vet2[] = Insertion.insertionSort(vet);

        System.out.println(Arrays.toString(vet2));
        System.out.println(buscaLinear(7, vet2));

    }

    private static int buscaLinear(int i, int[] vet2) {
        for (int j = 0; j < vet2.length; j++) {
            if (vet2[j] == i) return j;
        }
        return -1;
    }
}

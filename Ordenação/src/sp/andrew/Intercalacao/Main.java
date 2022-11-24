package sp.andrew.Intercalacao;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MergeSort merge = new MergeSort();
        int vet[] = {1, 4, 2, 8, 5, 10, 15, 35, 3};
        int vet2[] = merge.mergeSort(vet.length, vet);
        System.out.println(Arrays.toString(vet2));
    }
}

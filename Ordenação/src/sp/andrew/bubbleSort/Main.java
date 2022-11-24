package sp.andrew.bubbleSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int vet[] = {33,7,321,654 , 12, 1, 10, 0, 400};
        System.out.println(Arrays.toString(vet));
        int vet2[] = BubbleSort.bubbleSort(vet);
        System.out.println(Arrays.toString(vet2));
    }
}

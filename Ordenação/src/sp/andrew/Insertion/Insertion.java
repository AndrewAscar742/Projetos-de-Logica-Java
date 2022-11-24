package sp.andrew.Insertion;

public class Insertion {

    public static int[] insertionSort(int[] v) {
        for (int i = 1; i < v.length; i++){
            int j = i;
            int x = v[j];
            while (j > 0 && x < v[j-1]) {
                v[j] = v[j-1];
                j--;
            }
            v[j] = x;
        }
        return v;
    }
}

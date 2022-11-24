package sp.andrew.bubbleSort;

public class BubbleSort {

    public static int[] bubbleSort(int[] vetor) {
        int aux = 0;
        // Fase de Ordenação
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                // Troca dos Elementos
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

        return vetor;
    }
}

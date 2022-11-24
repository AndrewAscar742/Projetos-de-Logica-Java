package sp.andrew.QuickSort;

public class QuickSort {

    public int[] ordenarVetorDeInteiros(int[] vetor) {
        quickSort(vetor, 0, vetor.length - 1);
        return vetor;
    }

    private void quickSort(int[] vetor, int inicio, int fim) {
        if (fim > inicio) {
            //Chamada da rotina que ira dividir o vetor em 3 partes.
            int indexPivo = dividir(vetor, inicio, fim);

            /* Chamada recursiva para redivisao do vetor de elementos menores
                que o pivô. */
            quickSort(vetor, inicio, indexPivo - 1);

            /* Chamada recursiva para redivisao do vetor de elementos maiores
                que o pivô. */
            quickSort(vetor, indexPivo + 1, fim);
        }
    }

    private int dividir(int[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];

        while (pontEsq <= pontDir) {
      /* Vai correr o vetor ate que ultrapasse o outro ponteiro
        ou ate que o elemento em questão seja menor que o pivô. */
            while (pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
                pontEsq++;
            }

      /* Vai correr o vetor ate que ultrapasse o outro ponteiro
        que o elemento em questão seja maior que o pivô. */
            while (pontDir >= pontEsq && vetor[pontDir] > pivo) {
                pontDir--;
            }

      /* Caso os ponteiros ainda nao tenham se cruzado, significa que valores
        menores e maiores que o pivô foram localizados em ambos os lados.
        Trocar estes elementos de lado. */
            if (pontEsq < pontDir) {
                trocar(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }

        trocar(vetor, inicio, pontDir);
        return pontDir;
    }

    private void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
}

package grupoB;

import java.util.Random;

public class TestesMerge {
    public static void main(String[] args) {
        Random random = new Random();
        int tam = 100;
        int[] vetor = new int[tam];
        MergeSort mergeSort = new MergeSort();

        for (int i = 0; i < tam; i++) {
            vetor[i] = random.nextInt(1000);
        }
        long inicio = System.currentTimeMillis();
        mergeSort.sort(vetor, 0, tam);
        long fim = System.currentTimeMillis();

        System.out.printf("Tempo total: %d%n", fim - inicio);
        System.out.printf("Total de trocas: %d%n", mergeSort.nDeTrocas);
        System.out.printf("Total de iterações: %d%n", mergeSort.iteracoes);

        for (int i = 0; i < tam; i++) {
            System.out.printf("%d ", vetor[i]);
        }
    }
}

package grupoA;

import java.util.Random;

public class TestesA {
    public static void main(String[] args) {
        Random rand = new Random();
        BubbleSort bubble = new BubbleSort();
        int tamanho = 10000;
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = rand.nextInt(0, 100000);
        }
        long inicio = System.currentTimeMillis();
        bubble.bubble(vetor);
        long fim = System.currentTimeMillis();

        System.out.printf("Tempo total: %d%n", fim - inicio);
        System.out.printf("Total de trocas: %d%n", bubble.nDeTrocas);
        System.out.printf("Total de iterações: %d", bubble.iteracoes);
    }
}

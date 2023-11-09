package grupoB;

import java.util.Random;

public class TestesShell {
    public static void main(String[] args) {
        Random random = new Random();
        int tam = 10000;
        int[] vetor = new int[tam];
        ShellSort shellSort = new ShellSort();
        for (int i = 0; i < tam; i++) {
            vetor[i] = random.nextInt(0, 1000);
        }
        long inicio = System.currentTimeMillis();
        shellSort.shell(vetor);
        long fim = System.currentTimeMillis();

        System.out.printf("Tempo total: %d%n", fim - inicio);
        System.out.printf("Total de trocas: %d%n", shellSort.nDeTrocas);
        System.out.printf("Total de iterações: %d%n", shellSort.iteracoes);

        for (int i = 0; i < tam; i++) {
            System.out.printf("%d ", vetor[i]);
        }
    }

}

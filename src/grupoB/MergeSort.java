package grupoB;

public class MergeSort {
    public int nDeTrocas;
    public int iteracoes;

    public int tamanho(int[] vetor){
        int contador = 0;
        while (true){
            try {
                int elemento = vetor[contador];
                contador++;
            } catch (ArrayIndexOutOfBoundsException e){
                break;
            }
        }
        return contador;
    }

    public void sort(int[] vetor, int inicio, int fim){
        if (fim - inicio > 1){
            int meio = (fim + inicio)/2;
            sort(vetor, inicio, meio);
            sort(vetor, meio, fim);
            merge(vetor, inicio, meio, fim);
        }
    }

    public void merge(int[] vetor, int inicio, int meio, int fim){
        int[] esquerda = new int[meio - inicio];
        for (int i = 0; i < meio - inicio ; i++) {
            esquerda[i] = vetor[i + inicio];
            iteracoes++;
        }
        int[] direita = new int[fim - meio];
        for (int i = meio; i < fim; i++) {
            direita[i - meio] = vetor[i];
            iteracoes++;
        }
        int topEsq = 0;
        int topDir = 0;
        for (int i = inicio; i < fim; i++) {
            if (topEsq >= tamanho(esquerda)){
                if (vetor[i] != direita[topDir]){
                    vetor[i] = direita[topDir];
                    topDir++;
                    nDeTrocas++;
                } else {
                    topDir++;
                }
            } else if (topDir >= tamanho(direita)){
                if (vetor[i] != esquerda[topEsq]){
                    vetor[i] = esquerda[topEsq];
                    topEsq++;
                    nDeTrocas++;
                } else {
                    topEsq++;
                }
            } else if (esquerda[topEsq] < direita[topDir]){
                if (vetor[i] != esquerda[topEsq]){
                    vetor[i] = esquerda[topEsq];
                    topEsq++;
                    nDeTrocas++;
                }else {
                    topEsq++;
                }
            } else {
                if (vetor[i] != direita[topDir]){
                    vetor[i] = direita[topDir];
                    topDir++;
                    nDeTrocas++;
                }else {
                    topDir++;
                }
            }
            iteracoes++;
        }
    }
}

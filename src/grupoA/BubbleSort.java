package grupoA;

public class BubbleSort {
    public int nDeTrocas = 0;
    public int iteracoes = 0;
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
    public void bubble(int[] vetor){
        for (int i = 0; i < tamanho(vetor); i++) {
            boolean troca = false;
            for (int j = 0; j < tamanho(vetor) - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    nDeTrocas += 2;
                    troca = true;
                }
                iteracoes++;
            }
            iteracoes++;
            if (troca == false){
                break;
            }
        }
    }
}

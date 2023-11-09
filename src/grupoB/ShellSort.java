package grupoB;

import java.util.Random;

public class ShellSort {
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

    public void shell(int[] vetor){
        int espacamento = tamanho(vetor) / 2;
        while (espacamento > 0){
            for (int i = espacamento; i < tamanho(vetor); i++) {
                int temporario = vetor[i];
                int j = i;
                while (j >= espacamento && vetor[j - espacamento] > temporario){
                    vetor[j] = vetor[j - espacamento];
                    nDeTrocas++;
                    j -= espacamento;
                }
                vetor[j] = temporario;
                iteracoes++;
            }
            iteracoes++;
            espacamento /= 2;
        }
    }

}

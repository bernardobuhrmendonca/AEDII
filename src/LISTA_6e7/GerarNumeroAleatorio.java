package LISTA_6e7;

import java.util.Random;

public class GerarNumeroAleatorio {
    public static double[] gerarAleatorio(int tamanho, double minimo, double maximo) {
        double[] vetorAleatorio = new double[tamanho];
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetorAleatorio[i] = minimo + (maximo - minimo) * random.nextDouble();
        }

        return vetorAleatorio;
    }
    public static double[] gerarDecrescenteAleatorio(int tamanho) {
        double[] vetorDecrescenteAleatorio = new double[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            double valor = tamanho - i; // gera o valor decrescente

            // Aleatoriza a parte fracionada
            double parteFracionadaAleatoria = random.nextDouble();
            valor += parteFracionadaAleatoria;

            vetorDecrescenteAleatorio[i] = valor;
        }

        return vetorDecrescenteAleatorio;
    }

}

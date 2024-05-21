package LISTA_6e7;

import static LISTA_6e7.GerarNumeroAleatorio.gerarAleatorio;
import static LISTA_6e7.GerarNumeroAleatorio.gerarDecrescenteAleatorio;

public class ContagemTempo {
    public static void main(String[] args) {
        final double[] Ovet1 = gerarAleatorio(10000, 1, 50000);
        final double[] Ovet2 = gerarAleatorio(15000, 1, 50000);
        final double[] Ovet3 = gerarAleatorio(30000, 1, 50000);
        final double[] Odec1 = gerarDecrescenteAleatorio(10000);
        final double[] Odec2 = gerarDecrescenteAleatorio(15000);
        final double[] Odec3 = gerarDecrescenteAleatorio(30000);
        long startTime;
        long endTime;
        long elapsedTimeInMillis;
        for (int i = 0; i <= 6; i++) {
            double[] vet1 = Ovet1;
            double[] vet2 = Ovet2;
            double[] vet3 = Ovet3;
            double[] dec1 = Odec1;
            double[] dec2 = Odec2;
            double[] dec3 = Odec3;
            switch (i) {
                case 0:
                    System.out.println("Bubble Sort:");

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.bubbleSort(vet1);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.bubbleSort(vet2);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.bubbleSort(vet3);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Ordenado");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.bubbleSort(vet1);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Ordenado");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.bubbleSort(vet2);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Ordeando");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.bubbleSort(vet3);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.bubbleSort(dec1);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.bubbleSort(dec2);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.bubbleSort(dec3);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);
                    System.out.println("\n-------------------------------------------------------------------------\n");
                    break;
                case 1:
                    System.out.println("Selection Sort:");

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.selectionSort(vet1);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.selectionSort(vet2);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.selectionSort(vet3);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Ordenado");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.selectionSort(vet1);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Ordenado");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.selectionSort(vet2);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Ordeando");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.selectionSort(vet3);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.selectionSort(dec1);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.selectionSort(dec2);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.selectionSort(dec3);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);
                    System.out.println("\n-------------------------------------------------------------------------\n");
                    break;
                case 2:
                    System.out.println("Insert Sort:");

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.insertSort(vet1);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.insertSort(vet2);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.insertSort(vet3);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Ordenado");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.insertSort(vet1);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Ordenado");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.insertSort(vet2);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Ordeando");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.insertSort(vet3);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.insertSort(dec1);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.insertSort(dec2);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.insertSort(dec3);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);
                    System.out.println("\n-------------------------------------------------------------------------\n");
                    break;
                case 3:
                    System.out.println("Merge Sort:");

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.mergeSort(vet1);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.mergeSort(vet2);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.mergeSort(vet3);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Ordenado");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.mergeSort(vet1);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Ordenado");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.mergeSort(vet2);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Ordeando");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.mergeSort(vet3);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.mergeSort(dec1);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.mergeSort(dec2);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.mergeSort(dec3);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);
                    System.out.println("\n-------------------------------------------------------------------------\n");
                    break;
                case 4:
                    System.out.println("Quick Sort:");

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.quickSort(vet1, 0, 9999);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.quickSort(vet2, 0, 14999);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.quickSort(vet3, 0, 29999);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Ordenado");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.quickSort(vet1, 0, 9999);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Ordenado");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.quickSort(vet2, 0, 14999);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Ordeando");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.quickSort(vet3, 0, 29999);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.quickSort(dec1, 0, 9999);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.quickSort(dec2, 0, 14999);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.quickSort(dec3, 0, 29999);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);
                    System.out.println("\n-------------------------------------------------------------------------\n");
                    break;
                case 5:
                    System.out.println("Heap Sort:");

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.heapSort(vet1);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.heapSort(vet2);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.heapSort(vet3);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Ordenado");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.heapSort(vet1);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Ordenado");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.heapSort(vet2);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Ordeando");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.heapSort(vet3);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.heapSort(dec1);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.heapSort(dec2);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.heapSort(dec3);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);
                    System.out.println("\n-------------------------------------------------------------------------\n");
                    break;
                case 6:
                    System.out.println("Shell Sort:");

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.shellSort(vet1);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.shellSort(vet2);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Aleátorio");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.shellSort(vet3);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Ordenado");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.shellSort(vet1);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Ordenado");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.shellSort(vet2);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Ordeando");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.shellSort(vet3);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 10000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.shellSort(dec1);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 15000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.shellSort(dec2);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);

                    System.out.println();
                    System.out.println("Tamanho: 30000");
                    System.out.println("Ordenação: Decrescente");
                    startTime = System.nanoTime();
                    LISTA_6e7.MetodosOrdenacao.shellSort(dec3);
                    endTime = System.nanoTime();
                    elapsedTimeInMillis = (endTime - startTime);
                    System.out.println("Tempo decorrido(ns): " + elapsedTimeInMillis);
                    System.out.println("\n-------------------------------------------------------------------------\n");
                    break;
                default:
                    break;

            }
        }
    }
}

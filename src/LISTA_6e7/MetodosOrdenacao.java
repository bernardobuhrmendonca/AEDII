package LISTA_6e7;

public class MetodosOrdenacao {
    public static void bubbleSort(double[] vet) {
        int cont = vet.length;
        double temp = 0;
        for (int aux = 0; aux < vet.length; aux++) {
            for (int aux2 = 0; aux < cont; aux++) {
                if (aux + 1 < vet.length && vet[aux] > vet[aux + 1]) {
                    vet[aux] = temp;
                    vet[aux] = vet[aux + 1];
                    vet[aux + 1] = temp;
                }
            }
            cont--;
        }
    }

    public static void selectionSort(double[] vet) {
        int menor;
        double temp;
        for (int aux = 0; aux < vet.length - 1; aux++) {
            menor = aux;
            for (int aux2 = aux + 1; aux2 < vet.length; aux2++) {
                if (vet[aux2] < vet[menor]) {
                    menor = aux2;
                }
            }
            if (menor != aux) {
                temp = vet[aux];
                vet[aux] = vet[menor];
                vet[menor] = temp;
            }
        }
    }

    public static void insertSort(double[] vet) {
        int index;
        double temp;
        for (int aux = 1; aux < vet.length; aux++) {
            temp = vet[aux];
            index = aux - 1;
            while (index >= 0 && temp < vet[index]) {
                vet[index + 1] = vet[index];
                index--;
            }
            vet[index + 1] = temp;
        }
    }

    public static void mergeSort(double[] vet) {
        if (vet == null) {
            return;
        }
        if (vet.length > 1) {
            double[] left = leftHalf(vet);
            double[] right = rightHalf(vet);
            mergeSort(left);
            mergeSort(right);
            merge(vet, left, right);
        }
    }

    private static double[] leftHalf(double[] vet) {
        int size1 = vet.length / 2;
        double[] left = new double[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = vet[i];
        }
        return left;
    }

    private static double[] rightHalf(double[] vet) {
        int size1 = vet.length / 2;
        int size2 = vet.length - size1;
        double[] right = new double[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = vet[i + size1];
        }
        return right;
    }

    private static void merge(double[] result, double[] left, double[] right) {
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
    }

    public static void quickSort(double[] vet, int esq, int dir) {
        int i = esq, j = dir;
        double pivo = vet[(dir + esq) / 2];
        while (i <= j) {
            while (vet[i] < pivo) i++;
            while (vet[j] > pivo) j--;
            if (i <= j) {
                swap(vet, i, j);
                i++;
                j--;
            }
        }
        if (esq < j) quickSort(vet, esq, j);
        if (i < dir) quickSort(vet, i, dir);
    }

    private static void swap(double[] vet, int i, int j) {
        double temp = vet[i];
        vet[i] = vet[j];
        vet[j] = temp;
    }

    public static void heapSort(double[] vet) {
        int n = vet.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(vet, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            double temp = vet[0];
            vet[0] = vet[i];
            vet[i] = temp;

            heapify(vet, i, 0);
        }
    }

    private static void heapify(double[] vet, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && vet[left] > vet[largest]) {
            largest = left;
        }
        if (right < n && vet[right] > vet[largest]) {
            largest = right;
        }

        if (largest != i) {
            double swap = vet[i];
            vet[i] = vet[largest];
            vet[largest] = swap;
            heapify(vet, n, largest);
        }
    }

    public static void shellSort(double[] vet) {
        {
            int i, j, h = 1;
            double value;
            do {
                h = 3 * h + 1;
            } while (h < vet.length);
            do {
                h = h / 3;
                for (i = h; i < vet.length; i++) {
                    value = vet[i];
                    j = i - h;
                    while (j >= 0 && value < vet[j]) {
                        vet[j + h] = vet[j];
                        j = j - h;
                    }
                    vet[j + h] = value;
                }
            } while (h > 1);
        }
    }
}

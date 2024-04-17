package LISTA_5.EX07;

public class Main {
    public static void main(String[] args) {
        double[] v = new double[10];
        for (int aux = 0; aux<10; aux++){
            v[aux] = aux;
        }
        System.out.println(ex07.pesquisaRec(v,1));
    }
}

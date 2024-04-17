package LISTA_5.EX01;

public class Main {
    public static void main(String[] args) {
        String[] v = new String[10];
        for (int aux = 0; aux<10; aux++){
            v[aux] = String.valueOf(aux);
        }
        for (int aux = 0; aux < 10; aux++) {
            System.out.println(v[aux]);
        }
        ex01.inverso(v);
    }
}

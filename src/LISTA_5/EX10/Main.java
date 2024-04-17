package LISTA_5.EX10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Indique o termo desejado. ");
        n = teclado.nextInt();
        System.out.println("O valor de f(" + n + ") é igual à: " + ex10.funcao(n));
        teclado.close();
    }
}

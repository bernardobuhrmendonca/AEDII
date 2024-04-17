package LISTA_5.EX03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique um número.");
        n = teclado.nextInt();
        System.out.println("O número " + n + " possui " + ex03.nDigitos(n));
        teclado.close();
    }
}

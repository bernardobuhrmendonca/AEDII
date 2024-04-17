package LISTA_5.EX05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b;
        System.out.println("Indique um número.");
        a = teclado.nextInt();
        System.out.println("Indique outro número.");
        b = teclado.nextInt();
        System.out.println("O resultado da multiplicação é: " + ex05.multiplicacao(a,b));
        teclado.close();
    }
}

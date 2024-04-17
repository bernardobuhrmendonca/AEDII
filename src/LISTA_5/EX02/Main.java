package LISTA_5.EX02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique um número para ser dividido.");
        a = teclado.nextInt();
        System.out.println("Indique um número para dividir.");
        b = teclado.nextInt();
        System.out.println("A divisão de " + a + " por " + b + " é igual à: " + ex02.divisao(a,b));
        teclado.close();
    }
}

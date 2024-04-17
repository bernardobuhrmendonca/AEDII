package LISTA_5.EX04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique um número.");
        n = teclado.nextInt();
        System.out.println("A soma dos digitos deste número é: " + ex04.somaDig(n));
        teclado.close();
    }
}

package LISTA_3.EX02;

import java.util.Scanner;

public class Main {
    public static double divisao (int a, int b) throws DivisionZeroException{
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new DivisionZeroException();
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b;
        System.out.println("Indique o dividendo da divisão.");
        a = teclado.nextInt();
        System.out.println("Indique o divisor da divisão.");
        b = teclado.nextInt();
        double d = 0;
        try {
            d = divisao(a, b);
        } catch (DivisionZeroException e) {
            System.err.println("Erro! Divisão por zero!");
        }
        System.out.println(d);
    }
}

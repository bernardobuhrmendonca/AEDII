package LISTA_5.EX08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero;
        int expoente;
        System.out.println("Indique o número que será potenciado.");
        numero = teclado.nextDouble();
        System.out.println("Indique o expoente.");
        expoente = teclado.nextInt();
        System.out.println("O resultadode " + numero + " elevado à " + expoente + " é igual a: " + ex08.potenciacao(numero,expoente));
        teclado.close();
    }
}

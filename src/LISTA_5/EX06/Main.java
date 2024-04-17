package LISTA_5.EX06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double t1, razao;
        int nTermos;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique o primeiro termo: ");
        t1 = teclado.nextDouble();
        System.out.println("Indique a razão: ");
        razao = teclado.nextDouble();
        System.out.println("Indique o número de termos desejados: ");
        nTermos = teclado.nextInt();
        System.out.println("O último termo dessa progressão geométrica é: " + ex06.pg(t1,razao,nTermos));
        teclado.close();
    }
}

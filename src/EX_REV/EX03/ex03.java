package EX_REV.EX03;

import java.util.Scanner;

public class ex03 {
    public static void ex3() {
        double soma = 0;
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique o número de elementos da série.");
        n = teclado.nextInt();

        for (int aux = 1; aux <= n; aux++) {
            soma += (float) 1/aux;
        }
        System.out.printf("%1.5f", soma);
    }
}

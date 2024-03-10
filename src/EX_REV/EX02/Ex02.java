package EX_REV.EX02;

import java.util.Scanner;

public class Ex02 {
    public static void ex2(){
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Indique o núumero de elementos da sequência de Fibonacci desejados.");
        n = teclado.nextInt();
        int[] termos = new int[n];
        termos[0] = 1;

        for (int aux = 1; aux < n; aux++) {
            if (aux < 2) {
                termos[aux] = termos [aux-1];
            }
            else  {
                termos[aux] = termos[aux-2] + termos[aux-1];
            }
        }
        for (int termo : termos) {
            System.out.print(termo + " ");
        }
    }
}

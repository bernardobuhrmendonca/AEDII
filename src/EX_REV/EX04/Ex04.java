package EX_REV.EX04;

import java.util.Scanner;

public class Ex04 {
    public static void ex4() {
        int l, c;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique o número de linhas da matriz.");
        l = teclado.nextInt();
        System.out.println("Indique o número de colunas da matriz.");
        c = teclado.nextInt();
        int[][] matriz = new int[l][c];
        for (int aux2 = 0; aux2 < l; aux2++){
            for (int aux = 0; aux < c; aux++){
                System.out.println("Indique o valor da posição " + aux + " da linha " +  aux2);
                matriz[aux2][aux] = teclado.nextInt();
            }
        }
        for (int aux2 = 0; aux2 < c; aux2++){
            for (int aux = 0; aux < l; aux++){
                System.out.print(matriz[aux][aux2] + " ");
            }
            System.out.println();
        }
    }
}
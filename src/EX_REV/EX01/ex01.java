package EX_REV.EX01;

import java.util.Scanner;

public class ex01 {
    public static void ex1() {
        Scanner teclado = new Scanner(System.in);
        int m, n;
        System.out.println("Indique o valor de da variável 'm' (maior número sequencial inteiro que será representado em uma das extremidades de cada linha da matriz).");
        m = teclado.nextInt();
        System.out.println("Indique o valor da variável 'n' (número de linhas da matriz).");
        n = teclado.nextInt();

        for (int aux = 0; aux < n; aux++){
            if (aux%2==0){
                for (int aux2 = 0; aux2 <= m; aux2++){
                    System.out.print(aux2);
                }
            }
            else{
                for (int aux3 = m; aux3 >= 0; aux3--){
                    System.out.print(aux3);
                }
            }
            System.out.println();
        }
        teclado.close();
    }
}

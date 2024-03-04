package LISTA_3.EX03;

import java.util.Scanner;

public class Main {
    public static long Fatorial(long numero) throws EntradaInvalidaException {
        long fat = 1;
        long n = 1;
        if (numero >=20) {
            throw new EntradaInvalidaException();
        } else {
            while(n++ <= numero){
                fat *= n;
            }
            return fat;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long numero;
        System.out.println("Indique o número do qual será gerado o fatorial.");
        numero = teclado.nextLong();
        try {
            long f = Fatorial(numero);
            System.out.println(f);
        } catch(EntradaInvalidaException e) {
            System.err.println("Número indicado muito alto. Tente novamente com um número menor.");
        }

    }
}

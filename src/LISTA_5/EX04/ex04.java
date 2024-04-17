package LISTA_5.EX04;

public class ex04 {
    public static int somaDig(int n) {
        int resp = n % 10;
        if(n/10 >= 1) {
            resp = n % 10 + somaDig(n/10);
        }
        return resp;
    }
}

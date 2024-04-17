package LISTA_5.EX10;

public class ex10 {
    public static double funcao(int n) {
        double resp;
        if(n == 0) {
            resp = 1;
        } else if(n == 1) {
            resp = 2;
        } else {
            resp = funcao(n - 1) * funcao(n - 2) - funcao(n - 1);
        }
        return resp;
    }
}

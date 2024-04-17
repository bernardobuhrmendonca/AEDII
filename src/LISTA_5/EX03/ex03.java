package LISTA_5.EX03;

public class ex03 {
    public static int nDigitos(int n) {
        int resp = 1;
        if(n / 10 >= 1) {
            resp = 1 + nDigitos(n / 10);
        }
        return resp;
    }
}

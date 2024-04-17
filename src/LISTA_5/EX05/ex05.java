package LISTA_5.EX05;

public class ex05 {
    public static int multiplicacao(int a, int b){
        int resp = 0;
        if(b != 0) {
            resp = a + multiplicacao(a, b-1);
        }
        return resp;
    }
}

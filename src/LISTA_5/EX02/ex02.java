package LISTA_5.EX02;

public class ex02 {
    public static int divisao(int a, int b) {
        int resposta = 0;
        if(a >= b) {
            resposta = 1 + divisao(a-b,b);
        }
        return resposta;
    }
}

package LISTA_5.EX08;

public class ex08 {
    public static double potenciacao (double num, int expoente){
        double resp = 1;
            if (expoente != 0) {
                if (num == 0) {
                    resp = 0;
                } else {
                    resp = num * potenciacao(num, expoente - 1);
                }
            }
        return resp;
    }
}

package LISTA_5.EX06;

public class ex06 {
    public static double pg(double t1, double razao, int nTermos) {
        double resp = t1;
        if (nTermos - 1 > 0) {
            resp = razao * pg(t1, razao, nTermos - 1);
        }
        return resp;
    }
}

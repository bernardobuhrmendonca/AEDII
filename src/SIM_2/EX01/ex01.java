package SIM_2.EX01;

public class ex01 {
    public static double expoente (double num, int exp) throws ExcessaoExpNegativo {
        double resultado = 0;
        if (num == 0) {
            if (exp == 0) {
                resultado = 1;
            } else if (exp > 0) {
                resultado = 0;
            }
        } else if (exp == 0) {
            resultado = 1;
        } else if (exp > 0) {
            resultado = num * expoente(num, exp - 1);
        } else {
            throw new ExcessaoExpNegativo("Expoente negativo!");
        }
        return resultado;
    }
}

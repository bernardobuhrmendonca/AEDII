package LISTA_5.EX07;

public class ex07 {
    private static int pesquisaRec(double[] vet, double num, int tamanho) {
        int resp = -1;
        if (tamanho >= 0){
            if (vet[tamanho] == num){
                return tamanho;
            }
            else {
                resp = pesquisaRec(vet, num, tamanho-1);
            }
        }
        return resp;
    }
    public static int pesquisaRec(double[] vet, double num) {
        return pesquisaRec(vet,num,vet.length - 1);
    }
}

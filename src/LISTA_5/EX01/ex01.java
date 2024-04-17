package LISTA_5.EX01;

public class ex01 {

    private static void inverso(String[] vetor, int index){
        if (index >= 0){
            System.out.println(vetor[index]);
            inverso(vetor,index-1);
        }
    }
    public static void inverso(String[] vetor) {
        inverso(vetor, vetor.length - 1);
    }
}

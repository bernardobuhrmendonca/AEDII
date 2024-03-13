package LISTA_4.EX03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "";
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        while(!nome.equalsIgnoreCase("X") ) {
            System.out.println("Digite um nome para adcionar a lista, ou X para encerrar o cadastramento.");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("X")){
                nomes.add(nome);
            }
            else {
                System.out.println();
                System.out.println("Preencimento concluído.");
            }
        }
        System.out.println();
        System.out.println("Indique um nome para ser pesquisado.");
        nome = teclado.nextLine();
        boolean achou = PesquisaSquencial.PesquisaSQ(nomes,nome);
        if (achou) {
            System.out.println("Nome encontrado.");
        } else {
            System.out.println("Nome não encontrado.");
        }
        teclado.close();
    }
}

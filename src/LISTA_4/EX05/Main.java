package LISTA_4.EX05;

import LISTA_4.EX03.PesquisaSquencial;

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
        System.out.println("Indique um nome para ter a primeira ocorrência removida.");
        nome = teclado.nextLine();
        boolean achou = RemoverNomeSequencial.RemoverNomeSQ(nomes,nome);
        if (achou) {
            System.out.println("Nome encontrado e primeira ocorrência removida.");
            for (String termos : nomes) {
                System.out.println(termos);
            }
        } else {
            System.out.println("Nome não encontrado.");
        }
        teclado.close();
    }
}

package LISTA_4.EX01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {
    public static ArrayList<String> ex01() {
        ArrayList<String> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String nome = "";
        while(!nome.equalsIgnoreCase("STOP")){
            System.out.println("Indique um nome para ser adicionado à lista. " +
                    "\nDigite STOP para interromper o cadastramento de nomes.");
            nome = teclado.nextLine();
            lista.add(nome);
        }
        return lista;
    }
}

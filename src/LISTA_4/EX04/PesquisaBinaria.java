package LISTA_4.EX04;

import java.util.ArrayList;
import java.util.Collections;

public class PesquisaBinaria {
    public static boolean PesquisaBI(ArrayList<String> nomes, String nome){
        Collections.sort(nomes);
        int esquerda = 0;
        int direita = nomes.size() - 1;
        int meio;
        boolean achou = false;
        while (direita >= esquerda) {
            meio = direita - esquerda / 2;
            if (nome.equalsIgnoreCase(nomes.get(meio))) {
                esquerda = nomes.size();
                achou = true;
            } else if (nome.compareToIgnoreCase(nomes.get(meio)) > 0) {
                esquerda = meio + 1;
            } else {
                direita = meio -1;
            }

        }
        return achou;
    }
}

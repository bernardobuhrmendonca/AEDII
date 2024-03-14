package LISTA_4.EX06;

import java.util.ArrayList;
import java.util.Collections;

public class RemoverNomeBinario {
    public static boolean RemoverNomeBI(ArrayList<String> nomes, String nome) {
        boolean achou = false;
        int esquerda = 0;
        int direita = nomes.size() - 1;
        int meio;
        Collections.sort(nomes);
        while (esquerda <= direita && !achou) {
            meio = direita + esquerda / 2;
            if (nome.equalsIgnoreCase(nomes.get(meio))) {
                nomes.remove(meio);
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

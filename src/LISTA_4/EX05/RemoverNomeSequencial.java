package LISTA_4.EX05;

import java.util.ArrayList;

public class RemoverNomeSequencial {
    public static boolean RemoverNomeSQ(ArrayList<String> nomes, String nome) {
        boolean achou = false;
        for (int aux = 0; aux < nomes.size(); aux++) {
            if (nomes.get(aux).equalsIgnoreCase(nome) && !achou) {
                nomes.remove(nome);
                achou = true;
            }
        }
        return achou;
    }
}

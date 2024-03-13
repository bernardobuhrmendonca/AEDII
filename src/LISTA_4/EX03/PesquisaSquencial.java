package LISTA_4.EX03;

import java.util.ArrayList;

public class PesquisaSquencial {
    public static boolean PesquisaSQ(ArrayList<String> nomes, String nome) {
        boolean achou = false;
        for (int aux = 0; aux < nomes.size(); aux++){
            if (nomes.get(aux).equalsIgnoreCase(nome)) {
                aux = nomes.size();
                achou = true;
            }
        }
        return achou;
    }
}

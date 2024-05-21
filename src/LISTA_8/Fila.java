package LISTA_8;

public class Fila {
    private int tamanho;
    private Celula<Integer> primeiro;
    private Celula<Integer> ultimo;

    public Fila(int elemento){
        getPrimeiro().setElemento(elemento);
        setUltimo(getPrimeiro());
    }

    public int getTamanho() {
        return tamanho;
    }

    public Celula<Integer> getPrimeiro() {
        return primeiro;
    }

    public Celula<Integer> getUltimo() {
        return ultimo;
    }

    private void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    private void setPrimeiro(Celula<Integer> primeiro) {
        this.primeiro = primeiro;
    }

    private void setUltimo(Celula<Integer> ultimo) {
        this.ultimo = ultimo;
    }

    public void enfileirar(int elemento) {
        setTamanho(getTamanho() + 1);
        Celula<Integer> tmp = new Celula<>();
        ultimo.setProx(tmp);
        ultimo = ultimo.getProx();
    }

    public void remover()  throws FilaException{
        if (this.getTamanho()==1){
            throw new FilaException("Não é possível efetuar a remoção pois a fila já esta no tamanho mínimo.");
        }
        setTamanho(getTamanho() - 1);
        Celula<Integer> tmp;
        tmp = primeiro;
        primeiro = primeiro.getProx();
        tmp.setProx(null);
        tmp = null;
    }

    public void mostrar() {
        if (tamanho == 1) {
            System.out.println("[" + primeiro + "]");
        } else {
            System.out.print("[");
            for(Celula<Integer> i = primeiro; i != null; i= i.getProx()) {
                System.out.print(i + ", ");
            }
            System.out.print("]");
        }
    }

    public int amplitude() {
        Celula<Integer> tmp = primeiro;
        int menor = primeiro.getElemento();
        int maior = primeiro.getElemento();
        for (Celula<Integer> j = primeiro.getProx(); j != null; j = j.getProx()) {
            if (j.getElemento()>maior){
                maior = j.getElemento();
            } else if(j.getElemento()<menor) {
                menor = j.getElemento();
            }
        }
        return maior - menor;
    }

    public int mediaTermos() {
        int soma = primeiro.getElemento();
        int cont = 1;
        for(Celula<Integer> k = primeiro.getProx(); k!= null; k = k.getProx()) {
            soma = soma + k.getElemento();
            cont++;
        }
    return soma / cont;
    }

    public void furaFila(int elemento, int pos) {
        Celula<Integer> tmp = primeiro;
        tmp.setElemento(elemento);
        for (int l = 1; l < pos; l++){
            tmp = tmp.getProx();
        }
        tmp.getProx().setElemento(elemento);
    }

    public int menorRec() {
        Celula<Integer> tmp = primeiro;
        menorRec(tmp);
        return tmp.getElemento();
    }
    private int menorRec(Celula<Integer> tmp) {
            if(tmp.getProx().getElemento() < tmp.getElemento() && tmp.getProx() != null) {
                tmp = tmp.getProx();
                menorRec(tmp);
            }
            else{
                menorRec(tmp.getProx());
            }
        return tmp.getElemento();
    }

    public void inversor() {
        Celula<Integer> tmp;
        tmp = primeiro;
        primeiro = ultimo;
        ultimo = tmp;
        
    }

    public void enfileirarNoHead(int elemento) {
        if (primeiro==null) {
           Celula<Integer> tmp = new Celula<>();
           tmp.setElemento(elemento);
           primeiro = tmp;
           ultimo = tmp;
        } else {
            setTamanho(getTamanho() + 1);
            Celula<Integer> tmp = new Celula<>();
            ultimo.setProx(tmp);
            ultimo = ultimo.getProx();
        }
    }

    public void removerNoHead() throws FilaException{
        if (this.getTamanho()==1){
            throw new FilaException("Não é possível efetuar a remoção pois a fila já esta no tamanho mínimo.");
        }
        setTamanho(getTamanho() - 1);
        primeiro = null;
    }
}

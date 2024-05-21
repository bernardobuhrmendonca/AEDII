package LISTA_9;

public class Pilha {
    private Celula<Integer> ultimo;
    private int tamanho;

    public Pilha() {
        ultimo = null;
    }
    public Pilha(int elemento) {
        getUltimo().setElemento(elemento);
    }

    public int getTamanho() {
        return tamanho;
    }

    public Celula<Integer> getUltimo() {
        return ultimo;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setUltimo(Celula<Integer> ultimo) {
        this.ultimo = ultimo;
    }

    public boolean estavazia() {
        return tamanho == 0;
    }

    public void inserir(int elemento) {
        Celula<Integer> temp = new Celula<>();
        temp.setProx(ultimo);
        ultimo.setElemento(elemento);
        temp = null;
        tamanho++;
    }
    public int remover() {
        Celula<Integer> temp;
        temp = ultimo;
        ultimo = ultimo.getProx();
        Integer elemento = ultimo.getElemento();
        temp.setProx(null);
        temp = null;
        tamanho--;
        return elemento;
    }
    public int soma(){
        return soma(ultimo);
    }
    private int soma(Celula<Integer> cel){
        int soma =+ soma(cel.getProx().getElemento());
        return soma;
    }
    public int maior() {
        int maior = ultimo.getElemento();
        for (Celula<Integer> i = ultimo.getProx(); i!= null; i= i.getProx()){
            if(maior<i.getElemento()){
                maior = i.getElemento();
            }
        }
        return maior;
    }
    public void mostrar() {
        System.out.println(mostrar(ultimo));
    }
    public int mostrar(Celula<Integer> cel){
        mostrar(cel.getProx().getElemento());
        return cel.getElemento();
    }
}

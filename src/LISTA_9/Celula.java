package LISTA_9;

public class Celula <s>{
    private Celula<s> prox;
    private int elemento;

    public Celula() {

    }
    public Celula(int elemento) {
        setElemento(elemento);
    }

    public Celula<s> getProx() {
        return prox;
    }

    public int getElemento() {
        return elemento;
    }

    public void setProx(Celula<s> prox) {
        this.prox = prox;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
}

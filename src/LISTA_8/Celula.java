package LISTA_8;

public class Celula<T> {
    private int elemento;
    private Celula<T> prox;

    public Celula() {
        setProx(null);
    }
    public Celula(Integer elemento) {
        setProx(null);
        setElemento(elemento);
    }

    public int getElemento() {
        return elemento;
    }

    public Celula<T> getProx() {
        return prox;
    }

    public void setElemento(Integer elemento) {
        this.elemento = elemento;
    }

    public void setProx(Celula<T> prox) {
        this.prox = prox;
    }
}

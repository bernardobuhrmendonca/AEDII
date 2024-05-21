package SIM_2.EX03;

/**
 * SIM_2.EX03.Pilha dinamica
 * 
 * @author Diego Silva Caldeira Rocha
 * @version 3 01/2023
 */
public class Pilha <T> {
	protected Celula <T>topo;
	private int tamanho; //número de elemento de uma pilha

	/**
	 * Construtor da classe que cria uma fila sem elementos.
	 */
	public Pilha() {
		topo = null;
	}

	/**
	 * Insere elemento na pilha (politica FILO).
	 * 
	 * @param x int elemento a inserir.
	 */
	public void inserir(T x) {
		Celula tmp = new Celula(x);
		tmp.setProx( topo);
		topo = tmp;
		tmp = null;
		tamanho++;
	}

	/**
	 * Remove elemento da pilha (politica FILO).
	 * 
	 * @return Elemento removido.
	 * @trhows Exception Se a sequencia nao contiver elementos.
	 */
	public T remover() throws Exception {
		if (topo == null) {
			throw new Exception("Erro ao remover!");
		}
		T resp = topo.getElemento();
		Celula tmp = topo;
		topo = topo.getProx();
		tmp.setProx( null);
		tmp = null;
		tamanho--;
		return resp;
	}

	/**
	 * Mostra os elementos separados por espacos, comecando do topo.
	 */
	public void mostrar() {
		System.out.print("[ ");
		for (Celula i = topo; i != null; i = i.getProx()) {
			System.out.print(i.getElemento() + " ");
		}
		System.out.println("] ");
	}



	public void mostraPilha() {
		mostraPilha(topo);
	}

	private void mostraPilha(Celula i) {
		if (i != null) {
			mostraPilha(i.getProx());
			System.out.println("" + i.getElemento());
		}
	}


	/**
	 *
	 * @return numero de elementos da pilha
	 */
	public int getTamanho() {
		return tamanho;
	}

	public boolean vazio(){
		return (topo==null);
	}


}

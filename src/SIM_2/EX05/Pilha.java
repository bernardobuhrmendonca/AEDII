package SIM_2.EX05;

/**
 * SIM_2.EX05.Pilha dinamica
 * 
 * @author Diego Silva Caldeira Rocha
 * @version 3 01/2023
 */
public class Pilha<T> {
	private SIM_2.EX05.Celula<T> topo;
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
		SIM_2.EX05.Celula<T> tmp = new SIM_2.EX05.Celula<>(x);
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
		SIM_2.EX05.Celula<T> tmp = topo;
		topo = topo.getProx();
		tmp.setProx( null);
		tmp = null;
		tamanho--;
		return resp;
	}


	//Soma de dois números com o uso de pilhas - ex 05 (Questao6Sim)
	public void somaPilhas(Pilha<Integer> pilha1, Pilha<Integer> pilha2, Pilha<Integer> pilha3) {
        try {
			int soma;
			while (pilha1.topo.getElemento() != null && pilha2.topo.getElemento() != null) {
				soma = pilha1.remover() + pilha2.remover();
				if ( soma >= 10) {
					pilha1.topo.setElemento(pilha1.topo.getElemento() + soma / 10);
					soma = soma % 10;
				}
				pilha3.inserir(soma);
			}
			while (pilha3.topo.getElemento() != null) {
				System.out.print(pilha3.remover());
			}
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

	/**
	 * Mostra os elementos separados por espacos, comecando do topo.
	 */
	public void mostrar() {
		System.out.print("[ ");
		for (SIM_2.EX05.Celula<T> i = topo; i != null; i = i.getProx()) {
			System.out.print(i.getElemento() + " ");
		}
		System.out.println("] ");
	}



	public void mostraPilha() {
		mostraPilha(topo);
	}

	private void mostraPilha(SIM_2.EX05.Celula<T> i) {
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

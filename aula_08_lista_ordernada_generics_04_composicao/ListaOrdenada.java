package aula_08_lista_ordernada_generics_04_composicao;

public class ListaOrdenada<T extends Comparable<T>> implements Lista<T> {
	
	private Lista<T> lista = new ListaArranjo<T>();
	
	// Adiciona elemento
	public void adiciona(T elemento) {
		boolean inseriu = false;

		try {
			for (int i = 0; i < tamanho(); i++) {
				// Se encontrar elemento maior, insere na posicao
				if (elemento.compareTo(pega(i)) <= 0) {
					lista.adiciona(i, elemento);
					inseriu = true;
					break;
				}
			}
			if (!inseriu) {
				// Adiciona no final
				lista.adiciona(elemento);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição fora do limite do vetor!");
		}
	}

	@Override
	public void adiciona(int posicao, T elemento) {
		adiciona(elemento);
	}

	@Override
	public T pega(int posicao) {
		return lista.pega(posicao);
	}

	@Override
	public int busca(T elemento) {
		// TODO Auto-generated method stub
		return lista.busca(elemento);
	}

	@Override
	public void remove(int posicao) {
		lista.remove(posicao);
	}

	@Override
	public int tamanho() {
		// TODO Auto-generated method stub
		return lista.tamanho();
	}

	@Override
	public void substitui(int i, T elemento) {
		lista.substitui(i, elemento);
	}

	@Override
	public void copiaPara(T[] arranjo) {
		lista.copiaPara(arranjo);
	}

	@Override
	public void inverte() {
		lista.inverte();
	}

	@Override
	public Lista<T> segmento(int i, int j) {
		return lista.segmento(i, j);
	}

	@Override
	public void Equals() {
		lista.Equals();
	}

	@Override
	public String toString() {
		return lista.toString();
	}

}
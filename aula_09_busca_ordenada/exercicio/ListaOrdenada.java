package aula_09_busca_ordenada.exercicio;

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
		// Essa busca é linear e sequencial
		// return buscaOrdenada(elemento);

		// Essa busca é a binaria
		return buscaBinaria(elemento);
	}

	public int buscaOrdenada(T elemento) {
		for (int i = 0; i < tamanho(); i++) {

			int comparacao = elemento.compareTo(pega(i));

			if (comparacao == 0) {
				return i;
			} else if (comparacao < 0) {
				return -1;
			}
		}
		return -1;
	}
	
	public int buscaBinaria(T elemento) {
		int n = tamanho();
		int esquerda = 0;
		int direita = n - 1;

		for (int i = 0; i < tamanho(); i++) {

			int metade = Math.abs((esquerda + direita) / 2);
			int comparacao = elemento.compareTo(pega(metade));

			if (comparacao == 0) {
				return metade; 
			} else if (comparacao < 0) {
				direita = metade - 1;
			} else esquerda = metade + 1;
		}
		return -1;
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
	public String toString() {
		return lista.toString();
	}

}
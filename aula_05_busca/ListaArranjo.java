package aula_05_busca;

public class ListaArranjo<T> implements Lista<T> {

	private Object[] arranjo = new Object[100];
	private int qtde_elementos = 0;

	public ListaArranjo() {
	}

	// Adiciona elemento
	public void adiciona(T elemento) {
		garanteEspaco();
		try {
			arranjo[qtde_elementos] = elemento;
			qtde_elementos++;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição fora do limite do vetor!");
		}
	}

	// Adiciona elemento em posicao especÃ­fica
	public void adicionaPosicao(int posicao, T elemento) {
		if (!posicaoValidaAdicao(posicao)) {
			throw new IllegalArgumentException("Posição não encontrada!");
		}

		garanteEspaco();
		int tamanho = tamanho();
		if (posicao == tamanho) {
			arranjo[posicao] = elemento;
		} else {
			for (int i = tamanho; i > posicao; i--) {
				arranjo[i] = arranjo[i - 1];

			}
			arranjo[posicao] = elemento;
		}
		qtde_elementos++;
	}

	// Garante a inserÃ§Ã£o em uma posiÃ§Ã£o correta
	private boolean posicaoValidaAdicao(int posicao) {
		return posicao >= 0 && posicao <= tamanho();
	}

	// Aumenta o array se necessÃ¡rio
	public void garanteEspaco() {
		if (tamanho() == arranjo.length) {
			Object[] novoArranjo = new Object[this.arranjo.length * 2];
			for (int i = 0; i < this.arranjo.length; i++) {
				novoArranjo[i] = this.arranjo[i];
			}
			this.arranjo = novoArranjo;
		}
	}

	// Aluno em determinada posicao
	@SuppressWarnings("unchecked")
	public T pega(int posicao) {
		try {
			return (T) arranjo[posicao];
		} catch (Exception e) {
			return (T) "Range de elementos divergente do vetor!";
		}
	}

	// Quantidade de elementos
	public int tamanho() {
		return qtde_elementos;
	}

	// Remove elemento da posiÃ§Ã£o
	public void remove(int posicao) {
		int tamanho = tamanho();
		for (int i = posicao; i < tamanho; i++) {
			arranjo[i] = arranjo[i + 1];
		}
	}

	// Impressão dos dados
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		int i = 0;
		while (arranjo[i] != null) {
			if (i > 0) {
				result.append(", ");
			}
			result.append(arranjo[i]);
			i++;
		}
		result.append("]");
		return result.toString();
	}

	@Override
	public int busca(T elemento) {
		for (int i = 0; i < qtde_elementos; i++) {
			if (arranjo[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}	

	public void removeDaPosicao(T elemento) {
		int posicao = busca(elemento);
		if (posicao > -1) {
			remove(posicao);
		}
	}

	// remove todos os elementos encontrados
	public boolean removeTodos(T elemento) {
		boolean result = false;
		for (int i = 0; i < qtde_elementos; i++) {
			if (arranjo[i].equals(elemento)) {
				// int posicao = busca(elemento);
				// remove(posicao);
				remove(i);
				i--;
				result = true;
			}
		}
		return result;
	}

	public void copiaDe(T[] origem) {
		if (origem.length > arranjo.length) {
			arranjo = new Object[origem.length];
		} else {
			if (tamanho() > origem.length) {
				for (int i = origem.length; i < tamanho(); i++) {
					arranjo[i] = null;
				}
			}
		}
		for (int i = 0; i < origem.length; i++) {
			arranjo[i] = origem[i];
		}
		int tamanho = origem.length;
	}

	public void copiaDe(Lista<T> origem) {
		int tamanhoOrigem = origem.tamanho();
		for (int i = 0; i < tamanhoOrigem; i++) {
			adiciona(origem.pega(i));
		}
	}

	public boolean igual(Lista<T> lista) {
		if (this == lista) {
			return true;
		}
		int tamanho = 0;
		if (tamanho == lista.tamanho()) {
			for (int i = 0; i < arranjo.length; i++) {
				if (!arranjo[i].equals(lista.pega(i))) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

}
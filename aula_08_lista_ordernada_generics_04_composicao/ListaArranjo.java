package aula_08_lista_ordernada_generics_04_composicao;

public class ListaArranjo<T> implements Lista<T> {
	
	private Object[] arranjo = new Object[200];
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
			System.out.println("Posi��o fora do limite do vetor!");
		}
	}

	// Adiciona elemento em posicao específica
	public void adiciona(int posicao, T elemento) {
		if (!posicaoValidaAdicao(posicao)) {
			throw new IllegalArgumentException("Posi��o n�o encontrada!");
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

	// Garante a inserção em uma posição correta
	private boolean posicaoValidaAdicao(int posicao) {
		return posicao >= 0 && posicao <= tamanho();
	}

	// Aumenta o array se necessário
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

	// Remove elemento da posição
	public void remove(int posicao) {
		int tamanho = tamanho();
		for (int i = posicao; i < tamanho; i++) {
			arranjo[i] = arranjo[i + 1];
		}
	}

	// Impress�o dos dados
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

	////////////////// PROVA //////////////////
	public void substitui(int i, T elemento) {
		if (!posicaoValidaAdicao(i)) {
			throw new IllegalArgumentException("Posi��o n�o encontrada!");
		}
		garanteEspaco();
		arranjo[i] = elemento;
	}

	@SuppressWarnings("unchecked")
	public void copiaPara(T[] arranjo) {
		for (int i = 0; i < tamanho(); i++) {
			arranjo[i] = (T) this.arranjo[i];
		}
	}

	// Complexidade O:N
	public void inverte() {
		Object aux = "";
		int cont = tamanho() - 1;
		for (int i = 0; i < cont; i++) {
			aux = arranjo[i];
			arranjo[i] = arranjo[i + cont];
			arranjo[i + cont] = aux;
			cont--;
		}
	}

	//
	@SuppressWarnings("unchecked")
	public Lista<T> segmento(int i, int j) {		
		garanteEspaco();
		
		Lista <T> arranjo2 = new ListaArranjo<T>();
			
		try {
			for (int posicao = i; posicao < j; posicao++) {
				arranjo2.adiciona((T) arranjo[posicao]);
				qtde_elementos++;
			}
			
		} catch (Exception e) {
			System.out.println("Posicao fora do limite do vetor!");
		}
		//return (Lista<String>) arranjo2[qtde_elementos2];
		return (Lista<T>) arranjo2;

	}

	@Override
	public void Equals() {
		// TODO Auto-generated method stub
		
	}
}
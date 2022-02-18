package aula_10_lista_ligada_02_generics;

public class ListaLigada<T> {

	private Celula<T> inicio;
	private int qtdeElementos;

	public void adiciona(T elemento) {
		if (qtdeElementos == 0) {
			adicionaNoComeco(elemento);
		} else {
			Celula<T> atual = inicio;
			while (atual.getProxima() != null) {
				atual = atual.getProxima();
			}
			Celula<T> celula = new Celula<T>(elemento, null);
			atual.setProxima(celula);
			qtdeElementos++;
		}
	}

	public void adicionaNaPosicao(int posicao, T elemento) {
		if (!posicaoValidaAdicao(posicao)) {
			throw new IllegalArgumentException("Posição inválida para adição: " + posicao);
		}
		if (posicao == 0) {
			adicionaNoComeco(elemento);
		} else if (posicao == tamanho()) {
			adiciona(elemento);
		} else {
			Celula<T> anterior = pegaCelula(posicao - 1);
			Celula<T> nova = new Celula<T>(elemento, anterior.getProxima());
			anterior.setProxima(nova);
			qtdeElementos++;
		}
	}

	public void adicionaNoComeco(T elemento) {
		Celula<T> nova = new Celula<T>(elemento, inicio);
		inicio = nova;
		qtdeElementos++;
	}

	private boolean posicaoValidaAdicao(int posicao) {
		return posicao >= 0 && posicao <= tamanho();
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < tamanho();
	}

	public int tamanho() {
		return qtdeElementos++;
	}

	public T pega(int posicao) {
		return pegaCelula(posicao).getElemento();
	}

	private Celula<T> pegaCelula(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição não ocupada: " + posicao);
		}
		Celula<T> celula = inicio;
		for (int i = 0; celula != null && i < posicao; ++i) {
			celula = celula.getProxima();
		}
		return celula;
	}

	public int busca(T elemento) {
		Celula<T> celula = inicio;

		// Percorrendo a lista
		// Condições: a celula não ser nula e estar dentro do tamanho
		for (int i = 0; celula != null && i < tamanho(); i++) {
			// Se o elemento dentro da célula for igual ao passado
			if (celula.getElemento().equals(elemento)) {
				return i;
			}
			// Passa para o próximo elemento
			celula = celula.getProxima();
		}
		return -1;
	}

	public void remove(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição não ocupada: " + posicao);
		} else if (posicao == 0) {
			// Remove do começo
			inicio = inicio.getProxima();
		} else {
			// Remove do meio ou do final
			Celula<T> anterior = pegaCelula(posicao - 1);
			Celula<T> remover = anterior.getProxima();
			anterior.setProxima(remover.getProxima());
		}
		qtdeElementos--;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");

		Celula<T> celula = inicio;

		// testa se elemento pego é nulo
		while (celula != null) {
			if (result.length() > 1) {
				result.append(", ");
			}
			// anexa o elemento
			result.append(celula.getElemento());
			// pega o próximo elemento
			celula = celula.getProxima();
		}
		// fecha a lista
		result.append("]");
		return result.toString();
	}
}

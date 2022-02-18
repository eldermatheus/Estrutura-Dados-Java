package aula_11_lista_duplamente_ligada;

public class ListaDuplamenteLigada<T> implements Lista<T> {

	private Celula<T> inicio;
	private Celula<T> termina;
	private int qtdeElementos;

	public void adiciona(T elemento) {
		if (qtdeElementos == 0) {
			adicionaNoComeco(elemento);
		} else {
			
			Celula<T> celula = new Celula<T>(elemento, null, termina);							
			termina.setProxima(celula);
			termina = celula;
			qtdeElementos++;
		}
	}

	public void adiciona(int posicao, T elemento) {
		if (!posicaoValidaAdicao(posicao)) {
			throw new IllegalArgumentException("Posição inválida para adição: " + posicao);
		}
		if (posicao == 0) {
			adicionaNoComeco(elemento);
		} else if (posicao == tamanho()) {
			adiciona(elemento);
		} else {
			
			//Armazena as celulas já existentes
			Celula<T> atual = pegaCelula(posicao);
			Celula<T> anterior = pegaCelula(posicao - 1);
			
			//Cria nova celula
			Celula<T> nova = new Celula<T>(elemento, atual, anterior);

			//Atualiza as refências
			anterior.setProxima(nova);
			atual.setAnterior(nova);
			
			qtdeElementos++;
		}
	}

	public void adicionaNoComeco(T elemento) {
		Celula<T> nova = new Celula<T>(elemento);
		
		if (tamanho() == 0) {			
			termina = nova;
		} else {
			inicio.setAnterior(nova);
			nova.setProxima(inicio);			
		}
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
			throw new IllegalArgumentException("Posição não ocupada: ");
		}
		int n = tamanho();
		int esquerda = 0;
		int direita = n - 1;
		
		Celula<T> celula = inicio;
		int metade = Math.abs((esquerda + direita) / 2);

		
		if (posicao <= metade) {
			for (int i = 0; celula != null && i < posicao; ++i) {
			celula = celula.getProxima();
			}
			return celula;
		}
		else {
			for (int i = metade; i <= tamanho(); ++i) {
				celula = celula.getProxima();
				}
				return celula;
		}
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
	
	/*
	 *Falta implementar de forma duplamente encadeada
	 *
	 */
	public void remove(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição vazia");
		} else if (posicao == 0) {
			// Remove do começo
			inicio = inicio.getProxima();
		} else {
			// Remove de meio ou fim
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

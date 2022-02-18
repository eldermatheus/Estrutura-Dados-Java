package aula_04_interfaces;

public class ListaArranjo<T> implements Lista<T> {

	private Object[] arranjo = new Object[100];
	int qtde_elementos = 0;

	public ListaArranjo() {
	}

	// Adiciona elemento
	public void adiciona(T elemento) {
		garanteEspaco();
		try {
			for (int i = 0; i < arranjo.length; ++i) {
				if (arranjo[i] == null) {
					arranjo[i] = elemento;
					qtde_elementos += 1;
					break;
				}
			}
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
				qtde_elementos += 1;
			}
			arranjo[posicao] = elemento;
		}
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

	// ImpressÃ£o dos dados
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
}
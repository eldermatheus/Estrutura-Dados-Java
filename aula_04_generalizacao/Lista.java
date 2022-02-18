package aula_04_generalizacao;

public class Lista {

	private Object[] arranjo = new Object[100];
	int qtde_elementos = 0;

	public Lista() {
	}

	// Adiciona elemento
	public void adiciona(Object elemento) {
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

	// Adiciona elemento em posicao específica
	public void adicionaPosicao(int posicao, Object elemento) {
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
	public Object pega(int posicao) {
		try {
			return arranjo[posicao];
		} catch (Exception e) {
			return "Range de elementos divergente do vetor!";
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
}
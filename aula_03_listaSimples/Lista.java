package aula_03_listaSimples;

public class Lista {

	private Aluno[] arranjo = new Aluno[100];
	int qtde_elementos = 0;

	public Lista() {
	}

	// Adiciona elemento
	public void adiciona(Aluno aluno) {
		garanteEspaco();
		try {
			for (int i = 0; i < arranjo.length; ++i) {
				if (arranjo[i] == null) {
					arranjo[i] = aluno;
					qtde_elementos += 1;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Número de elementos maior que o vetor!");
		}
	}

	// Adiciona elemento em posicao específica
	public void adicionaPosicao(int posicao, Aluno aluno) {
		garanteEspaco();
		int tamanho = tamanho();
		if (posicao == tamanho) {
			arranjo[posicao] = aluno;
		} else {
			for (int i = tamanho; i > posicao; i--) {
				arranjo[i] = arranjo[i - 1];
				qtde_elementos += 1;
			}
			arranjo[posicao] = aluno;
		}
	}

	// Aumenta o array se necessário
	public void garanteEspaco() {
		if (tamanho() == arranjo.length) {
			Aluno[] novoArranjo = new Aluno[this.arranjo.length * 2];
			for (int i = 0; i < this.arranjo.length; i++) {
				novoArranjo[i] = this.arranjo[i];
			}
			this.arranjo = novoArranjo;
		}
	}

	// Aluno em determinada posicao
	public Aluno pega(int posicao) {
		return arranjo[posicao];
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
			result.append(arranjo[i] + ", ");
			i++;
		}
		result.append("]");
		return result.toString();
	}
}
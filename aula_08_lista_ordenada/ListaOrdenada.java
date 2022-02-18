package aula_08_lista_ordenada;

public class ListaOrdenada<T> {

	private Object[] arranjo = new Object[200];
	private int qtde_elementos = 0;

	// Adiciona elemento
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void adiciona(Comparable elemento) {
		garanteEspaco();
		boolean inseriu = false;

		try {

			for (int i = 0; i < tamanho(); i++) {
				// Se encontrar elemento maior, insere na posicao
				if (elemento.compareTo(arranjo[i]) <= 0) {
					 
					//Desloca os elementos
					for (int j = this.tamanho(); j > i; --j) {
						arranjo[j] = arranjo[j - 1];
					}
					arranjo[i] = elemento;
					inseriu = true;
					break;
				}
			}
			if (!inseriu) {
				//Adiciona no final
				arranjo[tamanho()] = elemento;
			}
			qtde_elementos++;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição fora do limite do vetor!");
		}
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
	
	// Quantidade de elementos
	public int tamanho() {
		return qtde_elementos;
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
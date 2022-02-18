package aula_08_lista_ordernada_generics_02_interface;

import aula_08_lista_ordenada.Candidato;

@SuppressWarnings("unused")
public class ListaOrdenada<T extends Comparable<T>> implements Lista<T> {

	private Object[] arranjo = new Object[200];
	private int qtde_elementos = 0;

	// Adiciona elemento
	@SuppressWarnings({ "unchecked" })
	public void adiciona(T elemento) {
		garanteEspaco();
		boolean inseriu = false;

		try {
			for (int i = 0; i < tamanho(); i++) {
				// Se encontrar elemento maior, insere na posicao
				if (elemento.compareTo((T) arranjo[i]) <= 0) {

					// Desloca os elementos
					for (int j = this.tamanho(); j > i; --j) {
						arranjo[j] = arranjo[j - 1];
					}
					arranjo[i] = elemento;
					inseriu = true;
					break;
				}
			}
			if (!inseriu) {
				// Adiciona no final
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

	@Override
	public void adicionaPosicao(int posicao, T elemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T pega(int posicao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int busca(T elemento) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void remove(int posicao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void substitui(int i, T elemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void copiaPara(T[] arranjo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inverte() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Lista<T> segmento(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Equals() {
		// TODO Auto-generated method stub
		
	}

}
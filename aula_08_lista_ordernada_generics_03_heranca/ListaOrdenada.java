package aula_08_lista_ordernada_generics_03_heranca;

public class ListaOrdenada<T extends Comparable<T>> extends ListaArranjo<T> {

	
	// Adiciona elemento
	public void adiciona(T elemento) {
		boolean inseriu = false;

		try {
			for (int i = 0; i < tamanho(); i++) {
				// Se encontrar elemento maior, insere na posicao
				if (elemento.compareTo(pega(i)) <= 0) {
					super.adiciona(i, elemento);
					inseriu = true;
					break;
				}
			}
			if (!inseriu) {
				// Adiciona no final
				super.adiciona(elemento);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição fora do limite do vetor!");
		}
	}

	@Override
	public void adiciona(int posicao, T elemento) {
		adiciona(elemento);
	}
}
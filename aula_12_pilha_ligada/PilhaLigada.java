package aula_12_pilha_ligada;

public class PilhaLigada <T extends Comparable<T>> implements Pilha<T> {

	private ListaLigada<T> pilha = new ListaLigada<T>();
	
	private Celula<T> inicio;
	private int topo = -1;
	
	@Override
	public void adiciona(T elemento) {
		boolean inseriu = false;

		try {
			for (int i = 0; i < tamanho(); i++) {
				// Se encontrar elemento maior, insere na posicao
				if (elemento.compareTo(pega(i)) <= 0) {
					pilha.adiciona(elemento);
					inseriu = true;
					break;
				}
			}
			if (!inseriu) {
				// Adiciona no final
				pilha.adiciona(elemento);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição fora do limite do vetor!");
		}
		
	}
	
	public T pega(int posicao) {
		return ((Pilha<T>) pilha).pega(posicao);
	}
	
	@Override
	public T remove() {
		return ((Pilha<T>) pilha).remove();
	}

	@Override
	public T topo() {
		return ((Pilha<T>) pilha).topo();		
	}

	@Override
	public int tamanho() {
		return topo + 1;
	}

	@Override
	public boolean vazia() {
		return ((Pilha<T>) pilha).vazia();		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void limpa() {
		((Pilha<T>) pilha).limpa();		
	}	
}

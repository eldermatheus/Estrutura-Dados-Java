package aula_12_pilha;

public class PilhaArranjo<T> implements Pilha<T> {
	private Object[] arranjo = new Object[100];
	private int topo = -1;

	@Override
	public void adiciona(T elemento) {
		topo++;
		arranjo[topo] = elemento;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove() {
		T pos_remocao = (T) "";
		if (topo < 0) {
			throw new ArrayIndexOutOfBoundsException("Posicao n�o encontrada!");
		} else {
			pos_remocao = (T) arranjo[topo];
			arranjo[topo] = null;
			topo--;
		}
		return pos_remocao;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T topo() {
		return (T) arranjo[topo];
	}

	@Override
	public int tamanho() {
		return topo + 1;
	}

	@Override
	public boolean vazia() {
		if (topo < 0) {
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		for (int i = 0; i <= topo; i++) {
			if (result.length() > 1) {
				result.append(", ");
			}
			result.append(arranjo[i]);
		}
		result.append("]");
		return result.toString();
	}

	@Override
	public void limpa() {
		while (!vazia()) {
			remove();
		}
	}
}

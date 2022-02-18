package aula_04_interfaces;

public interface Lista<T> {
	
		public void adiciona(T elemento);
		public void adicionaPosicao(int posicao, T elemento);
		public T pega(int posicao);
		public int tamanho();
		public void remove(int posicao);
}

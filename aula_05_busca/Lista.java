package aula_05_busca;

public interface Lista<T> {
	
		public void adiciona(T elemento);
		public void adicionaPosicao(int posicao, T elemento);
		public T pega(int posicao);
		public int busca(T elemento);
		public int tamanho();
		public void remove(int elemento);		
		public boolean removeTodos(T elemento);
}
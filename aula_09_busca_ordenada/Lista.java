package aula_09_busca_ordenada;

public interface Lista<T> {
	
		public void adiciona(T elemento);
		public void adiciona(int posicao, T elemento);
		public T pega(int posicao);
		public int busca(T elemento);		
		public void remove(int posicao);
		public int tamanho();
		
		/// PROVA ///
		public void substitui(int i, T elemento);
		public void copiaPara(T[] arranjo);
		public void inverte();
		public Lista<T> segmento(int i, int j);
		public void Equals();
}
package aula_12_pilha_ligada;

public interface Lista<T> {

	public void adiciona(T elemento);
	public void adiciona(int posicao, T elemento);	
	public T pega(int posicao);
	public int busca(T elemento);
	public void remove(int posicao);
	public int tamanho();
}
package aula_12_pilha;

public interface Pilha<T> {
	
	public void adiciona(T elemento);

	public T remove();

	public T topo();

	public int tamanho();

	public boolean vazia();
	
	public void limpa();
}

package aula_15_revisao_q20;

public interface Fila<T> {
    public void adiciona(T elemento);
    public T remove();
    public T consulta();
    public int tamanho();
    public boolean vazia();
    public void limpa();
}

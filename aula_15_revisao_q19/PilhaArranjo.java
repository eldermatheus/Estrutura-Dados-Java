package aula_15_revisao_q19;

public class PilhaArranjo<T> implements Pilha<T> {
    private Object[] arranjo;
    private int topo;

    public PilhaArranjo() {
        arranjo = new Object[100];
        topo = -1;
    }

    public void adiciona(T elemento) {
        topo++;
        arranjo[topo] = elemento;
    }

    public T remove() {
        T result = null;
        if (topo >= 0) {
            result = (T) arranjo[topo];
            arranjo[topo] = null;
            topo--;
        }
        return result;
    }

    public T topo() {
        T result = null;
        if (topo >= 0) {
            result = (T) arranjo[topo];
        }
        return result;
    }

    public int tamanho() {
        return topo + 1;
    }

    public boolean vazia() {
        return topo == -1;
    }
    
    public void limpa() {
        for (int i = 0; i <= topo; i++) {
            arranjo[i] = null;
        }
        topo = -1;
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

}

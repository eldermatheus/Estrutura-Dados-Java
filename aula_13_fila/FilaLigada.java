package aula_13_fila;

public class FilaLigada<T> implements Fila<T> {
    private Celula<T> inicio;
    private Celula<T> fim;
    private int totalDeElementos;

    @Override
    public void adiciona(T elemento) {
        Celula<T> nova = new Celula<T>(elemento);
        if (totalDeElementos == 0) {
            inicio = nova;
            fim = nova;
        } else {
            fim.setProxima(nova);
            nova.setAnterior(fim);
            fim = nova;
        }
        totalDeElementos++;
    }

    @Override
    public T remove() {
        T result = null;
        if (totalDeElementos > 0) {
            result = inicio.getElemento();
            if (totalDeElementos == 1) {
                inicio = null;
                fim = null;
            } else {
                inicio = inicio.getProxima();
                inicio.setAnterior(null);
            }
            totalDeElementos--;
        }
        return result;
    }

    @Override
    public T consulta() {
        T result = null;
        if (totalDeElementos > 0) {
            result = inicio.getElemento();
        }
        return result;
    }

    @Override
    public int tamanho() {
        return totalDeElementos;
    }

    @Override
    public boolean vazia() {
        return totalDeElementos == 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Celula<T> celula = inicio;
        while (celula != null) {
            if (result.length() > 1) {
                result.append(", ");
            }
            result.append(celula.getElemento().toString());
            celula = celula.getProxima();
        }

        result.append("]");
        return result.toString();
    }
}
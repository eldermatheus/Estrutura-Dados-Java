package aula_15_revisao_q18;

public class Celula<T> {

    private T elemento;
    private Celula<T> proxima;

    public Celula(T elemento, Celula<T> proxima) {
        this.elemento = elemento;
        this.proxima = proxima;
    }

    public T getElemento() {
        return elemento;
    }

    public Celula<T> getProxima() {
        return proxima;
    }

    public void setProxima(Celula<T> proxima) {
        this.proxima = proxima;
    }
}

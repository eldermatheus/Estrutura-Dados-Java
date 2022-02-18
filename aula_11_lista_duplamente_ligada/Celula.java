package aula_11_lista_duplamente_ligada;

public class Celula <T> {

	private T elemento;
	private Celula<T> proxima;
	private Celula<T> anterior;
	
	public Celula(T elemento, Celula<T> proxima, Celula<T> anterior) {		
		this.elemento = elemento;
		this.proxima = proxima;
		this.anterior = anterior;
	}

	public Celula(T elemento) {
		this.elemento = elemento;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public Celula <T> getProxima() {
		return proxima;
	}

	public void setProxima(Celula <T> proxima) {
		this.proxima = proxima;
	}
	
	public Celula <T> getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula <T> anterior) {
		this.anterior = anterior;
	}

	
}

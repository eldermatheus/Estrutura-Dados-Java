package aula_10_lista_ligada_02_interface;

public class Celula <T> {

	private T elemento;
	private Celula<T> proxima;
	private Celula<T> anterior;
	
	public Celula(T elemento, Celula<T> proxima) {		
		this.elemento = elemento;
		this.proxima = proxima;
	}
	
	public Celula(T elemento, Celula<T> anterior, Celula<T> proxima) {		
		this.elemento = elemento;
		this.proxima = proxima;
		this.anterior = anterior;
	}

	public T getElemento() {
		return elemento;
	}

	public Celula <T> getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula <T> anterior) {
		this.anterior = anterior;
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
}

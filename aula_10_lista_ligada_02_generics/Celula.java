package aula_10_lista_ligada_02_generics;

public class Celula <T> {

	private T elemento;
	private Celula<T> proxima;
	
	public Celula(T elemento, Celula<T> proxima) {		
		this.elemento = elemento;
		this.proxima = proxima;
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
	
	
}

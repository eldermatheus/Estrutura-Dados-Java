package aula_06_teste;

import aula_06_prova.Lista;
import aula_06_prova.ListaArranjo;

public class Substitui {

	public static void main(String[] args) {
		Lista<String> lista = new ListaArranjo<String>();
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		lista.adiciona("Maria");

		lista.substitui(1, "Joao");		
		System.out.println(lista);
		
		
	}
}

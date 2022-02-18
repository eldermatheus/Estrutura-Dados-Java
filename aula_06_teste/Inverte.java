package aula_06_teste;

import aula_06_prova.Lista;
import aula_06_prova.ListaArranjo;

public class Inverte {

	public static void main(String[] args) {
		Lista<String> lista = new ListaArranjo<String>();

		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		lista.adiciona("Maria");

		lista.inverte();
		
		System.out.println(lista);

		boolean test = lista.pega(0).equals("Maria") && lista.pega(1).equals("Paulo") && lista.pega(2).equals("Rafael");
		System.out.println("Inverte: " + test);

	}
}

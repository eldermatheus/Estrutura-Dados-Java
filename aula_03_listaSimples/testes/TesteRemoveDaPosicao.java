package aula_03_listaSimples.testes;

import aula_03_listaSimples.Aluno;
import aula_03_listaSimples.Lista;

public class TesteRemoveDaPosicao {

	/**
	 * Esperado:
	 * [Rafael, Paulo, Ana]
	 * [Rafael, Ana]
	 * [Ana]
	 * []
	 * @param args
	 */
	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
		lista.adiciona(new Aluno("Ana", "ana@gmail.com"));
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);

		lista.remove(0);
		System.out.println(lista);

		lista.remove(0);
		System.out.println(lista);
	}

}
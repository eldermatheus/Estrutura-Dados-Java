package aula_03_listaSimples.testes;

import aula_03_listaSimples.Aluno;
import aula_03_listaSimples.Lista;

public class TesteTamanho {

	/**
	 * Esperado:
	 * 2
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
		
		System.out.println(lista.tamanho());
	}

}
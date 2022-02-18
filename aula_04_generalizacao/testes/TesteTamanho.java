package aula_04_generalizacao.testes;

import aula_04_generalizacao.Aluno;
import aula_04_generalizacao.Lista;

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
package aula_04_generics.teste;

import aula_04_generics.Aluno;
import aula_04_generics.Lista;

public class TesteAdicionaNaPosicao {

	/**
	 * Esperado
	 * [Ana, Rafael, Maria, Paulo]
	 * @param args
	 */
	public static void main(String[] args) {
		Lista<Aluno> lista = new Lista<Aluno>();
		
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
		System.out.println("Lista inicial: " + lista);
		
		lista.adicionaPosicao(0, new Aluno("Ana", "ana@gmail.com"));
		lista.adicionaPosicao(2, new Aluno("Maria", "ana@gmail.com"));
		System.out.println("Lista alterada: " + lista);		
	}
}
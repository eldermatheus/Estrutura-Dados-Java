package aula_04_generics.teste;

import aula_04_generics.Aluno;
import aula_04_generics.Lista;

public class TestePegaNaPosicao {

	/**
	 * Esperado: [Rafael, Paulo] Rafael Paulo
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Lista<Aluno> lista = new Lista<Aluno>();
		
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));

		System.out.println(lista);

		// Aplicação do cast para (Aluno) por
		// eu ter generalizado à lista
		Aluno Aluno1 = lista.pega(0);
		System.out.println(Aluno1);

		Aluno Aluno2 = lista.pega(1);
		System.out.println(Aluno2);
	}
}

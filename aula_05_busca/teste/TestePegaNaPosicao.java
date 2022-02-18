package aula_05_busca.teste;

import aula_05_busca.Aluno;
import aula_05_busca.Lista;
import aula_05_busca.ListaArranjo;

public class TestePegaNaPosicao {
	
	public static void main(String[] args) {
		Lista<Aluno> lista = new ListaArranjo<Aluno>();
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));

		System.out.println(lista);

		// Aplicação do cast para (Aluno) por
		// eu ter generalizado a lista
		Aluno Aluno1 = lista.pega(0);
		System.out.println(Aluno1);

		Aluno Aluno2 = lista.pega(1);
		System.out.println(Aluno2);
	
	}	
}

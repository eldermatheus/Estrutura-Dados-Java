package aula_05_busca.teste;

import aula_05_busca.Aluno;
import aula_05_busca.Lista;
import aula_05_busca.ListaArranjo;

public class TesteRemoveTodos {
	
	public static void main(String[] args) {
		Lista<Aluno> lista = new ListaArranjo<Aluno>();
		
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Ana", "ana@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));		
		lista.adiciona(new Aluno("Ana", "ana@gmail.com"));
		lista.adiciona(new Aluno("Maria", "ana@gmail.com"));
		System.out.println(lista);
		
		/*lista.removeTodos(new Aluno("Ana"));
		System.out.println(lista);*/

		lista.removeTodos("Ana");
		System.out.println(lista);
	}		
}
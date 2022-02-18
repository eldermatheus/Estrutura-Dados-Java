package aula_05_busca.teste;

import aula_05_busca.Aluno;
import aula_05_busca.Lista;
import aula_05_busca.ListaArranjo;

public class TesteBusca {
	
	public static void main(String[] args) {
		Lista<Aluno> lista = new ListaArranjo<Aluno>();
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
		lista.adiciona(new Aluno("Maria", "rafael@gmail.com"));
		Aluno aluno1 = new Aluno("Joao", "paulo@gmail.com");
		lista.adiciona(aluno1);

		System.out.println(lista);
		
		System.out.println(lista.busca(new Aluno("Maria")));
		System.out.println(lista.busca(new Aluno("paulo")));
		System.out.println(lista.busca(aluno1));
		
		System.out.println(lista.busca(new Aluno("José")));		
	}	
}
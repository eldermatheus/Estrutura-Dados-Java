package aula_04_interfaces.teste;

import aula_04_generics.Aluno;
import aula_04_interfaces.Lista;
import aula_04_interfaces.ListaArranjo;

public class TesteAdicionaNaPosicao {
	
	public static void main(String[] args) {
		Lista<Aluno> lista = new ListaArranjo<Aluno>();
		Lista<Aluno> lista2 = new ListaArranjo<Aluno>();
		teste(lista, lista2);
	}
	
	public static void teste(Lista<Aluno> lista1, Lista<Aluno> lista2) {
		lista1.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista1.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
		System.out.println("Lista inicial: " + lista1);
		
		lista1.adicionaPosicao(0, new Aluno("Ana", "ana@gmail.com"));
		lista1.adicionaPosicao(2, new Aluno("Maria", "ana@gmail.com"));
		System.out.println("Lista alterada: " + lista1);
	}
}
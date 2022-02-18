package aula_04_interfaces.teste;

import aula_04_generics.Aluno;
import aula_04_interfaces.Lista;
import aula_04_interfaces.ListaArranjo;

public class TesteAdiciona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista<Aluno> lista = new ListaArranjo<Aluno>();
		Lista<String> lista2 = new ListaArranjo<String>();
		teste(lista, lista2);		
	}
	
	public static void teste(Lista<Aluno> lista1, Lista<String> lista2) {
		lista1.adiciona(new Aluno("Elder","elder@hotmail.com"));
		lista1.adiciona(new Aluno("Matheus","matheus@hotmail.com"));
		System.out.println(lista1);		
		
		lista2.adiciona("Maria");
		lista2.adiciona("Joao");		
		System.out.println(lista2);	
	}
}

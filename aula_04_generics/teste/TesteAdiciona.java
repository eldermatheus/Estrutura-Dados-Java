package aula_04_generics.teste;

import aula_04_generics.Aluno;
import aula_04_generics.Lista;

public class TesteAdiciona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista<Aluno> lista = new Lista<Aluno>();
		
		lista.adiciona(new Aluno("Elder","elder@hotmail.com"));
		lista.adiciona(new Aluno("Matheus","matheus@hotmail.com"));
				
		System.out.println(lista);		
		
		Lista<String> lista2 = new Lista<String>(); 
		lista2.adiciona("Maria");
		lista2.adiciona("Joao");
		
		System.out.println(lista2);
	}
}

package aula_04_generalizacao.testes;

import aula_04_generalizacao.Aluno;
import aula_04_generalizacao.Lista;

public class TesteAdiciona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista lista = new Lista();
		
		lista.adiciona(new Aluno("Elder","elder@hotmail.com"));
		lista.adiciona(new Aluno("Matheus","matheus@hotmail.com"));
				
		System.out.println(lista);		
		
		lista.adiciona("Maria");
		lista.adiciona("Joaozinho");
		System.out.println(lista);
	
	}
}

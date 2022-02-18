package aula_03_listaSimples.testes;

import aula_03_listaSimples.Aluno;
import aula_03_listaSimples.Lista;

public class TesteAdiciona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista lista = new Lista();
		
		lista.adiciona(new Aluno("Elder","elder@hotmail.com"));
		lista.adiciona(new Aluno("Matheus","matheus@hotmail.com"));
				
		System.out.println(lista);
	
	}
}

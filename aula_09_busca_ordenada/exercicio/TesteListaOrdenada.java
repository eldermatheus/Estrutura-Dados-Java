package aula_09_busca_ordenada.exercicio;

import aula_08_lista_ordenada.Candidato;

public class TesteListaOrdenada {

	public static void main(String[] args) {
		Lista<Candidato> lista = new ListaOrdenada<Candidato>();
		lista.adiciona(new Candidato("Joao", 42, 62));		
		lista.adiciona(new Candidato("Maria", 40, 80));
		lista.adiciona(new Candidato("Rafael", 30, 70));
		lista.adiciona(new Candidato("Paula", 23, 55));	
		lista.adiciona(new Candidato("Jose", 30, 40));		
		lista.adiciona(new Candidato("Sofia", 23, 95));
		lista.adiciona(new Candidato("Lucas", 42, 71));
		lista.adiciona(new Candidato("Miguel", 40, 68));
		lista.adiciona(new Candidato("Ana", 30, 73));
		lista.adiciona(new Candidato("Julia", 23, 84));

		System.out.println(lista);		
		System.out.println(lista.tamanho());
		
		//Retorna posição do elemento buscado
		// -1: resultaod
		
		Candidato mariana = new Candidato("Mariana",23,55);					
		System.out.println(lista.busca(mariana));
	}
}
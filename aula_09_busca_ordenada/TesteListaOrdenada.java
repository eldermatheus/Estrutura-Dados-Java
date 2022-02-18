package aula_09_busca_ordenada;

import aula_08_lista_ordenada.Candidato;

public class TesteListaOrdenada {

	public static void main(String[] args) {
		Lista<Candidato> lista = new ListaOrdenada<Candidato>();
		lista.adiciona(new Candidato("Joao", 42, 62));
		lista.adiciona(new Candidato("Maria", 40, 80));
		lista.adiciona(new Candidato("Rafael", 30, 80));
		lista.adiciona(new Candidato("Paula", 23, 55));

		System.out.println(lista);
		System.out.println(lista.tamanho());
		
		Candidato josefina = new Candidato("Josefina", 27, 65);
		lista.adiciona(1, josefina);
		System.out.println(lista);
				
		Candidato cand = lista.pega(0);		
		System.out.println(cand);
		
		System.out.println("Posicao de Josefina: " + lista.busca(josefina));
		
		//Retorna 1 porque existe pessoa com pontuação 62
		Candidato mariana = new Candidato("Mariana",42,62);
		System.out.println(lista.busca(mariana));
		
		//Retorna -1 porque não existe pessoa com pontuação 20
		Candidato marcos = new Candidato("Marcos",31,20);
		System.out.println(lista.busca(marcos));
	}
}
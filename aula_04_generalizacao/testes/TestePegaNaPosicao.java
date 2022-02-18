package aula_04_generalizacao.testes;

import aula_04_generalizacao.Aluno;
import aula_04_generalizacao.Lista;

public class TestePegaNaPosicao {

	/**
	 * Esperado: [Rafael, Paulo] Rafael Paulo
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Lista lista = new Lista();
		
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));

		System.out.println(lista);

		// Aplicação do cast para (Aluno) por
		// eu ter generalizado à lista
		Aluno Aluno1 = (Aluno) lista.pega(0);
		System.out.println(Aluno1);

		Aluno Aluno2 = (Aluno) lista.pega(1);
		System.out.println(Aluno2);

		// Operação de pega na posição:
		//System.out.println(lista.pega(3)); //null = não existe posição 3
		//System.out.println(lista.pega(101)); // exception out of range
		
		//Adicionando objetos String
		lista.adiciona(new String("Maria"));
		lista.adiciona(new String("Joao"));
		System.out.println(lista);

		// Exemplo de cast que daria erro
		// Aluno aluno3 = (Aluno) lista.pega(2);
		// System.out.println(aluno3);

		// Tratamento do cast
		String nome3;
		Object elemento3 = lista.pega(2);

		if (elemento3 instanceof Aluno) {
			Aluno aluno3 = (Aluno) elemento3;
			nome3 = aluno3.getNome();
		} else if (elemento3 instanceof String) {
			nome3 = (String) elemento3;
		} else {
			nome3 = elemento3.toString();
		}
		
		//Saída de dados
		System.out.println(nome3);
		System.out.println(lista.pega(3));
		
		
	}
}

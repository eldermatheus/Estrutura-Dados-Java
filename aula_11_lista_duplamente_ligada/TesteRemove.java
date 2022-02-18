package aula_11_lista_duplamente_ligada;

public class TesteRemove {

	public static void main(String[] args) {
		/*
		 * 
		 * Falta implementar de forma duplamente encadeada
		 * 
		 * 
		 */		
		ListaDuplamenteLigada<Aluno> lista = new ListaDuplamenteLigada<Aluno>();
		
		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("João", "joao@gmail.com"));
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Jose", "jose@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));

		System.out.println(lista);

		lista.remove(3);
		System.out.println(lista);

		lista.remove(1);
		System.out.println(lista);

		lista.remove(2);
		System.out.println(lista);
		
		lista.remove(0);
		System.out.println(lista);

		lista.remove(0);
		System.out.println(lista);
	}
}

package aula_10_lista_ligada_02_interface;

public class TesteAdiciona {

	public static void main(String[] args) {
		ListaLigada<Aluno> lista = new ListaLigada<Aluno>();

		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Jo�o", "joao@gmail.com"));
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));

		System.out.println(lista);
		System.out.println(lista.tamanho());
	}
}
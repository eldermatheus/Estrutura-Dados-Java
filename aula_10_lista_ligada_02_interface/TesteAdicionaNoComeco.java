package aula_10_lista_ligada_02_interface;

public class TesteAdicionaNoComeco {

	public static void main(String[] args) {
		ListaLigada<Aluno> lista = new ListaLigada<Aluno>();

		lista.adicionaNoComeco(new Aluno("Maria", "maria@gmail.com"));
		lista.adicionaNoComeco(new Aluno("João", "joao@gmail.com"));
		lista.adicionaNoComeco(new Aluno("Rafael", "rafael@gmail.com"));

		System.out.println(lista);
	}
}

package aula_11_lista_duplamente_ligada;

public class TesteAdicionaNoComeco {

	public static void main(String[] args) {
		ListaDuplamenteLigada<Aluno> lista = new ListaDuplamenteLigada<Aluno>();

		lista.adicionaNoComeco(new Aluno("Maria", "maria@gmail.com"));
		lista.adicionaNoComeco(new Aluno("Jo�o", "joao@gmail.com"));
		lista.adicionaNoComeco(new Aluno("Rafael", "rafael@gmail.com"));

		System.out.println(lista);
	}
}

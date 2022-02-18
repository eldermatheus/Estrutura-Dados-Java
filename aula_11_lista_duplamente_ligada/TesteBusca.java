package aula_11_lista_duplamente_ligada;

public class TesteBusca {

	public static void main(String[] args) {
		ListaDuplamenteLigada<Aluno> lista = new ListaDuplamenteLigada<Aluno>();

		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("João", "joao@gmail.com"));
		Aluno rafael = new Aluno("Rafael", "rafael@gmail.com");
		lista.adiciona(rafael);

		System.out.println(lista);
		System.out.println(lista.busca(new Aluno("João","joao@gmail.com")));
		System.out.println(lista.busca(rafael));
		System.out.println(lista.busca(new Aluno("Josefa","josefa@gmail.com")));
	}
}
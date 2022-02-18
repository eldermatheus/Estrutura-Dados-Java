package aula_10_lista_ligada_01_basica;

public class TesteBusca {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();

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
package aula_10_lista_ligada_01_basica;

public class TesteAdicionaNoComeco {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();

		lista.adicionaNoComeco(new Aluno("Maria", "maria@gmail.com"));
		lista.adicionaNoComeco(new Aluno("João", "joao@gmail.com"));
		lista.adicionaNoComeco(new Aluno("Rafael", "rafael@gmail.com"));

		System.out.println(lista);
	}
}

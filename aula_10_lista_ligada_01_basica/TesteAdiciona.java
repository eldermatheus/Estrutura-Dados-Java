package aula_10_lista_ligada_01_basica;

public class TesteAdiciona {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();

		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("João", "joao@gmail.com"));
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));

		System.out.println(lista);
		System.out.println(lista.tamanho());
	}
}
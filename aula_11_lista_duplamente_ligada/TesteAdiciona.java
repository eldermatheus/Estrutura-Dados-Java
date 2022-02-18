package aula_11_lista_duplamente_ligada;

public class TesteAdiciona {

	public static void main(String[] args) {
		ListaDuplamenteLigada<Aluno> lista = new ListaDuplamenteLigada<Aluno>();

		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("João", "joao@gmail.com"));
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));

		System.out.println(lista);
		System.out.println(lista.tamanho());
	}
}
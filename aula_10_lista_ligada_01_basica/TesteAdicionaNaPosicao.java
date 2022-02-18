package aula_10_lista_ligada_01_basica;

public class TesteAdicionaNaPosicao {

	/**
	 * Esperado: [João, Rafael, Maria, Paulo]
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();

		lista.adicionaNaPosicao(0, new Aluno("Maria", "maria@gmail.com"));
		lista.adicionaNaPosicao(0, new Aluno("João", "joao@gmail.com"));
		lista.adicionaNaPosicao(1, new Aluno("Rafael", "rafael@gmail.com"));
		lista.adicionaNaPosicao(3, new Aluno("Paulo", "paulo@gmail.com"));

		System.out.println(lista);
	}

}
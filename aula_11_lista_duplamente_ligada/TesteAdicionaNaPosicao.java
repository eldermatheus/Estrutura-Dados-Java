package aula_11_lista_duplamente_ligada;

public class TesteAdicionaNaPosicao {

	/**
	 * Esperado: [Jo�o, Rafael, Maria, Paulo]
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Falta revisar: implementa��o com Null point
		ListaDuplamenteLigada<Aluno> lista = new ListaDuplamenteLigada<Aluno>();

		lista.adiciona(0, new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(0, new Aluno("Jo�o", "joao@gmail.com"));
		lista.adiciona(1, new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(3, new Aluno("Paulo", "paulo@gmail.com"));

		System.out.println(lista);
	}

}
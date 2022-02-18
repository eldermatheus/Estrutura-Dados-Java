package aula_10_lista_ligada_01_basica;

public class TesteRemove {

	/**
	 * Esperado: [Jo�o, Rafael, Maria, Paulo]
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();

		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Jo�o", "joao@gmail.com"));
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));

		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);
		
		lista.remove(0);
		System.out.println(lista);
	}
}
package aula_08_lista_ordernada_generics_04_composicao;

public class Candidato implements Comparable<Candidato> {

	private String nome;
	private int nota;
	private int idade;

	public Candidato(String nome, int idade, int nota) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}
	
	public String getNome() {
		return nome;
	}	
	public int getNota() {
		return nota;
	}
	public int getIdade() {
		return idade;
	}
	
	@Override
	public String toString() {
		return nome + ": " + idade + " (" + nota + ")";
	}

	@Override
	public int compareTo(Candidato o) {
		if (nota > o.nota) {
			return 1;
		} else if (nota < o.nota) {
			return -1;
		} else if (idade > o.idade) {
			return 1;
		} else if (idade < o.idade) {
			return -1;
		}
		return 0;
	}

}
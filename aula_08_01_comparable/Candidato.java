package aula_08_01_comparable;

public class Candidato implements Comparable<Candidato>{
	
	private String nome;
	private int nota;
	private int idade;
		
	public Candidato(String nome, int nota, int idade) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return nome + " | " + idade  + " [" + nota + "]";
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

package aula_15_revisao_q19;

public class Peca {
	private String nome;

	public Peca(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return this.nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		return nome.equalsIgnoreCase(((Peca) obj).getNome());
	}
}

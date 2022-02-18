package aula_15_revisao_q20;

public class Aluno {
	private String nome;
	private String email;
	private String turma;

	public Aluno(String nome) {
		this.nome = nome;
	}

	public Aluno(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public Aluno(String nome, String email, String turma) {
		this.nome = nome;
		this.email = email;
		this.turma = turma;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
	
	public String getTurma() {
		return turma;
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
		return nome.equalsIgnoreCase(((Aluno) obj).getNome());
	}
}

package aula_05_busca;

public class Aluno {
	private String nome;
	private String email;
	
	public Aluno(String nome) {
		this.nome = nome;	
	}
	
	public Aluno(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return true;
		}
		
		if(getClass() != obj.getClass()) {
			return false;
		}
		return nome.equalsIgnoreCase(((Aluno) obj).getNome());
	}
}

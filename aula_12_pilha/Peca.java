package aula_12_pilha;

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
		return nome.equalsIgnoreCase(((Peca) obj).getNome());
	}
}

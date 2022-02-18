package aula_12_pilha;

public class TestePilha {
	
	public static void main(String[] args) {
		
		Pilha<Peca> pilha = new PilhaArranjo<Peca>(); 
		
		//System.out.println(pilha);		
		//System.out.println("Vazia: " + pilha.vazia());		
		pilha.adiciona(new Peca("Grade da frente"));
		pilha.adiciona(new Peca("Acabamento"));
		pilha.adiciona(new Peca("Parafuso"));
		pilha.adiciona(new Peca("Helice"));
		pilha.adiciona(new Peca("Grade do fundo"));
		pilha.adiciona(new Peca("Motor"));
				
		System.out.println(pilha);		
		/*System.out.println("Vazia: " + pilha.vazia());		
		System.out.println(pilha.remove());
		System.out.println(pilha);
		System.out.println(pilha.topo());
		System.out.println(pilha);	
		
		while (!pilha.vazia()) {
			System.out.println(pilha.remove());
		}*/
		pilha.limpa();
		System.out.println(pilha);
		System.out.println("Vazia: " + pilha.vazia());
	}
}

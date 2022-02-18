package aula_15_revisao_q19;

public class TestePilha {

    /**
     * Esperado:
     * []
     * Vazia: true
     * [Grade da frente, Acabamento, Parafuso, Helice, Grade do fundo, Motor]
     * []
     * 
     * @param args
     */
    public static void main(String[] args) {
        Pilha<Peca> pilha = new PilhaArranjo<Peca>();
        System.out.println(pilha);
        
        System.out.println("Vazia: " + pilha.vazia());
        pilha.adiciona(new Peca("Grade da frente"));
        pilha.adiciona(new Peca("Acabamento"));
        pilha.adiciona(new Peca("Parafuso"));
        pilha.adiciona(new Peca("Helice"));
        pilha.adiciona(new Peca("Grade do fundo"));
        pilha.adiciona(new Peca("Motor"));
        
        System.out.println(pilha);
        pilha.limpa();
        System.out.println(pilha);
        
        while(!pilha.vazia()) {
            System.out.println(pilha.remove());
        }
    }

}

package aula_15_revisao_q21;

import aula_15_revisao_q19.*;
import aula_15_revisao_q20.*;

public class Criptografia {
    
    public static void main(String[] args) {
        String mensagem = "Uma mensagem confidencial";
        String cifrada = cifrar(mensagem);
        System.out.println(cifrada);
    }

    public static String cifrar(String str) {
        StringBuilder fraseCifrada = new StringBuilder();
        Fila<String> fila = new FilaLigada<String>();
        String[] palavras = str.split(" ");
        for (String palavra : palavras) {
            fila.adiciona(palavra);
        }

        while (!fila.vazia()) {
            Pilha<Character> pilha = new PilhaArranjo<Character>();
            String palavra = fila.remove();
            for (int i = 0; i < palavra.length(); ++i) {
                pilha.adiciona(palavra.charAt(i));
            }
            StringBuilder palavraCifrada = new StringBuilder();
            while (!pilha.vazia()) {
                palavraCifrada.append(pilha.remove());
            }
            if (fraseCifrada.length() > 0) {
                fraseCifrada.append(" ");
            }
            fraseCifrada.append(palavraCifrada);
        }
        
        return fraseCifrada.toString();
    }
}

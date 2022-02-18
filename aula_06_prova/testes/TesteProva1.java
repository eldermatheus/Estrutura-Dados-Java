package aula_06_prova.testes;

import aula_06_prova.Lista;
import aula_06_prova.ListaArranjo;

public class TesteProva1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        testeSubstitui();
        testeCopiaPara();
        testeInverte();
        testeSegmento();
        testeEquals();
    }

    private static void testeSubstitui() {
        Lista<String> lista = new ListaArranjo<String>();

        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        lista.adiciona("Maria");

        lista.substitui(1, "Joao");
        
        boolean test = lista.tamanho() == 3 &&
                lista.pega(0).equals("Rafael") && 
                lista.pega(1).equals("Joao") && 
                lista.pega(2).equals("Maria");
        System.out.println("Substitui: " + test);
    }

    private static void testeCopiaPara() {
        Lista<String> lista = new ListaArranjo<String>();

        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        lista.adiciona("Maria");

        String[] arranjo = new String[4];
        lista.copiaPara(arranjo);
        
        boolean test = "Rafael".equals(arranjo[0]) && 
                "Paulo".equals(arranjo[1]) &&
                "Maria".equals(arranjo[2]) &&
                arranjo[3] == null; 
        System.out.println("CopiaPara: " + test);
    }

    private static void testeInverte() {
        Lista<String> lista = new ListaArranjo<String>();

        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        lista.adiciona("Maria");

        lista.inverte();
        
        boolean test = lista.pega(0).equals("Maria") && 
                lista.pega(1).equals("Paulo") && 
                lista.pega(2).equals("Rafael"); 
        System.out.println("Inverte: " + test);
    }

    private static void testeSegmento() {
        Lista<String> lista1 = new ListaArranjo<String>();
        lista1.adiciona("Rafael");
        lista1.adiciona("Paulo");
        lista1.adiciona("Maria");
        lista1.adiciona("Joao");

        Lista<String> lista2 = lista1.segmento(1, 3);
        
        boolean test = lista2 != null &&
                lista2.tamanho() == 2 &&
                lista2.pega(0).equals("Paulo") && 
                lista1.pega(1).equals("Maria"); 
        System.out.println("Segmento: " + test);
    }

    private static void testeEquals() {
        Lista<String> lista1 = new ListaArranjo<String>();
        lista1.adiciona("Rafael");
        lista1.adiciona("Paulo");
        lista1.adiciona("Maria");
        lista1.adiciona("Joao");

        Lista<String> lista2 = new ListaArranjo<String>();
        lista2.adiciona("Rafael");
        lista2.adiciona("Paulo");
        lista2.adiciona("Maria");
        lista2.adiciona("Joao");
        
        boolean test = lista1.equals(lista2); 
        System.out.println("Equals: " + test);
    }

}
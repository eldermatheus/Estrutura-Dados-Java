package aula_06_teste;

import aula_06_prova.Lista;
import aula_06_prova.ListaArranjo;

public class Segmento {

	public static void main(String[] args) {
	    Lista<String> lista1 = new ListaArranjo<String>();
        lista1.adiciona("Rafael");
        lista1.adiciona("Paulo");
        lista1.adiciona("Maria");
        lista1.adiciona("Joao");
        
        Lista<String> lista2 = lista1.segmento(1, 3);
        
        System.out.println(lista1);
        System.out.println(lista2);
        
        
        boolean test = lista2 != null &&
                lista2.tamanho() == 2 &&
                lista2.pega(0).equals("Paulo") && 
                lista1.pega(1).equals("Maria"); 
        System.out.println("Segmento: " + test);
    }
}

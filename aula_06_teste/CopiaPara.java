package aula_06_teste;

import aula_06_prova.Lista;
import aula_06_prova.ListaArranjo;

public class CopiaPara {

	public static void main(String[] args) {
	    Lista<String> lista = new ListaArranjo<String>();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		lista.adiciona("Maria");

		String[] arranjo = new String[4];
		lista.copiaPara(arranjo);

		System.out.println(arranjo);
		System.out.println(lista);
		
		 boolean test = "Rafael".equals(arranjo[0]) && 
                "Paulo".equals(arranjo[1]) &&
                "Maria".equals(arranjo[2]) &&
                arranjo[3] == null; 
        System.out.println("CopiaPara: " + test);
        
		
	}
}

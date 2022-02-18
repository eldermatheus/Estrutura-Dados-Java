package aula_04_interfaces.teste;

import aula_04_generics.Aluno;
import aula_04_interfaces.Lista;
import aula_04_interfaces.ListaArranjo;

public class TesteTamanho {

	public static void main(String[] args) {
		Lista<Aluno> lista = new ListaArranjo<Aluno>();
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
		
		System.out.println(lista.tamanho());
	}
}
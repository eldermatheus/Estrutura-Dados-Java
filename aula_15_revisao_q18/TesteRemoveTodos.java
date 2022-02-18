package aula_15_revisao_q18;

public class TesteRemoveTodos {

    /**
     * Esperado: 
     * [Maria, Jo�o, Rafael, Maria, Maria, Mauricio, Paulo]
     * [Jo�o, Rafael, Mauricio, Paulo]
     * 
     * @param args
     */
    public static void main(String[] args) {
        ListaLigada<Aluno> lista = new ListaLigada<Aluno>();

        lista.adiciona(new Aluno("Maria"));
        lista.adiciona(new Aluno("Jo�o"));
        lista.adiciona(new Aluno("Rafael"));
        lista.adiciona(new Aluno("Maria"));
        lista.adiciona(new Aluno("Maria"));
        lista.adiciona(new Aluno("Mauricio"));
        lista.adiciona(new Aluno("Paulo"));
        lista.adiciona(new Aluno("Maria"));

        System.out.println(lista);
        lista.removeTodos(new Aluno("Maria"));

        System.out.println(lista);
    }

}

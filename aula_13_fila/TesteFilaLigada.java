package aula_13_fila;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TesteFilaLigada {

    /**
     * Esperado:
     * []
     * 0
     * true
     * [João, Maria, Paulo]
     * 3
     * false
     * João
     * [João, Maria, Paulo]
     * João
     * [Maria, Paulo]
     * [Maria, Paulo, Rafaela, Letícia]
     * Maria
     * Paulo
     * Rafaela
     * Letícia
     * []
     * 
     * @param args
     */
    public static void main(String[] args) {
        String esperada = "[]\r\n"
                + "0\r\n"
                + "true\r\n"
                + "[João, Maria, Paulo]\r\n"
                + "3\r\n"
                + "false\r\n"
                + "João\r\n"
                + "[João, Maria, Paulo]\r\n"
                + "João\r\n"
                + "[Maria, Paulo]\r\n"
                + "[Maria, Paulo, Rafaela, Letícia]\r\n"
                + "Maria\r\n"
                + "Paulo\r\n"
                + "Rafaela\r\n"
                + "Letícia\r\n"
                + "[]\r\n";
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        
        Fila<Aluno> fila = new FilaLigada<Aluno>();
        out.println(fila);
        out.println(fila.tamanho());
        out.println(fila.vazia());
        
        fila.adiciona(new Aluno("João"));
        fila.adiciona(new Aluno("Maria"));
        fila.adiciona(new Aluno("Paulo"));
        out.println(fila);
        out.println(fila.tamanho());
        out.println(fila.vazia());
        
        out.println(fila.consulta());
        out.println(fila);
        out.println(fila.remove());
        out.println(fila);

        fila.adiciona(new Aluno("Rafaela"));
        fila.adiciona(new Aluno("Letícia"));
        out.println(fila);
        
        while (fila.tamanho() > 0) {
            out.println(fila.remove());
        }
        out.println(fila);
       
        System.out.println("Teste: " + baos.toString().equals(esperada));
    }

}
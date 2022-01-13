package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("Nome do Livro", "300");
        System.out.println(livro);

        /*int a = 5;
        int b = 3;
                      System.out.println("olá mundo intellij! " + (a+b));*/
    }
}
class Livro {
    private String nome;
    private String npag;

    public Livro() {
    }

    public Livro(String nome, String npag) {
        this.nome = nome;
        this.npag = npag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNpag() {
        return npag;
    }

    public void setNpag(String npag) {
        this.npag = npag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npag='" + npag + '\'' +
                '}';
    }
}


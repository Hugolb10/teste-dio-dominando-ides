package Projeto;

import Projeto.Classes.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("Harry Potter", 200);
        System.out.println(livro);
       /* int a = 3;
        int b = 2;
        System.out.println("Hello World! " + (a+b));*/
    }


}


class Livro {

    private String nome;
    private Integer NumPag;

    public Livro(String nome, Integer numPag) {
        this.nome = nome;
        NumPag = numPag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPag() {
        return NumPag;
    }

    public void setNumPag(Integer numPag) {
        NumPag = numPag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", NumPag=" + NumPag +
                '}';
    }
}
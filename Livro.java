package com.mycompany.biblioteca;
public class Livro extends ItemDeBiblioteca {
    private String autor;
    private String categoria;

    public Livro(String titulo, String autor, String categoria) {
        super(titulo);
        this.autor = autor;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor + ", Categoria: " + categoria;
    }
}

package com.mycompany.biblioteca;
public abstract class ItemDeBiblioteca {
    protected String titulo;
    protected boolean disponivel;

    public ItemDeBiblioteca(String titulo) {
        this.titulo = titulo;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean estaDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        disponivel = false;
    }

    public void retornar() {
        disponivel = true;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Disponível: " + disponivel;
    }
}

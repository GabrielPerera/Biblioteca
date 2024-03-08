package com.mycompany.biblioteca;
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia");
        Livro livro2 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", "Ficção");
        Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Infantil");

        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(livro2);
        biblioteca.adicionarItem(livro3);

        Estudante estudante = new Estudante("Jorge", "12345678910");
        Professor professor = new Professor("Francisco", "12345678901");

        biblioteca.registrarUsuario(estudante);
        biblioteca.registrarUsuario(professor);

        biblioteca.emprestarItem(estudante, livro1);
        biblioteca.emprestarItem(professor, livro2);
        biblioteca.emprestarItem(professor, livro3);

        biblioteca.listarEmprestimosAtivos();

        biblioteca.retornarItem(professor, livro2);

        biblioteca.listarEmprestimosAtivos();
    }
}

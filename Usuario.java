package com.mycompany.biblioteca;
public abstract class Usuario {
    protected String nome;
    protected String cpf;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Nome do Usuário: " + nome + "CPF: " + cpf;
    }
}


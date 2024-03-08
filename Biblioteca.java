package com.mycompany.biblioteca;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
    private List<ItemDeBiblioteca> catalogo;
    private Map<Usuario, List<ItemDeBiblioteca>> emprestimoAtivo;
    
    public Biblioteca(){
        catalogo = new ArrayList<>();
        emprestimoAtivo = new HashMap<>();
    }
    
    public void adicionarItem(ItemDeBiblioteca item) {
        catalogo.add(item);
    }

    public void removerItem(ItemDeBiblioteca item) {
        catalogo.remove(item);
    }

    public void registrarUsuario(Usuario usuario) {
        emprestimoAtivo.put(usuario, new ArrayList<>());
    }
    
    public void emprestarItem(Usuario usuario, ItemDeBiblioteca item) {
        if (item.estaDisponivel()) {
            item.emprestar();
            emprestimoAtivo.get(usuario).add(item);
            System.out.println("Item emprestado com sucesso para " + usuario.getNome());
        } else {
            System.out.println("Este item não está disponível para empréstimo.");
        }
    }
    
    public void retornarItem(Usuario usuario, ItemDeBiblioteca item) {
        item.retornar();
        emprestimoAtivo.get(usuario).remove(item);
        System.out.println("Item retornado com sucesso por " + usuario.getNome());
    }
    
    public void listarEmprestimosAtivos() {
        System.out.println("Empréstimos Ativos:");
        for (Usuario usuario : emprestimoAtivo.keySet()) {
            List<ItemDeBiblioteca> itensEmprestados = emprestimoAtivo.get(usuario);
            for (ItemDeBiblioteca item : itensEmprestados) {
                System.out.println(usuario.getNome() + ": " + item.getTitulo());
            }
        }
    }
}

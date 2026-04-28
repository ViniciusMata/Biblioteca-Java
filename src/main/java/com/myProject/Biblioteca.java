package com.myProject;

import java.util.ArrayList;
import java.util.List;

// Classe que gerencia os livros
public class Biblioteca {

    // Lista que armazena todos os livros
    private List<Livro> livros = new ArrayList<Livro>();

    // Adiciona um novo livro na lista
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    // Lista todos os livros no console
    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(
                    livro.getTitulo() + " - " +
                            livro.getAutor() + " | " +
                            (livro.isDisponivel() ? "Disponível" : "Emprestado")
            );
        }
    }

    // Busca um livro pelo título
    public Livro buscarLivro(String titulo) {
        for (Livro livro : livros) {
            // equalsIgnoreCase ignora maiúsculas/minúsculas
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null; // se não encontrar
    }

}

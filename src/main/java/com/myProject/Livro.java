package com.myProject;

// Classe que representa um livro
public class Livro {

    // Atributos (características do livro)
    private String titulo;
    private String autor;
    private boolean disponivel;

    // Construtor: usado quando criamos um novo livro
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; // todo livro começa disponível
    }

    // Métodos GET (servem para acessar os dados)
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    // Método para emprestar o livro
    public void emprestar() {
        this.disponivel = false;
    }

    // Método para devolver o livro
    public void devolver() {
        this.disponivel = true;
    }
}
package com.myProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Cria a biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Scanner para ler o que o usuário digita
        Scanner scanner = new Scanner(System.in);

        // Loop infinito (menu sempre aparece)
        while (true) {

            // Menu
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("0 - Sair");

            // Lê a opção do usuário
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o ENTER

            // Executa a ação baseada na escolha
            switch (opcao) {

                case 1:
                    // Adicionar livro
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    biblioteca.adicionarLivro(new Livro(titulo, autor));
                    break;

                case 2:
                    // Listar livros
                    biblioteca.listarLivros();
                    break;

                case 3:
                    // Emprestar livro
                    System.out.print("Título do livro: ");
                    String empTitulo = scanner.nextLine();

                    Livro livroEmp = biblioteca.buscarLivro(empTitulo);

                    if (livroEmp != null && livroEmp.isDisponivel()) {
                        livroEmp.emprestar();
                        System.out.println("Livro emprestado!");
                    } else {
                        System.out.println("Livro não disponível.");
                    }
                    break;

                case 4:
                    // Devolver livro
                    System.out.print("Título do livro: ");
                    String devTitulo = scanner.nextLine();

                    Livro livroDev = biblioteca.buscarLivro(devTitulo);

                    if (livroDev != null && !livroDev.isDisponivel()) {
                        livroDev.devolver();
                        System.out.println("Livro devolvido!");
                    } else {
                        System.out.println("Livro não encontrado ou já disponível.");
                    }
                    break;

                case 0:
                    // Encerrar programa
                    System.out.println("Saindo...");
                    return;
            }
        }
    }
}
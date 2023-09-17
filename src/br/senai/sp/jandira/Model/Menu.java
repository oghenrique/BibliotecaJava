package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Menu {
    public void Menu() {
        Scanner teclado = new Scanner(System.in);
        Register register = new Register();
        Catalogo catalogo = new Catalogo();
        Emprestimo emprestimo = new Emprestimo();
        boolean sair = false;

        while (!sair) {
            System.out.println("---------- Bem Vindo ----------");
            System.out.println("\n==> Menu:\n");
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Cadastrar Leitor");
            System.out.println("3 - Empréstimo");
            System.out.println("4 - Devolução");
            System.out.println("5 - Catálogo de Livros");
            System.out.println("6 - Livros Emprestados");
            System.out.print("\nOpção: ");

            int userOption = teclado.nextInt();
            teclado.nextLine();

            switch (userOption) {
                case 0:
                    System.out.println("Volte sempre! =D");
                    sair = true;
                    break;
                case 1:
                    Livros livroCadastrado = register.cadastrarLivro();
                    catalogo.adicionarLivro(livroCadastrado);
                    break;
                case 2:
                    register.cadastrarLeitor();
                    break;
                case 3:
                    System.out.println("\nLivros Disponíveis para Empréstimo:\n");
                    catalogo.listarLivrosDisponiveis();
                    System.out.print("\nDigite o título do livro que deseja emprestar: ");
                    String tituloLivro = teclado.nextLine();
                    boolean emprestado = emprestimo.emprestarLivro(catalogo, tituloLivro);
                    if (emprestado) {
                        System.out.println("Empréstimo realizado com sucesso!");
                    } else {
                        System.out.println("Livro não disponível para empréstimo ou não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("\nDigite o título do livro que deseja devolver: ");
                    String tituloLivroDevolucao = teclado.nextLine();
                    boolean devolvido = emprestimo.devolverLivro(catalogo, tituloLivroDevolucao);
                    if (devolvido) {
                        System.out.println("Devolução realizada com sucesso!");
                    } else {
                        System.out.println("Livro não encontrado ou não emprestado.");
                    }
                    break;
                case 5:
                    catalogo.listarLivros();
                    break;
                case 6:
                    catalogo.listarLivrosEmprestados();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}

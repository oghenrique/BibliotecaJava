package br.senai.sp.jandira.Model;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class Register {
    private int validaPrint = 0;
    private Scanner teclado = new Scanner(System.in);
    private List<Usuario> clientes = new ArrayList<>();

    public Usuario cadastrarLeitor() {
        Usuario usuario = new Usuario();

        System.out.println("---------------- Cadastro Leitor -----------------");
        System.out.print("Insira seu nome: ");
        usuario.nome = teclado.nextLine();
        System.out.print("Insira seu email: ");
        usuario.email = teclado.nextLine();
        System.out.print("Insira seu endereço: ");
        usuario.endereco = teclado.nextLine();
        System.out.print("Insira seu telefone: ");
        usuario.telefone = teclado.nextLine();
        System.out.println("--------- Usuário Cadastrado com Sucesso ---------");

        clientes.add(usuario);

        if (validaPrint != 1) {
            Output output = new Output();
            output.PrintUsuario(usuario);
        }

        return usuario;
    }

    public List<Usuario> getClientes() {
        return clientes;
    }

    public void listarLeitoresCadastrados() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum leitor cadastrado.");
        } else {
            System.out.println("\n---------------------------------------------------");
            System.out.println("            LISTA DE LEITORES CADASTRADOS          ");
            for (Usuario cliente : clientes) {
                System.out.println("Nome do leitor: " + cliente.getNome());
                System.out.println("Email do leitor: " + cliente.getEmail());
                System.out.println("Endereço do leitor: " + cliente.getEndereco());
                System.out.println("Telefone do leitor: " + cliente.getTelefone());
                System.out.println("---------------------------------------------------");
            }
        }
    }

    public Livros cadastrarLivro() {
        Livros livro = new Livros();

        System.out.println("---------------- Cadastro Livro ----------------");
        System.out.print("Qual é o título do livro: ");
        livro.titulo = teclado.nextLine();
        System.out.print("Qual o autor do livro: ");
        livro.autor = teclado.nextLine();
        System.out.print("Qual o gênero do livro: ");
        livro.genero = teclado.nextLine();
        System.out.print("Qual o ISBN do livro: ");
        livro.isbn = teclado.nextLine();
        System.out.println("--------- Livro Cadastrado com Sucesso ---------");

        if (validaPrint != 1) {
            Output output = new Output();
            output.PrintLivro(livro);
        }

        return livro;
    }
}

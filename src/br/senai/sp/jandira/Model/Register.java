package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Register {
    int validaPrint = 0;
    Scanner teclado = new Scanner(System.in);
    Usuario usuario = new Usuario();
    Livros livro = new Livros();
    Output output = new Output();

    public void BothRegister() {
        validaPrint = 1;
        LeitorRegister();
        LivroRegister();
        output.PrintUsuario(usuario);
        output.PrintLivro(livro);
    }

    public Usuario LeitorRegister() {
        System.out.println("---------------- Cadastro Usuário ----------------");
        System.out.print("Insira seu nome: ");
        usuario.nome = teclado.next();
        System.out.print("Insira seu email: ");
        usuario.email = teclado.next();
        System.out.print("Insira seu endereço: ");
        usuario.endereco = teclado.next();
        System.out.println("--------- Usuário Cadastrado com Sucesso ---------");

        if (validaPrint != 1) {
            output.PrintUsuario(usuario);
        }

        return usuario;
    }

    public Livros LivroRegister() {
        System.out.println("---------------- Cadastro Livro ----------------");
        System.out.print("Qual é o título do livro: ");
        livro.titulo = teclado.next();
        teclado.next();
        System.out.print("Qual o autor do livro: ");
        livro.autor = teclado.next();
        teclado.next();
        System.out.print("Qual o gênero do livro: ");
        livro.genero = teclado.next();
        teclado.next();
        System.out.print("Qual o ISBN do livro: ");
        livro.isbn = teclado.next();
        System.out.println("--------- Livro Cadastrado com Sucesso ---------");

        if (validaPrint != 1) {
            output.PrintLivro(livro);
        }

        return livro;
    }

    public void Decision() {
        String decision;

        System.out.println("Seja Bem Vindo !!!");
        while (true) {
            System.out.println("Deseja Cadastrar [Leitor | Livro | Ambos]: ");
            decision = teclado.next().toLowerCase();

            switch (decision) {
                case "leitor":
                    LeitorRegister();
                    return;
                case "livro":
                    LivroRegister();
                    return;
                case "ambos":
                    BothRegister();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println("Deseja Retornar ao Cadastro [1- Sim  2- Não]: ");
            int continuar = teclado.nextInt();

            if (continuar == 1) {
                Decision();
            }
        }
    }
}

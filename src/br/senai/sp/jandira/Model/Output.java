package br.senai.sp.jandira.Model;

import java.util.List;

public class Output {
    public void PrintUsuario(Usuario usuario) {
        System.out.println("---------------------------------------------------");
        System.out.println("                  INFORMAÇÕES DO LEITOR                ");
        System.out.println("Nome do leitor: " + usuario.getNome());
        System.out.println("Email do leitor: " + usuario.getEmail());
        System.out.println("Endereço do leitor: " + usuario.getEndereco());
        System.out.println("Telefone do leitor: " + usuario.getTelefone());
        System.out.println("---------------------------------------------------");
    }

    public void PrintLivro(Livros livros) {
        System.out.println("---------------------------------------------------");
        System.out.println("                  INFORMAÇÕES DO LIVRO                ");
        System.out.println("Título do livro: " + livros.getTitulo());
        System.out.println("Autor do livro: " + livros.getAutor());
        System.out.println("Gênero do livro: " + livros.getGenero());
        System.out.println("ISBN do livro: " + livros.getIsbn());
        System.out.println("---------------------------------------------------");
    }

}

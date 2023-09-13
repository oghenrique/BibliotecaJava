package br.senai.sp.jandira.Model;

public class Output {
    public void PrintUsuario(Usuario usuario) {
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("--------------- INFORMAÇÕES DO LEITOR ---------------");
        System.out.println("Nome do usuário: " + usuario.nome);
        System.out.println("Email do usuário: " + usuario.email);
        System.out.println("Endereço do usuário: " + usuario.endereco);
        System.out.println("---------------------------------------------------");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
    }

    public void PrintLivro(Livros livros) {
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("--------------- INFORMAÇÕES DO LIVRO ---------------");
        System.out.println("Título do livro: " + livros.titulo);
        System.out.println("Autor do livro: " + livros.autor);
        System.out.println("Gênero do livro: " + livros.genero);
        System.out.println("ISBN do livro: " + livros.isbn);
        System.out.println("---------------------------------------------------");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
    }
}
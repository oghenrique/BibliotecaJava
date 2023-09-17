package br.senai.sp.jandira.Model;

public class Emprestimo {

    public boolean emprestarLivro(Catalogo catalogo, String tituloLivro) {
        Livros livroParaEmprestimo = catalogo.tituloDoLivro(tituloLivro);

        if (livroParaEmprestimo != null && !livroParaEmprestimo.isEmprestado()) {
            catalogo.emprestarLivro(livroParaEmprestimo);
            return true;
        } else {
            return false;
        }
    }
    public boolean devolverLivro(Catalogo catalogo, String tituloLivro) {
        Livros livroDevolvido = catalogo.tituloDoLivro(tituloLivro);

        if (livroDevolvido != null && livroDevolvido.isEmprestado()) {
            catalogo.devolverLivro(livroDevolvido);
            return true;
        } else {
            return false;
        }
    }
}

package br.senai.sp.jandira.Model;

public class Livros {
    String titulo, autor, genero, isbn;
    boolean emprestado;

    public Livros(String titulo, String autor, String genero, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.genero = genero;
        this.emprestado = false;
    }

    public Livros() {
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        emprestado = true;
    }

    public void devolver() {
        emprestado = false;
    }
}

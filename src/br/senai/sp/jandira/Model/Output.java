package br.senai.sp.jandira.Model;

public class Output {
    public void PrintUsuario(Usuario usuario){

        /** Printar Informações */

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("-------------------- Player -------------------");
        System.out.println("Usuario: " + usuario.nome );
        System.out.println("Email: " + usuario.email );
        System.out.println("Endereço: " + usuario.endereco);
        System.out.println("-----------------------------------------------");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
    }
}


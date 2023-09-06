package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Register {
    int validaPrint = 0;

    Scanner teclado = new Scanner(System.in);

    Usuario usuario = new Usuario();

    Output output = new Output();

    public void BothRegister() {

    }

    public Usuario PlayerRegister() {

        /** Coleta dados do Player-1 */
        System.out.println("---------------- Cadastro Usuário ----------------");
        System.out.print("Insira seu nome: ");
        usuario.nome = teclado.next();
        System.out.println("Insira seu email: ");
        usuario.email = teclado.next();
        System.out.println("Insira seu endereço: ");
        usuario.endereco = teclado.next();
        System.out.println("--------- Usuário Cadastrado com Sucesso ---------");

        if(validaPrint != 1) {
            /** Printa as Informações Cadastradas */
            output.PrintUsuario(usuario);
        }

        return usuario;

    }
}





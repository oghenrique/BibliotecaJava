package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Menu {
    public void Menu() {

        Scanner teclado = new Scanner(System.in);
        Register register = new Register();
        boolean exit = false;

        while (!exit){
            System.out.println("----------  Bem Vindo  ---------");
            System.out.println("Escolha uma das Opções: ");
            System.out.println("");
            System.out.println("1 - Resgistro");
            System.out.println("2 - Catalogo");
            System.out.println("3 - Sair");
            System.out.println("--------------------------------");

            int userOption = teclado.nextInt();

            switch (userOption){

                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    exit = true;
                    break;
                }
            }
        }
    }


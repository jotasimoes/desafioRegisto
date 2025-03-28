package view;

import service.PetService;

import java.util.Scanner;

public class MenuView {
    private Scanner sc = new Scanner(System.in);
    private PetService ps = new PetService();

    public void mostrarMenu() {
        int escolha = 0;

        while (escolha !=6) {
            System.out.println("1. Registar novo pet.");
            System.out.println("2. Alterar dados de pet.");
            System.out.println("3. Remover um pet.");
            System.out.println("4. Listar todos os pets.");
            System.out.println("5. Listar pets por filtro.");
            System.out.println("6. Sair");

            escolha = obterEscolhaValida(1,6);

            switch (escolha) {
                case 1: ps.registarPet();
            }

        }


    }


    public int obterEscolhaValida(int min, int max) {
        Scanner sc = new Scanner(System.in);
        boolean escolhaValida = false;
        int escolha = 0;

        while(!escolhaValida) {
            String input = sc.nextLine();


            if(input.trim().isEmpty()) {
                System.out.println("Por favor, digite um número.");
                continue;
            }

            try {
                escolha = Integer.parseInt(input);

                if(escolha < min || escolha > max) {
                    System.out.println("Digite um valor entre " + min + " e " + max);
                } else {
                    escolhaValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite apenas números.");
            }
        }

        return escolha;
    }
}

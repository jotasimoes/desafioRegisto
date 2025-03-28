package service;

import model.Morada;
import model.Pet;
import util.FileUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class PetService {
    private Scanner sc = new Scanner(System.in);

    private static FileUtil fileUtil = new FileUtil();

    public Pet registarPet() {
        Pet novoPet = new Pet();
        boolean valido = false;

        ArrayList<String> perguntas = fileUtil.lerFicheiro("formulario.txt");

        //1. Perguntar nome
        while (!valido) {
            System.out.println(perguntas.get(0));
            String nome = sc.nextLine();
            try {
                novoPet.setNome(nome);
                valido = true;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        valido = false;
        //2. Perguntar tipo
        while (!valido) {
            System.out.println(perguntas.get(1));
            String tipo = sc.nextLine();

            try {
                novoPet.setTipo(tipo);
                valido = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
        valido = false;
        //Perguntar género
        while (!valido) {
            System.out.println(perguntas.get(2));
            String genero = sc.nextLine();

            try {
                novoPet.setGenero(genero);
                valido = true;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        valido = false;
        //Perguntar morada
        while (!valido) {
            Morada novaMorada = new Morada();
            System.out.println(perguntas.get(3));
            System.out.println("Indique a rua:");
            String rua = sc.nextLine();
            novaMorada.setRua(rua);
            boolean valido2 = false;
            while (!valido2) {
                System.out.println("Indique a numero:");
                String numero = sc.nextLine();
                try {
                    novaMorada.setNumero(numero);
                    valido2 = true;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println("Indique a Cidade:");
            String cidade = sc.nextLine();
            novaMorada.setCidade(cidade);

            valido=false;
           //Perguntar idade
            while (!valido) {
                System.out.println(perguntas.get(4));
                String idade = sc.nextLine();

                try{
                    novoPet.setIdade(idade);
                    valido = true;
                }catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }



        }
        return novoPet;
    }
}

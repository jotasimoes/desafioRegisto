import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> formulario = new ArrayList<>();

    public static void main(String[] args) {
        formulario = lerFormulario();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1. Registar um novo pet");
            System.out.println("2. Alterar os dados do pet registado");
            System.out.println("3. Remover um pet registado");
            System.out.println("4. Listar todos os pets registados");
            System.out.println("5. Listar pets por algum critério (idade, nome, raça)");
            System.out.println("6. Sair");
            switch (sc.nextInt()) {
                case 1: lerFormulario();

            }
        }
    }

    public static ArrayList<String> lerFormulario() {

        try{
            BufferedReader br = new BufferedReader(new FileReader("formulario.txt"));
            String linha;
            while((linha = br.readLine()) != null) {
                formulario.add(linha);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        return formulario;
    }

    }




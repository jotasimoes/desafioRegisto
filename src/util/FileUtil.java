package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileUtil {

    public ArrayList<String> lerFicheiro(String nomeFicheiro) {
        //ArrayList para guardar o conteúdo do ficheiro
        ArrayList<String> conteudo = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeFicheiro))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
               conteudo.add(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return conteudo;
    }


}


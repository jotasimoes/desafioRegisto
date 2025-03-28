import model.Pet;
import util.FileUtil;
import view.MenuView;

import java.util.ArrayList;

public class Main {
    private static FileUtil fileUtil = new FileUtil();
    private static MenuView menuView = new MenuView();


    public static void main(String[] args) {

        menuView.mostrarMenu();

    }
}




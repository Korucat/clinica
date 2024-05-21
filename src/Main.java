import CardServis.UserServis;
import Clinica.Doctors;
import Clinica.HistoriVisits;
import Clinica.User;
import Until.Menu;
import Basa.Database;

import java.sql.SQLOutput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Menu.loadDB();

        Menu.runApplication();
    }

}


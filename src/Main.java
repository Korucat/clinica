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

        System.out.println("Выберите пункт из меню");
        System.out.println("1.Создать пользователя");
        System.out.println("2.Ввести данные врача");
        System.out.println("3.Получить список всех пациентов");
        System.out.println("4.Открыть карту пациента");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {

            String input;
            do {
                input = reader.readLine();

                switch (input) {
                    case "1": {
                        Menu.createUser(reader);
                        break;
                    }
                    case "2": {
                        Menu.createDoctor(reader);
                        break;
                    }


                    case "3": {
                        Menu.printUser(reader);
                        break;
                    }



                        case "4": {
                            Menu.createCard(reader);
                            break;
                        }





                    default: {
                        System.out.println("неверная команда");

                    }
                }
                System.out.println("Выберите пункт из меню");
                System.out.println("1.Создать пользователя");
                System.out.println("2.Ввести данные врача");
                System.out.println("3.Получить список всех пациентов");
                System.out.println("4.Открыть карту пациента");

                } while (input != "-1");

            if (input == "-1") {
                System.out.println("Работа программы успешно завершена");
            }

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }




    }
}


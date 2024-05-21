package Until;

import Basa.Database;
import CardServis.CardServis;
import CardServis.UserServis;
import CardServis.DoctorServis;
import Clinica.Card;
import Clinica.Doctors;
import Clinica.HistoriVisits;
import Clinica.User;
import Lib.ArrayListCustom;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    private static Database database = new Database();
    private static CardServis cardServis = new CardServis(database);
    private static UserServis userServis = new UserServis(database);
    private static DoctorServis doctorServis = new DoctorServis(database);



    public static void main(String[] args) {

        System.out.println("Выберите пункт из меню");
        System.out.println("1.Создать пользователя");
        System.out.println("2.Ввести данные врача");
        System.out.println("3.Получить список всех пациентов");
        System.out.println("4.Открыть карту пациента");
        System.out.println("5.Получить список всех докторов");

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
                        Menu.printUser();
                        break;
                    }


                    case "4": {
                        Menu.createCard(reader);
                        break;
                    }

                    case "5": {
                        Menu.printDoctors();
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
                System.out.println("5.Получить список всех докторов");

            } while (input != "-1");

            if (input == "-1") {
                System.out.println("Работа программы успешно завершена");
            }

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }


    }


    public static void loadDB() {
        try (
                var objectInputStream = new java.io.ObjectInputStream(
                        new FileInputStream("db.serialization")
                )
        ) {
            final var users = (ArrayListCustom<User>) objectInputStream.readObject();
            final var doctors = (ArrayListCustom<Doctors>) objectInputStream.readObject();
            final var historiVisits = (ArrayListCustom<HistoriVisits>) objectInputStream.readObject();
            final var cards = (ArrayListCustom<Card>) objectInputStream.readObject();

            database.setCards(cards);
            database.setUsers(users);
            database.setDoctors(doctors);
            database.setHistoriVisits(historiVisits);
        } catch (Exception e) {
            System.out.println("Не удалось загрузить базу данных " + e.getMessage());
        }
    }



    public static void createUser(BufferedReader reader) throws IOException {
        System.out.println("Введите имя");
        System.out.println("Введите возраст");
        System.out.println("Введите серию и номер паспорта");
        System.out.println("Введите номер телефона");
        System.out.println("Введите электронную почту ");

        String name = reader.readLine();

        int age = Integer.parseInt(reader.readLine());

        String documentNumber = reader.readLine();
        String phoneNumber = reader.readLine();
        String email = reader.readLine();

        userServis.createUser(name, age, documentNumber, phoneNumber, email);
    }

    public static void createDoctor(BufferedReader reader) throws IOException {
        System.out.println("Введите имя доктора");
        System.out.println("Введите наименование услуги");
        System.out.println("Введите стоимость услуги");


        String nameDoctor = reader.readLine();
        String service = reader.readLine();
        int priceDoctor = Integer.parseInt(reader.readLine());

        doctorServis.createDoctor(nameDoctor, service, priceDoctor);
    }


    public static void createCard(BufferedReader reader) throws IOException {
        System.out.println("Введите имя пациента");


        String name = reader.readLine();
        boolean isUserExists = userServis.isUserExists(name);

        if (!isUserExists) {
            System.out.println("Такого пациента еще нет");
            return;
        }

        User user = userServis.getUser(name);


        boolean hasAnyCards = cardServis.hasAnyCards(user);

        if (hasAnyCards) {
            System.out.println("У этого пациента уже есть карта");
            return;
        }

        cardServis.hasAnyCards(user);
        System.out.println("Карта успешно создана");
        return;


    }

    public static void printUser() {
        userServis.printUser();
    }


    public static void printDoctors() {
        doctorServis.printDoctors();
    }





}






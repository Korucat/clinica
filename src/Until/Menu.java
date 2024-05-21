package Until;

import Basa.Database;
import CardServis.CardServis;
import CardServis.UserServis;
import CardServis.DoctorServis;
import Clinica.User;

import java.io.BufferedReader;
import java.io.IOException;

public class Menu {
    private static Database database = new Database();
    private static CardServis cardServis = new CardServis(database);
    private static UserServis userServis = new UserServis(database);
    private static DoctorServis doctorServis = new DoctorServis(database);

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

    public static void printUser(BufferedReader reader) {
        UserServis.printUser();
    }
}






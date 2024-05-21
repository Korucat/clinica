package CardServis;

import Basa.Database;
import Clinica.User;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class UserServis {

    private Database database;

    public UserServis(Database database) {
        this.database = database;
    }

    public void createUser(String name, int age, String documentNumber, String phoneNumber, String email) {
        if (age < 18) throw new IllegalArgumentException("Обслуживаются только пациенты, достигшие 18 лет");

        if (
                !((phoneNumber.length() == 12 && phoneNumber.startsWith("+7"))
                        || (phoneNumber.length() == 11 && phoneNumber.startsWith("8")))
        ) {
            throw new IllegalArgumentException("Неверный номер телефона");
        }

        User createdUser = new User(name, age, documentNumber, phoneNumber, email);

        database.addUser(createdUser);
    }


    public void printUser() {
        database.printUsers();
    }

    public boolean isUserExists(String name) {

        return database.isUserExists(name);
    }

    public void getUserInfo(String name) {

    }


    public User getUser(String userFullName) {
        return database.getUser(userFullName);
    }




}





